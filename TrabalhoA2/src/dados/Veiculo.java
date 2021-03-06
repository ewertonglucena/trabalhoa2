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
   
   Motor motor = new Motor();
   
   public Veiculo(){}
   
   public Veiculo(String proprietario, String marca, String placa,int numeroPassageiros, double preco, Motor motor){
        this.setProprietario(proprietario);
        this.setMarca(marca);
        this.setPlaca(placa);
        this.setNumeroPassageiros(numeroPassageiros);
        this.setPreco(preco);
        this.setMotor(motor);
    }
    public Veiculo(String proprietario, String marca, String placa){
        this.setProprietario(proprietario);
        this.setMarca(marca);
        this.setPlaca(placa);
    }
    public Veiculo(int numeroPassageiros , Motor motor){
        this.setNumeroPassageiros(numeroPassageiros);
        this.setMotor(motor);
    }
    public Veiculo(int numeroPasageiros, double preco){
        this.setNumeroPassageiros(numeroPassageiros);
        this.setPreco(preco);
    }
    public Veiculo(String marca, int numeroPassageiros , double preco){
        this.setMarca(marca);
        this.setNumeroPassageiros(numeroPassageiros);
        this.setPreco(preco);
    }
    public Veiculo(double preco, String proprietario, int numeroPassageiros){
        this.setPreco(preco);
        this.setProprietario(proprietario);
        this.setNumeroPassageiros(numeroPassageiros);
    }
    public Veiculo(int numeroPassageiros, String marca ,Motor motor, String placa ,double preco, String proprietario){
        this.setNumeroPassageiros(numeroPassageiros);
        this.setMarca(marca);
        this.setMotor(motor);
        this.setPlaca(placa);
        this.setPreco(preco);
        this.setProprietario(proprietario);  
    }
   
   public void setProprietario(String proprietario){
       if ("".equals(proprietario)){
            throw new IllegalArgumentException("Não insira campos vazios.");
        }
       if(" ".equals(proprietario)){
            throw new IllegalArgumentException("Não insira espaços");
       }
       if(proprietario == null){
           throw new IllegalArgumentException("Não são permitidos valores nulos");
       }
       this.proprietario = proprietario;
    }
   
   public void setMarca(String marca){
       if ("".equals(marca)){
            throw new IllegalArgumentException("Não insira campos vazios.");
        }
       if(" ".equals(marca)){
            throw new IllegalArgumentException("Não insira espaços");
       }
       if(marca == null){
           throw new IllegalArgumentException("Não são permitidos valores nulos");
       }
       this.marca = marca;
    }
      
   public void setPlaca(String placa){
       if ("".equals(placa)){
            throw new IllegalArgumentException("Não insira campos vazios.");
        }
       if(" ".equals(placa)){
            throw new IllegalArgumentException("Não insira espaços");
       }
       if(placa == null){
           throw new IllegalArgumentException("Não são permitidos valores nulos");
       }
        this.placa = placa;
    }
    
   public void setNumeroPassageiros(int numeroPassageiros){
       if(numeroPassageiros < 0){
           throw new IllegalArgumentException("Não insira números negativos");
       }
        this.numeroPassageiros = numeroPassageiros;
    }
    
   public void setPreco(double preco){       
       if(preco < 0){
           throw new IllegalArgumentException("Não insira números negativos");
       }
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
    
   public void setNomeVeiculo(String nomeVeiculo){
       if ("".equals(nomeVeiculo)){
            throw new IllegalArgumentException("Não insira campos vazios.");
        }
       if(" ".equals(nomeVeiculo)){
            throw new IllegalArgumentException("Não insira espaços");
       }
       if(nomeVeiculo == null){
           throw new IllegalArgumentException("Não são permitidos valores nulos");
       }
        this.nomeVeiculo = nomeVeiculo;
    }
    
   public String getNomeVeiculo(){
       return this.nomeVeiculo;
    }
   
   public void setMotor(Motor motor){
       this.motor = motor;
   }
   
   public Motor getMotor(){
       return this.motor;
   }
    
   public void acelerar(){
       int novaRpm;
       novaRpm = motor.getRpm()+rpmVeiculo;
       if(novaRpm > motor.getRpmMaximo()){
           novaRpm = motor.getRpmMaximo();
       }
       motor.setRpm(novaRpm);
       System.out.println("Acelerando...");
    }
    
   public void desacelerar(){
       int novaRpm;
       novaRpm = motor.getRpm()-rpmVeiculo;
       if(novaRpm<0){
           novaRpm = 0;
       }
       motor.setRpm(novaRpm);
       System.out.println("Desacelerando...");
    }
    public void rpmAtual(){
        System.out.println("RPM ATUAL : "+motor.getRpm());
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
        System.out.println("Placa: "+getPlaca());
        System.out.println("Número de Passageiros: "+getNumeroPassageiros());
        System.out.println("Preço: R$"+getPreco());
        System.out.println("Tempo Máximo de Uso: "+TEMPOMAXUSO);
        System.out.println("Idade Mínima do Motorista: "+IDADEMINIMAMOTORISTA+" anos.");
        motor.imprimir();
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = true;
        System.out.println("\nDados do(a) "+getNomeVeiculo());
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
                System.out.print("Insira a Marca: ");
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
        do{
            try{
                System.out.print("Insira o Número de Passageiros: ");
                setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
                entradaValida = false;
            }
            catch(NumberFormatException e ){
                System.out.println("Erro: "+e.getMessage());
                System.out.println("Digite somente números inteiros!");
            }
            catch(IllegalArgumentException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println("Digite uma quantidade de passageiros válida!");
            }
        }while(entradaValida);
        entradaValida = true;
        do{
            try{
                System.out.print("Insira o preço: R$");
                setPreco(Double.parseDouble(sc.nextLine()));
                entradaValida = false;
            }
            catch(NumberFormatException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println("Digite somente valores reais positivos!");
            }
            catch(IllegalArgumentException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println("Digite um preço válido!");
            }
        }while(entradaValida);
        motor.entradaDados();
    }
    
    public void cadastrar(String proprietario, String marca, String placa,int numeroPassageiros, double preco, Motor motor){
        this.setProprietario(proprietario);
        this.setMarca(marca);
        this.setPlaca(placa);
        this.setNumeroPassageiros(numeroPassageiros);
        this.setPreco(preco);
        this.setMotor(motor);
    }  
}
