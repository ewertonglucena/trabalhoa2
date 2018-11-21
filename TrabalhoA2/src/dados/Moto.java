
package dados;

public class Moto extends Veiculo {
    private int volumeBagageiro;
    
    public void setVolumeBagageiro(int volumeBagageiro){
        if(volumeBagageiro < 0){
            throw new IllegalArgumentException ("Não são permitidos valores negativos");
        }
        this.volumeBagageiro = volumeBagageiro;
    }
    
    public int getVolumeBagageiro(){
        return this.volumeBagageiro;
    }
    
    public Moto(){
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(int volumeBagageiro){
        this.setVolumeBagageiro(volumeBagageiro);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(String proprietario, String marca, String placa,int numeroPassageiros, double preco, Motor motor, int volumeBagageiro){
        super(proprietario, marca, placa, numeroPassageiros, preco, motor);
        this.setVolumeBagageiro(volumeBagageiro);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(String proprietario, String marca, String placa,int numeroPassageiros, double preco, Motor motor){
        super(proprietario, marca, placa, numeroPassageiros, preco, motor);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(String proprietario, String marca, String placa, int volumeBagageiro){
        super(proprietario, marca, placa);
        this.setVolumeBagageiro(volumeBagageiro);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(int numeroPassageiros , Motor motor, int volumeBagageiro){
        super(numeroPassageiros, motor);
        this.setVolumeBagageiro(volumeBagageiro);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(int numeroPasageiros, double preco, int volumeBagageiro){
        super(numeroPasageiros, preco);
        this.setVolumeBagageiro(volumeBagageiro);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(String marca, int numeroPassageiros , double preco, int volumeBagageiro){
        super(marca, numeroPassageiros, preco);
        this.setVolumeBagageiro(volumeBagageiro);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(double preco, String proprietario, int numeroPassageiros, int volumeBagageiro){
        super(preco, proprietario, numeroPassageiros);
        this.setVolumeBagageiro(volumeBagageiro);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    public Moto(int numeroPassageiros, String marca ,Motor motor, String placa ,double preco, String proprietario, int volumeBagageiro){
        super(numeroPassageiros, marca , motor, placa , preco, proprietario);
        this.setVolumeBagageiro(volumeBagageiro);
        super.nomeVeiculo = MOTO;
        super.rpmVeiculo = MOTORPM;
    }
    
    
}
