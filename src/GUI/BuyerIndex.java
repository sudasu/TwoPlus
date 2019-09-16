package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class BuyerIndex {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyerIndex window = new BuyerIndex();
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
	public BuyerIndex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuyerMenu");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(161, 22, 101, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("addSuburb");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton.setBounds(124, 63, 155, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGetpropertyinfo = new JButton("getPropertyInfo");
		btnGetpropertyinfo.setFont(new Font("宋体", Font.PLAIN, 14));
		btnGetpropertyinfo.setBounds(124, 106, 155, 23);
		frame.getContentPane().add(btnGetpropertyinfo);
		
		JButton btnGiveoffer = new JButton("giveOffer");
		btnGiveoffer.setFont(new Font("宋体", Font.PLAIN, 14));
		btnGiveoffer.setBounds(124, 149, 155, 23);
		frame.getContentPane().add(btnGiveoffer);
		
		JButton btnPaydeposit = new JButton("payDeposit");
		btnPaydeposit.setFont(new Font("宋体", Font.PLAIN, 14));
		btnPaydeposit.setBounds(124, 195, 155, 23);
		frame.getContentPane().add(btnPaydeposit);
		
		JButton btnEditprofile = new JButton("editProfile");
		btnEditprofile.setFont(new Font("宋体", Font.PLAIN, 14));
		btnEditprofile.setBounds(124, 240, 155, 23);
		frame.getContentPane().add(btnEditprofile);
		frame.setVisible(true);
	}

}
