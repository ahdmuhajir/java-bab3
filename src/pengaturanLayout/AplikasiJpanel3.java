package pengaturanLayout;

import javax.swing.*;
import java.awt.*;

class AplikasiJpanel3 extends JFrame{
	JPanel panel = new JPanel();
	JLabel judul = new JLabel ("Masukan Kata Yang Dicari :");
	JTextField txjudul = new JTextField(20);
	JLabel icon = new JLabel(new ImageIcon("images/search.png"));
	
	JPanel panel2 = new JPanel();
	JButton cari = new JButton ("SEARCHING");
	JButton keluar = new JButton("EXIT");
	Color c = new Color(243, 156, 18);
	
	AplikasiJpanel3(){
		setTitle("Aplikasi Panel3");
		setLocation(200,100);
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		panel.add(judul);
		judul.setForeground(Color.WHITE);
		panel.add(txjudul);
		panel.add(icon);
		getContentPane().add(panel,BorderLayout.CENTER);
		panel.setBackground(c);
		
		panel2.add(cari);
		panel2.add(keluar);
		getContentPane().add(panel2,BorderLayout.SOUTH);
		panel2.setBackground(Color.RED);
		
		setVisible(true);
	}
	
	public static void main(String args[]){
    	AplikasiJpanel3 AP3= new AplikasiJpanel3();
    	AP3.KomponenVisual();
    }
}