package com.example.phase1;

import com.example.phase1.GaussElimination.*;

public class Solve {
	
	private String method = "Gauss Elimination";
	private double coef[][];
	double ans[];
	
	public Solve(String method, double[][] coef) {
		this.method = method;
		this.coef = coef;
	}
	
	public double[] chooseMethod() {
		switch(method) {
			case "Gauss Elimination" : {
				GaussElimination obj = new GaussElimination(coef, true);
				ans = obj.solve();
			}
		}
		return ans;
	}

}
