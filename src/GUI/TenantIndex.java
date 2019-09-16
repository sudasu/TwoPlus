package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TenantIndex {

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public TenantIndex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("tenantMenu");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(166, 25, 114, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("addSuburb");
		btnNewButton.setBounds(142, 74, 162, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGetpropertyinfo = new JButton("getPropertyInfo");
		btnGetpropertyinfo.setBounds(142, 124, 162, 23);
		frame.getContentPane().add(btnGetpropertyinfo);
		
		JButton btnAddtenantapplication = new JButton("addTenantApplication");
		btnAddtenantapplication.setBounds(142, 174, 162, 23);
		frame.getContentPane().add(btnAddtenantapplication);
		
		JButton btnEditprofile = new JButton("editProfile");
		btnEditprofile.setBounds(142, 222, 162, 23);
		frame.getContentPane().add(btnEditprofile);
		
		frame.setVisible(true);
	}

}
