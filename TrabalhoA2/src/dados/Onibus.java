
package dados;

/**
 *
 * @author 20152104805
 */
public class Onibus extends Veiculo {
    private String motorista;
    
    public void setMotorista(String motorista){
        this.motorista = motorista;
    }
    public String getMotorista(){
        return this.motorista;
    }
    public Onibus(){
        
    }
    public Onibus(String proprietario,String marca,String placa ,int numeroPassageiros ,double preco ,Motor motor,String motorista){
        super(proprietario, marca, placa, numeroPassageiros, preco, motor);
        this.setMotorista(motorista);
    }
    public Onibus(String proprietario , String marca, String placa ,String motorista){
        super(proprietario, marca, placa);
        this.setMotorista(motorista);  
    }
    public Onibus(int numeroPassageiros , Motor motor ,String motorista){
        super(numeroPassageiros, motor );
        this.setMotorista(motorista);
    }
    public Onibus(int numeroPassageiros , double preco , String motorista){
        super(numeroPassageiros, preco);
        this.setMotorista(motorista);
    }
    public Onibus(String marca, int numeroPassageiros, double preco, String motorista){
        super(marca, numeroPassageiros, preco);
        this.setMotorista(motorista);
    }
    public Onibus(double preco, String proprietario ,int numeroPassageiros, String motorista){
        super(preco, proprietario ,numeroPassageiros);
        this.setMotorista(motorista);
    }
    public Onibus(int numeroPassageiros, String marca ,Motor motor ,String placa, double preco ,String proprietario , String Motorista){
        super(numeroPassageiros, marca, motor , placa, preco, proprietario);
        this.setMotorista(motorista);
    }
    public Onibus(String motorista){
        this.setMotorista(motorista);
    }
    public Onibus(String proprietario ,String marca, String placa){
        super(proprietario ,marca ,placa);
    }
}
