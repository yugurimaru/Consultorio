/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.ErpDAOException;
import DAO.ConsultaDAO;
import Classes.Consulta;
import DAO.MedicoDAO;
import Classes.Medico;
import DAO.PacienteDAO;
import Classes.Paciente;
import java.awt.event.MouseAdapter;
import java.lang.System.Logger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;

/**
 *
 * @author yugurimaru
 */
public class Consultas extends javax.swing.JFrame {

    ArrayList<Consulta> Consulta = new ArrayList();

    /**
     * Creates new form Pessoas
     */
    public Consultas() {
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

        BT_adicionar = new javax.swing.JButton();
        BT_Excluir = new javax.swing.JButton();
        BT_editar = new javax.swing.JButton();
        BT_procurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        BT_atualizar_tabela = new javax.swing.JButton();
        BT_consultas_data = new javax.swing.JButton();
        BT_consultas_paciente = new javax.swing.JButton();
        BT_consultas_medico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BT_adicionar.setText("Adiconar");
        BT_adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_adicionarMousePressed(evt);
            }
        });
        BT_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_adicionarActionPerformed(evt);
            }
        });

        BT_Excluir.setText("Excluir");
        BT_Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_ExcluirMousePressed(evt);
            }
        });
        BT_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ExcluirActionPerformed(evt);
            }
        });

        BT_editar.setText("Editar");
        BT_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_editarMousePressed(evt);
            }
        });

        BT_procurar.setText("Procurar");
        BT_procurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_procurarMousePressed(evt);
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
                "ID Consulta", "Médico", "Paciente", "Data", "Horário", "Compareceu"
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
        Tabela.setShowGrid(false);
        Tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabela);
        if (Tabela.getColumnModel().getColumnCount() > 0) {
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(10);
            Tabela.getColumnModel().getColumn(5).setResizable(false);
            Tabela.getColumnModel().getColumn(5).setPreferredWidth(1);
        }

        BT_atualizar_tabela.setText("Atualizar");
        BT_atualizar_tabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_atualizar_tabelaActionPerformed(evt);
            }
        });

        BT_consultas_data.setText("Consultas por Data");
        BT_consultas_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_consultas_dataMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_consultas_dataMousePressed(evt);
            }
        });

        BT_consultas_paciente.setText("Consultas por Paciente");
        BT_consultas_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_consultas_pacienteMousePressed(evt);
            }
        });

        BT_consultas_medico.setText("Consultas por Médico");
        BT_consultas_medico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_consultas_medicoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BT_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_procurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_atualizar_tabela)
                    .addComponent(BT_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BT_consultas_data)
                        .addGap(18, 18, 18)
                        .addComponent(BT_consultas_paciente)
                        .addGap(18, 18, 18)
                        .addComponent(BT_consultas_medico)
                        .addGap(150, 150, 150)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_adicionar)
                        .addGap(18, 18, 18)
                        .addComponent(BT_editar)
                        .addGap(18, 18, 18)
                        .addComponent(BT_procurar)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Excluir)
                        .addGap(253, 253, 253)
                        .addComponent(BT_atualizar_tabela)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_consultas_data)
                    .addComponent(BT_consultas_paciente)
                    .addComponent(BT_consultas_medico))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_adicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_adicionarActionPerformed

    private void BT_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_ExcluirActionPerformed

    private void BT_atualizar_tabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_atualizar_tabelaActionPerformed
        Atualizar_tabela();
    }//GEN-LAST:event_BT_atualizar_tabelaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Atualizar_tabela();
    }//GEN-LAST:event_formWindowOpened

    private void BT_adicionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_adicionarMousePressed
        JFrame Janela_consultas = new Consultas_inserir();
        Janela_consultas.setLocationRelativeTo(null); //Centraliza a Janela
        Janela_consultas.setVisible(true);
    }//GEN-LAST:event_BT_adicionarMousePressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Atualizar_tabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void BT_ExcluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ExcluirMousePressed
        Excluir_linha_tabela();
    }//GEN-LAST:event_BT_ExcluirMousePressed

    private void BT_editarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_editarMousePressed
        if (Linha_selecionada()) {

            int index = Tabela.getSelectedRow();
            Consulta Consulta_selecionado = Consulta.get(index);

            JFrame janelaEditar = new Consultas_editar(Consulta_selecionado);
            janelaEditar.setLocationRelativeTo(null); // Centraliza a Janela
            janelaEditar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para editar.");
        }
    }//GEN-LAST:event_BT_editarMousePressed

    private void BT_procurarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_procurarMousePressed
        JFrame Janela_consultas = new Consultas_procurar();
        Janela_consultas.setLocationRelativeTo(null); //Centraliza a Janela
        Janela_consultas.setVisible(true);
    }//GEN-LAST:event_BT_procurarMousePressed

    private void BT_consultas_dataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_consultas_dataMouseExited
        
    }//GEN-LAST:event_BT_consultas_dataMouseExited

    private void BT_consultas_dataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_consultas_dataMousePressed
        JFrame Janela_consultas = new Consultas_procurar_data();
        Janela_consultas.setLocationRelativeTo(null); //Centraliza a Janela
        Janela_consultas.setVisible(true);
    }//GEN-LAST:event_BT_consultas_dataMousePressed

    private void BT_consultas_pacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_consultas_pacienteMousePressed
        JFrame Janela_consultas = new Consultas_procurar_paciente();
        Janela_consultas.setLocationRelativeTo(null); //Centraliza a Janela
        Janela_consultas.setVisible(true);
    }//GEN-LAST:event_BT_consultas_pacienteMousePressed

    private void BT_consultas_medicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_consultas_medicoMousePressed
        JFrame Janela_consultas = new Consultas_procurar_medico();
        Janela_consultas.setLocationRelativeTo(null); //Centraliza a Janela
        Janela_consultas.setVisible(true);
    }//GEN-LAST:event_BT_consultas_medicoMousePressed

    private boolean Linha_selecionada() {
        int index = Tabela.getSelectedRow();
        return index != -1;
    }

    private void Atualizar_tabela() {

        DefaultTableModel table = (DefaultTableModel) Tabela.getModel();
        Tabela.removeAll();
        String id_medico, id_paciente, id_consulta, datas, hora_string, compareceu;

        if (Tabela.getRowCount() > 0) {
            while (Tabela.getRowCount() > 0) {
                table.removeRow(0);
            }
        }

        ConsultaDAO CDAO;
        try {
            CDAO = new ConsultaDAO();
            Consulta = CDAO.Listar();
        } catch (Exception e) {
            System.out.println("Erro de conexao ao banco.");
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

            DateFormat dtOutput = new SimpleDateFormat("dd/MM/yyyy");
            datas = dtOutput.format(Consulta.get(i).getData());

            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Time hora;

            try {
                hora = Consulta.get(i).getHora();
                hora_string = format.format(hora);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro na conversao da hora");
                hora_string = null;
            }

            compareceu = Consulta.get(i).getCompareceu() + "";

            table.addRow(new String[]{id_consulta, id_medico, id_paciente, datas, hora_string, compareceu});
        }
    }

    //
    private void Excluir_linha_tabela() {
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        int id_consulta;
        int Linha_selecioanda = Tabela.getSelectedRow();

        if (Linha_selecioanda != -1) {

            Consulta Consulta_selecionado = Consulta.get(Linha_selecioanda);

            try {
                ConsultaDAO CDAO = new ConsultaDAO();
                id_consulta = Consulta_selecionado.getId_consulta();
                CDAO.Excluir(id_consulta);
                Atualizar_tabela();
            } catch (Exception e) {
                System.out.println("Erro ao Excluir Consulta");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Excluir;
    private javax.swing.JButton BT_adicionar;
    private javax.swing.JButton BT_atualizar_tabela;
    private javax.swing.JButton BT_consultas_data;
    private javax.swing.JButton BT_consultas_medico;
    private javax.swing.JButton BT_consultas_paciente;
    private javax.swing.JButton BT_editar;
    private javax.swing.JButton BT_procurar;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}