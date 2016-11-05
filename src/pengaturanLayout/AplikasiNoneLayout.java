package pengaturanLayout;
import javax.swing.*;
import java.awt.*;

public class AplikasiNoneLayout extends JFrame{
	JLabel judul = new JLabel ("Masukan Kata Yang Dicari :");
	JTextField txjudul = new JTextField(20);
	JLabel icon = new JLabel(new ImageIcon("images/search.png"));
	
	JButton cari = new JButton ("SEARCHING");
	JButton keluar = new JButton("EXIT");
	Color c = new Color(243, 156, 18);
	
	AplikasiNoneLayout(){
		setTitle("Aplikasi NoneLayout");
		setLocation(200,100);
		setSize(300,170);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		
		getContentPane().add(judul);
		judul.setForeground(Color.WHITE);
		judul.setBounds(10,10,180,20);
			
		getContentPane().add(txjudul);
		txjudul.setBounds(10,40,210,20);
		
		getContentPane().add(icon);		
		icon.setBounds(220,0,50,50);

		getContentPane().add(cari);
		cari.setBounds(10,70,100,40);
		
		getContentPane().add(keluar);
		keluar.setBounds(120,70,100,40);
		
		setVisible(true);
	}
	
	public static void main(String args[]){
    	AplikasiNoneLayout AN = new AplikasiNoneLayout();
    	AN.KomponenVisual();
    }
}