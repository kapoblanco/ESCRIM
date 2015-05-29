/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrim;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author David
 */
public class JFrame_Principale extends javax.swing.JFrame {
//Nouvelle version de test
    // Assure que la classe courante s'appelle LOGGER
    private final static Logger LOGGER = Logger.getLogger(JFrame_Principale.class.getName()); 
    /**
     * Creates new form JFrame_Principale
     */
    public JFrame_Principale() {
        initComponents();
        errorLabel.setVisible(false);   //Rends invisible le label d'erreur de connexion
        menuPanel.setVisible(false);    //Rends invisible le second panel
        menuPanel.enable(false);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escrimLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        usrLabel = new javax.swing.JLabel();
        usrTextField = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        errorLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        criseButton = new javax.swing.JToggleButton();
        stockButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(1200, 960));
        setMinimumSize(new java.awt.Dimension(1200, 960));
        setName("ESCRIM"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 960));
        setSize(new java.awt.Dimension(1200, 960));

        escrimLabel.setText("ESCRIM");

        mainPanel.setMaximumSize(new java.awt.Dimension(1100, 900));
        mainPanel.setMinimumSize(new java.awt.Dimension(1100, 900));
        mainPanel.setPreferredSize(new java.awt.Dimension(1100, 900));

        usrLabel.setText("UTILISATEUR");

        usrTextField.setText("utilisateur");

        connectButton.setText("Connexion");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        passwordLabel.setText("MOT DE PASSE");

        passwordField.setText("mot de passe");

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText("Erreur mot de passe/utilisateur inconnu");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(544, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(connectButton)
                    .addComponent(passwordLabel)
                    .addComponent(usrLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorLabel))
                .addGap(448, 448, 448))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(usrLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(connectButton)
                .addContainerGap(443, Short.MAX_VALUE))
        );

        menuPanel.setMaximumSize(new java.awt.Dimension(1100, 900));
        menuPanel.setMinimumSize(new java.awt.Dimension(1100, 900));

        criseButton.setText("État de crise");
        criseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criseButtonActionPerformed(evt);
            }
        });

        stockButton.setText("Gestion des stocks");
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(stockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268)
                .addComponent(criseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addComponent(escrimLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escrimLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        LOGGER.info("Connexion à la base de données\n");
        String user = usrTextField.getText(); //Récupération de l'identifiant  
        String password = passwordField.getText(); //Récupération du mot de passe
        LOGGER.info(user + " "+password);
        if(user.equals("usr") && password.equals("pass") ){ //Teste les identifiants de connexion
            LOGGER.info("Connexion réussi");
            menuPanel.setVisible(true);
            menuPanel.enable(true);
            mainPanel.setVisible(false);
            mainPanel.enable(false);
        }else
            errorLabel.setVisible(true); //Rends visible le label d'erreur de connexion
        ControllerColis.getController().creerColis(usrTextField.getText());
    }//GEN-LAST:event_connectButtonActionPerformed

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockButtonActionPerformed

    private void criseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_criseButtonActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        LOGGER.setLevel(Level.INFO);
        
        LOGGER.info("Je suis dans le main de la frame principale");
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectButton;
    private javax.swing.JToggleButton criseButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel escrimLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JToggleButton stockButton;
    private javax.swing.JLabel usrLabel;
    private javax.swing.JTextField usrTextField;
    // End of variables declaration//GEN-END:variables
}
