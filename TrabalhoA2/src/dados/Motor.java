package dados;

import java.util.Scanner;

/**
 *
 * @author 20152104805
 */
public class Motor {
    private String marca;
    private String tipoCombustivel;
    private int rpm;
    private int rpmMaximo;
    
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
    public void setTipoCombustivel(String tipoCombustivel){        
        if ("".equals(tipoCombustivel)){
            throw new IllegalArgumentException("Não insira campos vazios.");
        }
        if(" ".equals(tipoCombustivel)){
            throw new IllegalArgumentException("Não insira espaços");
        }
        if(tipoCombustivel == null){
           throw new IllegalArgumentException("Não são permitidos valores nulos");
        }
        this.tipoCombustivel = tipoCombustivel;
    }
    public void setRpm(int rpm){
        if (rpm < 0){
            throw new IllegalArgumentException("Não são permitidos números negativos.");
        }
        this.rpm = rpm;
    }
    public void setRpmMaximo(int rpmMaximo){
        if (rpm <= 0){
            throw new IllegalArgumentException("Não são permitidos zero e números negativos.");
        }
        this.rpmMaximo = rpmMaximo;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getTipoCombustivel(){
        return this.tipoCombustivel;
    }
    public int getRpm(){
        return this.rpm;
    }
    public int getRpmMaximo(){
        return this.rpmMaximo;
    }
    public Motor(){}
    
    public Motor(String marca, String tipoCombustivel, int rpm, int rpmMaximo){
        this.setMarca(marca);
        this.setTipoCombustivel(tipoCombustivel);
        this.setRpm(rpm);
        this.setRpmMaximo(rpmMaximo);
    }
    
    public void imprimir(){
        System.out.println("Dados do Motor");
        System.out.println("Marca: "+getMarca());
        System.out.println("Rpm: "+getRpm());
        System.out.println("Rpm Máximo: "+getRpmMaximo());
        System.out.println("Tipo de Combustível: "+getTipoCombustivel());
    }
    
    public void cadastrar(String marca, String tipoCombustivel, int rpm, int rpmMaximo){
        setMarca(marca);
        setTipoCombustivel(tipoCombustivel);
        setRpm(rpm);
        setRpmMaximo(rpmMaximo);
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = true;
        System.out.println("\nInsira os dados do Motor");
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
                System.out.print("Insira a Rpm: ");
                setRpm(Integer.parseInt(sc.nextLine()));
                entradaValida = false;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Apenas são permitidos valores inteiros!");
                System.out.println("Digite uma Rpm válida.");
            }
            catch(IllegalArgumentException e){
                System.out.println("Zero ou números negativos não são permitidos!");
                System.out.println("Digite uma Rpm válida.");
            }
        }while(entradaValida);
        entradaValida = true;
        do{
            try{
                System.out.print("Insira a Rpm Máxima: ");
                setRpmMaximo(Integer.parseInt(sc.nextLine()));
                entradaValida = false;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Apenas são permitidos valores inteiros!");
                System.out.println("Digite uma Rpm Máxima válida.");
            }
            catch(IllegalArgumentException e){
                System.out.println("Zero ou números negativos não são permitidos!");
                System.out.println("Digite uma Rpm Máxima válida.");
            }
        }while(entradaValida);
        entradaValida = true;
        do{
            try{
                System.out.print("Insira o Tipo de Combustível: ");
                setTipoCombustivel(sc.nextLine());
                entradaValida = false;
            }
            catch(IllegalArgumentException e){
                System.out.println("Campos vazios não são permitidos!");
                System.out.println("Digite um Tipo de Combustível válido.");
            }
        }while(entradaValida);
    }
} 
