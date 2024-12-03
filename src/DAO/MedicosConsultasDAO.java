package DAO;

import Classes.MedicoConsultas;
import Conexao.ConexaoAulaDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class MedicosConsultasDAO {

    private Connection conn;

    public MedicosConsultasDAO() {
        try {
            this.conn = ConexaoAulaDAO.getConnection();
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + ":\n" + e.getMessage());
        }
    }

    public ArrayList listar(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList MedicosCon = new ArrayList();
        //ChatGPT be like:
        try {
            String SQL = "SELECT medicos.id, medicos.nome_med, medicos.especialidade, medicos.data_nasc, medicos.sexo, medicos.fone, consultas.ID_consulta, consultas.id_medico, consultas.id_paciente, consultas.data, consultas.hora, consultas.compareceu FROM medicos JOIN consultas ON medicos.id = consultas.id_medico WHERE medicos.id = ?;";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idMedico = rs.getInt("id");
                String nomeMed = rs.getString("nome_med");
                String especialidade = rs.getString("especialidade");
                Date dataNasc = rs.getDate("data_nasc");
                char sexo = rs.getString("sexo").charAt(0);
                String fone = rs.getString("fone");

                int idConsulta = rs.getInt("ID_consulta");
                int idMedicoConsulta = rs.getInt("id_medico");
                int idPaciente = rs.getInt("id_paciente");
                Date dateConsulta = rs.getDate("data");
                Time horaConsulta = rs.getTime("hora");
                char compareceu = rs.getString("compareceu").charAt(0);

                MedicosCon.add(new MedicoConsultas(idMedico, nomeMed, especialidade, dataNasc, sexo, fone,
                        idConsulta, idMedicoConsulta, idPaciente, dateConsulta, horaConsulta, compareceu));
            }

        } catch (SQLException sqle) {
            System.out.println("Erro ao listar Consultas " + sqle);
        } finally {
            ConexaoAulaDAO.close(connL, ps, rs);
        }
        return MedicosCon;
    }
}
