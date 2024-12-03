
package DAO;

import Classes.PacienteConsulta;
import Conexao.ConexaoAulaDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;


public class PacienteConsultaDAO {

    private Connection conn;
    
    public PacienteConsultaDAO() {
        try {
            this.conn = ConexaoAulaDAO.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList ListarConsulta(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList pacientesconsulta = new ArrayList();
        
        try {
            String SQL = "select codigo, nome_pac, fone, data_nasc, sexo, ID_consulta, "
                    + "id_medico, id_paciente, data, hora, compareceu from pacientes, "
                    + "consultas where codigo = ? and codigo = id_paciente";
            connL = this.conn;
            
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
    
            rs = ps.executeQuery();

            while (rs.next()) {
                int Id_paciente = rs.getInt("codigo");
                String nome = rs.getString("nome_pac");
                String telefone = rs.getString("fone");
                
                Date dataNasc = rs.getDate("data_nasc");
                char sexo;
                if (rs.getString("sexo") == null) {
                    sexo = ' ';
                } else {
                    sexo = (rs.getString("sexo")).charAt(0);
                }
                int id_consulta = rs.getInt("ID_consulta");
                int id_medico = rs.getInt("ID_medico");
                int id_paciente = rs.getInt("ID_paciente");
                Date data = rs.getDate("data");
                Time hora = rs.getTime("hora");
                char compareceu = rs.getString("compareceu").charAt(0);

                pacientesconsulta.add(new PacienteConsulta(Id_paciente, nome, telefone, dataNasc, sexo, id_consulta, id_medico, id_paciente, data, hora, compareceu));

            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }

        return pacientesconsulta;
    }

}
