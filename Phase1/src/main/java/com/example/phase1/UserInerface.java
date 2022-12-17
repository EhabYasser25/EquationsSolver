package com.example.phase1;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class UserInerface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInerface frame = new UserInerface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int it = sc.nextInt();
		double[][] coff = new double[n][n+1];
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n+1 ;j++) {
				coff[i][j] = sc.nextDouble();
			}
		}
		GaussSeidel Solver = new GaussSeidel(coff,it);
		double ans[] = Solver.solve();
		for(int i=0 ; i<n ; i++) {
			System.out.println(ans[i]);
		}*/
	}

	/**
	 * Create the frame.
	 */
	public UserInerface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
