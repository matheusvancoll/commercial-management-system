package Model;
public class ModelProdutos {
    
    private int idProduto, estoqueProduto;
    private String nomeProduto, marcaProduto, detalhesProduto;
    private double valorProduto;

    //Getters e Setters
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }
    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getDetalhesProduto() {
        return detalhesProduto;
    }
    public void setDetalhesProduto(String detalhesProduto) {
        this.detalhesProduto = detalhesProduto;
    }
    
    
    
    
    
}
