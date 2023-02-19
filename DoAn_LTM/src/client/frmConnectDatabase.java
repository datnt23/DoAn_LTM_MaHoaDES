/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class frmConnectDatabase extends javax.swing.JFrame {

	/**
	 * Creates new form frmConnectCSDL
	 */
	public frmConnectDatabase() {
		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
                javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
                javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
                txtNameDB = new javax.swing.JTextField();
                javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
                txtCong = new javax.swing.JTextField();
                javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
                txtUsername = new javax.swing.JTextField();
                javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
                btnKetNoi = new javax.swing.JButton();
                txtPassword = new javax.swing.JPasswordField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Connect To DataBase");
                setResizable(false);

                jPanel1.setBackground(new java.awt.Color(153, 255, 255));

                jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
                jLabel1.setText("Kết Nối Database");

                jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
                jLabel2.setText("Tên Database:");

                jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
                jLabel3.setText("Cổng:");

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
                jLabel4.setText("Username:");

                jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
                jLabel5.setText("Password:");

                btnKetNoi.setBackground(new java.awt.Color(255, 255, 153));
                btnKetNoi.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
                btnKetNoi.setText("Kết Nối");
                btnKetNoi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnKetNoiActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNameDB, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                                        .addComponent(txtCong)
                                                        .addComponent(txtUsername)
                                                        .addComponent(txtPassword)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(btnKetNoi)))
                                .addContainerGap(28, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNameDB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCong))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUsername))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnKetNoi)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnKetNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetNoiActionPerformed
                byte []send;
		DatagramSocket client;
		try {
			client = new DatagramSocket();
			String nameDB = this.txtNameDB.getText();
			int cong = Integer.parseInt(txtCong.getText());
			String user = this.txtUsername.getText();
			String pass = this.txtPassword.getText();
			String chuoi = "ConneectToDatabase#"+nameDB+"#"+cong+"#"+user+"#"+pass;
			send = chuoi.getBytes();
			InetAddress ip = InetAddress.getByName("localhost");
			DatagramPacket sendData = new DatagramPacket(send, send.length, ip, 1234);
			System.out.println(chuoi);
			client.send(sendData);
			
			byte[] receiveBuffer = new byte[65507];
			DatagramPacket receiveData = new DatagramPacket(receiveBuffer, receiveBuffer.length);
			client.receive(receiveData);
			JOptionPane.showMessageDialog(null, new String (receiveData.getData()).trim());
			this.dispose();
			frmSinhVien frm = new frmSinhVien();
			frm.show();
		} catch (Exception e) {
		}
        }//GEN-LAST:event_btnKetNoiActionPerformed

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
			java.util.logging.Logger.getLogger(frmConnectDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frmConnectDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frmConnectDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frmConnectDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmConnectDatabase().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnKetNoi;
        private javax.swing.JTextField txtCong;
        private javax.swing.JTextField txtNameDB;
        private javax.swing.JPasswordField txtPassword;
        private javax.swing.JTextField txtUsername;
        // End of variables declaration//GEN-END:variables
}
