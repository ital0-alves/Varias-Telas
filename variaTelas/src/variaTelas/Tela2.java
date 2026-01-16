package variaTelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Tela2 {

	private JFrame frmTela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 window = new Tela2();
					window.frmTela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela2() {
		initialize();
		
	}
	public void visivel() {
		Tela2 window = new Tela2();
		window.frmTela.setVisible(true);
	}
		

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTela = new JFrame();
		frmTela.setTitle("Tela 2");
		frmTela.setBounds(100, 100, 450, 300);
		frmTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTela.getContentPane().setLayout(null);
		
		JButton btn2 = new JButton("Voltar para tela 1");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela1 tel = new Tela1();
				tel.visivel();
				frmTela.dispose();
			}
		});
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn2.setBounds(140, 78, 169, 64);
		frmTela.getContentPane().add(btn2);
	}

}




