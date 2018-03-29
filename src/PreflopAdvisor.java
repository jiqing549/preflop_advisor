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
public class PreflopAdvisor {

	private JFrame frame;

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
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 9));
		frame.setBounds(100, 100, 502, 736);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel rng = new JLabel("");
		rng.setFont(new Font("Arial", Font.BOLD, 12));
		rng.setBackground(Color.RED);
		rng.setBounds(301, 73, 54, 15);
		frame.getContentPane().add(rng);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 237, 455, 450);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("UTG ");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_1.setBounds(0, 5, 57, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/UTG_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("MP ");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton.setBounds(0, 38, 51, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/MP_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		
		JButton btnNewButton_5 = new JButton("VS BB");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/U_BB.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_5.setBounds(67, 5, 63, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("VS SB");
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_6.setBounds(140, 5, 63, 23);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/U_S.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("VS BTN");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/U_B.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_7.setBounds(213, 5, 69, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("VS CO");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/U_C.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_8.setBounds(292, 5, 63, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("VS MP");
		btnNewButton_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Image img1 = new ImageIcon(this.getClass().getResource("/U_M.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
				}
		
		});
		btnNewButton_9.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_9.setBounds(365, 5, 63, 23);
		frame.getContentPane().add(btnNewButton_9);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("VS BB");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/M_BB.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button.setFont(new Font("Arial", Font.BOLD, 9));
		button.setBounds(67, 38, 63, 23);
		frame.getContentPane().add(button);
		
		JButton button_4 = new JButton("VS SB");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/M_S.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_4.setFont(new Font("Arial", Font.BOLD, 9));
		button_4.setBounds(140, 38, 63, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_7 = new JButton("VS BTN");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/M_B.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_7.setFont(new Font("Arial", Font.BOLD, 9));
		button_7.setBounds(213, 38, 69, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_9 = new JButton("VS CO");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/M_C.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_9.setFont(new Font("Arial", Font.BOLD, 9));
		button_9.setBounds(292, 38, 63, 23);
		frame.getContentPane().add(button_9);
		
		JButton btnNewButton_2 = new JButton("CO ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/CO_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_2.setBounds(0, 71, 51, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button_1 = new JButton("VS BB");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/C_BB.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_1.setFont(new Font("Arial", Font.BOLD, 9));
		button_1.setBounds(67, 71, 63, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_5 = new JButton("VS SB");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/C_S.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_5.setFont(new Font("Arial", Font.BOLD, 9));
		button_5.setBounds(140, 71, 63, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_8 = new JButton("VS BTN");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/C_B.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_8.setFont(new Font("Arial", Font.BOLD, 9));
		button_8.setBounds(213, 71, 69, 23);
		frame.getContentPane().add(button_8);
		
		JButton btnNewButton_3 = new JButton("BTN ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/BTN_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_3.setBounds(0, 104, 57, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton button_2 = new JButton("VS BB");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/B_BB.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_2.setFont(new Font("Arial", Font.BOLD, 9));
		button_2.setBounds(67, 104, 63, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_6 = new JButton("VS SB");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/B_S.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_6.setFont(new Font("Arial", Font.BOLD, 9));
		button_6.setBounds(140, 104, 63, 23);
		frame.getContentPane().add(button_6);
		
		JButton btnNewButton_4 = new JButton("SB ");

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/SB_OPEN.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 9));
		btnNewButton_4.setBounds(0, 137, 51, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton button_3 = new JButton("VS BB");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/S_BB.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		button_3.setFont(new Font("Arial", Font.BOLD, 9));
		button_3.setBounds(67, 137, 63, 23);
		frame.getContentPane().add(button_3);
		
		JButton btnb = new JButton("5");
		btnb.setFont(new Font("Arial", Font.BOLD, 8));
		btnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/MVU5.png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		btnb.setBounds(395, 71, 39, 23);
		frame.getContentPane().add(btnb);
		
		JButton btnMvu = new JButton("MvU");
		btnMvu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Image img1 = new ImageIcon(this.getClass().getResource("/MVU.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img1));
			}
		});
		btnMvu.setFont(new Font("Arial", Font.BOLD, 8));
		btnMvu.setBounds(433, 71, 51, 23);
		frame.getContentPane().add(btnMvu);
		
				
				
				JButton btnCvu = new JButton("CvU");
				btnCvu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/CVU.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnCvu.setFont(new Font("Arial", Font.BOLD, 8));
				btnCvu.setBounds(433, 104, 51, 23);
				frame.getContentPane().add(btnCvu);
				
				JButton button_11 = new JButton("5");
				button_11.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/CVU5.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_11.setFont(new Font("Arial", Font.BOLD, 8));
				button_11.setBounds(395, 104, 39, 23);
				frame.getContentPane().add(button_11);
				
				JButton btnBvu = new JButton("BvU");
				btnBvu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVU.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnBvu.setFont(new Font("Arial", Font.BOLD, 8));
				btnBvu.setBounds(433, 137, 51, 23);
				frame.getContentPane().add(btnBvu);
				
				JButton button_13 = new JButton("5");
				button_13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVU5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_13.setFont(new Font("Arial", Font.BOLD, 8));
				button_13.setBounds(395, 137, 39, 23);
				frame.getContentPane().add(button_13);
				
				JButton btnCvm = new JButton("CvM");
				btnCvm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/CVM.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnCvm.setFont(new Font("Arial", Font.BOLD, 8));
				btnCvm.setBounds(341, 104, 51, 23);
				frame.getContentPane().add(btnCvm);
				
				JButton button_15 = new JButton("5");
				button_15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/CVM5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_15.setFont(new Font("Arial", Font.BOLD, 8));
				button_15.setBounds(303, 104, 39, 23);
				frame.getContentPane().add(button_15);
				
				JButton btnBvm = new JButton("BvM");
				btnBvm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVM.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnBvm.setFont(new Font("Arial", Font.BOLD, 8));
				btnBvm.setBounds(341, 137, 51, 23);
				frame.getContentPane().add(btnBvm);
				
				JButton button_17 = new JButton("5");
				button_17.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVM5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_17.setFont(new Font("Arial", Font.BOLD, 8));
				button_17.setBounds(303, 137, 39, 23);
				frame.getContentPane().add(button_17);
				
				JButton btnBvc = new JButton("BvC");
				btnBvc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVC.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnBvc.setFont(new Font("Arial", Font.BOLD, 8));
				btnBvc.setBounds(244, 137, 51, 23);
				frame.getContentPane().add(btnBvc);
				
				JButton button_19 = new JButton("5");
				button_19.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BVC5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_19.setFont(new Font("Arial", Font.BOLD, 8));
				button_19.setBounds(206, 137, 39, 23);
				frame.getContentPane().add(button_19);
				
				JButton btnSvc = new JButton("SvC");
				btnSvc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVC.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnSvc.setFont(new Font("Arial", Font.BOLD, 8));
				btnSvc.setBounds(244, 169, 51, 23);
				frame.getContentPane().add(btnSvc);
				
				JButton button_21 = new JButton("5");
				button_21.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVC5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_21.setFont(new Font("Arial", Font.BOLD, 8));
				button_21.setBounds(206, 169, 39, 23);
				frame.getContentPane().add(button_21);
				
				JButton btnSvb = new JButton("SvB");
				btnSvb.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVB.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnSvb.setFont(new Font("Arial", Font.BOLD, 8));
				btnSvb.setBounds(147, 170, 51, 23);
				frame.getContentPane().add(btnSvb);
				
				JButton button_23 = new JButton("5");
				button_23.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVB5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_23.setFont(new Font("Arial", Font.BOLD, 8));
				button_23.setBounds(109, 170, 39, 23);
				frame.getContentPane().add(button_23);
				
				JButton btnBbb = new JButton("BBB");
				btnBbb.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBB.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnBbb.setFont(new Font("Arial", Font.BOLD, 8));
				btnBbb.setBounds(147, 204, 51, 23);
				frame.getContentPane().add(btnBbb);
				
				JButton button_25 = new JButton("5");
				button_25.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBB5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_25.setFont(new Font("Arial", Font.BOLD, 8));
				button_25.setBounds(109, 204, 39, 23);
				frame.getContentPane().add(button_25);
				
				JButton button_26 = new JButton("5");
				button_26.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBS5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_26.setFont(new Font("Arial", Font.BOLD, 8));
				button_26.setBounds(10, 204, 39, 23);
				frame.getContentPane().add(button_26);
				
				JButton btnBbs = new JButton("BBS");
				btnBbs.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBS.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnBbs.setFont(new Font("Arial", Font.BOLD, 8));
				btnBbs.setBounds(48, 204, 51, 23);
				frame.getContentPane().add(btnBbs);
				
				JButton button_28 = new JButton("5");
				button_28.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVU5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_28.setFont(new Font("Arial", Font.BOLD, 8));
				button_28.setBounds(395, 170, 39, 23);
				frame.getContentPane().add(button_28);
				
				JButton btnSvu = new JButton("SvU");
				btnSvu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVU.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnSvu.setFont(new Font("Arial", Font.BOLD, 8));
				btnSvu.setBounds(433, 170, 51, 23);
				frame.getContentPane().add(btnSvu);
				
				JButton button_30 = new JButton("5");
				button_30.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVM5.png")).getImage();
						lblNewLabel.setIcon(new ImageIcon(img1));
					
					
					}
				});
				button_30.setFont(new Font("Arial", Font.BOLD, 8));
				button_30.setBounds(303, 170, 39, 23);
				frame.getContentPane().add(button_30);
				
				JButton btnSvm = new JButton("SvM");
				btnSvm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/SVM.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnSvm.setFont(new Font("Arial", Font.BOLD, 8));
				btnSvm.setBounds(341, 170, 51, 23);
				frame.getContentPane().add(btnSvm);
				
				JButton button_32 = new JButton("5");
				button_32.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBC5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_32.setFont(new Font("Arial", Font.BOLD, 8));
				button_32.setBounds(206, 204, 39, 23);
				frame.getContentPane().add(button_32);
				
				JButton btnBbc = new JButton("BBC");
				btnBbc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBC.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnBbc.setFont(new Font("Arial", Font.BOLD, 8));
				btnBbc.setBounds(244, 204, 51, 23);
				frame.getContentPane().add(btnBbc);
				
				JButton button_34 = new JButton("5");
				button_34.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBM5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_34.setFont(new Font("Arial", Font.BOLD, 8));
				button_34.setBounds(303, 204, 39, 23);
				frame.getContentPane().add(button_34);
				
				JButton btnBbm = new JButton("BBM");
				btnBbm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBM.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnBbm.setFont(new Font("Arial", Font.BOLD, 8));
				btnBbm.setBounds(341, 204, 51, 23);
				frame.getContentPane().add(btnBbm);
				
				JButton button_36 = new JButton("5");
				button_36.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBU5.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				button_36.setFont(new Font("Arial", Font.BOLD, 8));
				button_36.setBounds(395, 204, 39, 23);
				frame.getContentPane().add(button_36);
		
				
				JButton btnBbvu = new JButton("BBU");
				btnBbvu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {Image img1 = new ImageIcon(this.getClass().getResource("/BBU.png")).getImage();
					lblNewLabel.setIcon(new ImageIcon(img1));
					}
				});
				btnBbvu.setFont(new Font("Arial", Font.BOLD, 8));
				btnBbvu.setBounds(433, 204, 51, 23);
				frame.getContentPane().add(btnBbvu);
				
				JButton btnRng = new JButton("@");
				btnRng.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Random rand = new Random();

						int  n = rand.nextInt(100) + 1;
						
						rng.setText(String.valueOf(n) );
						
					}
				});
				btnRng.setBounds(375, 38, 51, 23);
				frame.getContentPane().add(btnRng);
			
		
	}
	}
