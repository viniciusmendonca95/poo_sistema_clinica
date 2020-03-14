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

public class FolhaPagamentoDB {
    DBUtils db = null;
    Connection con = null;

    public FolhaPagamentoDB() {
        db = new DBUtils();
        con = db.conectar();
    }

    public ArrayList<FolhaPagamentoModel> listarFolhaPagamento() {
        ArrayList<FolhaPagamentoModel> fp = new ArrayList();
        FolhaPagamentoModel fpm;
        try {
            Statement stmt = con.createStatement();
            String sql = "select * from FOLHA";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) { 
                fpm = new FolhaPagamentoModel(rs.getDouble(1),rs.getDouble(2),
                        rs.getDouble(3), rs.getDouble(4), rs.getString(5));
                fp.add(fpm);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao enviar consulta");
        }
        return fp;

    }
    public void cadastrarFolha(FolhaPagamentoModel fpm){
        String sql = "insert into FOLHA(salario, inss, irrf, salarioliquido, nome)"
                    + "values(?, ?, ?, ?, ?)";
        
        try { 
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setDouble(1, fpm.getSalarioBruto());
            pstm.setDouble(2, fpm.getInss());
            pstm.setDouble(3, fpm.getIrrf());
            pstm.setDouble(4, fpm.getSalarioLiquido());
            pstm.setString(5, fpm.getNome());
            pstm.executeUpdate();    
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir dados no banco");
        }
        
    }

}
