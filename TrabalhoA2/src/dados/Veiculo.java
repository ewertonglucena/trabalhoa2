package dados;

import java.util.Scanner;

/**
 *
 * @author 20152104805
 */
public abstract class Veiculo implements preRequisitos {
   protected String proprietario;
   protected String marca;
   protected String placa;
   protected int numeroPassageiros;
   protected double preco;
   protected String nomeVeiculo;
   protected int rpmVeiculo;
   
   Motor motor1 = new Motor();
   
   public void setProprietario(String proprietario){
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
    
   public void setNomeVeiculo(){
        this.nomeVeiculo = nomeVeiculo;
    }
    
   public String getNomeVeiculo(){
       return this.nomeVeiculo;
    }
    
   public void acelerar(){
       int novaRpm;
       novaRpm = motor1.getRpm()+rpmVeiculo;
       if(novaRpm > motor1.getRpmMaximo()){
           novaRpm = motor1.getRpmMaximo();
       }
       motor1.setRpm(novaRpm);
    }
    
   public void desacelerar(){
       int novaRpm;
       novaRpm = motor1.getRpm()-rpmVeiculo;
       if(novaRpm<0){
           novaRpm = 0;
       }
       motor1.setRpm(novaRpm);
    }
    
   public void frear(){
        System.out.println(getNomeVeiculo()+" freando");
    }
    
    public void virarDireita(){
        System.out.println(getNomeVeiculo()+" virando a direita");
    }
    
    public void virarEsquerda(){
        System.out.println(getNomeVeiculo()+" virando a esquerda");
    }
    
    public void imprimir(){
        System.out.println("\nDados do "+getNomeVeiculo());
        System.out.println("Proprietário: "+getProprietario());
        System.out.println("Marca: "+getMarca());
        System.out.println("Placa: "+getMarca());
        System.out.println("Número de Passageiros: "+getNumeroPassageiros());
        System.out.println("Preço: R$"+getPreco());
        System.out.println("Tempo Máximo de Uso: "+TEMPOMAXUSO);
        System.out.println("Idade Mínima do Motorista: "+IDADEMINIMAMOTORISTA);
        motor1.imprimir();
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = true;
        System.out.println("\nDados do "+getNomeVeiculo());
        do{
            try{
                System.out.print("Insira o nome do Proprietário: ");
                setProprietario(sc.nextLine());
                entradaValida = false;
            }
            catch(IllegalArgumentException e){
                System.out.println("Campos vazios não são permitidos!");
                System.out.println("Digite um nome de proprietário válido.");
            }
        }while(entradaValida);
        entradaValida = true;
        do{
            try{
                System.out.print("Insira a Marca");
                setMarca(sc.nextLine());
                entradaValida = false;
            }
            catch(IllegalArgumentException e){
                System.out.println("Campos vazios não são permitidos!");
                System.out.println("Digite uma marca válida.");
            }
        }while(entradaValida);
        entradaValida = true;
        do{
            try{
                System.out.print("Insira a Placa: ");
                setPlaca(sc.nextLine());
                entradaValida = false;
            }
            catch(IllegalArgumentException e){
                System.out.println("Campos vazios não são permitidos!");
                System.out.println("Digite uma placa válida.");
            }
        }while(entradaValida);
        entradaValida = true;
    }
    
    public void validarPlaca(){
        
    }
}