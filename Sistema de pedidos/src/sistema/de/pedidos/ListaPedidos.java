/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.pedidos;

/**
 *
 * @author elvis
 */
public class ListaPedidos {
    private Pedido[] pedidos;
    private int capacidade;
    private int quantidade;

    public ListaPedidos(Pedido[] pedidos, int capacidade, int quantidade) {
        this.pedidos = pedidos;
        this.capacidade = capacidade;
        this.quantidade = quantidade;
    }

    ListaPedidos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   // metodo para buscar pedido 
    public Pedido buscarPedido(int numPed){
        for (int i=0; i<quantidade; i++){
            if (pedidos[i].getNumeroPedido() == numPed){
                return pedidos[i];
            }
        }
        return null;
    }
    
    
    // metodo para cadastrar pedido
    public void cadastrarPedido(Pedido p) throws Exception{
        if (quantidade >= capacidade){
            throw new Exception("Lista de pedidos está cheia!");
        }
        for (int i = 0; i < quantidade; i++){
            if (pedidos[i].getNumeroPedido() == p.getNumeroPedido()){
                throw new Exception ("pedido não encontrado");
            }
        }
        pedidos[quantidade++] = p;
    }
    
    
    // metodo para atender pedido
    public void atenderPedido(int numPed) throws Exception{
        Pedido pedido = buscarPedido(numPed);
        if (pedido == null){
            throw new Exception("Pedido não encontrado");
        }
           pedido.setAtendido(true);
    }
    
   // metodo para gerar relatorio do cliente
    public void relatorioCliente( int codCli, boolean todos, boolean atendidos){
        double total = 0;
        for (int i =0; i<quantidade; i++){
            Pedido p = pedidos[i];
            if (p.getCodClient() == codCli){
              if (todos || (atendidos && p.isAtendido()) || (!atendidos && !p.isAtendido())){
                  System.out.println (p.getValor());
                  total += p.getValor();
              }  
            }
        }
    }
    
    // metodo para pagar vendedor
    public void pagarVendedor(int codVend, double porcentagem){
        double total = 0;
        for (int i = 0; i<quantidade; i++){
            Pedido p = pedidos[i];
            if (p.getCodVendedor() == codVend && p.isAtendido() && !p.isPago()){
                p.setPago(true);
                total += p.getValor();
            }
        }
        double comissao = total * porcentagem / 100;
        System.out.println("Valor" + total + "comissão"+ comissao);
    }
}
