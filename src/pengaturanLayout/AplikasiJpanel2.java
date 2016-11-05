package pengaturanLayout;

import javax.swing.*;
import java.awt.*;

class AplikasiJpanel2 extends JFrame{
	JPanel panel = new JPanel();
	JLabel judul = new JLabel ("Masukan Kata Yang Dicari :");
	JTextField txjudul = new JTextField(20);
	
	JPanel panel2 = new JPanel();
	JLabel icon = new JLabel(new ImageIcon("images/search.png"));
	
	JPanel panel3 = new JPanel();
	JButton cari = new JButton ("SEARCHING");
	JButton keluar = new JButton("EXIT");
	Color c = new Color(243, 156, 18);
	
	AplikasiJpanel2(){
		setTitle("Aplikasi Panel2");
		setLocation(200,100);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		panel.add(judul);
		judul.setForeground(Color.WHITE);
		panel.add(txjudul);
		getContentPane().add(panel,BorderLayout.CENTER);
		panel.setBackground(c);
		
		panel2.add(icon);
		getContentPane().add(panel2,BorderLayout.WEST);
		panel2.setBackground(Color.BLUE);
		
		panel3.add(cari);
		panel3.add(keluar);
		getContentPane().add(panel3,BorderLayout.SOUTH);
		panel3.setBackground(Color.RED);
		
		setVisible(true);
	}
	
	public static void main(String args[]){
    	AplikasiJpanel2 AP2 = new AplikasiJpanel2();
    	AP2.KomponenVisual();
    }
}	