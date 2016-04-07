import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


@SuppressWarnings("serial")

public class changePassword extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private String user;
    private String newPass;
    /**
     * Creates new form NewJFrame3
     */
    public changePassword() {
        initComponents();
    }

                             
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jButton1.setText("BACK");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("CHANGE  PASSWORD");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        jLabel2.setText("NEW  PASSWORD");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        jButton2.setText("CHANGE ");
        

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        jLabel3.setText("ENTER  USERNAME");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 12)); 

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        jLabel4.setText("CONFIRM  PASSWORD");
        
        jButton1.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				if ( e.getSource() == jButton1)
        				{
        					new forgotPassword().setVisible(true);
        					dispose();
        				}
        				
        			}
                });
        
        jButton2.addActionListener(
            	new ActionListener ()
            	{
        			public void actionPerformed(ActionEvent e) {
        				
        				
						try {
							user = String.format("%s.txt" , jTextField2.getText());
	        				String y = new String(jPasswordField1.getPassword());
	        				
	        				if ( !jTextField2.getText().equals("") && y.equals(new String(jPasswordField2.getPassword())))
	        				{
	        					newPass = y;
							File file = new File(user);
							FileReader f0 = new FileReader ( file);
							BufferedReader br = new BufferedReader ( f0);;
	        				
	        				PrintWriter writer;
	        				File file2 = new File("change.txt");

							writer = new PrintWriter(file2);
							
							writer.println(newPass);
							
							br.readLine();
							for ( int i = 0 ; i < 9 ; i++)
							{
								writer.println(br.readLine());
							}
							

							br.close();
							writer.close();
							
							file.delete();
							file2.renameTo(file);
							
							
							
							JOptionPane.showMessageDialog(null , "Password changed");
							new login().setVisible(true);
							dispose();
	        				}
	        				
	        				else if ( jTextField2.getText().equals(""))
								JOptionPane.showMessageDialog(null , "Please enter the username");
	        				else if (( new String(jPasswordField1.getPassword()).equals("")))
	        				{
								JOptionPane.showMessageDialog(null , "Please enter a new password");
	        				}
	        				
	        				else if (!y.equals(new String(jPasswordField2.getPassword())))
	        				{
	        					JOptionPane.showMessageDialog(null , "Passwords do not match!!");
	        				}
							
						} 
						catch (FileNotFoundException e1) {
							JOptionPane.showMessageDialog(null , "User Name Does Not Exist");
							e1.printStackTrace();
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
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jPasswordField1)
                    .addComponent(jPasswordField2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }
   

                    
}

