
package dados;
import java.util.Scanner;
/**
 *
 * @author 20152104805
 */
public class Onibus extends Veiculo {
    private String motorista;
    
    public void setMotorista(String motorista){
        if(motorista == ""){
         throw new IllegalArgumentException("Não são permitidos espaços em brancos");   
        }
        if(motorista == " "){
         throw new IllegalArgumentException("Não são permitidos espaços vazios");
        }
        this.motorista = motorista;
    }
    public String getMotorista(){
        return this.motorista;
    }
    public Onibus(){
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
        
    }
    public Onibus(String proprietario,String marca,String placa ,int numeroPassageiros ,double preco ,Motor motor,String motorista){
        super(proprietario, marca, placa, numeroPassageiros, preco, motor);
        this.setMotorista(motorista);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public Onibus(String proprietario , String marca, String placa ,String motorista){
        super(proprietario, marca, placa);
        this.setMotorista(motorista);  
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public Onibus(int numeroPassageiros , Motor motor ,String motorista){
        super(numeroPassageiros, motor );
        this.setMotorista(motorista);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public Onibus(int numeroPassageiros , double preco , String motorista){
        super(numeroPassageiros, preco);
        this.setMotorista(motorista);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public Onibus(String marca, int numeroPassageiros, double preco, String motorista){
        super(marca, numeroPassageiros, preco);
        this.setMotorista(motorista);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public Onibus(double preco, String proprietario ,int numeroPassageiros, String motorista){
        super(preco, proprietario ,numeroPassageiros);
        this.setMotorista(motorista);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public Onibus(int numeroPassageiros, String marca ,Motor motor ,String placa, double preco ,String proprietario , String Motorista){
        super(numeroPassageiros, marca, motor , placa, preco, proprietario);
        this.setMotorista(motorista);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public Onibus(String motorista){
        this.setMotorista(motorista);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public Onibus(String proprietario ,String marca, String placa){
        super(proprietario ,marca ,placa);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    public void cadastrar(String proprietario, String marca, String placa , int numeroPassageiros , double preco ,Motor motor, String motorista){
        super.cadastrar(proprietario, marca, placa, numeroPassageiros, preco, motor);
        this.setMotorista(motorista);
        super.nomeVeiculo = ONIBUS;
        super.rpmVeiculo = ONIBUSRPM;
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        boolean entradaValida = true;
        do{
            try{
                System.out.print("Insira o nome do motorista: ");
                setMotorista(sc.nextLine());
                entradaValida = false;
            }
            catch(IllegalArgumentException e ){
                System.out.println("Erro: "+e.getMessage());
                System.out.println("Valor inválido!");
            }
        }while(entradaValida);
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Motorista: "+getMotorista());
    }
    
}
