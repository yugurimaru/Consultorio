
package DAO;

import Classes.Consulta;
import Conexao.ConexaoAulaDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultaDAO {

    private Connection conn;

    public ConsultaDAO() {
        try {
            this.conn = ConexaoAulaDAO.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    public ArrayList Listar() {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList lista = new ArrayList();

        try {
            String SQL = "SELECT ID_consulta, id_medico, id_paciente, data, hora, compareceu FROM consultas";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int ID_consulta = rs.getInt("ID_consulta");
                int id_medico = rs.getInt("id_medico");
                int id_paciente = rs.getInt("id_paciente");
                Date data = rs.getDate("data");
                Time hora = rs.getTime("hora");
                char compareceu;

                if (rs.getString("compareceu") == null) {
                    compareceu = ' ';
                } else {
                    compareceu = (rs.getString("compareceu")).charAt(0);
                }

                lista.add(new Consulta(ID_consulta, id_medico, id_paciente, data, hora, compareceu));

            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }

        return lista;
    }

    public void Inserir(Consulta consulta) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (consulta == null) {
            throw new ErpDAOException("O objeto pessoa não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO consultas(id_medico, id_paciente, data, hora, compareceu) "
                    + "values (?,?,?,?,?)";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);

            ps.setInt(1, consulta.getId_medico());

            ps.setInt(2, consulta.getId_paciente());

            java.util.Date dataJAVA = consulta.getData();  // Data da classe Java Util
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
            ps.setDate(3, dataSQL);
       
            ps.setTime(4, consulta.getHora());

            ps.setString(5, Character.toString(consulta.getCompareceu()));

            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao inserir uma nova consulta " + sqle);
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }
    }

    public void Excluir(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;


        try {
            String SQL = "DELETE FROM consultas WHERE ID_consulta=?";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException sqle) {
            System.out.println("Erro ao excluir a consulta " + sqle);
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }
    }

    public Consulta Procurar(int codigo) throws ErpDAOException {

        Consulta consulta = new Consulta();
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;

        try {
            String SQL = "SELECT ID_consulta, id_medico, id_paciente, data, hora, compareceu FROM consultas WHERE ID_consulta = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            Consulta Consultas = new Consulta();
            Consultas = null;

            while (rs.next()) {
                int ID_Consulta = rs.getInt("ID_consulta");
                int id_medico = rs.getInt("id_medico");
                int id_paciente = rs.getInt("id_paciente");
                Date data = rs.getDate("data");
                Time hora = rs.getTime("hora");
                char compareceu;
                if (rs.getString("compareceu") == null) {
                    compareceu = ' ';
                } else {
                    compareceu = (rs.getString("compareceu")).charAt(0);
                }

                consulta = new Consulta(ID_Consulta, id_medico, id_paciente, data, hora, compareceu);

            }

            return consulta;

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao procurar a consulta " + sqle);
        } finally {
             ConexaoAulaDAO.close(connL,ps);
        }
    }

    public void Atualizar(Consulta Consultas) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;

        if (Consultas == null) {
            throw new ErpDAOException("O objeto Consultas não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE consultas SET id_medico=?, id_paciente=?, data=?, hora=?, compareceu=? WHERE ID_consulta=?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, Consultas.getId_medico());
            ps.setInt(2, Consultas.getId_paciente());
            java.util.Date dataJAVA = Consultas.getData();  // Data da classe Java Util
            java.sql.Time timeSQL = Consultas.getHora();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
            ps.setDate(3, dataSQL);

            //hora
            ps.setTime(4, timeSQL);

            ps.setString(5, Character.toString(Consultas.getCompareceu()));

            ps.setInt(6, Consultas.getId_consulta());

            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao editar Consultas " + sqle);
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }
    }
    
    public ArrayList Listar_por_data(java.util.Date data) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList lista = new ArrayList();

        try {
            String SQL = "SELECT ID_consulta, id_medico, id_paciente, data, hora, compareceu FROM consultas WHERE data=?";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            java.util.Date dataJAVA = data;  // Data da classe Java Util
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime()); // Data da classe SQL
            ps.setDate(1, dataSQL);           
            rs = ps.executeQuery();

            while (rs.next()) {
                int ID_consulta = rs.getInt("ID_consulta");
                int id_medico = rs.getInt("id_medico");
                int id_paciente = rs.getInt("id_paciente");
                Date dat = rs.getDate("data");
                Time hora = rs.getTime("hora");
                char compareceu;

                if (rs.getString("compareceu") == null) {
                    compareceu = ' ';
                } else {
                    compareceu = (rs.getString("compareceu")).charAt(0);
                }

                lista.add(new Consulta(ID_consulta, id_medico, id_paciente, dat, hora, compareceu));

            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }

        return lista;
    }
    
    

}
