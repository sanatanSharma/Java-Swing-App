import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


@SuppressWarnings("serial")

public class transport extends javax.swing.JFrame {
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
	private existingUser user;
	
    public transport(existingUser ur) {
    	user = ur ;
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
        jLabel1.setText("TRANSPORT");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("SHOULD  WE  CALL  A  TAXI  FOR YOU ??");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("TRAVEL  AGENCY");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("RETURN  TO  MAIN  MENU");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("BACK");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        				FileReader file1 = null;
						try {
							file1 = new FileReader("CarKeshav.txt");
						} catch (FileNotFoundException e2) {
							
							e2.printStackTrace();
						}
        				FileReader file2 = null;
						try {
							file2 = new FileReader("CarKaran.txt");
						} catch (FileNotFoundException e2) {
							
							e2.printStackTrace();
						}
        				BufferedReader br1 = new BufferedReader(file1);
        				String x1 = null;
						try {
							x1 = br1.readLine();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
        				String x2 = null;
						try {
							x2 = br1.readLine();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
        				BufferedReader br2 = new BufferedReader(file2);
        				String y1 = null;
						try {
							y1 = br2.readLine();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
        				String y2 = null;
						try {
							y2 = br2.readLine();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
        				
        				
        				JOptionPane.showMessageDialog(null, "The available options are :\n" +"1)- " + x1 + "\n" + x2 + "\n" + "2)-" + y1 + "\n" + y2);
        				
        				try {
							br1.close();
						} catch (IOException e2) {
							
							e2.printStackTrace();
						}
        				try {
							br2.close();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
        			}
                });
        
        jButton2.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				try{
        					FileReader file3 = new FileReader ("TravelAgency.txt");
            				BufferedReader br3 = new BufferedReader(file3);
            				String z1 = br3.readLine();
            				String z2 = br3.readLine();
            				String z3 = br3.readLine();
            				
            				JOptionPane.showMessageDialog(null, " The nearest Travel Agency recommended for you is : \n " + z1 +"\n" + z2 + "\n" + z3);
            				br3.close();
        				}
        				
        				catch (Exception e2)
        				{
        				}
        				}
        				
        			}
                );
        
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
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jButton2)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }
}
