package B_J12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

import javax.swing.JTextField;

public class TestFloareDecorator {

	private JFrame frmDecoratorDesignPattern;
	private JTextField txtTotal;
	private JTextField txtInformatie;
	static Floare buchetSimplu = new BuchetSimplu();
	static Floare buchetCriogenat = new BuchetCriogenat();
	static Floare buchetAranjament = new Buchet_tip_Aranjament();
	static Floare buchetMesaj = new BuchetCuMesaj();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFloareDecorator window = new TestFloareDecorator();
					window.frmDecoratorDesignPattern.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestFloareDecorator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDecoratorDesignPattern = new JFrame();
		frmDecoratorDesignPattern.setTitle("Decorator Design Pattern");
		frmDecoratorDesignPattern.getContentPane().setBackground(new Color(255, 255, 255));
		frmDecoratorDesignPattern.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\QUASAR\\Desktop\\Facultate\\SEM 1\\PIP\\Laboratoare\\Proiect PIP\\src\\trandafir.png"));
		frmDecoratorDesignPattern.setBounds(100, 100, 737, 591);
		frmDecoratorDesignPattern.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDecoratorDesignPattern.getContentPane().setLayout(null);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
	
		txtTotal.setBounds(268, 411, 145, 35);
		frmDecoratorDesignPattern.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		txtInformatie = new JTextField();
		txtInformatie.setEditable(false);
		txtInformatie.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
	
		txtInformatie.setBounds(67,455,544,35);
		frmDecoratorDesignPattern.getContentPane().add(txtInformatie);
		txtInformatie.setColumns(10);
		
		JButton btnBuchetSimplu = new JButton("Buchet Simplu");
		btnBuchetSimplu.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnBuchetSimplu.setForeground(new Color(255, 255, 255));
		btnBuchetSimplu.setBackground(new Color(255, 204, 153));
		btnBuchetSimplu.setBounds(0, 0, 178, 52);
		frmDecoratorDesignPattern.getContentPane().add(btnBuchetSimplu);
		
		JButton btnBuchetCriogenat = new JButton("Buchet Criogenat");
		btnBuchetCriogenat.setForeground(new Color(255, 255, 255));
		btnBuchetCriogenat.setBackground(new Color(255, 204, 153));
		btnBuchetCriogenat.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnBuchetCriogenat.setBounds(177, 0, 178, 52);
		frmDecoratorDesignPattern.getContentPane().add(btnBuchetCriogenat);
		
		JButton btnBuchetCuMesaj = new JButton("Buchet cu Mesaj");
		btnBuchetCuMesaj.setForeground(new Color(255, 255, 255));
		btnBuchetCuMesaj.setBackground(new Color(255, 204, 153));
		btnBuchetCuMesaj.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnBuchetCuMesaj.setBounds(355, 0, 159, 52);
		frmDecoratorDesignPattern.getContentPane().add(btnBuchetCuMesaj);
		
		JButton btnAranjamenteFlorale = new JButton("Aranjamente florale");
		btnAranjamenteFlorale.setForeground(new Color(255, 255, 255));
		btnAranjamenteFlorale.setBackground(new Color(255, 204, 153));
		btnAranjamenteFlorale.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnAranjamenteFlorale.setBounds(512, 0, 209, 52);
		frmDecoratorDesignPattern.getContentPane().add(btnAranjamenteFlorale);
		
		JButton btnTrandafir = new JButton("Trandafir");
		btnTrandafir.setForeground(new Color(255, 255, 255));
		btnTrandafir.setBackground(new Color(255, 102, 102));
		btnTrandafir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnTrandafir.setBounds(67, 120, 124, 63);
		frmDecoratorDesignPattern.getContentPane().add(btnTrandafir);
		
		JButton btnLalea = new JButton("Lalea");
		btnLalea.setForeground(new Color(255, 255, 255));
		btnLalea.setBackground(new Color(255, 102, 255));
		btnTrandafir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnLalea.setBounds(67, 214, 124, 63);
		frmDecoratorDesignPattern.getContentPane().add(btnLalea);
		
		JButton btnCrizantema = new JButton("Crizantema");
		btnCrizantema.setForeground(new Color(255, 255, 255));
		btnCrizantema.setBackground(new Color(255, 204, 0));
		btnCrizantema.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnCrizantema.setBounds(67, 319, 124, 63);
		frmDecoratorDesignPattern.getContentPane().add(btnCrizantema);
		
		JButton btnCrin = new JButton("Crin");
		btnCrin.setForeground(new Color(255, 255, 255));
		btnCrin.setBackground(new Color(102, 204, 204));
		btnCrin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnCrin.setBounds(487, 120, 124, 63);
		frmDecoratorDesignPattern.getContentPane().add(btnCrin);
		
		JButton btnHortensie = new JButton("Hortensie");
		btnHortensie.setForeground(new Color(255, 255, 255));
		btnHortensie.setBackground(new Color(102, 153, 255));
		btnHortensie.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnHortensie.setBounds(487, 214, 124, 63);
		frmDecoratorDesignPattern.getContentPane().add(btnHortensie);
		
		JButton btnOrhidee = new JButton("Orhidee");
		btnOrhidee.setForeground(new Color(255, 255, 255));
		btnOrhidee.setBackground(new Color(51, 204, 255));
		btnOrhidee.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnOrhidee.setBounds(487, 319, 124, 63);
		frmDecoratorDesignPattern.getContentPane().add(btnOrhidee);
		
		
		JButton btnAnulare = new JButton("Anulare");
		btnAnulare.setForeground(new Color(255, 255, 255));
		btnAnulare.setBackground(new Color(255, 51, 51));
		btnAnulare.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnAnulare.setBounds(605, 500, 97, 25);
		frmDecoratorDesignPattern.getContentPane().add(btnAnulare);
		
		JButton btnAfisare_Pret = new JButton("Afisare pret");
		btnAfisare_Pret.setForeground(new Color(255, 255, 255));
		btnAfisare_Pret.setBackground(new Color(51, 102, 255));
		btnAfisare_Pret.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnAfisare_Pret.setBounds(268, 214, 132, 56);
		frmDecoratorDesignPattern.getContentPane().add(btnAfisare_Pret);
		
		JButton btnIncepere = new JButton("Start");
		btnIncepere.setForeground(Color.WHITE);
		btnIncepere.setBackground(Color.GREEN);
		btnIncepere.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		btnIncepere.setBounds(268, 123, 132, 56);
		frmDecoratorDesignPattern.getContentPane().add(btnIncepere);
		
		btnIncepere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtInformatie.setText(null);
				txtTotal.setText(null);
				btnBuchetSimplu.setEnabled(true);
				btnBuchetCuMesaj.setEnabled(true);
				btnBuchetCriogenat.setEnabled(true);
				btnAranjamenteFlorale.setEnabled(true);
				}
		});
		
		btnBuchetSimplu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnBuchetSimplu.setSelected(true);
				btnBuchetCuMesaj.setEnabled(false);
				btnBuchetCriogenat.setEnabled(false);
				btnAranjamenteFlorale.setEnabled(false);
				// Floare buchetSimplu=new BuchetSimplu();
				txtInformatie.setText(buchetSimplu.descriere());
			}
		});
		
		btnBuchetCriogenat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Floare buchetCriogenat=new BuchetCriogenat();
				txtInformatie.setText(buchetCriogenat.descriere());
				btnBuchetCriogenat.setSelected(true);
				btnBuchetSimplu.setEnabled(false);
				btnBuchetCuMesaj.setEnabled(false);
				btnAranjamenteFlorale.setEnabled(false);
			}
		});
		
		btnBuchetCuMesaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Floare buchetCuMesaj=new Buchet_cu_Mesaj();
				txtInformatie.setText(buchetMesaj.descriere());
				btnBuchetCuMesaj.setSelected(true);
				btnBuchetSimplu.setEnabled(false);
				btnBuchetCriogenat.setEnabled(false);
				btnAranjamenteFlorale.setEnabled(false);
			}
		});
		
		btnAranjamenteFlorale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Floare aranjament=new Buchet_tip_Aranjament();
				txtInformatie.setText(buchetAranjament.descriere());
				btnAranjamenteFlorale.setSelected(true);
				btnBuchetSimplu.setEnabled(false);
				btnBuchetCuMesaj.setEnabled(false);
				btnBuchetCriogenat.setEnabled(false);
			}
		});
		
		btnTrandafir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTrandafir.setEnabled(true);
				btnTrandafir.setSelected(true);
					if(btnBuchetSimplu.isSelected() == true)
						{buchetSimplu = new Trandafir(buchetSimplu);
						txtInformatie.setText(buchetSimplu.descriere());}
					if(btnBuchetCuMesaj.isSelected() == true)
						{buchetMesaj = new Trandafir(buchetMesaj);
						txtInformatie.setText(buchetMesaj.descriere());}
					if(btnBuchetCriogenat.isSelected() == true)
						{buchetCriogenat = new Trandafir(buchetCriogenat);
						txtInformatie.setText(buchetCriogenat.descriere());
						}
					if(btnAranjamenteFlorale.isSelected() == true)
						{buchetAranjament = new Trandafir(buchetAranjament);
						txtInformatie.setText(buchetAranjament.descriere());}
				}
			
		});
		
		btnLalea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLalea.setEnabled(true);
				btnLalea.setSelected(true);
					if(btnBuchetSimplu.isSelected() == true)
						{buchetSimplu = new Lalea(buchetSimplu);
						txtInformatie.setText(buchetSimplu.descriere());
						}
					if(btnBuchetCuMesaj.isSelected() == true)
						{buchetMesaj = new Lalea(buchetMesaj);
						txtInformatie.setText(buchetMesaj.descriere());
						}
					if(btnBuchetCriogenat.isSelected() == true)
						{buchetCriogenat = new Lalea(buchetCriogenat);
						txtInformatie.setText(buchetCriogenat.descriere());
						}
					if(btnAranjamenteFlorale.isSelected() == true)
						{buchetAranjament = new Lalea(buchetAranjament);
						txtInformatie.setText(buchetAranjament.descriere());
						}
				}
			
		});
		
		btnOrhidee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOrhidee.setEnabled(true);
				btnOrhidee.setSelected(true);
					if(btnBuchetSimplu.isSelected() == true)
						{buchetSimplu = new Orhidee(buchetSimplu);
						txtInformatie.setText(buchetSimplu.descriere());
						}
					if(btnBuchetCuMesaj.isSelected() == true)
						{buchetMesaj = new Orhidee(buchetMesaj);
						txtInformatie.setText(buchetMesaj.descriere());
						}
					if(btnBuchetCriogenat.isSelected() == true)
						{buchetCriogenat = new Orhidee(buchetCriogenat);
						txtInformatie.setText(buchetCriogenat.descriere());
						}
					if(btnAranjamenteFlorale.isSelected() == true)
						{buchetAranjament = new Orhidee(buchetAranjament);
						txtInformatie.setText(buchetAranjament.descriere());
						}
				}
		
		});
		
		btnHortensie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHortensie.setEnabled(true);
				btnHortensie.setSelected(true);
					if(btnBuchetSimplu.isSelected() == true)
						{buchetSimplu = new Hortensie(buchetSimplu);
						txtInformatie.setText(buchetSimplu.descriere());
						}
					if(btnBuchetCuMesaj.isSelected() == true)
						{buchetMesaj = new Hortensie(buchetMesaj);
						txtInformatie.setText(buchetMesaj.descriere());
						}
					if(btnBuchetCriogenat.isSelected() == true)
						{buchetCriogenat = new Hortensie(buchetCriogenat);
						txtInformatie.setText(buchetCriogenat.descriere());
						}
					if(btnAranjamenteFlorale.isSelected() == true)
						{buchetAranjament = new Hortensie(buchetAranjament);
						txtInformatie.setText(buchetAranjament.descriere());
						}
				}
			
		});
		
		btnCrin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCrin.setEnabled(true);
				btnCrin.setSelected(true);
					if(btnBuchetSimplu.isSelected() == true)
						{buchetSimplu = new Crin(buchetSimplu);
						txtInformatie.setText(buchetSimplu.descriere());
						}
					if(btnBuchetCuMesaj.isSelected() == true)
						{buchetMesaj = new Crin(buchetMesaj);
						txtInformatie.setText(buchetMesaj.descriere());
						}
					if(btnBuchetCriogenat.isSelected() == true)
						{buchetCriogenat = new Crin(buchetCriogenat);
						txtInformatie.setText(buchetCriogenat.descriere());
						}
					if(btnAranjamenteFlorale.isSelected() == true)
						{buchetAranjament = new Crin(buchetAranjament);
						txtInformatie.setText(buchetAranjament.descriere());
						}
				}
			
		});
		
		btnCrizantema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCrizantema.setEnabled(true);
				btnCrizantema.setSelected(true);
					if(btnBuchetSimplu.isSelected() == true)
						{buchetSimplu = new Crizantema(buchetSimplu);
						txtInformatie.setText(buchetSimplu.descriere());
						}
					if(btnBuchetCuMesaj.isSelected() == true)
						{buchetMesaj = new Crizantema(buchetMesaj);
						txtInformatie.setText(buchetMesaj.descriere());
						}
					if(btnBuchetCriogenat.isSelected() == true)
						{buchetCriogenat = new Crizantema(buchetCriogenat);
						txtInformatie.setText(buchetCriogenat.descriere());
						}
					if(btnAranjamenteFlorale.isSelected() == true)
						{buchetAranjament = new Crizantema(buchetAranjament);
						txtInformatie.setText(buchetAranjament.descriere());
						}
				}
			
		});
		
		btnAfisare_Pret.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAfisare_Pret.setEnabled(true);
				
				if(btnBuchetSimplu.isSelected()==true)
					{txtTotal.setText(""+buchetSimplu.pret());
					System.out.println(buchetSimplu.descriere()+"\n"+buchetSimplu.pret()+"\n");}
				if(btnBuchetCriogenat.isSelected()==true)
					{txtTotal.setText(""+buchetCriogenat.pret());
					System.out.println(buchetCriogenat.descriere()+"\n"+buchetCriogenat.pret()+"\n");}
				if(btnAranjamenteFlorale.isSelected()==true)
					{txtTotal.setText(""+buchetAranjament.pret());
					System.out.println(buchetAranjament.descriere()+"\n"+buchetAranjament.pret()+"\n");}
				if(btnBuchetCuMesaj.isSelected()==true)
					{txtTotal.setText(""+buchetMesaj.pret());
					System.out.println(buchetMesaj.descriere()+"\n"+buchetMesaj.pret()+"\n");}
					}
				
			
		});
		
		btnAnulare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtInformatie.setText(null);
				txtTotal.setText(null);
				btnBuchetSimplu.setSelected(false);
				btnBuchetCriogenat.setSelected(false);
				btnBuchetCuMesaj.setSelected(false);
				btnAranjamenteFlorale.setSelected(false);
				btnTrandafir.setSelected(false);
				btnLalea.setSelected(false);
				btnOrhidee.setSelected(false);
				btnHortensie.setSelected(false);
				btnCrin.setSelected(false);
				btnCrizantema.setSelected(false);
				}
		});

	}
}