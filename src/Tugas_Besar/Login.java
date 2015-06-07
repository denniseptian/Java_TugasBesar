package Tugas_Besar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("ID");
		label.setBounds(86, 77, 80, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(86, 102, 80, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 74, 86, 20);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 99, 86, 20);
		contentPane.add(passwordField);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ID = "root";
				String Pass = "root";
				String Jlabel1 = textField.getText();
				String Jpass = passwordField.getText();
				
				if (Jlabel1.equalsIgnoreCase(ID)&&Jpass.equals(Pass)){
					HalamanUtama.main(null);
				}else{
					JOptionPane.showMessageDialog(null, "Pasword Salah");
				}
				
				
			}
		});
		button.setBounds(202, 142, 89, 23);
		contentPane.add(button);
	}
}
