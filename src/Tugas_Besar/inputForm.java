package Tugas_Besar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.Choice;

public class inputForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	
	//Dec
	
	
	String item = "Bersih";
	String item1 = "Kokoh";
	String item2 = "Tidak";
	String item3 = "Ada";
	String item4 = "Aman";
	String item5 = "Bahaya";
	String gkb1 = "GKB1";
	String gkb2 = "GKB2";
	String gkb3 = "GKB3";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inputForm frame = new inputForm();
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
	public inputForm() {
		setTitle("Input Data");
		setBounds(100, 100, 450, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(10, 11, 414, 330);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Nama", null, panel, null);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Gedung");
		lblNewLabel_1.setBounds(10, 86, 103, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Nama Kelas");
		lblNewLabel.setBounds(10, 11, 125, 14);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(199, 8, 188, 20);
		panel.add(textField);
		textField.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(199, 83, 105, 20);
		panel.add(comboBox);
		
		comboBox.addItem(gkb1);
		comboBox.addItem(gkb2);
		comboBox.addItem(gkb3);

		JLabel lblFakultas = new JLabel("Fakultas");
		lblFakultas.setBounds(10, 36, 103, 14);
		panel.add(lblFakultas);

		JLabel lblJurusan = new JLabel("Jurusan");
		lblJurusan.setBounds(10, 61, 125, 14);
		panel.add(lblJurusan);

		textField_1 = new JTextField();
		textField_1.setBounds(199, 33, 188, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(199, 58, 188, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Kondisi Ruang", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblPanjangRuangan = new JLabel("Panjang Ruangan");
		lblPanjangRuangan.setBounds(10, 11, 127, 14);
		panel_1.add(lblPanjangRuangan);

		JLabel lblLebarRuangan = new JLabel("Lebar Ruangan");
		lblLebarRuangan.setBounds(10, 35, 113, 14);
		panel_1.add(lblLebarRuangan);

		JLabel lblNewLabel_2 = new JLabel("Jumlah Kursi");
		lblNewLabel_2.setBounds(10, 60, 100, 14);
		panel_1.add(lblNewLabel_2);

		JLabel lblJumlahPintu = new JLabel("Jumlah Pintu");
		lblJumlahPintu.setBounds(10, 85, 100, 14);
		panel_1.add(lblJumlahPintu);

		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setBounds(10, 110, 113, 14);
		panel_1.add(lblJumlahJendela);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(199, 8, 90, 20);
		panel_1.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(199, 32, 90, 20);
		panel_1.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(199, 57, 90, 20);
		panel_1.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(199, 82, 90, 20);
		panel_1.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(199, 107, 90, 20);
		panel_1.add(spinner_6);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Sarana", null, panel_2, null);
		panel_2.setLayout(null);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(392, 0, 17, 178);
		panel_2.add(scrollBar);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 11, 46, 14);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 36, 46, 14);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(10, 61, 46, 14);
		panel_2.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(10, 86, 46, 14);
		panel_2.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(10, 111, 46, 14);
		panel_2.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(10, 136, 46, 14);
		panel_2.add(lblNewLabel_8);

		JLabel lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setBounds(10, 164, 46, 14);
		panel_2.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setBounds(10, 192, 46, 14);
		panel_2.add(lblNewLabel_24);

		JLabel lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setBounds(10, 217, 46, 14);
		panel_2.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("New label");
		lblNewLabel_26.setBounds(10, 242, 46, 14);
		panel_2.add(lblNewLabel_26);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Kondisi Kelas", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("Kondisi Lantai");
		lblNewLabel_9.setBounds(10, 11, 96, 14);
		panel_3.add(lblNewLabel_9);

		JLabel lblKondisiDinding = new JLabel("Kondisi Dinding");
		lblKondisiDinding.setBounds(10, 36, 96, 14);
		panel_3.add(lblKondisiDinding);

		JLabel lblKondisiAtap = new JLabel("Kondisi Atap");
		lblKondisiAtap.setBounds(10, 61, 96, 14);
		panel_3.add(lblKondisiAtap);

		JLabel lblNewLabel_10 = new JLabel("Kondisi Pintu");
		lblNewLabel_10.setBounds(10, 86, 96, 14);
		panel_3.add(lblNewLabel_10);

		JLabel lblKondisiJendela = new JLabel("Kondisi Jendela");
		lblKondisiJendela.setBounds(10, 111, 96, 14);
		panel_3.add(lblKondisiJendela);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(180, 8, 96, 20);
		panel_3.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(180, 33, 96, 20);
		panel_3.add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(180, 58, 96, 20);
		panel_3.add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(180, 83, 96, 20);
		panel_3.add(comboBox_4);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(180, 108, 96, 20);
		panel_3.add(comboBox_5);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Kebersihan", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("Sirkulasi Udara");
		lblNewLabel_11.setBounds(10, 11, 86, 14);
		panel_4.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Pencahayaan");
		lblNewLabel_12.setBounds(10, 36, 86, 14);
		panel_4.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Kelembapan");
		lblNewLabel_13.setBounds(10, 61, 86, 14);
		panel_4.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("Suhu");
		lblNewLabel_14.setBounds(10, 86, 86, 14);
		panel_4.add(lblNewLabel_14);

		textField_8 = new JTextField();
		textField_8.setBounds(204, 8, 188, 20);
		panel_4.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(204, 33, 188, 20);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(204, 58, 71, 20);
		panel_4.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(204, 83, 71, 20);
		panel_4.add(spinner_1);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Kenyamanan", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel lblNewLabel_15 = new JLabel("Kebisingan");
		lblNewLabel_15.setBounds(10, 11, 83, 14);
		panel_5.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("Bau");
		lblNewLabel_16.setBounds(10, 36, 83, 14);
		panel_5.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("Kebocoran");
		lblNewLabel_17.setBounds(10, 61, 83, 14);
		panel_5.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("Kerusakan");
		lblNewLabel_18.setBounds(10, 86, 83, 14);
		panel_5.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("Keausan");
		lblNewLabel_19.setBounds(10, 111, 83, 14);
		panel_5.add(lblNewLabel_19);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(199, 8, 105, 20);
		panel_5.add(comboBox_6);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(199, 33, 105, 20);
		panel_5.add(comboBox_7);

		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(199, 58, 105, 20);
		panel_5.add(comboBox_8);

		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(199, 83, 105, 20);
		panel_5.add(comboBox_9);

		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(199, 108, 105, 20);
		panel_5.add(comboBox_10);

		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Keamanan", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblNewLabel_20 = new JLabel("Kekokohan");
		lblNewLabel_20.setBounds(10, 11, 126, 14);
		panel_6.add(lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("Kunci Jendela Dan Pintu");
		lblNewLabel_21.setBounds(10, 36, 126, 14);
		panel_6.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("Bahaya");
		lblNewLabel_22.setBounds(10, 61, 126, 14);
		panel_6.add(lblNewLabel_22);

		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setBounds(199, 8, 105, 20);
		panel_6.add(comboBox_11);
		
		comboBox_11.addItem(item1);
		comboBox_11.addItem(item2);
		

		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setBounds(199, 33, 105, 20);
		panel_6.add(comboBox_12);
		
		comboBox_12.addItem(item3);
		comboBox_12.addItem(item2);

		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setBounds(199, 58, 105, 20);
		panel_6.add(comboBox_13);
		
		comboBox_13.addItem(item4);
		comboBox_13.addItem(item5);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(335, 352, 89, 23);
		contentPane.add(btnExit);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			
			Analisis analisis = new Analisis();
			public void actionPerformed(ActionEvent arg0) {
				String Text = textField.getText();
				String Text1 = textField_1.getText();
				String Text2 = textField_2.getText();
				

				if (Text.equals("") || Text1.equals("") || Text2.equals("")
						) {
					JOptionPane.showMessageDialog(null,
							"Semua bagian harus di isi !");
				} else {
					 int selectOption = JOptionPane.showConfirmDialog(null, "Apakah anda yakin save data ini !", "Message", 
                             JOptionPane.YES_NO_OPTION);
					 if(selectOption == JOptionPane.YES_OPTION){
						 
						 Input inputO = new Input();
						 
						 
						try{
							 String Combo1 = comboBox.getActionCommand();
							 
							
							//inputObject.input(textField, textField_1, textField_2, Combo1);
							inputO.input(spinner_2, spinner_3, spinner_4, spinner_5, spinner_6);
							
							 
							 JOptionPane.showMessageDialog(null, "Selamat Penyimpanan Berhasil");
						 }catch(Exception e){
							 JOptionPane.showMessageDialog(null, "Penyimpanan GAGAL dikarenakan System error");
						 }
						
						 
					 }
				}
			}
		});
		btnSave.setBounds(235, 352, 89, 23);
		contentPane.add(btnSave);
	}
}
