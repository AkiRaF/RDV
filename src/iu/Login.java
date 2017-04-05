package iu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import tools.tools;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblSeConnecter;

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
		setBackground(new Color(65, 105, 225));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 245, 245));
		textField.setBounds(80, 165, 192, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(245, 245, 245));
		textField_1.setBounds(80, 239, 192, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblMotDePasse.setBounds(80, 202, 140, 26);
		contentPane.add(lblMotDePasse);
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblLogin.setBounds(80, 128, 84, 26);
		contentPane.add(lblLogin);
		
		lblSeConnecter = new JLabel("Se Connecter");
		lblSeConnecter.setForeground(new Color(0, 0, 128));
		lblSeConnecter.setFont(new Font("Century", Font.BOLD, 30));
		lblSeConnecter.setBounds(73, 35, 220, 53);
		contentPane.add(lblSeConnecter);
		
		JButton btnConnecter = new JButton("connecter");
		btnConnecter.setForeground(UIManager.getColor("Button.background"));
		btnConnecter.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConnecter.setBackground(new Color(0, 100, 0));
		btnConnecter.setBounds(111, 306, 128, 31);
		contentPane.add(btnConnecter);
		
		tools.Center(this);
	}
}