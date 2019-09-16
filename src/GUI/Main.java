package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 435, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REAL ESEATE");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 17));
		lblNewLabel.setBounds(138, 26, 113, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("User Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new Login();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		btnNewButton.setBounds(110, 113, 173, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEmployeeLogin = new JButton("Employee Login");
		btnEmployeeLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EmployeeIndex();
			}
		});
		btnEmployeeLogin.setFont(new Font("宋体", Font.PLAIN, 15));
		btnEmployeeLogin.setBounds(110, 201, 173, 47);
		frame.getContentPane().add(btnEmployeeLogin);
		
		JButton btnGuset = new JButton("Guest");
		btnGuset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GuestIndex();
			}
		});
		btnGuset.setFont(new Font("宋体", Font.PLAIN, 15));
		btnGuset.setBounds(110, 290, 173, 47);
		frame.getContentPane().add(btnGuset);
	}
}
