package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Customer.Customer;
import Util.FileOperate;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(183, 28, 62, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(93, 88, 62, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(165, 88, 140, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("宋体", Font.PLAIN, 14));
		lblPassword.setBounds(93, 149, 62, 28);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(165, 153, 140, 25);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String account = textField.getText();
				String psw = textField_1.getText();
				int id = Integer.parseInt(account);
				int flag = checkPsw(id, psw);
				if(flag != 1) {
					frame.dispose();
					if(flag == 2) {
						new LandlordIndex();
					}else if(flag == 3) {
						new VendorIndex();
					}else if(flag == 4) {
						new EmployeeIndex();
					}else if(flag == 5) {
						new TenantIndex();
					}else if(flag == 6) {
						new BuyerIndex();
					}
				}else {
					JOptionPane.showMessageDialog(null, "check you id or password");
					textField_1.setText("");
				}
			}
		});
		btnNewButton.setBounds(117, 213, 75, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register();
			}
		});
		btnSignUp.setBounds(216, 213, 82, 28);
		frame.getContentPane().add(btnSignUp);
		frame.setVisible(true);
	}
	
	public int checkPsw(int id, String psw) {
		Customer[] customers = FileOperate.readCustomer("D://customer.txt");
		Customer tempCus = null;
		int flag = 0;
		for(Customer customer : customers) {
			if((customer.getCusID() == id) && (psw.compareTo(customer.getPassword())==0)) {
				flag = 1;
				tempCus = customer;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("Login succeed");
			if(tempCus.getType().compareTo("LANDLORD")==0) {
				flag = 2;
			}else if(tempCus.getType().compareTo("VENDOR")==0) {
				flag = 3;
			}else if(tempCus.getType().compareTo("EMPLOYEE")==0) {
				flag = 4;
			}else if(tempCus.getType().compareTo("TENANT")==0) {
				flag = 5;
			}else if(tempCus.getType().compareTo("BUYER")==0) {
				flag = 6;
			}
		}else {
			System.out.println("Login fail");
		}
		return flag;
	}
}
