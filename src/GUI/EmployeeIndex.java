package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class EmployeeIndex {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public EmployeeIndex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EmployeeBoard");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(140, 27, 141, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("empMenu");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton.setBounds(115, 76, 182, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAssessnewproperty = new JButton("assessNewProperty");
		btnAssessnewproperty.setFont(new Font("宋体", Font.PLAIN, 14));
		btnAssessnewproperty.setBounds(115, 120, 182, 23);
		frame.getContentPane().add(btnAssessnewproperty);
		
		JButton btnAssignemp = new JButton("assignEmp");
		btnAssignemp.setFont(new Font("宋体", Font.PLAIN, 14));
		btnAssignemp.setBounds(115, 168, 182, 23);
		frame.getContentPane().add(btnAssignemp);
		
		JButton btnApproveparttimehours = new JButton("approveParttimeHours");
		btnApproveparttimehours.setFont(new Font("宋体", Font.PLAIN, 14));
		btnApproveparttimehours.setBounds(115, 209, 182, 23);
		frame.getContentPane().add(btnApproveparttimehours);
		
		JButton btnAddinspection = new JButton("addInspection");
		btnAddinspection.setFont(new Font("宋体", Font.PLAIN, 14));
		btnAddinspection.setBounds(115, 252, 182, 23);
		frame.getContentPane().add(btnAddinspection);
		
		JButton btnManagepayroll = new JButton("managePayroll");
		btnManagepayroll.setFont(new Font("宋体", Font.PLAIN, 14));
		btnManagepayroll.setBounds(115, 298, 182, 23);
		frame.getContentPane().add(btnManagepayroll);
		
		JButton btnCalmgtfee = new JButton("calMgtFee");
		btnCalmgtfee.setFont(new Font("宋体", Font.PLAIN, 14));
		btnCalmgtfee.setBounds(115, 347, 182, 23);
		frame.getContentPane().add(btnCalmgtfee);
		
		frame.setVisible(true);
	}

}
