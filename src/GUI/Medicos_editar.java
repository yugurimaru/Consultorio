/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Medico;
import DAO.ErpDAOException;
import DAO.MedicoDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author yugurimaru
 */
public class Medicos_editar extends javax.swing.JFrame {

    private Medico medico;
    /**
     * Creates new form Pacientes_Inserir
     */
    public Medicos_editar(Medico medico) {
        this.medico = medico;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_nome = new javax.swing.JTextField();
        TF_telefone = new javax.swing.JTextField();
        BT_salvar = new javax.swing.JButton();
        BT_cancelar = new javax.swing.JButton();
        RB_masculino = new javax.swing.JRadioButton();
        RB_feminino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        TF_especialidade = new javax.swing.JTextField();
        DC_data_nascimento = new datechooser.beans.DateChooserPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Medico");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Data de nascimento:");

        TF_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_nomeActionPerformed(evt);
            }
        });

        TF_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_telefoneActionPerformed(evt);
            }
        });

        BT_salvar.setText("Salvar");
        BT_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_salvarMousePressed(evt);
            }
        });

        BT_cancelar.setText("Cancelar");
        BT_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_cancelarActionPerformed(evt);
            }
        });

        buttonGroup1.add(RB_masculino);
        RB_masculino.setText("Masculino");

        buttonGroup1.add(RB_feminino);
        RB_feminino.setText("Feminino");

        jLabel5.setText("Especialidade:");

        TF_especialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_especialidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DC_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT_cancelar)
                        .addGap(36, 36, 36)
                        .addComponent(BT_salvar)
                        .addGap(66, 66, 66)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_nome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_especialidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RB_masculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(RB_feminino))))
                            .addComponent(TF_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TF_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RB_masculino)
                    .addComponent(RB_feminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DC_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_salvar)
                    .addComponent(BT_cancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TF_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_nomeActionPerformed

    private void TF_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_telefoneActionPerformed

    private void BT_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BT_cancelarActionPerformed

    private void BT_salvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_salvarMousePressed
        String nome, telefone, especialidade, data_string;
        Date dataNasc = null;
        char sexo = ' ';
        DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
        
        if (TF_nome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessário o Nome");
        } else if ((RB_masculino.isSelected() == false) && (RB_feminino.isSelected() == false)) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o Sexo");
        } else {

            nome = TF_nome.getText();
            especialidade = TF_especialidade.getText();
            if (RB_feminino.isSelected() == true) {
                sexo = 'F';
            }
            if (RB_masculino.isSelected() == true) {
                sexo = 'M';
            }
            telefone = TF_telefone.getText();
            
            Calendar date = DC_data_nascimento.getSelectedDate();
            int mes = (int) date.get(Calendar.MONTH);
            mes += 1;
            data_string = (date.get(Calendar.DAY_OF_MONTH) + "/" + mes + "/" + date.get(Calendar.YEAR));
            if (data_string.equals("")) {
                dataNasc = null;
                
            } else {
                try {
                    dataNasc = dtOutput.parse(data_string);
                } catch (ParseException ex) {
                    System.out.println("Erro na conversão da data");
                }
            }
            medico.setNome_med(nome);
            medico.setData_nasc(dataNasc);
            medico.setSexo(sexo);
            medico.setFone(telefone);
            medico.setEspecialidade(especialidade);
            
            try {
                MedicoDAO MDAO = new MedicoDAO();
                MDAO.Atualizar(medico);
                JOptionPane.showMessageDialog(rootPane, "Edição efetuada com sucesso!!");
            } catch (Exception e) {
                System.out.println("problema na edição do Medico");
            }
            dispose();
        }
    }//GEN-LAST:event_BT_salvarMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TF_nome.setText(medico.getNome_med());
        TF_especialidade.setText(medico.getEspecialidade());
        TF_telefone.setText(medico.getFone());
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(medico.getData_nasc());
        DC_data_nascimento.setSelectedDate(calendar);
        
        if(medico.getSexo() == 'M'){
            RB_masculino.setSelected(true);
        }
        else{
            RB_feminino.setSelected(true);
        }
    }//GEN-LAST:event_formWindowOpened

    private void TF_especialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_especialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_especialidadeActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_cancelar;
    private javax.swing.JButton BT_salvar;
    private datechooser.beans.DateChooserPanel DC_data_nascimento;
    private javax.swing.JRadioButton RB_feminino;
    private javax.swing.JRadioButton RB_masculino;
    private javax.swing.JTextField TF_especialidade;
    private javax.swing.JTextField TF_nome;
    private javax.swing.JTextField TF_telefone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
