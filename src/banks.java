import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;


@SuppressWarnings("serial")

public class banks extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private String y;
	public String display ()
    {
    	y = user.getName();
    	return y;
    }
	
	private existingUser user;
	
	public banks(existingUser ur) {
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
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Select a Bank " + display() + " !");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("ICICI  BANK");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("SBI  BANK");

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("AXIS  BANK");

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("PNB  BANK");

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("BACK");

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setText("RETURN  TO  MAIN  MENU");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("LOGOUT");
        
        jButton1.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				String x1;
        				String x2;
        				String x3;
        				try{
        					FileReader file ;
        					file = new FileReader("bankAREA3.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The address of ICICI nearest branch is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}
        				
        			}
                );
        
        jButton2.addActionListener(
            	new ActionListener ()
            	{
        			
					public void actionPerformed(ActionEvent e) {
        				String x1;
        				String x2;
        				String x3;
        				try{
        					FileReader file ;
        					file = new FileReader("bankAREA1.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The address of SBI nearest branch is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}

					});
        				
        			
               
        
        jButton3.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				String x1;
        				String x2;
        				String x3;
        				try{
        					FileReader file ;
        					file = new FileReader("bankAREA4.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The address of Axis nearest branch is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}});
        				
        			
                
        
        jButton4.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				String x1;
        				String x2;
        				String x3;
        				try{
        					FileReader file ;
        					file = new FileReader("bankAREA2.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The address of PNB nearest branch is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        			}
        				}
        				
        		);
        
        jButton5.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				new bank_Ins(user).setVisible(true);
        				dispose();
        			}
                });
        
        jButton6.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				new services(user).setVisible(true);
        				dispose();
        			}
                });
        
        jButton7.addActionListener(
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
                .addGap(23, 23, 23)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(25, 25, 25))
        );

        pack();
    }                   
    
                     
}


