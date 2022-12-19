package com.example.phase1;


public class GaussElimination {

    int n;
    boolean enableScaling;
    double[][] coef;
    double[] scale;
    double[] ans;

    public GaussElimination(double[][] ceof, boolean enableScaling) {
        this.coef = ceof;
        this.enableScaling = enableScaling;
        this.n = coef.length;
        this.scale = new double[n];
        this.ans = new double[n];
    }

    private void scaling() {
        if(!enableScaling) {
            for(int i = 0; i < n; i++) {
                scale[i] = 1;
            }
            return;
        }
        for(int i = 0; i < n; i++) {
            scale[i] = Math.abs(coef[i][0]);
            for(int j = 1; j < n; j++) {
                if(Math.abs(coef[i][j]) > scale[i]) {
                    scale[i] = Math.abs(coef[i][j]);
                }
            }
        }
    }

    private void partialPivoting(int k) {
        double pivot = Math.abs(coef[k][k] / scale[k]);
        int pivotRow = k;
        for(int i = k + 1; i < n; i++) {
            if(Math.abs(coef[i][k] / scale[i]) > pivot) {
                pivot = Math.abs(coef[i][k] / scale[i]);
                pivotRow = i;
            }
        }
        if(pivotRow == k) return;
        for(int j = k; j < n + 1; j++) {
            double tmp = coef[k][j];
            coef[k][j] = coef[pivotRow][j];
            coef[pivotRow][j] = tmp;
        }
    }

    private void forwardElimination() {
        for(int k = 0; k < n - 1; k++) {
            partialPivoting(k);
            for(int i = k + 1; i < n; i++) {
                double multiplier = coef[i][k] / coef[k][k];
                for(int j = k; j < n + 1; j++) {
                    coef[i][j] = coef[i][j] - multiplier * coef[k][j];
                }
            }
        }
    }

    private void backwardSubstitution() {
        for(int i = n - 1; i >= 0; i--) {
            double total = 0;
            for(int j = i + 1; j < n; j++) {
                total += coef[i][j] * ans[j];
            }
            ans[i] = (coef[i][n] - total) / coef[i][i];
        }
    }

    public double[] solve() {
        scaling();
        forwardElimination();
        backwardSubstitution();
        return ans;
    }

}
