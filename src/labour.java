import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


@SuppressWarnings("serial")

public class labour extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private String y;
	private existingUser user;
	public String display ()
    {
    	y = user.getName();
    	
    	return y;
    }
    public labour(existingUser ur) {
    	user = ur;
        initComponents();
    }                        
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("LABOUR");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("MAID/LABOUR");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("PLUMBER");

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("ELECTRICIAN");

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("CARPENTER");

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("NEWSPAPER");

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("TELECOMMUNICATION");

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("BACK");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("RETURN  TO  MAIN  MENU");

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("LOGOUT");
        
        jButton8.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				new household(user).setVisible(true);
        				dispose();
        			}
                });
        
        jButton9.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				new services(user).setVisible(true);
        				dispose();
        			}
                });
        
        jButton10.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				new existingUser().setVisible(true);
        				dispose();
        			}
                });
        
        jButton7.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				FileReader file1 = null;
						try {
							file1 = new FileReader("TeleGagan.txt");
						} catch (FileNotFoundException e2) {
							
							e2.printStackTrace();
						}
        				FileReader file2 = null;
						try {
							file2 = new FileReader("TeleJaspal.txt");
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
        				
        				
        				JOptionPane.showMessageDialog(null, "The available telecom men are :\n" +"1)- " + x1 + "\n" + x2 + "\n" + "2)-" + y1 + "\n" + y2);
        				
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
        
        jButton5.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				FileReader file1 = null;
						try {
							file1 = new FileReader("NewsRajeev.txt");
						} catch (FileNotFoundException e2) {
							
							e2.printStackTrace();
						}
        				FileReader file2 = null;
						try {
							file2 = new FileReader("NewsRakesh.txt");
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
        				
        				
        				JOptionPane.showMessageDialog(null, "The available vendor boys are :\n" +"1)- " + x1 + "\n" + x2 + "\n" + "2)-" + y1 + "\n" + y2);
        				
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
        
        jButton4.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				FileReader file1 = null;
						try {
							file1 = new FileReader("CarpJolly.txt");
						} catch (FileNotFoundException e2) {
							
							e2.printStackTrace();
						}
        				FileReader file2 = null;
						try {
							file2 = new FileReader("CarpSoni.txt");
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
        				
        				
        				JOptionPane.showMessageDialog(null, "The available carpenters are :\n" +"1)- " + x1 + "\n" + x2 + "\n" + "2)-" + y1 + "\n" + y2);
        				
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
        
        jButton3.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				FileReader file1 = null;
						try {
							file1 = new FileReader("ElecRahul.txt");
						} catch (FileNotFoundException e2) {
							
							e2.printStackTrace();
						}
        				FileReader file2 = null;
						try {
							file2 = new FileReader("ElecRaghav.txt");
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
        				
        				
        				JOptionPane.showMessageDialog(null, "The available electricians are :\n" +"1)- " + x1 + "\n" + x2 + "\n" + "2)-" + y1 + "\n" + y2);
        				
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
        				
        				FileReader file1 = null;
						try {
							file1 = new FileReader("PlumberParam.txt");
						} catch (FileNotFoundException e2) {
							
							e2.printStackTrace();
						}
        				FileReader file2 = null;
						try {
							file2 = new FileReader("PlumberParikshit.txt");
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
        				
        				
        				JOptionPane.showMessageDialog(null, "The available plumber are :\n" +"1)- " + x1 + "\n" + x2 + "\n" + "2)-" + y1 + "\n" + y2);
        				
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
        
        jButton1.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				FileReader file1 = null;
						try {
							file1 = new FileReader("MaidPreeti.txt");
						} catch (FileNotFoundException e2) {
							
							e2.printStackTrace();
						}
        				FileReader file2 = null;
						try {
							file2 = new FileReader("MaidGauri.txt");
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
        				
        				
        				JOptionPane.showMessageDialog(null, "The available maids are :\n" +"1)- " + x1 + "\n" + x2 + "\n" + "2)-" + y1 + "\n" + y2);
        				
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(162, 162, 162))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(23, 23, 23))
        );

        pack();
    }

                 
}
