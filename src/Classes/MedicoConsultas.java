
package Classes;

import java.sql.Time;
import java.util.Date;

public class MedicoConsultas {
     
    private int ID_Medico;
    private String nome_med;
    private String especialidade;
    private Date data_nasc;
    private char sexo;
    private String fone;
    private int ID_consultas;
    private int id_medico;
    private int id_paciente;
    private Date date;
    private Time hora;
    private char compareceu;

    public MedicoConsultas(int ID_Medico, String nome_med, String especialidade, Date data_nasc, char sexo, String fone, int ID_consultas, int id_medico, int id_paciente, Date date, Time hora, char compareceu) {
        this.ID_Medico = ID_Medico;
        this.nome_med = nome_med;
        this.especialidade = especialidade;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.fone = fone;
        this.ID_consultas = ID_consultas;
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
        this.date = date;
        this.hora = hora;
        this.compareceu = compareceu;
    }

    public MedicoConsultas(String nome_med, Date date, Time hora, char compareceu) {
        this.nome_med = nome_med;
        this.date = date;
        this.hora = hora;
        this.compareceu = compareceu;
    }

    
    
    public MedicoConsultas() {
    }

  

    
    public int getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(int ID_Medico) {
        this.ID_Medico = ID_Medico;
    }

    public String getNome_med() {
        return nome_med;
    }

    public void setNome_med(String nome_med) {
        this.nome_med = nome_med;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getID_consultas() {
        return ID_consultas;
    }

    public void setID_consultas(int ID_consultas) {
        this.ID_consultas = ID_consultas;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
