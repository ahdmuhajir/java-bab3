package pengaturanLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TugasBab2 extends JFrame{
	JLabel creator = new JLabel ("Created by Ahd Muhajir");
	JLabel judul = new JLabel ("KALKULATOR LOGIKA");
	JLabel input1 = new JLabel ("MASUKAN NILAI PERTAMA");
	JLabel input2 = new JLabel ("MASUKAN NILAI KEDUA");
	JLabel hasil = new JLabel ("HASIL");
	Color c = new Color(243, 156, 18);
	JLabel kalicon = new JLabel (new ImageIcon("images/calculator.png"));
	
	JTextField txinput1 = new JTextField (12);
	JTextField txinput2 = new JTextField (12);
	JTextField txhasil = new JTextField (12);
	
	JButton and = new JButton ("&");
	JButton and2 = new JButton ("&&");
	JButton or = new JButton ("|");
	JButton or2 = new JButton ("||");
	JButton not = new JButton ("!");
	JButton lbd = new JButton (">=");
	JButton kbd= new JButton ("<=");
	JButton samadgn = new JButton ("==");
	JButton infinite = new JButton ("~");
	JButton pangkat = new JButton ("^");
	JButton movekanan = new JButton (">>");
	JButton movekiri = new JButton ("<<");
	JButton clear = new JButton ("CLEAR");
	JButton exit = new JButton ("EXIT");
	 
	 TugasBab2(){
	 	setTitle("KALKULATOR LOGIKA");
	 	setLocation(200,100);
	 	setSize(320,500);
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	 
	 void komVisual(){
	 	getContentPane().setLayout(null);
	 	getContentPane().setBackground(c);
	 	
	 	getContentPane().add(judul);
	 	judul.setBounds(100,25,200,20);
	 	judul.setForeground(Color.BLACK);
	 	
	 	getContentPane().add(creator);
	 	creator.setBounds(95,45,200,20);
	 	creator.setForeground(Color.BLACK);
	 	
	 	getContentPane().add(input1);
	 	input1.setBounds(80,120,200,20);
	 	input1.setForeground(Color.BLACK);
	 	
	 	getContentPane().add(txinput1);
	 	txinput1.setBounds(10,150,280,20);
	 	txinput1.setHorizontalAlignment(SwingConstants.CENTER);
	 	
	 	getContentPane().add(input2);
	 	input2.setBounds(90,190,200,20);
	 	input2.setForeground(Color.BLACK);
	 	
	 	getContentPane().add(txinput2);
	 	txinput2.setBounds(10,220,280,20);
	 	txinput2.setHorizontalAlignment(SwingConstants.CENTER);
	 	
	 	
	 	getContentPane().add(hasil);
	 	hasil.setBounds(140,340,100,20);
	 	hasil.setForeground(Color.BLACK);
	 	
	 	getContentPane().add(txhasil);
	 	txhasil.setBounds(10,370,280,20);
	 	txhasil.setHorizontalAlignment(SwingConstants.CENTER);
	 	
	 	getContentPane().add(kalicon);
	 	kalicon.setBounds(10,10,60,60);
	 	
	 	
	 	getContentPane().add(and);
	 	and.setBounds(10,250,50,20);
	 	
	 	getContentPane().add(and2);
	 	and2.setBounds(68,250,55,20);
	 	
	 	getContentPane().add(or);
	 	or.setBounds(130,250,50,20);
	 	
	 	getContentPane().add(or2);
	 	or2.setBounds(185,250,50,20);
	 	
	 	getContentPane().add(not);
	 	not.setBounds(245,250,45,20);
	 	
	 	getContentPane().add(lbd);
	 	lbd.setBounds(30,280,50,20);
	 	
	 	getContentPane().add(kbd);
	 	kbd.setBounds(90,280,50,20);
	 	
	 	getContentPane().add(samadgn);
	 	samadgn.setBounds(150,280,50,20);
	 	
	 	getContentPane().add(infinite);
	 	infinite.setBounds(210,280,50,20);
	 	
	 	getContentPane().add(pangkat);
	 	pangkat.setBounds(60,310,50,20);
	 	
	 	getContentPane().add(movekanan);
	 	movekanan.setBounds(120,310,50,20);
	 	
	 	getContentPane().add(movekiri);
	 	movekiri.setBounds(180,310,50,20);
	 	
	 	getContentPane().add(clear);
	 	clear.setBounds(10,400,130,40);
	 	clear.setIcon(new ImageIcon("gambar/remove.png"));
	 		
	 	getContentPane().add(exit);
	 	exit.setBounds(160,400,130,40);
	 	exit.setIcon(new ImageIcon("gambar/exit.png"));
	 
	 	setVisible(true);
	 }
	 
	 void aksiReaksi(){
	 	and.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			String z = String.valueOf(x&y);
	 			txhasil.setText(z);
	 		}
	 	});
	 	
	 	and2.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			String z;
	 			if ((x>=2)&&(y++<10))
					y+=2;
					{
						z = String.valueOf(y);
						txhasil.setText(z);
					}
	 		}
	 	});
	 	
	 	or.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			String z = String.valueOf(x|y);
	 			txhasil.setText(z);
	 		}
	 	});
	 	
	 	or2.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			String z;
	 			if ((x>=2)||(y++<10))
					y+=2;
					{
						z = String.valueOf(y);
						txhasil.setText(z);
					}
	 		}
	 	});
	 	
	 	not.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			if (x!=y){
	 				String z = "true";
	 				txhasil.setText(z);
	 				}else{
	 				String z = "false";
	 				txhasil.setText(z);
	 			}
	 			
	 		}
	 	});
	 	
	 	lbd.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			if (x>=y){
	 				String z = "true";
	 				txhasil.setText(z);
	 			}
	 			else{
	 				String z = "false";
	 				txhasil.setText(z);
	 			}
	 			
	 		}
	 	});
	 	
	 	kbd.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			if (x<=y){
	 				String z = "true";
	 				txhasil.setText(z);
	 			}
	 			else{
	 				String z = "false";
	 				txhasil.setText(z);
	 			}
	 			
	 		}
	 	});
	 	
	 	samadgn.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			if (x==y){
	 				String z = "true";
	 				txhasil.setText(z);
	 			}
	 			else{
	 				String z = "false";
	 				txhasil.setText(z);
	 			}
	 			
	 		}
	 	});
	 	
	 	infinite.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			String z = String.valueOf((-x)-1);
	 			txhasil.setText(z);
	 		}
	 	});
	 	
	 	pangkat.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			String z = String.valueOf(x^y);
	 			txhasil.setText(z);
	 		}
	 	});
	 	
	 	movekanan.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			String z = String.valueOf(x>>y);
	 			txhasil.setText(z);
	 		}
	 	});
	 	
	 	movekiri.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			int x = Integer.parseInt(txinput1.getText());
	 			int y = Integer.parseInt(txinput2.getText());
	 			String z = String.valueOf(x<<y);
	 			txhasil.setText(z);
	 		}
	 	});
	 	clear.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e){
	 			txinput1.setText("");
	 			txinput2.setText("");
	 			txhasil.setText("");
	 		}
	 	});
	 	
	 	exit.addActionListener(new ActionListener (){
	 		public void actionPerformed(ActionEvent e)
	 		{
	 			System.exit(0);
	 		}
	 	});
	 }
	 
	 public static void main(String args[]) 
	 {
	 	TugasBab2 bab2= new TugasBab2();
	 	bab2.komVisual();
	 	bab2.aksiReaksi();
	 	
	 }
}

