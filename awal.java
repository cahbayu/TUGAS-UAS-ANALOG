import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class awal {

	
	private JFrame frame;
	private JTextField tb;
	private JTable table;
	private DefaultTableModel keluar;
	ArrayList<data>Data = new ArrayList<data>();
	private JTextField jg;
	int Hargay;
	int hargag;
	int harga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					awal window = new awal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Create the application.
	 */
	public awal() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Brush Script MT", Font.PLAIN, 14));
		frame.setBounds(100, 100, 850, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 52, 305, 185);
		panel.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nama Produk");
		lblNewLabel.setBounds(10, 21, 85, 17);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tb = new JTextField();
		
		tb.setBounds(173, 131, 122, 26);
		panel.add(tb);
		tb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tb.setColumns(10);
		
		JComboBox np = new JComboBox();
		np.setFont(new Font("Tahoma", Font.PLAIN, 14));
		np.setModel(new DefaultComboBoxModel(new String[] {"", "Scarlett", "MSglow", "MSglow for MAN", "Wardah", "Nivea"}));
		np.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(np.getSelectedItem()=="Scarlett") {
					Hargay=4;
				}
				if(np.getSelectedItem()=="MSglow") {
					Hargay=2;
				}
				if(np.getSelectedItem()=="MSglow for MAN") {
					Hargay=3;
				}
				if(np.getSelectedItem()=="Wardah") {
					Hargay=1;
				}
				if(np.getSelectedItem()=="Nivea") {
					Hargay=2;
				}
			}
		});
		np.setBounds(173, 16, 122, 26);
		panel.add(np);
		
		
		
		
		JComboBox jb = new JComboBox();
		jb.setModel(new DefaultComboBoxModel(new String[] {"", "Serum", "HandBody", "AnceCream", "tonner", "FacelWash", "Sun Screen", ""}));
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jb.getSelectedItem()=="Serum") {
					hargag=15000;
				}
				if(jb.getSelectedItem()=="HandBody") {
					hargag=20000;
				}
				if(jb.getSelectedItem()=="AnceCream") {
					hargag=19000;
				}
				if(jb.getSelectedItem()=="tonner") {
					hargag=16000;
				}
				if(jb.getSelectedItem()=="FacelWash") {
					hargag=18000;
				}
				if(jb.getSelectedItem()=="Sun Screen") {
					hargag=25000;
				}
			}
		});
		jb.setBounds(173, 52, 122, 26);
		panel.add(jb);
		
		
		JLabel lblNewLabel_1 = new JLabel("Jenis Barang");
		lblNewLabel_1.setBounds(10, 48, 86, 36);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Jumlah Barang Terjual");
		lblNewLabel_2.setBounds(10, 94, 142, 26);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Tanggal Pembelian");
		lblNewLabel_3.setBounds(10, 130, 156, 26);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		jg = new JTextField();
		jg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char a = e.getKeyChar();
				String key = String.valueOf(a);
				if(!(key.matches("(.*)[0-9](.*)")) && (a != '\b')) {
					e.consume();
				}
			
			}
		});
		jg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jg.setBounds(173, 95, 122, 26);
		panel.add(jg);
		jg.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 290, 305, 64);
		panel_1.setBackground(Color.GREEN);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NamaProduk = np.getSelectedItem().toString();
				String JenisBarang = jb.getSelectedItem().toString();
				String JumlahBarang = jg.getText();
				String TanggalPembelian = tb.getText();
				int harga = (Hargay*hargag*(Integer.valueOf(jg.getText())));
				String HargaBarangTerjual = String.valueOf(harga);
				
				Data.add(new data(NamaProduk, JenisBarang, JumlahBarang, TanggalPembelian, HargaBarangTerjual));
				keluar =(DefaultTableModel) table.getModel();
				
				Object[] data = new Object[5];
		        data[0]=NamaProduk;
		        data[1]=JenisBarang;
		        data[2]=JumlahBarang;
		        data[3]=TanggalPembelian;
		        data[4]=HargaBarangTerjual;
		        keluar.addRow(data);

			}
		});
		btnNewButton.setBounds(10, 10, 99, 41);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				keluar.removeRow(row);
				Data.remove(row);
			}
		});
		btnNewButton_1.setBounds(202, 10, 93, 41);
		panel_1.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(337, 52, 465, 302);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nama Produk", "Jenis Barang", "Jumlah Barang", "Tanggal Pemelian", "Harga  Barang Terjual"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(84);
		table.getColumnModel().getColumn(3).setPreferredWidth(111);
		table.getColumnModel().getColumn(4).setPreferredWidth(116);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("DATA PENJAUALAN SKINCARE");
		lblNewLabel_4.setBounds(296, 0, 275, 42);
		lblNewLabel_4.setFont(new Font("Eras Demi ITC", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_4);
	}
}
