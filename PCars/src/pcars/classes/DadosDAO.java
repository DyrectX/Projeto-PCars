/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcars.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Luz
 */
public class DadosDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pcars", "root", "di240304DI!");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }

    }

    public int salvarCliente(Clientes cliente) {
        int status;
        try {
            ps = conn.prepareStatement("INSERT INTO clientes VALUES(?,?,?,?,?)");
            ps.setInt(1, cliente.getId());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getCpf());
            ps.setString(4, cliente.getCnh());
            ps.setString(5, cliente.getTelefone());
            status = ps.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public int salvarVeiculos(Veiculos v) {
        int status;
        try {
            ps = conn.prepareStatement("INSERT INTO veiculos VALUES(?,?,?,?,?)");
            ps.setInt(1, v.getId());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getPlaca());
            ps.setString(4, v.getMarca());
            ps.setString(5, v.getAno());
            status = ps.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public int salvarVendas(Vendas vds) {
        int status;
        try {
            ps = conn.prepareStatement("INSERT INTO vendas VALUES(?,?,?,?,?)");
            ps.setInt(1, vds.getId());
            ps.setString(2, vds.getCliente());
            ps.setString(3, vds.getVeiculo());
            ps.setString(4, vds.getValor());
            ps.setString(5, vds.getParcelas());
            status = ps.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    public boolean excluirClientes(int id) {
        try {
            ps = conn.prepareStatement("DELETE FROM clientes WHERE id = ?");

            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean excluirVeiculos(int id) {
        try {
            ps = conn.prepareStatement("DELETE FROM veiculos WHERE id = ?");

            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean excluirVendas(int id) {
        try {
            ps = conn.prepareStatement("DELETE FROM vendas WHERE id = ?");

            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public List<Clientes> getClientes(String listaC) {
        String sql = "SELECT * FROM clientes";

        try {
            ps = this.conn.prepareStatement(sql);

            rs = ps.executeQuery();

            List<Clientes> listaClientes = new ArrayList<>();

            while (rs.next()) {
                Clientes c = new Clientes();

                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCnh(rs.getString("cnh"));
                c.setTelefone(rs.getString("telefone"));
                c.setCpf(rs.getString("cpf"));
                

                listaClientes.add(c);
            }
            return listaClientes;

        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Veiculos> getVeiculos(String listaVc) {
        String sql = "SELECT * FROM veiculos";

        try {
            ps = this.conn.prepareStatement(sql);

            rs = ps.executeQuery();

            List<Veiculos> listaVeiculos = new ArrayList<>();

            while (rs.next()) {
                Veiculos v = new Veiculos();

                v.setId(rs.getInt("id"));
                v.setPlaca(rs.getString("placa"));
                v.setModelo(rs.getString("modelo"));
                v.setMarca(rs.getString("marca"));
                v.setAno(rs.getString("ano"));
                

                listaVeiculos.add(v);
            }
            return listaVeiculos;

        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Vendas> getVendas(String listaVds) {
        String sql = "SELECT * FROM vendas";

        try {
            ps = this.conn.prepareStatement(sql);

            rs = ps.executeQuery();

            List<Vendas> listaVendas = new ArrayList<>();

            while (rs.next()) {
                Vendas vds = new Vendas();

                vds.setId(rs.getInt("id"));
                vds.setCliente(rs.getString("cliente"));
                vds.setVeiculo(rs.getString("veiculo"));
                vds.setValor(rs.getString("valor"));
                    vds.setParcelas(rs.getString("parcelas"));
                

                listaVendas.add(vds);
            }
            return listaVendas;

        } catch (Exception e) {
            return null;
        }
    }


    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            //pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }

}
