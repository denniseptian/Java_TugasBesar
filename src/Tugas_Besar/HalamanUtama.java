package Tugas_Besar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTable;

import java.sql.*;
import java.awt.ScrollPane;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class HalamanUtama extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HalamanUtama frame = new HalamanUtama();
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
	Koneksi connection = new Koneksi();
	private JTable table;

	public HalamanUtama() {
		connection.Database();
		setTitle("Inventaris");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 548, 25);
		contentPane.add(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);

		JMenuItem mntmDataRuanganBaru = new JMenuItem("New Data");
		mntmDataRuanganBaru
				.setIcon(new ImageIcon(
						"D:\\Java\\Java_TugasBesar\\Java_TugasBesar\\1338978696_gtk-edit.png"));
		mnMenu.add(mntmDataRuanganBaru);

		JMenuItem mntmEditData = new JMenuItem("Edit Data");
		mnMenu.add(mntmEditData);

		JMenuItem mntmDeleteData = new JMenuItem("Delete Data");
		mnMenu.add(mntmDeleteData);

		JMenuItem mntmLoadData = new JMenuItem("Load Data");
		mnMenu.add(mntmLoadData);

		mntmLoadData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String query = "select * from identitas";

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mnMenu.add(mntmLogOut);

		mntmLogOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Login.main(null);
				dispose();
			}
		});

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnMenu.add(mntmExit);

		mntmExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int selectOption = JOptionPane.showConfirmDialog(null,
						"Apakah anda yakin save data ini !", "Message",
						JOptionPane.YES_NO_OPTION);
				if (selectOption == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmVersion = new JMenuItem("Software Version");
		mnHelp.add(mntmVersion);

		mntmVersion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				InformasiSoftware.main(null);
			}
		});

		JMenuItem mntmHelp = new JMenuItem("Help");
		mnHelp.add(mntmHelp);

		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 528, 221);
		contentPane.add(panel);
		panel.setLayout(null);

		Koneksi connection = new Koneksi();
		

		mntmExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		mntmDataRuanganBaru.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				inputForm.main(null);
			}
		});

	}
}
