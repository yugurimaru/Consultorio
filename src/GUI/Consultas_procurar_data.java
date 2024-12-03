/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Consulta;
import Classes.Medico;
import Classes.Paciente;
import DAO.ConsultaDAO;
import DAO.MedicoDAO;
import DAO.PacienteDAO;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yugurimaru
 */
public class Consultas_procurar_data extends javax.swing.JFrame {

    ArrayList<Consulta> Consulta = new ArrayList();
    
    /**
     * Creates new form Consultas_procurar_data
     */
    public Consultas_procurar_data() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        DC_procurar_data = new datechooser.beans.DateChooserPanel();
        jLabel1 = new javax.swing.JLabel();
        BT_atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas por Data");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Consulta", "ID Médico", "ID Paciente", "Data", "Hora", "Compareceu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jLabel1.setText("Informe a Data:");

        BT_atualizar.setText("Atualizar");
        BT_atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_atualizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DC_procurar_data, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(BT_atualizar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(DC_procurar_data, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(BT_atualizar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Atualizar_tabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void BT_atualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_atualizarMousePressed
        Atualizar_tabela();
    }//GEN-LAST:event_BT_atualizarMousePressed

    /**
     * @param args the command line arguments
     */
    
    private void Atualizar_tabela() {

        DefaultTableModel table = (DefaultTableModel) Tabela.getModel();
        Tabela.removeAll();
        String id_medico, id_paciente, id_consulta, data_string, hora_string, compareceu;
        DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
        Date data_consulta = null;

        if (Tabela.getRowCount() > 0) {
            while (Tabela.getRowCount() > 0) {
                table.removeRow(0);
            }
        }

        ConsultaDAO CDAO;
        try {
            CDAO = new ConsultaDAO();
            
            Calendar date = DC_procurar_data.getSelectedDate();
            int mes = (int) date.get(Calendar.MONTH);
            mes += 1;
            data_string = (date.get(Calendar.DAY_OF_MONTH) + "/" + mes + "/" + date.get(Calendar.YEAR));
            data_consulta = dtOutput.parse(data_string);
            
            Consulta = CDAO.Listar_por_data(data_consulta);
        } catch (Exception e) {
            System.out.println("Erro de conexão ao banco.");
        }

        for (int i = 0; i < Consulta.size(); i++) {  
            
            int id_medico_procurar = Consulta.get(i).getId_medico();
            MedicoDAO MDAO = new MedicoDAO();
            Medico medico = MDAO.Procurar(id_medico_procurar);
            id_medico = medico.getNome_med();
            
            int id_paciente_procurar = Consulta.get(i).getId_paciente();
            PacienteDAO PDAO = new PacienteDAO();
            Paciente paciente = PDAO.procurar(id_paciente_procurar);
            id_paciente = paciente.getNome_pac();
            
            id_consulta = Integer.toString(Consulta.get(i).getId_consulta());

            data_string = dtOutput.format(Consulta.get(i).getData());

            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Time hora;

            try {
                hora = Consulta.get(i).getHora();
                hora_string = format.format(hora);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro na conversão da hora");
                hora_string = null;
            }

            compareceu = Consulta.get(i).getCompareceu() + "";

            table.addRow(new String[]{id_consulta, id_medico, id_paciente, data_string, hora_string, compareceu});
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_atualizar;
    private datechooser.beans.DateChooserPanel DC_procurar_data;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}