package trabalhoa2;
import dados.*;
/**
 *
 * @author ewerton.lucena
 */
public class TrabalhoA2 {
    public static void main(String[] args) {
    try{
        int j =10;
        Carro car[] = new Carro[j];
        Moto mot[] = new Moto[j];
        Onibus oni[] = new Onibus[j];
        for(int i = 0; i<j; i++){
            car[i] = new Carro();
            car[i].entradaDados();
            car[i].imprimir();
            car[i].acelerar();
            car[i].rpmAtual();
            car[i].desacelerar();
            car[i].rpmAtual();
            car[i].frear();
            car[i].virarDireita();
            car[i].virarEsquerda();
        
            mot[i] = new Moto();
            mot[i].entradaDados();
            mot[i].imprimir();
            mot[i].acelerar();
            mot[i].rpmAtual();
            mot[i].desacelerar();
            mot[i].rpmAtual();
            mot[i].frear();
            mot[i].virarDireita();
            mot[i].virarEsquerda();
        
            oni[i] = new Onibus();
            oni[i].entradaDados();
            oni[i].imprimir();
            oni[i].acelerar();
            oni[i].rpmAtual();
            oni[i].desacelerar();
            oni[i].rpmAtual();
            oni[i].frear();
            oni[i].virarDireita();
            oni[i].virarEsquerda();
            }
        }
        catch(NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
