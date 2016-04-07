
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")

public class household extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
	private existingUser user;
	
    public household(existingUser ur) {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("HOUSEHOLD  ASSISTANCE");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton1.setText("GENERAL  STORE");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton2.setText("LABOUR");
        

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton3.setText("BACK");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton4.setText("RETURN  TO  MAIN  MENU");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton5.setText("LOGOUT");
        
        jButton4.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				new services(user).setVisible(true);
        				dispose();
        			}
                });
        
        jButton3.addActionListener(
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
        				String x3;
        				if ( user.getArea().equals("Area 1"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("RajGeneral.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest General store is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 2"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("DelhiGeneral.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest General store is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch(Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 3"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("Reliance.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest General store is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}

        				else
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("CoolnFresh.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest General store is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1) {}
        				}
        			}
                });
        
        jButton2.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        					new labour(user).setVisible(true);
        					dispose();
        			}
                });
        
        jButton5.addActionListener(
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
                        .addGap(38, 38, 38)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(171, 171, 171))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }

                      
}

