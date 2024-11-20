/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.pedidos;

/**
 *
 * @author elvis miranda
 * RA 0040482311010
 */
public class Pedido {
    private int numeroPedido;
    private int codCliente;
    private int codVendedor;
    private double valor;
    private boolean atendido;
    private boolean pago;
    
    
    // construtores

    public Pedido(int numeroPedido, int codCliente, int codVendedor, double valor, boolean atendido, boolean pago) {
        this.numeroPedido = numeroPedido;
        this.codCliente = codCliente;
        this.codVendedor = codVendedor;
        this.valor = valor;
        this.atendido = atendido;
        this.pago = pago;
    }

    private Pedido(int i, int i0, int i1, double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // getter e setters

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public double getValor() {
        return valor;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public boolean isPago() {
        return pago;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    int getCodClient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    public class main{
    public static void main(String[] args){
        try {
            ListaPedidos lista = new ListaPedidos(5);
            
            lista.cadastrarPedido(new Pedido(1, 101, 201, 500.0));
            lista.cadastrarPedido(new Pedido(2, 102, 202, 300.0));
            
            lista.atenderPedido(1);
            
            lista.relatorioCliente(101, true, true);
            
            lista.pagarVendedor(201, 10.0);
        } catch (Exception e){
            System.out.println("Erro" + e.getMessage());
        }
    }
}
}
