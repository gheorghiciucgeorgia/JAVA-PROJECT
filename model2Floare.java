package B_J12;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;


import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class model2Floare {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtTotal;
	
	
	Floare flower;
	String txt_Finalizare=new String();
	int flag_BuchetSimplu=0;
	int flag_BuchetCriogenat=0;
	int flag_BuchetCuMesaj=0;
	int flag_AranjamentFloral=0;
	
	Floare trandafir=new Trandafir(new BuchetSimplu());
	Floare lalea=new Lalea(new BuchetSimplu());
	Floare crin=new Crin(new BuchetSimplu());
	Floare crizantema=new Crizantema(new BuchetSimplu());
	Floare hortensie=new Hortensie(new BuchetSimplu());
	Floare orhidee=new Orhidee(new BuchetSimplu());
	
	Floare trandafir1=new Trandafir(new BuchetCriogenat());
	Floare lalea1=new Lalea(new BuchetCriogenat());
	Floare crin1=new Crin(new BuchetCriogenat());
	Floare crizantema1=new Crizantema(new BuchetCriogenat());
	Floare hortensie1=new Hortensie(new BuchetCriogenat());
	Floare orhidee1=new Orhidee(new BuchetCriogenat());
	
	Floare trandafir2=new Trandafir(new BuchetCuMesaj());
	Floare lalea2=new Lalea(new BuchetCuMesaj());
	Floare crin2=new Crin(new BuchetCuMesaj());
	Floare crizantema2=new Crizantema(new BuchetCuMesaj());
	Floare hortensie2=new Hortensie(new BuchetCuMesaj());
	Floare orhidee2=new Orhidee(new BuchetCuMesaj());
	
	Floare trandafir3=new Trandafir(new Buchet_tip_Aranjament());
	Floare lalea3=new Lalea(new Buchet_tip_Aranjament());
	Floare crin3=new Crin(new Buchet_tip_Aranjament());
	Floare crizantema3=new Crizantema(new Buchet_tip_Aranjament());
	Floare hortensie3=new Hortensie(new Buchet_tip_Aranjament());
	Floare orhidee3=new Orhidee(new Buchet_tip_Aranjament());
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					model2Floare window = new model2Floare();
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
	public model2Floare() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(308, 300, 97, 35);
		textField.setEditable(false);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuchetSimplu = new JButton("Buchet Simplu");
		btnBuchetSimplu.setBounds(12, 26, 130, 25);
		frame.getContentPane().add(btnBuchetSimplu);
		
		btnBuchetSimplu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Floare floare = new BuchetSimplu();
				textField.setText(String.valueOf(floare.pret()));
				flower=floare;
				flag_BuchetSimplu=1;
				flag_BuchetCuMesaj=0;
				flag_BuchetCriogenat=0;
				flag_AranjamentFloral=0;
			}
		});
		
		JButton btnBuchetCriogenat = new JButton("Buchet Criogenat");
		btnBuchetCriogenat.setBounds(12, 64, 130, 25);
		frame.getContentPane().add(btnBuchetCriogenat);
		
		btnBuchetCriogenat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Floare floare = new BuchetCriogenat();
				textField.setText(String.valueOf(floare.pret()));
				flower=floare;
				flag_BuchetSimplu=0;
				flag_BuchetCuMesaj=0;
				flag_BuchetCriogenat=1;
				flag_AranjamentFloral=0;
			}
		});
		
		JButton btnBuchetCuMesaj = new JButton("Buchet Cu Mesaj");
		btnBuchetCuMesaj.setBounds(154, 26, 146, 25);
		frame.getContentPane().add(btnBuchetCuMesaj);
		
		btnBuchetCuMesaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Floare floare = new BuchetCuMesaj();
				textField.setText(String.valueOf(floare.pret()));
				flower=floare;
				flag_BuchetSimplu=0;
				flag_BuchetCuMesaj=1;
				flag_BuchetCriogenat=0;
				flag_AranjamentFloral=0;
			}
		});
		
		
		JButton btnAranjamentFloral = new JButton("Aranjament Floral");
		btnAranjamentFloral.setBounds(154, 64, 146, 25);
		frame.getContentPane().add(btnAranjamentFloral);
		
		btnAranjamentFloral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Floare floare = new Buchet_tip_Aranjament();
				textField.setText(String.valueOf(floare.pret()));
				flower=floare;
				flag_BuchetSimplu=0;
				flag_BuchetCuMesaj=0;
				flag_BuchetCriogenat=0;
				flag_AranjamentFloral=1;
			}
		});
		
		JRadioButton rdbtnTrandafir = new JRadioButton("Trandafir");
		rdbtnTrandafir.setBounds(12, 98, 127, 25);
		frame.getContentPane().add(rdbtnTrandafir);
		
		JRadioButton rdbtnLalea = new JRadioButton("Lalea");
		rdbtnLalea.setBounds(12, 128, 127, 25);
		frame.getContentPane().add(rdbtnLalea);
		
		JRadioButton rdbtnCrizantema = new JRadioButton("Crizantema");
		rdbtnCrizantema.setBounds(12, 158, 127, 25);
		frame.getContentPane().add(rdbtnCrizantema);
		
		JRadioButton rdbtnCrin = new JRadioButton("Crin");
		rdbtnCrin.setBounds(12, 188, 127, 25);
		frame.getContentPane().add(rdbtnCrin);
		
		JRadioButton rdbtnHortensie = new JRadioButton("Hortensie");
		rdbtnHortensie.setBounds(12, 218, 127, 25);
		frame.getContentPane().add(rdbtnHortensie);
		
		JRadioButton rdbtnOrhidee = new JRadioButton("Orhidee");
		rdbtnOrhidee.setBounds(12, 248, 127, 25);
		frame.getContentPane().add(rdbtnOrhidee);
		
		/*buttonGroup.add(rdbtnTrandafir);
		buttonGroup.add(rdbtnLalea);
		buttonGroup.add(rdbtnOrhidee);
		buttonGroup.add(rdbtnHortensie);
		buttonGroup.add(rdbtnCrin);
		buttonGroup.add(rdbtnCrizantema);*/
		
		
		JButton btnFinalizare = new JButton("Finalizare");
		btnFinalizare.setBounds(12, 300, 97, 25);
		frame.getContentPane().add(btnFinalizare);
		
		btnFinalizare.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				int p = 0;
				int k=-1;
				if(flag_BuchetSimplu==1)
					{if(rdbtnTrandafir.isSelected()==true)
						{p=p+(int) (trandafir.pret());
						k++;
						}
					if(rdbtnCrin.isSelected()==true)
						{p=p+(int) (crin.pret());
						k++;
						}
					if(rdbtnCrizantema.isSelected()==true)
						{p=p+(int) (crizantema.pret());
						k++;
						}
					if(rdbtnOrhidee.isSelected()==true)
						{p=p+(int) (orhidee.pret());
						k++;
						}
					if(rdbtnLalea.isSelected()==true)
						{p=p+(int) (lalea.pret());
						k++;
						}
					if(rdbtnHortensie.isSelected()==true)
						{p=p+(int) (hortensie.pret());
						k++;
						}
				textField.setText(String.valueOf(p-k*5));
				}
				if(flag_BuchetCriogenat==1)
				{if(rdbtnTrandafir.isSelected()==true)
					{p=p+(int) (trandafir1.pret());
					k++;
					}
				if(rdbtnCrin.isSelected()==true)
					{p=p+(int) (crin1.pret());
					k++;
					}
				if(rdbtnCrizantema.isSelected()==true)
					{p=p+(int) (crizantema1.pret());
					k++;
					}
				if(rdbtnOrhidee.isSelected()==true)
					{p=p+(int) (orhidee1.pret());
					k++;
					}
				if(rdbtnLalea.isSelected()==true)
					{p=p+(int) (lalea1.pret());
					k++;
					}
				if(rdbtnHortensie.isSelected()==true)
					{p=p+(int) (hortensie1.pret());
					k++;
					}
				textField.setText(String.valueOf(p-k*100));
				}
				if(flag_BuchetCuMesaj==1)
				{if(rdbtnTrandafir.isSelected()==true)
					{p=p+(int) (trandafir2.pret());
					k++;
					}
				if(rdbtnCrin.isSelected()==true)
					{p=p+(int) (crin2.pret());
					k++;
					}
				if(rdbtnCrizantema.isSelected()==true)
					{p=p+(int) (crizantema2.pret());
					k++;
					}
				if(rdbtnOrhidee.isSelected()==true)
					{p=p+(int) (orhidee2.pret());
					k++;
					}
				if(rdbtnLalea.isSelected()==true)
					{p=p+(int) (lalea2.pret());
					k++;
					}
				if(rdbtnHortensie.isSelected()==true)
					{p=p+(int) (hortensie2.pret());
					k++;
					}
				textField.setText(String.valueOf(p-k*20));
				}
				
				if(flag_AranjamentFloral==1)
				{if(rdbtnTrandafir.isSelected()==true)
					{p=p+(int) (trandafir3.pret());
					k++;
					}
				if(rdbtnCrin.isSelected()==true)
					{p=p+(int) (crin3.pret());
					k++;
					}
				if(rdbtnCrizantema.isSelected()==true)
					{p=p+(int) (crizantema3.pret());
					k++;
					}
				if(rdbtnOrhidee.isSelected()==true)
					{p=p+(int) (orhidee3.pret());
					k++;
					}
				if(rdbtnLalea.isSelected()==true)
					{p=p+(int) (lalea3.pret());
					k++;
					}
				if(rdbtnHortensie.isSelected()==true)
					{p=p+(int) (hortensie3.pret());
					k++;
					}
				textField.setText(String.valueOf(p-k*150));}
				
				}
		});
		
		JButton btnAnulare = new JButton("Anulare");
		btnAnulare.setBounds(121, 300, 97, 25);
		frame.getContentPane().add(btnAnulare);
		
		btnAnulare.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				flag_BuchetSimplu=0;
				flag_BuchetCriogenat=0;
				flag_BuchetCuMesaj=0;
				flag_AranjamentFloral=0;
			}
			});
			
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setText("Total");
		txtTotal.setBounds(232, 300, 68, 35);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
	}
}
