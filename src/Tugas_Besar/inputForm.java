//backup

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

import javax.swing.ButtonGroup;
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
import java.net.Inet4Address;
import java.security.acl.Group;

import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

import com.sun.glass.events.KeyEvent;

public class inputForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */

	/** Main Action **/

	String item = "Bersih";
	String item1 = "Kokoh";
	String item2 = "Tidak";
	String item3 = "Ada";
	String item4 = "Aman";
	String item5 = "Bahaya";
	String gkb1 = "GKB1";
	String gkb2 = "GKB2";
	String gkb3 = "GKB3";
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

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
		setBounds(100, 100, 760, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(10, 11, 718, 374);
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

		String pilihanGKB[] = { "GKB1", "GKB2", "GKB3" };

		JComboBox comboBox = new JComboBox(pilihanGKB);
		comboBox.setBounds(199, 83, 105, 20);
		panel.add(comboBox);

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

		JSlider slider_3 = new JSlider();
		slider_3.setBounds(128, 2, 200, 23);
		panel_1.add(slider_3);

		JSlider slider_4 = new JSlider();
		slider_4.setBounds(128, 26, 200, 23);
		panel_1.add(slider_4);

		JSlider slider_5 = new JSlider();
		slider_5.setBounds(128, 51, 200, 23);
		panel_1.add(slider_5);

		JSlider slider_6 = new JSlider();
		slider_6.setBounds(128, 76, 200, 23);
		panel_1.add(slider_6);

		JSlider slider_7 = new JSlider();
		slider_7.setBounds(128, 101, 200, 23);
		panel_1.add(slider_7);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Sarana", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Jumlah Stop Kontak");
		lblNewLabel_3.setBounds(10, 40, 118, 14);
		panel_2.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Kondisi");
		lblNewLabel_4.setBounds(301, 11, 55, 14);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Posisi");
		lblNewLabel_5.setBounds(458, 11, 46, 14);
		panel_2.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Jumlah Kabel LCD");
		lblNewLabel_6.setBounds(10, 65, 118, 14);
		panel_2.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Jumlah Lampu");
		lblNewLabel_7.setBounds(10, 90, 118, 14);
		panel_2.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Jumlah Kipas Angin");
		lblNewLabel_8.setBounds(10, 115, 118, 14);
		panel_2.add(lblNewLabel_8);

		JLabel lblNewLabel_23 = new JLabel("Jumlah AC");
		lblNewLabel_23.setBounds(10, 140, 118, 14);
		panel_2.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("CCTV");
		lblNewLabel_24.setBounds(10, 165, 46, 14);
		panel_2.add(lblNewLabel_24);

		JLabel lblNewLabel_25 = new JLabel("SSID");
		lblNewLabel_25.setBounds(10, 248, 46, 14);
		panel_2.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("Bandwith");
		lblNewLabel_26.setBounds(290, 223, 66, 14);
		panel_2.add(lblNewLabel_26);

		textField_3 = new JTextField();
		textField_3.setBounds(138, 37, 86, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);

		JRadioButton rdbtnBaik = new JRadioButton("Baik");
		rdbtnBaik.setBounds(339, 36, 85, 23);
		panel_2.add(rdbtnBaik);

		JRadioButton rdbtnRusak = new JRadioButton("Rusak");
		rdbtnRusak.setBounds(244, 36, 93, 23);
		panel_2.add(rdbtnRusak);

		JRadioButton rdbtnPojok = new JRadioButton("Pojok");
		rdbtnPojok.setBounds(426, 36, 77, 23);
		panel_2.add(rdbtnPojok);

		JRadioButton rdbtnTengah = new JRadioButton("Tengah");
		rdbtnTengah.setBounds(505, 36, 109, 23);
		panel_2.add(rdbtnTengah);

		textField_4 = new JTextField();
		textField_4.setBounds(138, 62, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Rusak");
		rdbtnNewRadioButton.setBounds(244, 61, 90, 23);
		panel_2.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bailk");
		rdbtnNewRadioButton_1.setBounds(339, 61, 85, 23);
		panel_2.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnPojok_1 = new JRadioButton("Pojok");
		rdbtnPojok_1.setBounds(426, 61, 77, 23);
		panel_2.add(rdbtnPojok_1);

		JRadioButton rdbtnTengah_1 = new JRadioButton("Tengah");
		rdbtnTengah_1.setBounds(505, 61, 109, 23);
		panel_2.add(rdbtnTengah_1);

		textField_5 = new JTextField();
		textField_5.setBounds(138, 87, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(138, 112, 86, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(138, 137, 86, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(138, 162, 86, 20);
		panel_2.add(textField_10);
		textField_10.setColumns(10);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Rusak");
		rdbtnNewRadioButton_2.setBounds(244, 86, 93, 23);
		panel_2.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Rusak");
		rdbtnNewRadioButton_3.setBounds(244, 111, 93, 23);
		panel_2.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Rusak");
		rdbtnNewRadioButton_4.setBounds(244, 136, 93, 23);
		panel_2.add(rdbtnNewRadioButton_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Rusak");
		rdbtnNewRadioButton_5.setBounds(244, 161, 93, 23);
		panel_2.add(rdbtnNewRadioButton_5);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Baik");
		rdbtnNewRadioButton_6.setBounds(339, 86, 86, 23);
		panel_2.add(rdbtnNewRadioButton_6);

		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Baik");
		rdbtnNewRadioButton_7.setBounds(339, 111, 86, 23);
		panel_2.add(rdbtnNewRadioButton_7);

		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Baik");
		rdbtnNewRadioButton_8.setBounds(339, 136, 86, 23);
		panel_2.add(rdbtnNewRadioButton_8);

		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Baik");
		rdbtnNewRadioButton_9.setBounds(339, 161, 86, 23);
		panel_2.add(rdbtnNewRadioButton_9);

		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Atap");
		rdbtnNewRadioButton_10.setBounds(426, 86, 78, 23);
		panel_2.add(rdbtnNewRadioButton_10);

		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Atap");
		rdbtnNewRadioButton_11.setBounds(426, 111, 78, 23);
		panel_2.add(rdbtnNewRadioButton_11);

		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Atap");
		rdbtnNewRadioButton_12.setBounds(426, 136, 78, 23);
		panel_2.add(rdbtnNewRadioButton_12);

		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Atap");
		rdbtnNewRadioButton_13.setBounds(426, 161, 78, 23);
		panel_2.add(rdbtnNewRadioButton_13);

		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Tembok");
		rdbtnNewRadioButton_14.setBounds(505, 86, 109, 23);
		panel_2.add(rdbtnNewRadioButton_14);

		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Tembok");
		rdbtnNewRadioButton_15.setBounds(505, 111, 109, 23);
		panel_2.add(rdbtnNewRadioButton_15);

		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("Tembok");
		rdbtnNewRadioButton_16.setBounds(505, 136, 109, 23);
		panel_2.add(rdbtnNewRadioButton_16);

		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("Tembok");
		rdbtnNewRadioButton_17.setBounds(505, 161, 109, 23);
		panel_2.add(rdbtnNewRadioButton_17);

		textField_11 = new JTextField();
		textField_11.setBounds(138, 245, 86, 20);
		panel_2.add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setBounds(270, 245, 86, 20);
		panel_2.add(textField_12);
		textField_12.setColumns(10);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Lingkungan", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("Kondisi Lantai");
		lblNewLabel_9.setBounds(10, 60, 96, 14);
		panel_3.add(lblNewLabel_9);

		JLabel lblKondisiDinding = new JLabel("Kondisi Dinding");
		lblKondisiDinding.setBounds(10, 85, 96, 14);
		panel_3.add(lblKondisiDinding);

		JLabel lblKondisiAtap = new JLabel("Kondisi Atap");
		lblKondisiAtap.setBounds(10, 110, 96, 14);
		panel_3.add(lblKondisiAtap);

		JLabel lblNewLabel_10 = new JLabel("Kondisi Pintu");
		lblNewLabel_10.setBounds(10, 135, 96, 14);
		panel_3.add(lblNewLabel_10);

		JLabel lblKondisiJendela = new JLabel("Kondisi Jendela");
		lblKondisiJendela.setBounds(10, 160, 96, 14);
		panel_3.add(lblKondisiJendela);

		JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_18.setBounds(177, 56, 109, 23);
		panel_3.add(rdbtnNewRadioButton_18);

		JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("Kotor");
		rdbtnNewRadioButton_19.setBounds(307, 56, 109, 23);
		panel_3.add(rdbtnNewRadioButton_19);
		
		ButtonGroup GroubKondisiLantai = new ButtonGroup();
		 GroubKondisiLantai.add(rdbtnNewRadioButton_18);
		 GroubKondisiLantai.add(rdbtnNewRadioButton_19);
		

		JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_20.setBounds(177, 81, 109, 23);
		panel_3.add(rdbtnNewRadioButton_20);

		JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("Kotor");
		rdbtnNewRadioButton_21.setBounds(307, 81, 109, 23);
		panel_3.add(rdbtnNewRadioButton_21);
		
		ButtonGroup GroubKondisiDinding = new ButtonGroup();
		GroubKondisiDinding.add(rdbtnNewRadioButton_20);
		GroubKondisiDinding.add(rdbtnNewRadioButton_21);

		JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_22.setBounds(177, 106, 109, 23);
		panel_3.add(rdbtnNewRadioButton_22);

		JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("Kotor");
		rdbtnNewRadioButton_23.setBounds(307, 106, 109, 23);
		panel_3.add(rdbtnNewRadioButton_23);
		
		ButtonGroup GroupKondisiAtap = new ButtonGroup();
		GroupKondisiAtap.add(rdbtnNewRadioButton_22);
		GroupKondisiAtap.add(rdbtnNewRadioButton_23);

		JRadioButton rdbtnNewRadioButton_24 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_24.setBounds(177, 131, 109, 23);
		panel_3.add(rdbtnNewRadioButton_24);

		JRadioButton rdbtnNewRadioButton_25 = new JRadioButton("Kotor");
		rdbtnNewRadioButton_25.setBounds(307, 131, 109, 23);
		panel_3.add(rdbtnNewRadioButton_25);
		
		ButtonGroup GroupKondisiPintu = new ButtonGroup();
		GroupKondisiPintu.add(rdbtnNewRadioButton_24);
		GroupKondisiPintu.add(rdbtnNewRadioButton_25);

		JRadioButton rdbtnNewRadioButton_26 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_26.setBounds(177, 156, 109, 23);
		panel_3.add(rdbtnNewRadioButton_26);

		JRadioButton rdbtnNewRadioButton_27 = new JRadioButton("Kotor");
		rdbtnNewRadioButton_27.setBounds(307, 156, 109, 23);
		panel_3.add(rdbtnNewRadioButton_27);
		
		ButtonGroup GroubKondisiJendela = new ButtonGroup();
		GroubKondisiJendela.add(rdbtnNewRadioButton_26);
		GroubKondisiJendela.add(rdbtnNewRadioButton_27);

		JLabel lblNewLabel_27 = new JLabel("Kondisi");
		lblNewLabel_27.setBounds(232, 23, 70, 14);
		panel_3.add(lblNewLabel_27);

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
		textField_8.setBounds(204, 8, 200, 20);
		panel_4.add(textField_8);
		textField_8.setColumns(10);

		JSlider slider = new JSlider();
		slider.setBounds(204, 61, 200, 23);
		panel_4.add(slider);

		JSlider slider_1 = new JSlider();
		slider_1.setBounds(204, 86, 200, 23);
		panel_4.add(slider_1);

		JSlider slider_2 = new JSlider();
		slider_2.setBounds(204, 36, 200, 23);
		panel_4.add(slider_2);

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

		String ComboBoxMenus_6[] = { "Tidak Bising", "Bising" };

		JComboBox comboBox_6 = new JComboBox(ComboBoxMenus_6);
		comboBox_6.setBounds(199, 8, 105, 20);
		panel_5.add(comboBox_6);

		String ComboBoxMenus_7[] = { "Tidak Bau", "Bau" };

		JComboBox comboBox_7 = new JComboBox(ComboBoxMenus_7);
		comboBox_7.setBounds(199, 33, 105, 20);
		panel_5.add(comboBox_7);

		String ComboBoxMenus_8[] = { "Tidak Bocor", "Bocor" };

		JComboBox comboBox_8 = new JComboBox(ComboBoxMenus_8);
		comboBox_8.setBounds(199, 58, 105, 20);
		panel_5.add(comboBox_8);

		String ComboBoxMenus_9[] = { "Tidak Rusak", "Rusak" };

		JComboBox comboBox_9 = new JComboBox(ComboBoxMenus_9);
		comboBox_9.setBounds(199, 83, 105, 20);
		panel_5.add(comboBox_9);

		String ComboBoxMenus_10[] = { "Tidak Aus", "Aus" };

		JComboBox comboBox_10 = new JComboBox(ComboBoxMenus_10);
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

		String Combo11_a = "Kokoh";
		String Combo11_b = "Tidak";
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setBounds(199, 8, 105, 20);
		panel_6.add(comboBox_11);
		comboBox_11.addItem(Combo11_a);
		comboBox_11.addItem(Combo11_b);

		String Combo12_a = "Ada";
		String Combo12_b = "Tidak";
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setBounds(199, 33, 105, 20);
		panel_6.add(comboBox_12);
		comboBox_12.addItem(Combo12_a);
		comboBox_12.addItem(Combo12_b);

		String Combo13_a = "Bahaya";
		String COmbo13_b = "Tidak";
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setBounds(199, 58, 105, 20);
		panel_6.add(comboBox_13);
		comboBox_13.addItem(Combo13_a);
		comboBox_13.addItem(COmbo13_b);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(637, 396, 89, 23);
		contentPane.add(btnExit);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				String Text = textField.getText();
				String Text1 = textField_1.getText();
				String Text2 = textField_2.getText();
				String GKB = comboBox.getSelectedItem().toString();
				String Kebisingan = comboBox_6.getSelectedItem().toString();
				String Bau = comboBox_7.getSelectedItem().toString();
				String Kebocoran = comboBox_8.getSelectedItem().toString();
				String Kerusakan = comboBox_9.getSelectedItem().toString();
				String Keausan = comboBox_10.getSelectedItem().toString();
				String Kekokohan = comboBox_11.getSelectedItem().toString();
				String Kunci = comboBox_12.getSelectedItem().toString();
				String Bahaya = comboBox_13.getSelectedItem().toString();
				String SirkulasiUdara = textField_8.getText();
				int Pencahayaan = slider.getValue();
				int Kelembapan = slider_1.getValue();
				int Suhu = slider_2.getValue();
				int panjang = slider_3.getValue();
				int lebar = slider_4.getValue();
				int JumlahKursi = slider_5.getValue();
				int JumlahPintu = slider_6.getValue();
				int JumlahJendela = slider_7.getValue();
				String KondisiLantai;
				String KondisiDinding;
				String KondisiAtap;
				String KondisiPintu;
				String KondisiJendela;
				int JumlahStopKontak = Integer.parseInt(textField_3.getText());
				String KondisiStopKontak;
				String PosisiStopKontak;
				int JumlahKabelLCD = Integer.parseInt(textField_4.getText());
				String KondisiKabelLCD;
				String PosisiKabelLCD;
				int JumlahLampu = Integer.parseInt(textField_5.getText());
				String KondisiLampu;
				String PosisiLampu;
				int JumlahKipasAngin = Integer.parseInt(textField_6.getText());
				String KondisiKipas;
				String PosisiKipasAngin;
				int JumlahAC = Integer.parseInt(textField_7.getText());
				String KondisiAC;
				String PosisiAC;
				String SSID;
				int Bandwith = Integer.parseInt(textField_12.getText());
				int JumlahCCTV = Integer.parseInt(textField_10.getText());
				String KondisiCCTV;
				String PosisiCCTV;

				/** Brance **/

				if (Text.equals("") || Text1.equals("") || Text2.equals("") || SirkulasiUdara.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Semua bagian harus di isi !");
				}
				
				
				else {
					int selectOption = JOptionPane.showConfirmDialog(null,
							"Apakah anda yakin save data ini !", "Message",
							JOptionPane.YES_NO_OPTION);
					if (selectOption == JOptionPane.YES_OPTION) {

						Input input = new Input();

						try {

							input.input(Text, GKB, Text1, Text2);
							input.input(panjang, lebar, JumlahKursi,
									JumlahPintu, JumlahJendela);
							input.input(SirkulasiUdara, Pencahayaan,
									Kelembapan, Suhu);
							input.input(Kebisingan, Bau, Kebocoran, Kerusakan,
									Keausan);

							input.input(Kekokohan, Kunci, Bahaya);

							JOptionPane.showMessageDialog(null,
									"All Data Saved"+JumlahStopKontak);
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null,
									"Warning! Ceck you're input");
						}

					}
				}
			}
		});
		btnSave.setBounds(538, 396, 89, 23);
		contentPane.add(btnSave);
	}
}
