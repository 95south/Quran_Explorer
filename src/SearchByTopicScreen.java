/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class SearchByTopicScreen extends javax.swing.JFrame {

    numberSearch quran;
    SearchByTopic topicSearch;
    
    public SearchByTopicScreen(numberSearch q) {
        initComponents();
        quran=q;
        topicSearch=new SearchByTopic(q);
        OtherTopic.hide();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AyatOutput = new javax.swing.JTextArea();
        TopicName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        SubTopicButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        OtherTopic = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AyatOutput.setColumns(20);
        AyatOutput.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AyatOutput.setRows(5);
        jScrollPane1.setViewportView(AyatOutput);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 430, 210));

        TopicName.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        TopicName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TopicName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jButton1.setText("English Translation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 150, 40));

        jButton2.setText("Urdu Translation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 150, 40));

        jButton3.setText("<< Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 120, 30));

        SubTopicButton.setText("Sub Topics");
        SubTopicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTopicButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SubTopicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 110, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 :  Ablution ", "2  : Allah", "3  : Angels", "4  : Apostacy", "5  : Behavior", "6  : Charity", "7  : Children", "8  : Death", "9  : Disbelievers", "10  : Earth", "11  : Fasting", "12  : Fighting", "13  : Friends", "14  : Hajj", "15  : Inheritance", "16  : Materialism", "17  : Mecca", "18  : Religion", "19  : Water", "20  : Revelation" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 290, 30));

        OtherTopic.setText("Search Other Topic");
        OtherTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherTopicActionPerformed(evt);
            }
        });
        jPanel1.add(OtherTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, -1));

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search by Topic");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 50));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quran Explorer");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select The Topic :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/14d2be9a360be5da2f41b41b4fe22088.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MainMenu mm=new MainMenu();
        mm.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
        if(jLabel5.getText().equals("Search by Topic")){
            
            String[] arr=jComboBox1.getSelectedItem().toString().split(" ");
            int i=Integer.parseInt(arr[0]);
            AyatOutput.setText(topicSearch.ayatTopic(i));
         
        }
        else if(jLabel5.getText().equals("Search Subtopic")){
            String[] arr=jComboBox1.getSelectedItem().toString().split(" ");
            int i=Integer.parseInt(arr[0]);
            AyatOutput.setText(topicSearch.sAyatTopic(i));
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       if(jLabel5.getText().equals("Search by Topic")){
            String[] arr=jComboBox1.getSelectedItem().toString().split(" ");
        int i=Integer.parseInt(arr[0]);
        AyatOutput.setText(topicSearch.urduAyatTopic(i));
         
        }
        else if(jLabel5.getText().equals("Search Subtopic")){
            String[] arr=jComboBox1.getSelectedItem().toString().split(" ");
            int i=Integer.parseInt(arr[0]);
            AyatOutput.setText(topicSearch.urdTopicAyat(i));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jLabel5.getText().equals("Search by Topic")){
            String[] arr=jComboBox1.getSelectedItem().toString().split(" ");
        int i=Integer.parseInt(arr[0]);
        AyatOutput.setText(topicSearch.englishAyatTopic(i));
         
        }
        else if(jLabel5.getText().equals("Search Subtopic")){
            String[] arr=jComboBox1.getSelectedItem().toString().split(" ");
            int i=Integer.parseInt(arr[0]);
            AyatOutput.setText(topicSearch.engTopicAyat(i));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void OtherTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherTopicActionPerformed
        // TODO add your handling code here:
        OtherTopic.hide();
        jLabel5.setText("Search by Topic");
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 :  Ablution ", "2  : Allah", "3  : Angels", "4  : Apostacy", "5  : Behavior", "6  : Charity", "7  : Children", "8  : Death", "9  : Disbelievers", "10  : Earth", "11  : Fasting", "12  : Fighting", "13  : Friends", "14  : Hajj", "15  : Inheritance", "16  : Materialism", "17  : Mecca", "18  : Religion", "19  : Water", "20  : Revelation" }));
        AyatOutput.setText("");
        SubTopicButton.show();
        TopicName.setText("");
    }//GEN-LAST:event_OtherTopicActionPerformed

    private void SubTopicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTopicButtonActionPerformed
        // TODO add your handling code here:
        jLabel5.setText("Search Subtopic");
        jLabel2.setText("Enter the Sub Topic");
           String[] arr=jComboBox1.getSelectedItem().toString().split(" ");
           TopicName.setText("Of "+arr[3]);
        int i=Integer.parseInt(arr[0]);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(topicSearch.sListOfTopics(i)));
        AyatOutput.setText("");
        OtherTopic.show();
        SubTopicButton.hide();
        
    }//GEN-LAST:event_SubTopicButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */

//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SearchAyatScreen(quran).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AyatOutput;
    private javax.swing.JButton OtherTopic;
    private javax.swing.JButton SubTopicButton;
    private javax.swing.JLabel TopicName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
