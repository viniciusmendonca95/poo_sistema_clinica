/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Util.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinicius
 */
public class FuncionarioDB {
    
    DBUtils dbu = new DBUtils();
    Connection con = dbu.conectar();

    public void cadastrarFuncionario(String nome, String endereco, String numero, String complemento, String cep, String sexo, String rg, String cpf, String matricula) {
        String sql = "Insert into funcionario(nome, endereco, numero, complemento, cep, sexo, rg, cpf, matricula) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm;
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, endereco);
            pstm.setString(3, numero);
            pstm.setString(4, complemento);
            pstm.setString(5, cep);
            pstm.setString(6, sexo);
            pstm.setString(7, rg);
            pstm.setString(8, cpf);
            pstm.setString(9, matricula);
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao executar o comando");
        }
    }

    public void listarTodosOsFuncionarios() {
        Statement stm;
        try {
            stm = con.createStatement();
            String sql = "select * from funcionario";
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void buscarFuncionarioPorNome(String nome){
        String sql = "select * from funcionario where NOME like ?";
        PreparedStatement psm;
        try {
            psm = con.prepareStatement(sql);
            psm.setString(1, nome);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("endereco"));
                System.out.println(rs.getString("numero"));
                System.out.println(rs.getString("complemento"));
                System.out.println(rs.getString("cep"));
                System.out.println(rs.getString("sexo"));
                System.out.println(rs.getString("rg"));
                System.out.println(rs.getString("cpf"));
                System.out.println(rs.getString("matricula"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}