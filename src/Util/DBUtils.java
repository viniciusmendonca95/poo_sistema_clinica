/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
  public Connection conectar() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ClinicaDB",
                "root", "unit2020");
        System.out.println("Conexão efetuada com sucesso");
        } catch (ClassNotFoundException ex) {
            System.out.println("Drive não encontrado");
        } catch (SQLException ex) {
            System.out.println("Não foi possível conectar");
        }
        
        return con;
    }
    public void fecharConexao(Connection con){
        try {
            con.close();
            System.out.println("Conexão fechada com sucesso");
        } catch (SQLException ex) {
            System.out.println("Não foi possível desconectar");
        }
        
    }

}