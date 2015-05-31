package Tugas_Besar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;

public class Awal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Awal frame = new Awal();
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
	public Awal() {
		setTitle("Add Data");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(117, 34, 208, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNamaRuang = new JLabel("Nama Ruang");
		lblNamaRuang.setBounds(10, 37, 79, 14);
		contentPane.add(lblNamaRuang);
		
		JLabel lblLokasiRuang = new JLabel("Lokasi Ruang");
		lblLokasiRuang.setBounds(10, 62, 79, 14);
		contentPane.add(lblLokasiRuang);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 228, 118, 23);
		contentPane.add(progressBar);
		
		JButton btnExit = new JButton("Cancel");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnExit.setBounds(241, 228, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblJurusan = new JLabel("Jurusan");
		lblJurusan.setBounds(10, 87, 46, 14);
		contentPane.add(lblJurusan);
		
		JLabel lblFakultas = new JLabel("Fakultas");
		lblFakultas.setBounds(10, 112, 46, 14);
		contentPane.add(lblFakultas);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 84, 208, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(117, 109, 208, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Input inputObjec = new Input();
				Analisis analisisObjec = new Analisis();
				kondisiruang kondisiruangObject = new kondisiruang();
				
				
				
			}
		});
		btnNext.setBounds(142, 228, 89, 23);
		contentPane.add(btnNext);
		
		textField_3 = new JTextField();
		textField_3.setBounds(117, 59, 208, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
