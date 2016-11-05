package pengaturanLayout;

import javax.swing.*;
import java.awt.*;

public class AplikasiJpanel extends JFrame{
	JPanel pan = new JPanel();
	JLabel judul = new JLabel ("Masukan Kata Yang Dicari :");
	JTextField txjudul = new JTextField(20);
	JLabel icon = new JLabel(new ImageIcon("images/search.png"));
	
	JButton cari = new JButton ("SEARCHING");
	JButton keluar = new JButton("EXIT");
	Color c = new Color(243, 156, 18);
	
	AplikasiJpanel(){
		setTitle("Aplikasi Panel");
		setLocation(200,100);
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		getContentPane().add(pan);
		pan.setBackground(c);
		
		pan.add(judul);
		pan.add(txjudul);
		pan.add(icon);
		pan.add(cari);
		pan.add(keluar);
		
		setVisible(true);
	}
	
	public static void main(String args[]){
    	AplikasiJpanel AP = new AplikasiJpanel();
    	AP.KomponenVisual();
    }
}