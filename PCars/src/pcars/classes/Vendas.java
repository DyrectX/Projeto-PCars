package pcars.classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego Luz
 */
public class Vendas {

    private int id;
    private String cliente;
    private String veiculo;
    private String valor;
    private String parcelas;

    public Vendas(int id, String cliente, String veiculo, String valor, String parcelas) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public Vendas() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }

}
