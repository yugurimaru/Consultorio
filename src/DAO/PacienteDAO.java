
package DAO;

import DAO.ErpDAOException;
import Classes.Paciente;
import Conexao.ConexaoAulaDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDAO {

    private Connection conn;

    public PacienteDAO() {
        try {
            this.conn = ConexaoAulaDAO.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void inserir(Paciente paciente) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (paciente == null) {
            throw new ErpDAOException("O objeto paciente não pode ser nulo.");
        }
        try {
            String SQL = "INSERT INTO pacientes (nome_pac, fone, data_nasc, sexo) "
                    + "values (?,?,?,?)";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, paciente.getNome_pac());
            ps.setString(2, paciente.getFone());
            java.util.Date dataJAVA = paciente.getData_pac();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime());
            ps.setDate(3, dataSQL);
            ps.setString(4, Character.toString(paciente.getSexo()));
            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao inserir um novo paciente" + sqle);
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }
    }

    public void atualizar(Paciente paciente) throws ErpDAOException {
        PreparedStatement ps = null;
        Connection connL = null;
        if (paciente == null) {
            throw new ErpDAOException("O objeto paciente não pode ser nulo.");
        }

        try {
            String SQL = "UPDATE pacientes set nome_pac=?, fone=?, data_nasc=?, sexo=? where codigo = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setString(1, paciente.getNome_pac());
            ps.setString(2, paciente.getFone());
            java.util.Date dataJAVA = paciente.getData_pac();
            java.sql.Date dataSQL = new java.sql.Date(dataJAVA.getTime());
            ps.setDate(3, dataSQL);
            ps.setString(4, Character.toString(paciente.getSexo()));
            ps.setInt(5, paciente.getCodigo());
            ps.executeUpdate();

        } catch (SQLException sqle) {
            throw new ErpDAOException("Erro ao editar o paciente " + sqle);
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }
    }

    public Paciente procurar(int codigo) {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        Paciente paciente = new Paciente();

        try {
            String SQL = "SELECT codigo, nome_pac, fone, data_nasc, sexo FROM pacientes WHERE codigo = ?";
            connL = this.conn;
            ps = connL.prepareStatement(SQL);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int codigo2 = rs.getInt("codigo");
                String nome = rs.getString("nome_pac");
                String fone = rs.getString("fone");
                Date dataNasc = rs.getDate("data_nasc");
                char sexo;
                if (rs.getString("sexo") == null) {
                    sexo = ' ';
                } else {
                    sexo = (rs.getString("sexo")).charAt(0);
                }

                paciente = new Paciente(codigo2, nome, fone, dataNasc, sexo);

            }

            

        } catch (SQLException sqle) {
            System.out.println("Erro ao procurar paciente " + sqle);
        } finally {
            ConexaoAulaDAO.close(connL,ps);
        }
        return paciente;
    }

    public ArrayList Listar() {
        PreparedStatement ps = null;
        Connection connL = null;
        ResultSet rs = null;
        ArrayList pacientes = new ArrayList();
        try {
            String SQL = "SELECT * FROM pacientes ORDER BY nome_pac";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
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

                pacientes.add(new Paciente(Id_paciente, nome, telefone, dataNasc, sexo));

            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }

        return pacientes;
    }

    public void excluir(Paciente paciente) {
        PreparedStatement ps = null;
        Connection connL = null;
        if (paciente == null) {
            System.out.println("O objeto paciente não pode ser nulo.");
        }

        try {
            String SQL = "DELETE FROM pacientes WHERE codigo=?";
            connL = this.conn;

            ps = connL.prepareStatement(SQL);
            ps.setInt(1, paciente.getCodigo());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            System.out.println("Erro ao excluir pessoa " + sqle);
        } finally {
            ConexaoAulaDAO.close(connL, ps);
        }
    }
}
