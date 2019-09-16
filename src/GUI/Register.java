package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Customer.Customer;
import Util.FileOperate;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create your account");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(114, 25, 198, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCusid = new JLabel("cusID");
		lblCusid.setFont(new Font("宋体", Font.PLAIN, 16));
		lblCusid.setBounds(100, 83, 55, 24);
		frame.getContentPane().add(lblCusid);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("宋体", Font.PLAIN, 16));
		lblPassword.setBounds(100, 134, 74, 24);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblName = new JLabel("name");
		lblName.setFont(new Font("宋体", Font.PLAIN, 16));
		lblName.setBounds(100, 184, 55, 24);
		frame.getContentPane().add(lblName);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setFont(new Font("宋体", Font.PLAIN, 16));
		lblEmail.setBounds(100, 235, 55, 24);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setFont(new Font("宋体", Font.PLAIN, 16));
		lblPhone.setBounds(100, 280, 55, 24);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblType = new JLabel("type");
		lblType.setFont(new Font("宋体", Font.PLAIN, 16));
		lblType.setBounds(100, 330, 55, 24);
		frame.getContentPane().add(lblType);
		
		textField = new JTextField();
		textField.setBounds(180, 83, 132, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 137, 132, 24);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 187, 132, 24);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(180, 238, 132, 24);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(180, 283, 132, 24);
		frame.getContentPane().add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("LANDLORD");
		comboBox.addItem("VENDOR");
		comboBox.addItem("EMPLOYEE");
		comboBox.addItem("TENANT");
		comboBox.addItem("BUYER");
		comboBox.setBounds(180, 333, 89, 21);
		frame.getContentPane().add(comboBox);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = Integer.parseInt(textField.getText());
				String psw = textField_1.getText();
				String name = textField_2.getText();
				String phone = textField_3.getText();
				String email = textField_4.getText();
				String type = comboBox.getSelectedItem().toString();
				int i = insertCustomer(id, psw, name, phone, email, type);
				if(i==1) {
					JOptionPane.showMessageDialog(null, "regist succeed");
				}else {
					JOptionPane.showMessageDialog(null, "regist fail");
				}
				
			}
		});
		btnSignUp.setBounds(114, 389, 93, 23);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnReturn.setBounds(229, 389, 93, 23);
		frame.getContentPane().add(btnReturn);
		
		frame.setVisible(true);
	}
	
	public int insertCustomer(int id, String psw, String name, String phone, String email, String type) {
		int i = 0;
		Customer customer = new Customer(id, psw, name, phone, email, type);
	    i = FileOperate.insertCustomer("D://customer.txt", customer);
		return i;
	}
}
