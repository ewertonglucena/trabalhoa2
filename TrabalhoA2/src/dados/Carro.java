package dados;

/**
 *
 * @author ewerton.lucena
 */
public class Carro extends Veiculo {
    private int volumeMala;

    public void setVolumeMala(int volumeMala){
        this.volumeMala = volumeMala;
    }
    public int getVolumeMala(){
        return this.volumeMala;
    }

    public Carro() {
        super();
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    
    public Carro(String proprietario,String marca , String placa , int numeroPassageiros, double preco,
            Motor motor, int volumeMala){
        super(proprietario, marca, placa, numeroPassageiros, preco, motor);
        this.setVolumeMala(volumeMala);
    }
    public Carro(int volumeMala){
        this.setVolumeMala(volumeMala);
    }
    public Carro(String proprietario,String marca,String placa, int volumeMala){
        super(proprietario, marca, placa);
        this.setVolumeMala(volumeMala);
    }
    public Carro(int numeroPassageiros, double preco , int volumeMala){
        super(numeroPassageiros, preco);
    }
    public Carro(String proprietario , String marca, String placa){
        super(proprietario, marca , placa); 
    }
}