
package Classes;

import java.sql.Time;
import java.util.Date;

public class PacienteConsulta {

    private int codigo;
    private String nome_pac;
    private String fone;
    private Date data_pac;
    private char sexo;
    private int Id_consulta;
    private int Id_medico;
    private int Id_paciente;
    private Date data;
    private Time hora;
    private char compareceu;

    public PacienteConsulta() {
    }

    public PacienteConsulta(int codigo, String nome_pac, String fone, Date data_pac, char sexo, int Id_consulta, int Id_medico, int Id_paciente, Date data, Time hora, char compareceu) {
        this.codigo = codigo;
        this.nome_pac = nome_pac;
        this.fone = fone;
        this.data_pac = data_pac;
        this.sexo = sexo;
        this.Id_consulta = Id_consulta;
        this.Id_medico = Id_medico;
        this.Id_paciente = Id_paciente;
        this.data = data;
        this.hora = hora;
        this.compareceu = compareceu;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_pac() {
        return nome_pac;
    }

    public void setNome_pac(String nome_pac) {
        this.nome_pac = nome_pac;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Date getData_pac() {
        return data_pac;
    }

    public void setData_pac(Date data_pac) {
        this.data_pac = data_pac;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getId_consulta() {
        return Id_consulta;
    }

    public void setId_consulta(int Id_consulta) {
        this.Id_consulta = Id_consulta;
    }

    public int getId_medico() {
        return Id_medico;
    }

    public void setId_medico(int Id_medico) {
        this.Id_medico = Id_medico;
    }

    public int getId_paciente() {
        return Id_paciente;
    }

    public void setId_paciente(int Id_paciente) {
        this.Id_paciente = Id_paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public char getCompareceu() {
        return compareceu;
    }

    public void setCompareceu(char compareceu) {
        this.compareceu = compareceu;
    }
    

    
}
