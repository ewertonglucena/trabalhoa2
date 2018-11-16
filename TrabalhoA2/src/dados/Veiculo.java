package dados;

/**
 *
 * @author 20152104805
 */
public abstract class Veiculo {
   protected  String proprietario;
   protected String marca;
   protected String placa;
   protected int numeroPassageiros;
   protected double preco;
   
   public void setProrietario(String proprietario){
       this.proprietario = proprietario;
   }
   public void setMarca(String marca){
       this.marca = marca;
   }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setNumeroPassageiros(int numeroPassageiros){
        this.numeroPassageiros = numeroPassageiros;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public String getProprietario(){
        return this.proprietario;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getPlaca(){
        return this.placa;
    }
    public int getNumeroPassageiros(){
        return this.numeroPassageiros;
    }
    public double getPreco(){
        return this.preco;
    }
}
