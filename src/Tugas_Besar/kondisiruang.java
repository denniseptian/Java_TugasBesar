package Tugas_Besar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kondisiruang extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kondisiruang frame = new kondisiruang();
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
	public kondisiruang() {
		setTitle("Kondisi Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPanjangRuangan = new JLabel("Panjang Ruangan");
		lblPanjangRuangan.setBounds(10, 38, 104, 14);
		contentPane.add(lblPanjangRuangan);
		
		JLabel lblLebarRuangan = new JLabel("Lebar Ruangan");
		lblLebarRuangan.setBounds(10, 63, 91, 14);
		contentPane.add(lblLebarRuangan);
		
		JLabel lblJumlahKursi = new JLabel("Jumlah Kursi");
		lblJumlahKursi.setBounds(10, 88, 69, 14);
		contentPane.add(lblJumlahKursi);
		
		JLabel lblJumlahPintu = new JLabel("Jumlah Pintu");
		lblJumlahPintu.setBounds(10, 113, 69, 14);
		contentPane.add(lblJumlahPintu);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setBounds(10, 138, 91, 14);
		contentPane.add(lblJumlahJendela);
		
		textField = new JTextField();
		textField.setBounds(124, 35, 104, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 60, 104, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 85, 104, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(124, 110, 104, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 135, 104, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(153, 228, 89, 23);
		contentPane.add(btnCancel);
		
		Input inputObject = new Input();
		Analisis analisisObject = new Analisis();
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//InputObject.input(textField, textField_1, textField_2, textField_3, textField_4);
				analisisObject.KondisiRuang();
			}
		});
		btnNext.setBounds(54, 228, 89, 23);
		contentPane.add(btnNext);
	}

}
