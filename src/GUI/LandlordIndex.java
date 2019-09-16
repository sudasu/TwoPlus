package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class LandlordIndex {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandlordIndex window = new LandlordIndex();
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
	public LandlordIndex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 313);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LandlordMenu");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(153, 20, 115, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("addRentalProperty");
		btnNewButton.setBounds(125, 76, 165, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEditrentalproperty = new JButton("editRentalProperty");
		btnEditrentalproperty.setBounds(125, 134, 165, 23);
		frame.getContentPane().add(btnEditrentalproperty);
		
		JButton btnEditprofile = new JButton("editProfile");
		btnEditprofile.setBounds(125, 198, 165, 23);
		frame.getContentPane().add(btnEditprofile);
		
		frame.setVisible(true);
	}

}
