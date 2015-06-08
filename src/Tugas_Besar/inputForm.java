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
import javax.swing.JToggleButton;

public class inputForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		lblNewLabel_4.setBounds(432, 11, 55, 14);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Posisi");
		lblNewLabel_5.setBounds(589, 11, 46, 14);
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

		JSlider slider_8 = new JSlider();
		slider_8.setBounds(122, 40, 200, 23);
		panel_2.add(slider_8);

		JSlider slider_9 = new JSlider();
		slider_9.setBounds(122, 65, 200, 23);
		panel_2.add(slider_9);

		JSlider slider_10 = new JSlider();
		slider_10.setBounds(122, 90, 200, 23);
		panel_2.add(slider_10);

		JSlider slider_11 = new JSlider();
		slider_11.setBounds(122, 115, 200, 23);
		panel_2.add(slider_11);

		JSlider slider_12 = new JSlider();
		slider_12.setBounds(122, 140, 200, 23);
		panel_2.add(slider_12);

		JSlider slider_13 = new JSlider();
		slider_13.setBounds(122, 165, 200, 23);
		panel_2.add(slider_13);

		String KondisiKabeh[] = { "Baik", "Rusak" };

		JComboBox comboBox_15 = new JComboBox(KondisiKabeh);
		comboBox_15.setBounds(380, 37, 136, 20);
		panel_2.add(comboBox_15);

		JComboBox comboBox_16 = new JComboBox(KondisiKabeh);
		comboBox_16.setBounds(380, 62, 136, 20);
		panel_2.add(comboBox_16);

		JComboBox comboBox_17 = new JComboBox(KondisiKabeh);
		comboBox_17.setBounds(380, 87, 136, 20);
		panel_2.add(comboBox_17);

		JComboBox comboBox_18 = new JComboBox(KondisiKabeh);
		comboBox_18.setBounds(380, 112, 136, 20);
		panel_2.add(comboBox_18);

		JComboBox comboBox_19 = new JComboBox(KondisiKabeh);
		comboBox_19.setBounds(380, 137, 136, 20);
		panel_2.add(comboBox_19);

		JComboBox comboBox_20 = new JComboBox(KondisiKabeh);
		comboBox_20.setBounds(380, 162, 136, 20);
		panel_2.add(comboBox_20);

		String ComboStopKontak[] = { "Pojok Dekat Dosen", "Pojok Belakang" };
		String ComboKabelLCD[] = { "Pojok Dekat Dosen", "Tengah" };
		String PosisiLamuCombo[] = { "Atap", "Dinding" };
		String ComboKipasAngin[] = { "Dinding Atas", "Atap" };

		JComboBox comboBox_21 = new JComboBox(ComboStopKontak);
		comboBox_21.setBounds(553, 37, 118, 20);
		panel_2.add(comboBox_21);

		JComboBox comboBox_22 = new JComboBox(ComboKabelLCD);
		comboBox_22.setBounds(553, 62, 118, 20);
		panel_2.add(comboBox_22);

		JComboBox comboBox_23 = new JComboBox(PosisiLamuCombo);
		comboBox_23.setBounds(553, 87, 118, 20);
		panel_2.add(comboBox_23);

		JComboBox comboBox_24 = new JComboBox(ComboKipasAngin);
		comboBox_24.setBounds(553, 112, 118, 20);
		panel_2.add(comboBox_24);

		JComboBox comboBox_25 = new JComboBox(ComboKipasAngin);
		comboBox_25.setBounds(553, 137, 118, 20);
		panel_2.add(comboBox_25);

		JComboBox comboBox_26 = new JComboBox(ComboKipasAngin);
		comboBox_26.setBounds(553, 162, 118, 20);
		panel_2.add(comboBox_26);

		String bandwithJc[] = { "256", "512", "1024" };
		JComboBox comboBox_27 = new JComboBox(bandwithJc);
		comboBox_27.setBounds(267, 245, 89, 20);
		panel_2.add(comboBox_27);
		
		String sSID[] = {"UMM Hotspot","Lain-nya"};
		JComboBox comboBox_28 = new JComboBox(sSID);
		comboBox_28.setBounds(84, 245, 127, 20);
		panel_2.add(comboBox_28);

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

		ButtonGroup GroubKondisiLantai = new ButtonGroup();

		ButtonGroup GroubKondisiDinding = new ButtonGroup();

		ButtonGroup GroupKondisiAtap = new ButtonGroup();

		ButtonGroup GroupKondisiPintu = new ButtonGroup();

		ButtonGroup GroubKondisiJendela = new ButtonGroup();

		JLabel lblNewLabel_27 = new JLabel("Kondisi");
		lblNewLabel_27.setBounds(198, 37, 70, 14);
		panel_3.add(lblNewLabel_27);

		String Kebersihan[] = { "Bersih", "Kotor" };

		JComboBox comboBox_2 = new JComboBox(Kebersihan);
		comboBox_2.setBounds(155, 57, 147, 20);
		panel_3.add(comboBox_2);

		JComboBox comboBox_3 = new JComboBox(Kebersihan);
		comboBox_3.setBounds(155, 82, 147, 20);
		panel_3.add(comboBox_3);

		JComboBox comboBox_4 = new JComboBox(Kebersihan);
		comboBox_4.setBounds(155, 107, 147, 20);
		panel_3.add(comboBox_4);

		JComboBox comboBox_5 = new JComboBox(Kebersihan);
		comboBox_5.setBounds(155, 132, 147, 20);
		panel_3.add(comboBox_5);

		JComboBox comboBox_14 = new JComboBox(Kebersihan);
		comboBox_14.setBounds(155, 157, 147, 20);
		panel_3.add(comboBox_14);

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

		JSlider slider = new JSlider();
		slider.setBounds(204, 61, 200, 23);
		panel_4.add(slider);

		JSlider slider_1 = new JSlider();
		slider_1.setBounds(204, 86, 200, 23);
		panel_4.add(slider_1);

		JSlider slider_2 = new JSlider();
		slider_2.setBounds(204, 36, 200, 23);
		panel_4.add(slider_2);

		String Combo1[] = { "Baik", "Buruk" };
		JComboBox comboBox_1 = new JComboBox(Combo1);
		comboBox_1.setBounds(204, 8, 200, 20);
		panel_4.add(comboBox_1);

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
				int selectOption = JOptionPane.showConfirmDialog(null,
						"Apakah anda yakin save data ini !", "Message",
						JOptionPane.YES_NO_OPTION);
				if(selectOption == JOptionPane.YES_OPTION){
					dispose();
				}
				
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
				String SirkulasiUdara = comboBox_1.getSelectedItem().toString();
				int Pencahayaan = slider.getValue();
				int Kelembapan = slider_1.getValue();
				int Suhu = slider_2.getValue();
				int panjang = slider_3.getValue();
				int lebar = slider_4.getValue();
				int JumlahKursi = slider_5.getValue();
				int JumlahPintu = slider_6.getValue();
				int JumlahJendela = slider_7.getValue();
				String KondisiLantai = comboBox_2.getSelectedItem().toString();
				String KondisiDinding = comboBox_3.getSelectedItem().toString();
				String KondisiAtap = comboBox_4.getSelectedItem().toString();
				String KondisiPintu = comboBox_5.getSelectedItem().toString();
				String KondisiJendela = comboBox_14.getSelectedItem()
						.toString();
				int JumlahStopKontak = slider_8.getValue();
				String KondisiStopKontak = comboBox_15.getSelectedItem()
						.toString();
				String PosisiStopKontak = comboBox_21.getSelectedItem()
						.toString();
				int JumlahKabelLCD = slider_9.getValue();
				String KondisiKabelLCD = comboBox_16.getSelectedItem()
						.toString();
				String PosisiKabelLCD = comboBox_21.getSelectedItem()
						.toString();
				int JumlahLampu = slider_10.getValue();
				String KondisiLampu = comboBox_17.getSelectedItem().toString();
				String PosisiLampu = comboBox_22.getSelectedItem().toString();
				String KondisiKipas = comboBox_18.getSelectedItem().toString();
				String PosisiKipasAngin = comboBox_23.getSelectedItem()
						.toString();
				String KondisiAC = comboBox_19.getSelectedItem().toString();
				String PosisiAC = comboBox_24.getSelectedItem().toString();
				String SSID = comboBox_28.getSelectedItem().toString();
				int JumlahKipasAngin = slider_11.getValue();
				int JumlahAC = slider_12.getValue();
				int JumlahCCTV = slider_13.getValue();
				int Bandwith = Integer.parseInt(comboBox_27.getSelectedItem()
						.toString());
				String KondisiCCTV = comboBox_20.getSelectedItem().toString();
				String PosisiCCTV = comboBox_25.getSelectedItem().toString();

				/** Brance **/

				if (Text.equals("") || Text1.equals("") || Text2.equals("")
						|| SirkulasiUdara.equals("")) {
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
							input.input(JumlahStopKontak, KondisiStopKontak,
									PosisiStopKontak, JumlahKabelLCD,
									KondisiKabelLCD, PosisiKabelLCD,
									JumlahLampu, KondisiLampu, PosisiLampu,
									JumlahKipasAngin, KondisiKipas,
									PosisiKipasAngin, JumlahAC, KondisiAC,
									PosisiAC, SSID, Bandwith, JumlahCCTV,
									KondisiCCTV, PosisiCCTV);
							input.inputKenyamanan(KondisiLantai,
									KondisiDinding, KondisiAtap, KondisiPintu,
									KondisiJendela);
							input.input(SirkulasiUdara, Pencahayaan,
									Kelembapan, Suhu);
							input.input(Kebisingan, Bau, Kebocoran, Kerusakan,
									Keausan);
							input.input(Kekokohan, Kunci, Bahaya);
							
							JOptionPane.showMessageDialog(null, "All Data Saved to Database ");
							
							dispose();

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
