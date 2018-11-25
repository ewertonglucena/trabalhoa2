package trabalhoa2;
import java.util.Scanner;
import dados.*;
/**
 *
 * @author ewerton.lucena
 */
public class TrabalhoA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 10;
        Carro car[] = new Carro[op];
        Moto m1[] = new Moto[op];
        Onibus o1[] = new Onibus[op];
        
    for(int i = 0; i<op; i++){
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
        
        m1[i] = new Moto();
        m1[i].entradaDados();
        
        o1[i] = new Onibus();
        o1[i].entradaDados();
    }
    }    
}
