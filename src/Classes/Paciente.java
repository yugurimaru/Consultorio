
package Classes;

import java.util.Date;

public class Paciente {
    
    private int codigo;
    private String nome_pac;
    private String fone;
    private Date data_pac;
    private char sexo;

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

    public Paciente() {
    }

    public Paciente(int codigo, String nome_pac, String fone, Date data_pac, char sexo) {
        this.codigo = codigo;
        this.nome_pac = nome_pac;
        this.fone = fone;
        this.data_pac = data_pac;
        this.sexo = sexo;
    }
    
    
}
