package variaTelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;

public class Tela1 {

	private JFrame frmTela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
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
	public Tela1() {
		initialize();
		
	}
	public void visivel() {
		Tela1 window = new Tela1();
		window.frmTela.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTela = new JFrame();
		frmTela.setTitle("Tela1");
		frmTela.setBounds(100, 100, 450, 300);
		frmTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTela.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("Ir para a tela 2");
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela2 tel = new Tela2();
				tel.visivel();
				frmTela.dispose();
			}
		});
		btn1.setBounds(147, 109, 131, 59);
		frmTela.getContentPane().add(btn1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(137, 29, 159, 69);
		frmTela.getContentPane().add(textPane);
	}
}
