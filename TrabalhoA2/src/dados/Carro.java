package dados;
import java.util.Scanner;
/**
 *
 * @author ewerton.lucena
 */
public class Carro extends Veiculo {
    private int volumeMala;

    public void setVolumeMala(int volumeMala){
        if(volumeMala <0){
            throw new IllegalArgumentException("Não são permitidos valores negativos");
        }
        this.volumeMala = volumeMala;
    }
    public int getVolumeMala(){
        return this.volumeMala;
    }

    public Carro() {
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    
    public Carro(String proprietario,String marca , String placa , int numeroPassageiros, double preco,
            Motor motor, int volumeMala){
        super(proprietario, marca, placa, numeroPassageiros, preco, motor);
        this.setVolumeMala(volumeMala);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public Carro(int volumeMala){
        this.setVolumeMala(volumeMala);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public Carro(String proprietario,String marca,String placa, int volumeMala){
        super(proprietario, marca, placa);
        this.setVolumeMala(volumeMala);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public Carro(int numeroPassageiros, double preco , int volumeMala){
        super(numeroPassageiros, preco);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public Carro(String proprietario , String marca, String placa){
        super(proprietario, marca , placa);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public Carro(int numeroPassageiros , double preco){
        super(numeroPassageiros, preco);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public Carro(int numeroPassageiros , Motor motor , int volumeMala){
        super(numeroPassageiros, motor);
        this.setVolumeMala(volumeMala);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    
    public Carro(int numeroPassageiros, String marca , Motor motor, String placa, double preco, String proprietario){
        super(numeroPassageiros , marca, motor , placa , preco, proprietario);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }

    public Carro(double preco ,String proprietario, int numeroPassageiros , int volumeMala) {
        super(preco,proprietario, numeroPassageiros);
        this.setVolumeMala(volumeMala);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public Carro(String marca ,int numeroPassageiros,double preco, int volumeMala){
        super(marca ,numeroPassageiros,preco);
        this.setVolumeMala(volumeMala);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public void cadastrar(String proprietario , String marca , String placa ,int numeroPassageiros , double preco ,Motor motor, int volumeMala){
        super.cadastrar(proprietario, marca, placa, numeroPassageiros, preco, motor);
        this.setVolumeMala(volumeMala);
        super.nomeVeiculo = CARRO;
        super.rpmVeiculo = CARRORPM;
    }
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        boolean entradaValida = true ;
        do{
            try{
                System.out.print("Insira o Volume da Mala :");
                setVolumeMala(Integer.parseInt(sc.nextLine()));
                entradaValida = false;
            }catch(NumberFormatException e){
                System.out.println("Erro :"+e.getMessage());
                System.out.println("Digite apenas números inteiros");
            }
            catch(IllegalArgumentException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println("Digite apenas volume de mala válido!");
            }
        } while(entradaValida);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Volume da Mala: "+getVolumeMala());
    }
}