import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;



@SuppressWarnings("serial")
public class recreation extends javax.swing.JFrame {

	private existingUser user;
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    public recreation(existingUser ur) {
    	user = ur;
        initComponents();
    }
    
                              
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText(" RECREATION");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("PARKS");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("CINEMA  HALL");

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("MALL");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("BACK");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("RETURN  TO  MAIN  MENU");

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("LOGOUT");
        
        jButton4.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        					new services(user).setVisible(true);
        					dispose();
        			}
                });
        
        jButton5.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				new services(user).setVisible(true);
        				dispose();
        			}
                });

        jButton1.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				String x1;
        				String x2;
        				try{
        					FileReader file ;
        					file = new FileReader("CentralPark.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Park is :" + "\n" + x1 + "\n" + x2 );
        					br.close();
        					}
        					catch(Exception e1){}
        				
        			}
                });
        
        jButton2.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e)  {
        				String x1;
        				String x2;
        				String x3;
        				if ( user.getArea().equals("Area 1"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("CinemaArea1.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Cinema Hall is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 2"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("CinemaArea2.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Cinema Hall is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch(Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 3"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("CinemaArea3.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Cinema Hall is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}

        				else
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("CinemaArea4.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Cinema Hall is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1) {}
        				}
        				
        			}
                });
        
        jButton3.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				String x1;
        				String x2;
        				String x3;
        				if ( user.getArea().equals("Area 1"))
        				{
        					try{
        					
        					FileReader file ;
        					file = new FileReader("MallArea1.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Mall is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}

        				else if ( user.getArea().equals("Area 2"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("MallArea2.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Mall is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 3"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("MallArea3.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null,"The nearest Mall is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}

        				else
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("MallArea4.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Mall is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch(Exception e1){}
        				}
        				
        			}
                });
        
        jButton6.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				new existingUser().setVisible(true);
        				dispose();
        			}
                });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(31, 31, 31)
                .addComponent(jButton6)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }

                     
}

