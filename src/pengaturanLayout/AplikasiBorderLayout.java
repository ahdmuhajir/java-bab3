package pengaturanLayout;

import javax.swing.*;
import java.awt.*;
public class AplikasiBorderLayout extends JFrame{
	JLabel judul = new JLabel ("Masukan Kata Yang Diacari");
	JTextField txjudul = new JTextField (20);
	JLabel icon = new JLabel(new ImageIcon("images/search.png"));
	
	JButton cari = new JButton ("SEARCHING");
	JButton keluar = new JButton("EXIT");
	Color c = new Color(243, 156, 18);
	
	AplikasiBorderLayout(){
		setTitle("Aplikasi BroderLayout");
		setLocation(100,100);
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(c);
		getContentPane().add(judul,"North");
		judul.setForeground(Color.WHITE);
		getContentPane().add(txjudul,"East");
		getContentPane().add(icon,"Center");
		getContentPane().add(cari,"West");
		getContentPane().add(keluar,"South");
		
		setVisible(true);
	}
	
	public static void main(String args[]){
    	AplikasiBorderLayout AB= new AplikasiBorderLayout();
    	AB.KomponenVisual();
    }
}