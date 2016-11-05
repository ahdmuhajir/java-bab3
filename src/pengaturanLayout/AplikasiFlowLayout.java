package pengaturanLayout;

import javax.swing.*;
import java.awt.*;

class AplikasiFlowLayout extends JFrame{
	JLabel judul = new JLabel("Masukan Kata Yang Dicari : ");
	JTextField txjudul = new JTextField(20);
	JLabel icon = new JLabel(new ImageIcon("images/search.png"));
	
	JButton cari = new JButton ("SEARCHING");
	Color c = new Color(243, 156, 18);
	
	AplikasiFlowLayout(){
		setTitle("Alikasi FlowLayout");
		setLocation(200,100);
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
		
	void KomponenVisual(){
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(c);
		getContentPane().add(judul);
		getContentPane().add(txjudul);
		getContentPane().add(icon);
		getContentPane().add(cari);
		
		setVisible(true);
	}
	
	public static void main(String args[]){
    	AplikasiFlowLayout AF = new AplikasiFlowLayout();
    	AF.KomponenVisual();
    }
}