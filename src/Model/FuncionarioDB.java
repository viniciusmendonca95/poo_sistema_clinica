package Model;

import Util.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDB {
    DBUtils db = null;
    Connection con = null;
    
    public FuncionarioDB() {
        db = new DBUtils();
        con = db.conectar();
    }

    public void cadastrarFuncionario(FuncionarioModel fm) {
        String sql = "insert into FUNCIONARIO(nome, endereco, numero, complemento, sexo, matricula, cep, rg, cpf) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, fm.getNome());
            pstm.setString(2, fm.getEndereco());
            pstm.setInt(3, fm.getNumero());
            pstm.setString(4, fm.getComplemento());
            pstm.setString(5, fm.getSexo());
            pstm.setString(6, fm.getMatricula());
            pstm.setString(7, fm.getCep());
            pstm.setString(8, fm.getRg());
            pstm.setString(9, fm.getCpf());
            
            pstm.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir dados no banco");
        }
    }

    public ArrayList<FuncionarioModel> listarTodosOsFuncionarios() {
        ArrayList<FuncionarioModel> lfm = new ArrayList();
        FuncionarioModel fm;
        try {
            Statement stmt = con.createStatement();
            String sql = "select * from FUNCIONARIO";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) { 
                fm = new FuncionarioModel(rs.getString(1),rs.getString(2),
                        rs.getInt(3), rs.getString(4), rs.getString(7), rs.getString(5), rs.getString(8), rs.getString(9), rs.getString(6));
                lfm.add(fm);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao enviar consulta");
        }
        return lfm;

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
                System.out.println(rs.getString("sexo"));
                System.out.println(rs.getString("matricula"));
                System.out.println(rs.getString("cep"));
                System.out.println(rs.getString("rg"));
                System.out.println(rs.getString("cpf"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}