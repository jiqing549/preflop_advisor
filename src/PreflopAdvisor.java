import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.util.Random;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class PreflopAdvisor {

	private JFrame frame;
	String Hero="";
	String Villian="";
	String P = "";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreflopAdvisor window = new PreflopAdvisor();
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
	public PreflopAdvisor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 9));
		frame.setBounds(100, 100, 646, 873);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JLabel VillianP = new JLabel("");
		VillianP.setFont(new Font("Arial", Font.BOLD, 12));
		VillianP.setBackground(Color.RED);
		VillianP.setBounds(335, 55, 40, 20);
		frame.getContentPane().add(VillianP);
		

		JLabel lblHero = new JLabel("");
		lblHero.setBounds(433, 7, 54, 15);
		frame.getContentPane().add(lblHero);
		
		JLabel lblVillian = new JLabel("");
		lblVillian.setBounds(433, 32, 54, 15);
		frame.getContentPane().add(lblVillian);
		
		JLabel HeroP = new JLabel("");
		HeroP.setFont(new Font("Arial", Font.BOLD, 12));
		HeroP.setBackground(Color.RED);
		HeroP.setBounds(335, 32, 54, 15);
		frame.getContentPane().add(HeroP);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(5, 204, 620, 620);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("UTG ");
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_1.setBounds(5, 5, 56, 20);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/UTG_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "UTG";
				HeroP.setText(String.valueOf(Hero) );	
				Villian = " ";
				VillianP.setText(String.valueOf(Villian) );
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("MP ");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton.setBounds(5, 30, 56, 20);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/MP_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "MP";
				HeroP.setText(String.valueOf(Hero) );
				Villian = " ";
				VillianP.setText(String.valueOf(Villian) );
				P="";
			}
		});
		
		JButton btnNewButton_2 = new JButton("CO ");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/CO_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "CO";
				HeroP.setText(String.valueOf(Hero) );
				P="";
				Villian = " ";
				VillianP.setText(String.valueOf(Villian) );
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_2.setBounds(5, 55, 56, 20);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("BTN ");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/BTN_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "BTN";
				HeroP.setText(String.valueOf(Hero) );
				Villian = " ";
				VillianP.setText(String.valueOf(Villian) );
				P="";
				
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_3.setBounds(5, 80, 56, 20);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("SB");
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/SB_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));

				Hero = "SB";
				HeroP.setText(String.valueOf(Hero) );
				Villian = " ";
				VillianP.setText(String.valueOf(Villian) );
				P="";
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_4.setBounds(5, 105, 56, 20);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("BB");
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/U_BB.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "UTG";
				HeroP.setText(String.valueOf(Hero) );
				Villian = "BB";
				VillianP.setText(String.valueOf(Villian) );
				P="1";
			}
		});
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_5.setBounds(71, 5, 56, 20);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("SB");
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_6.setBounds(137, 5, 56, 20);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/U_S.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "UTG";
				HeroP.setText(String.valueOf(Hero) );
				Villian = "SB";
				VillianP.setText(String.valueOf(Villian) );
				P="1";
			}
		});
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("BTN");
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_7.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/U_B.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "UTG";
				HeroP.setText(String.valueOf(Hero) );
				Villian = "BTN";
				VillianP.setText(String.valueOf(Villian) );
				P="0";
			}
		});
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_7.setBounds(203, 5, 56, 20);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("CO");
		btnNewButton_8.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_8.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/U_C.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "UTG";
				HeroP.setText(String.valueOf(Hero) );
				Villian = "CO";
				VillianP.setText(String.valueOf(Villian) );
				P="0";
				
			}
		});
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_8.setBounds(269, 5, 56, 20);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("MP");
		btnNewButton_9.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_9.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Image img1 = new ImageIcon(this.getClass().getResource("/U_M.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "UTG";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "MP";
					VillianP.setText(String.valueOf(Villian) );
					P="0";
				}
		
		});
		btnNewButton_9.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_9.setBounds(335, 5, 56, 20);
		frame.getContentPane().add(btnNewButton_9);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBb = new JButton("BB");
		btnBb.setHorizontalAlignment(SwingConstants.LEFT);
		btnBb.setVerticalAlignment(SwingConstants.TOP);
		btnBb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/M_BB.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			Hero = "MP";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "BB";
			VillianP.setText(String.valueOf(Villian) );
			P="1";
			}
		});
		btnBb.setFont(new Font("Arial", Font.BOLD, 9));
		btnBb.setBounds(71, 30, 56, 20);
		frame.getContentPane().add(btnBb);
		
		JButton btnSb = new JButton("SB");
		btnSb.setHorizontalAlignment(SwingConstants.LEFT);
		btnSb.setVerticalAlignment(SwingConstants.TOP);
		btnSb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/M_S.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			Hero = "MP";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "SB";
			VillianP.setText(String.valueOf(Villian) );
			P="1";
			}
		});
		btnSb.setFont(new Font("Arial", Font.BOLD, 9));
		btnSb.setBounds(137, 30, 56, 20);
		frame.getContentPane().add(btnSb);
		
		JButton btnBtn = new JButton("BTN");
		btnBtn.setHorizontalAlignment(SwingConstants.LEFT);
		btnBtn.setVerticalAlignment(SwingConstants.TOP);
		btnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/M_B.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "MP";
				HeroP.setText(String.valueOf(Hero) );
				Villian = "BTN";
				VillianP.setText(String.valueOf(Villian) );
				P="0";
			}
		});
		btnBtn.setFont(new Font("Arial", Font.BOLD, 9));
		btnBtn.setBounds(203, 30, 56, 23);
		frame.getContentPane().add(btnBtn);
		
		JButton button_9 = new JButton("CO");
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.setVerticalAlignment(SwingConstants.TOP);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/M_C.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "MP";
				HeroP.setText(String.valueOf(Hero) );
				Villian = "CO";
				VillianP.setText(String.valueOf(Villian) );
				P="0";
			}
		});
		button_9.setFont(new Font("Arial", Font.BOLD, 9));
		button_9.setBounds(269, 30, 56, 20);
		frame.getContentPane().add(button_9);

		
		JButton btnBb_1 = new JButton("BB");
		btnBb_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnBb_1.setVerticalAlignment(SwingConstants.TOP);
		btnBb_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/C_BB.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			Hero = "CO";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "BB";
			VillianP.setText(String.valueOf(Villian) );
			P="1";
			}
		});
		btnBb_1.setFont(new Font("Arial", Font.BOLD, 9));
		btnBb_1.setBounds(71, 55, 56, 20);
		frame.getContentPane().add(btnBb_1);
		
		JButton btnSb_1 = new JButton("SB");
		btnSb_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnSb_1.setVerticalAlignment(SwingConstants.TOP);
		btnSb_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/C_S.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			Hero = "CO";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "SB";
			VillianP.setText(String.valueOf(Villian) );
			P="1";
			}
		});
		btnSb_1.setFont(new Font("Arial", Font.BOLD, 9));
		btnSb_1.setBounds(137, 55, 56, 20);
		frame.getContentPane().add(btnSb_1);
		
		JButton btnBtn_1 = new JButton("BTN");
		btnBtn_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnBtn_1.setVerticalAlignment(SwingConstants.TOP);
		btnBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/C_B.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			Hero = "CO";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "BTN";
			VillianP.setText(String.valueOf(Villian) );
			P="0";
			}
		});
		btnBtn_1.setFont(new Font("Arial", Font.BOLD, 9));
		btnBtn_1.setBounds(203, 55, 56, 23);
		frame.getContentPane().add(btnBtn_1);
		

		
		JButton btnBb_2 = new JButton("BB");
		btnBb_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnBb_2.setVerticalAlignment(SwingConstants.TOP);
		btnBb_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/B_BB.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));

			Hero = "BTN";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "BB";
			VillianP.setText(String.valueOf(Villian) );
			P="1";
			}
		});
		btnBb_2.setFont(new Font("Arial", Font.BOLD, 9));
		btnBb_2.setBounds(71, 80, 56, 20);
		frame.getContentPane().add(btnBb_2);
		
		JButton btnSb_2 = new JButton("SB");
		btnSb_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnSb_2.setVerticalAlignment(SwingConstants.TOP);
		btnSb_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/B_S.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));

			Hero = "BTN";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "SB";
			VillianP.setText(String.valueOf(Villian) );

			P="1";
			}
		});
		btnSb_2.setFont(new Font("Arial", Font.BOLD, 9));
		btnSb_2.setBounds(137, 80, 56, 20);
		frame.getContentPane().add(btnSb_2);
		


		
		JButton btnBb_3 = new JButton("BB");
		btnBb_3.setVerticalAlignment(SwingConstants.TOP);
		btnBb_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnBb_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/S_BB.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			Hero = "SB";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "BB";
			VillianP.setText(String.valueOf(Villian) );
			P="0";
			}
		});
		btnBb_3.setFont(new Font("Arial", Font.BOLD, 9));
		btnBb_3.setBounds(71, 105, 56, 20);
		frame.getContentPane().add(btnBb_3);
		
		JButton btnb = new JButton("5");
		btnb.setFont(new Font("Dialog", Font.BOLD, 9));
		btnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/MVU5.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			Hero = "MP";
			HeroP.setText(String.valueOf(Hero) );
			Villian = "UTG";
			VillianP.setText(String.valueOf(Villian) );
			P="";
			}
		});
		btnb.setBounds(427, 45, 40, 20);
		frame.getContentPane().add(btnb);
		
		JButton btnMvu = new JButton("MvU");
		btnMvu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/MVU.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
				Hero = "MP";
				HeroP.setText(String.valueOf(Hero) );
				Villian = "UTG";
				VillianP.setText(String.valueOf(Villian) );

				P="";
			}
		});
		btnMvu.setFont(new Font("Dialog", Font.BOLD, 9));
		btnMvu.setBounds(467, 45, 55, 20);
		frame.getContentPane().add(btnMvu);
		
				
				
				JButton btnCvu = new JButton("CvU");
				btnCvu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/CVU.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));

					Hero = "CO";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "UTG";
					VillianP.setText(String.valueOf(Villian) );

					P="";
					}
				});
				btnCvu.setFont(new Font("Dialog", Font.BOLD, 9));
				btnCvu.setBounds(467, 75, 55, 20);
				frame.getContentPane().add(btnCvu);
				
				JButton button_11 = new JButton("5");
				button_11.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/CVU5.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));

						Hero = "CO";
						HeroP.setText(String.valueOf(Hero) );
						Villian = "UTG";
						VillianP.setText(String.valueOf(Villian) );
						P="";
					}
				});
				button_11.setFont(new Font("Dialog", Font.BOLD, 9));
				button_11.setBounds(427, 75, 40, 20);
				frame.getContentPane().add(button_11);
				
				JButton btnBvu = new JButton("BvU");
				btnBvu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVU.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));

					Hero = "BTN";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "UTG";
					VillianP.setText(String.valueOf(Villian) );

					P="";
					}
				});
				btnBvu.setFont(new Font("Dialog", Font.BOLD, 9));
				btnBvu.setBounds(467, 105, 55, 20);
				frame.getContentPane().add(btnBvu);
				
				JButton button_13 = new JButton("5");
				button_13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVU5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));

					Hero = "BTN";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "UTG";
					VillianP.setText(String.valueOf(Villian) );

					P="";
					}
				});
				button_13.setFont(new Font("Dialog", Font.BOLD, 9));
				button_13.setBounds(427, 105, 40, 20);
				frame.getContentPane().add(button_13);
				
				JButton btnCvm = new JButton("CvM");
				btnCvm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/CVM.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));

					Hero = "CO";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "MP";
					VillianP.setText(String.valueOf(Villian) );
					P="";
					}
				});
				btnCvm.setFont(new Font("Dialog", Font.BOLD, 9));
				btnCvm.setBounds(357, 75, 55, 20);
				frame.getContentPane().add(btnCvm);
				
				JButton button_15 = new JButton("5");
				button_15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/CVM5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));

					Hero = "CO";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "MP";
					VillianP.setText(String.valueOf(Villian) );
					P="";
					}
				});
				button_15.setFont(new Font("Dialog", Font.BOLD, 9));
				button_15.setBounds(317, 75, 40, 20);
				frame.getContentPane().add(button_15);
				
				JButton btnBvm = new JButton("BvM");
				btnBvm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVM.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));

					Hero = "BTN";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "MP";
					VillianP.setText(String.valueOf(Villian) );
					P="";
					}
				});
				btnBvm.setFont(new Font("Dialog", Font.BOLD, 9));
				btnBvm.setBounds(357, 105, 55, 20);
				frame.getContentPane().add(btnBvm);
				
				JButton button_17 = new JButton("5");
				button_17.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVM5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BTN";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "MP";
					VillianP.setText(String.valueOf(Villian) );
					P="";
					}
				});
				button_17.setFont(new Font("Dialog", Font.BOLD, 9));
				button_17.setBounds(317, 105, 40, 20);
				frame.getContentPane().add(button_17);
				
				JButton btnBvc = new JButton("BvC");
				btnBvc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVC.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BTN";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "CO";
					VillianP.setText(String.valueOf(Villian) );
					P="";
					}
				});
				btnBvc.setFont(new Font("Dialog", Font.BOLD, 9));
				btnBvc.setBounds(259, 105, 55, 20);
				frame.getContentPane().add(btnBvc);
				
				JButton button_19 = new JButton("5");
				button_19.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVC5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BTN";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "CO";
					VillianP.setText(String.valueOf(Villian) );
					P="";
					}
				});
				button_19.setFont(new Font("Dialog", Font.BOLD, 9));
				button_19.setBounds(219, 105, 40, 20);
				frame.getContentPane().add(button_19);
				
				JButton btnSvc = new JButton("SvC");
				btnSvc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVC.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "SB";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "CO";
					VillianP.setText(String.valueOf(Villian) );					P="";
					}
				});
				btnSvc.setFont(new Font("Dialog", Font.BOLD, 9));
				btnSvc.setBounds(259, 135, 55, 20);
				frame.getContentPane().add(btnSvc);
				
				JButton button_21 = new JButton("5");
				button_21.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVC5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "SB";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "CO";					P="";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				button_21.setFont(new Font("Dialog", Font.BOLD, 9));
				button_21.setBounds(219, 135, 40, 20);
				frame.getContentPane().add(button_21);
				
				JButton btnSvb = new JButton("SvB");
				btnSvb.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVB.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "SB";					P="";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "BTN";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				btnSvb.setFont(new Font("Dialog", Font.BOLD, 9));
				btnSvb.setBounds(150, 135, 55, 20);
				frame.getContentPane().add(btnSvb);
				
				JButton button_23 = new JButton("5");
				button_23.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVB5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "SB";
					HeroP.setText(String.valueOf(Hero) );					P="";
					Villian = "BTN";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				button_23.setFont(new Font("Dialog", Font.BOLD, 9));
				button_23.setBounds(110, 135, 40, 20);
				frame.getContentPane().add(button_23);
				
				JButton btnBbb = new JButton("BBB");
				btnBbb.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBB.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";
					HeroP.setText(String.valueOf(Hero) );					P="";
					Villian = "BTN";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				btnBbb.setFont(new Font("Dialog", Font.BOLD, 9));
				btnBbb.setBounds(150, 165, 55, 20);
				frame.getContentPane().add(btnBbb);
				
				JButton button_25 = new JButton("5");
				button_25.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBB5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";					P="";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "BTN";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				button_25.setFont(new Font("Dialog", Font.BOLD, 9));
				button_25.setBounds(110, 165, 40, 20);
				frame.getContentPane().add(button_25);
				
				JButton button_26 = new JButton("5");
				button_26.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBS5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";					P="";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "SB";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				button_26.setFont(new Font("Dialog", Font.BOLD, 9));
				button_26.setBounds(5, 165, 40, 20);
				frame.getContentPane().add(button_26);
				
				JButton btnBbs = new JButton("BBS");
				btnBbs.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBS.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";					P="";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "SB";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				btnBbs.setFont(new Font("Dialog", Font.BOLD, 9));
				btnBbs.setBounds(45, 165, 55, 20);
				frame.getContentPane().add(btnBbs);
				
				JButton button_28 = new JButton("5");
				button_28.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVU5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "SB";					P="";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "UTG";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				button_28.setFont(new Font("Dialog", Font.BOLD, 9));
				button_28.setBounds(427, 135, 40, 20);
				frame.getContentPane().add(button_28);
				
				JButton btnSvu = new JButton("SvU");
				btnSvu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVU.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "SB";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "UTG";					P="";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				btnSvu.setFont(new Font("Dialog", Font.BOLD, 9));
				btnSvu.setBounds(467, 135, 55, 20);
				frame.getContentPane().add(btnSvu);
				
				JButton button_30 = new JButton("5");
				button_30.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVM5.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
						Hero = "SB";
						HeroP.setText(String.valueOf(Hero) );
						Villian = "MP";					P="";
						VillianP.setText(String.valueOf(Villian) );
					
					
					}
				});
				button_30.setFont(new Font("Dialog", Font.BOLD, 9));
				button_30.setBounds(317, 135, 40, 20);
				frame.getContentPane().add(button_30);
				
				JButton btnSvm = new JButton("SvM");
				btnSvm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVM.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "SB";					P="";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "MP";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				btnSvm.setFont(new Font("Dialog", Font.BOLD, 9));
				btnSvm.setBounds(357, 135, 55, 20);
				frame.getContentPane().add(btnSvm);
				
				JButton button_32 = new JButton("5");
				button_32.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBC5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "CO";
					VillianP.setText(String.valueOf(Villian) );					P="";
					}
				});
				button_32.setFont(new Font("Dialog", Font.BOLD, 9));
				button_32.setBounds(219, 165, 40, 20);
				frame.getContentPane().add(button_32);
				
				JButton btnBbc = new JButton("BBC");
				btnBbc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBC.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";
					HeroP.setText(String.valueOf(Hero) );					P="";
					Villian = "CO";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				btnBbc.setFont(new Font("Dialog", Font.BOLD, 9));
				btnBbc.setBounds(259, 165, 55, 20);
				frame.getContentPane().add(btnBbc);
				
				JButton button_34 = new JButton("5");
				button_34.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBM5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "MP";					P="";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				button_34.setFont(new Font("Dialog", Font.BOLD, 9));
				button_34.setBounds(317, 165, 40, 20);
				frame.getContentPane().add(button_34);
				
				JButton btnBbm = new JButton("BBM");
				btnBbm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBM.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";
					HeroP.setText(String.valueOf(Hero) );					P="";
					Villian = "MP";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				btnBbm.setFont(new Font("Dialog", Font.BOLD, 9));
				btnBbm.setBounds(357, 165, 55, 20);
				frame.getContentPane().add(btnBbm);
				
				JButton button_36 = new JButton("5");
				button_36.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBU5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "UTG";					P="";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				button_36.setFont(new Font("Dialog", Font.BOLD, 9));
				button_36.setBounds(427, 165, 40, 20);
				frame.getContentPane().add(button_36);
		
				
				JButton btnBbvu = new JButton("BBU");
				btnBbvu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					Image img1 = new ImageIcon(this.getClass().getResource("/BBU.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					Hero = "BB";					P="";
					HeroP.setText(String.valueOf(Hero) );
					Villian = "UTG";
					VillianP.setText(String.valueOf(Villian) );
					}
				});
				btnBbvu.setFont(new Font("Dialog", Font.BOLD, 9));
				btnBbvu.setBounds(467, 165, 55, 20);
				frame.getContentPane().add(btnBbvu);
				
				JButton btnRng = new JButton("@");
				btnRng.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//
					}
				});
				btnRng.setBounds(401, 5, 55, 20);
				frame.getContentPane().add(btnRng);
				
				JButton button_10 = new JButton("3B OP A");
				button_10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Image img1 = new ImageIcon(this.getClass().getResource("/3BOPA.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_10.setFont(new Font("Arial", Font.BOLD, 9));
				button_10.setBounds(532, 130, 75, 20);
				frame.getContentPane().add(button_10);
				
				JButton btnbIpD = new JButton("3B IP D");
				btnbIpD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Image img1 = new ImageIcon(this.getClass().getResource("/3BIPD.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnbIpD.setFont(new Font("Arial", Font.BOLD, 9));
				btnbIpD.setBounds(532, 155, 75, 20);
				frame.getContentPane().add(btnbIpD);
				
				JButton button_14 = new JButton("3B IP A");
				button_14.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Image img1 = new ImageIcon(this.getClass().getResource("/3BIPA.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_14.setFont(new Font("Arial", Font.BOLD, 9));
				button_14.setBounds(532, 105, 75, 20);
				frame.getContentPane().add(button_14);
				
				JButton button_16 = new JButton("SR OP D");
				button_16.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Image img1 = new ImageIcon(this.getClass().getResource("/SROOPD.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_16.setFont(new Font("Arial", Font.BOLD, 9));
				button_16.setBounds(532, 80, 75, 20);
				frame.getContentPane().add(button_16);
				
				JButton button_18 = new JButton("SR IP D");
				button_18.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Image img1 = new ImageIcon(this.getClass().getResource("/SRIPD.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_18.setFont(new Font("Arial", Font.BOLD, 9));
				button_18.setBounds(532, 55, 75, 20);
				frame.getContentPane().add(button_18);
				
				JButton btnSrOpA = new JButton("SR OP A");
				btnSrOpA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Image img1 = new ImageIcon(this.getClass().getResource("/SROOPA.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnSrOpA.setFont(new Font("Arial", Font.BOLD, 9));
				btnSrOpA.setBounds(532, 30, 75, 20);
				frame.getContentPane().add(btnSrOpA);
				
				JButton btnSrIpA = new JButton("SR IP A");
				btnSrIpA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Image img1 = new ImageIcon(this.getClass().getResource("/SRIPA.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
						
					}
				});
				btnSrIpA.setFont(new Font("Arial", Font.BOLD, 9));
				btnSrIpA.setBounds(532, 5, 75, 20);
				frame.getContentPane().add(btnSrIpA);
				
				JButton btnbOpDb = new JButton("3BOPD4");
				btnbOpDb.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Image img1 = new ImageIcon(this.getClass().getResource("/3BOPD4.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
						
					}
				});
				btnbOpDb.setFont(new Font("Arial", Font.BOLD, 9));
				btnbOpDb.setBounds(532, 180, 75, 20);
				frame.getContentPane().add(btnbOpDb);
				
				
			
			
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	}
