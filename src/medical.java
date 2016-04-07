import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;


@SuppressWarnings("serial")

public class medical extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
	private existingUser user;
	
    public medical(existingUser ur) {
    	user= ur;
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
        jLabel1.setText("MEDICAL");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("HOSPITALS");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("CHEMIST  SHOP");

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("BACK");

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("RETURN  TO  MAIN  MENU");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("LOGOUT");

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setText("ELEMENTARY  FIRST  AID");
        
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
        					file = new FileReader("HospitalArea1.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Hospital is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 2"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("HospitalArea2.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Hospital is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch(Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 3"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("HospitalArea3.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Hospital is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}

        				else
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("HospitalArea4.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Hospital is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
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
        				
        				String x1;
        				String x2;
        				String x3;
        				if ( user.getArea().equals("Area 1"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("ChemistArea1.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Chemist shop is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 2"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("ChemistArea2.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Chemist shop is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch(Exception e1){}
        				}

        				else if ( user.getArea().equals("Area 3"))
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("ChemistArea3.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Chemist shop is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
        					br.close();
        					}
        					catch (Exception e1){}
        					
        				}

        				else
        				{
        					try{
        					FileReader file ;
        					file = new FileReader("ChemistArea2.txt");
        					BufferedReader br = new BufferedReader (file);
        					x1 = br.readLine();
        					x2 = br.readLine();
        					x3 = br.readLine();
        					JOptionPane.showMessageDialog(null, "The nearest Chemist shop is " + "\n" + x1 + "\n" + x2 + "\n" + x3);
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
        				 new services(user).setVisible(true);
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
        
        jButton6.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				new symptoms(user).setVisible(true);
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
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(28, 28, 28)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }

                     
}


