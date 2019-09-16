package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class VendorIndex {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendorIndex window = new VendorIndex();
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
	public VendorIndex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VendorMenu");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(164, 23, 104, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("addSaleProperty");
		btnNewButton.setBounds(141, 78, 143, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEditsaleproperty = new JButton("editSaleProperty");
		btnEditsaleproperty.setBounds(141, 134, 143, 23);
		frame.getContentPane().add(btnEditsaleproperty);
		
		JButton btnReceiveoffer = new JButton("receiveOffer");
		btnReceiveoffer.setBounds(141, 187, 143, 23);
		frame.getContentPane().add(btnReceiveoffer);
		
		JButton btnAcceptoffer = new JButton("acceptOffer");
		btnAcceptoffer.setBounds(141, 245, 143, 23);
		frame.getContentPane().add(btnAcceptoffer);
		
		JButton btnReceivedeposit = new JButton("receiveDeposit");
		btnReceivedeposit.setBounds(141, 299, 143, 23);
		frame.getContentPane().add(btnReceivedeposit);
		
		JButton btnEditprofile = new JButton("editProfile");
		btnEditprofile.setBounds(141, 358, 143, 23);
		frame.getContentPane().add(btnEditprofile);
		
		frame.setVisible(true);
	}

}
