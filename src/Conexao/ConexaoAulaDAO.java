
package Conexao;


import Classes.Configuracao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoAulaDAO {
 
    
    public static Connection getConnection() {
        
        Configuracao CF = new Configuracao();
        CF = acessoArquivo.ler();
        String server = CF.getServer();
        String porta = CF.getPorta();
        String banco = CF.getBanco();
        String user = CF.getUser();
        String password = CF.getPassword();

        //Opção 1
        //String strcon="jdbc:mysql://"+server+":"+porta+"/"+banco;
        
        //Opção 2
        String strcon = "jdbc:mysql://" + server + ":" + porta + "/" + banco + "?characterEncoding=UTF-8";
        
    	Connection conexao = null;
    	try
    	{
	    	Class.forName("com.mysql.jdbc.Driver"); 
	    	System.out.println("Driver carregado");
    	}
    	catch(ClassNotFoundException e)
    	{
    		System.out.println("Erro ao carregar o driver");
    	}

       try{
           conexao = DriverManager.getConnection(strcon, user , password );
           System.out.println("Conexao ok");
       }catch(Exception e){
          System.out.println(e.getMessage());
          conexao = null;
       }
       
       return conexao;
       
   }



   public static void close(Connection conn, Statement stmt, ResultSet rs) {
       try{
           if (rs != null) rs.close();
           if (stmt != null) stmt.close();
           if (conn != null) conn.close();
       }catch(Exception e){
    	   System.out.println(e.getMessage());
       }
   }
   
   
   public static void close(Connection conn, Statement stmt) {
       try{
           if (stmt != null) stmt.close();
           if (conn != null) conn.close();
       }catch(Exception e){
    	   System.out.println(e.getMessage());
       }
   }


}