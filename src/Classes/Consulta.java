
package Classes;

import java.util.Date;
import java.sql.Time;

public class Consulta {

    private int ID_consulta;
    private int id_medico;
    private int id_paciente;
    private Date data;
    private Time hora;
    private char compareceu;

    public int getId_consulta() {
        return ID_consulta;
    }

    public void setId_consulta(int ID_consulta) {
        this.ID_consulta = ID_consulta;
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

    public Consulta() {
    }

    public Consulta(int ID_consulta, int id_medico, int id_paciente, Date data, Time hora, char compareceu) {
        this.ID_consulta = ID_consulta;
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
        this.data = data;
        this.hora = hora;
        this.compareceu = compareceu;

    }

}
