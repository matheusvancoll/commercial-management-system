package Model;
public class ModelVendas {
    int idVenda;
    
    String clienteVenda, cpfClienteVenda;
    double valorTotalVenda;
    int quantidadeItem;

    public int getIdVenda() {
        return idVenda;
    }
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getCpfClienteVenda() {
        return cpfClienteVenda;
    }
    public void setCpfClienteVenda(String cpfClienteVenda) {
        this.cpfClienteVenda = cpfClienteVenda;
    }
    
    public double getValorTotalVenda() {
        return valorTotalVenda;
    }
    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public String getClienteVenda() {
        return clienteVenda;
    }
    public void setClienteVenda(String clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }
    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }
    
    
    

    
    
    
    
    
}
