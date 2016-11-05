package pengaturanLayout;
import javax.swing.*;
import java.awt.*;

public class AplikasiGridLayout extends JFrame{
	JLabel judul = new JLabel ("Masukan Kata Yang Dicari :");
	JTextField txjudul = new JTextField(20);
	JLabel icon = new JLabel(new ImageIcon("images/search.png"));
	
	JButton cari = new JButton ("SEARCHING");
	JButton keluar = new JButton("EXIT");
	Color c = new Color(243, 156, 18);
	
	AplikasiGridLayout(){
		setTitle("Aplikasi GridLayout");
		setLocation(200,100);
		setSize(450,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		getContentPane().setLayout(new GridLayout(3,2,10,10));
		getContentPane().setBackground(c);
		getContentPane().add(judul);
		judul.setForeground(Color.WHITE);
		getContentPane().add(txjudul);
		getContentPane().add(icon);
		getContentPane().add(cari);
		getContentPane().add(keluar);
		
		setVisible(true);
	}
	
	public static void main(String args[]){
    	AplikasiGridLayout AG = new AplikasiGridLayout();
    	AG.KomponenVisual();
    }
}