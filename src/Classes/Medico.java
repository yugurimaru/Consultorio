
package Classes;

import java.util.Date;


public class Medico {
    
    private int ID_Medico;
    private String nome_med;
    private String especialidade;
    private Date data_nasc;
    private char sexo;
    private String fone;

    public Medico() {
    }

    public Medico(int ID_Medico, String nome_med, String especialidade, Date data_nasc, char sexo, String fone) {
        this.ID_Medico = ID_Medico;
        this.nome_med = nome_med;
        this.especialidade = especialidade;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.fone = fone;
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
    
}
