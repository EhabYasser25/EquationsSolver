package com.example.phase1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    double mat[][] = { { 3.0, 2.0, -4.0, 3.0 },
                     { 2.0, 3.0, 3.0, 15.0 },
                     { 5.0, -3, 1.0, 14.0 } };
    private GaussElimination gauss = new GaussElimination(mat, true);
    double ans[] = gauss.solve();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(String.valueOf(ans[0] + " " + ans[1] + " " + ans[2]));
    }
}