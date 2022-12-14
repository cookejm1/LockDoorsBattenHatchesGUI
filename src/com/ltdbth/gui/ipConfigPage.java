import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

/**
 *
 * @author James Cooke, Ian Apelgren
 */
public class ipConfigPage extends javax.swing.JFrame {

    /**
     * Creates new form appPages
     */
    public ipConfigPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        DscriptionTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        RunButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DscriptionTextArea = new javax.swing.JTextArea();
        nameLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DscriptionTextArea2 = new javax.swing.JTextArea();

        DscriptionTextArea1.setBackground(new java.awt.Color(0, 153, 255));
        DscriptionTextArea1.setColumns(20);
        DscriptionTextArea1.setLineWrap(true);
        DscriptionTextArea1.setRows(20);
        DscriptionTextArea1.setText("text");
        DscriptionTextArea1.setWrapStyleWord(true);
        DscriptionTextArea1.setAutoscrolls(false);
        DscriptionTextArea1.setBorder(null);
        DscriptionTextArea1.setFocusable(false);
        DscriptionTextArea1.setOpaque(false);
        jScrollPane2.setViewportView(DscriptionTextArea1);

        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        RunButton.setText("Launch");
        RunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					RunButtonActionPerformed(evt);
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(RunButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        DscriptionTextArea.setBackground(new java.awt.Color(102, 204, 255));
        DscriptionTextArea.setColumns(20);
        DscriptionTextArea.setLineWrap(true);
        DscriptionTextArea.setRows(20);
        DscriptionTextArea.setText("output");
        DscriptionTextArea.setWrapStyleWord(true);
        DscriptionTextArea.setAutoscrolls(false);
        DscriptionTextArea.setBorder(null);
        DscriptionTextArea.setFocusable(false);
        DscriptionTextArea.setOpaque(false);
        jScrollPane1.setViewportView(DscriptionTextArea);

        nameLabel.setFont(new java.awt.Font("Georgia", 1, 36)); 
        nameLabel.setText("IP Config");

        DscriptionTextArea2.setBackground(new java.awt.Color(102, 204, 255));
        DscriptionTextArea2.setColumns(20);
        DscriptionTextArea2.setLineWrap(true);
        DscriptionTextArea2.setRows(20);
        DscriptionTextArea2.setText("Windows: The IP Config tool will display useful infomation about your home network. "
        		+ "IP Config shows all current TCP/IP network configurations and provides functionality to "
        		+ "refresh both Dynamic Host Configuration and Domain Name System protocols."
        		+ " MacOS: Once the launch button is pressed the application will run the command \"route -n get default\"."
        		+ " This command will show your current network interface and your default gateway. If you are using a wired connection,"
        		+ " and enter the default gateway into your browser, the browser will bring you to your routers configuration page."
        		+ " Upon login this page always the user to change SSID, passwords and which MAC addresses have access to the network.");
        DscriptionTextArea2.setWrapStyleWord(true);
        DscriptionTextArea2.setAutoscrolls(false);
        DscriptionTextArea2.setBorder(null);
        DscriptionTextArea2.setFocusable(false);
        DscriptionTextArea2.setOpaque(false);
        jScrollPane3.setViewportView(DscriptionTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void RunButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_RunButtonActionPerformed
    	boolean winOS = Launcher.setOS();
    	Process p;
    	if (winOS) {
    		p = Runtime.getRuntime().exec("ipconfig");
    	}
    	else
    	{
    		p = Runtime.getRuntime().exec("route -n get default");
    	}
    	
    	
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	
    	StringJoiner joiner = new StringJoiner("\n");
    	String line = null;
    	
    	while ((line = stdInput.readLine()) != null) {
    		joiner.add(line);
    		
    	}
    	String output = joiner.toString();
    	DscriptionTextArea.setText(output);
    }

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new SystemToolsPage().setVisible(true);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ipConfigPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ipConfigPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ipConfigPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ipConfigPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ipConfigPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton BackButton;
    private javax.swing.JTextArea DscriptionTextArea;
    private javax.swing.JTextArea DscriptionTextArea1;
    private javax.swing.JTextArea DscriptionTextArea2;
    private javax.swing.JButton RunButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration
}
