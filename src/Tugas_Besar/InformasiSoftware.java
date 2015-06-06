package Tugas_Besar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.ImageIcon;

public class InformasiSoftware extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformasiSoftware frame = new InformasiSoftware();
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
	public InformasiSoftware() {
		setTitle("Version 1.0");
		setBounds(100, 100, 312, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInventarisTugasBesar = new JLabel("Inventaris tugas besar PBO");
		lblInventarisTugasBesar.setBounds(10, 28, 160, 14);
		contentPane.add(lblInventarisTugasBesar);
		
		JLabel lblSoftwareVersion = new JLabel("Software version 1.0");
		lblSoftwareVersion.setForeground(Color.RED);
		lblSoftwareVersion.setBounds(10, 84, 129, 14);
		contentPane.add(lblSoftwareVersion);
		
		JLabel lblBuildWithEclipse = new JLabel("Build with Java programing");
		lblBuildWithEclipse.setBounds(10, 109, 160, 14);
		contentPane.add(lblBuildWithEclipse);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Home\\Pictures\\index.png"));
		label.setBounds(206, 11, 80, 146);
		contentPane.add(label);
	}
}
