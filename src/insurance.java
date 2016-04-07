
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;


@SuppressWarnings("serial")

public class insurance extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
	private existingUser user;
	
    public insurance(existingUser ur) {
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
        jLabel1.setText("INSURANCE");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("LIC ");
        

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("HDFC");

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("BACK");

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("RETURN  TO  MAIN  MENU");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("LOGOUT");
        
        jButton1.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				String x1;
        				String x2;
        				String x3;
        				try{
        					FileReader file ;
        					file = new FileReader("LIC.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The address of LIC nearest branch is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        				
        			}
                });
        
        jButton2.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				String x1;
        				String x2;
        				String x3;
        				try{
        					FileReader file ;
        					file = new FileReader("HDFC.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The address of HDFC nearest branch is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        				
        			}
                });
        
        jButton3.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				new bank_Ins(user).setVisible(true);
        				dispose();
        			}
                });
        
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }
                   
}

