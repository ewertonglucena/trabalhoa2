package trabalhoa2;
import dados.*;
/**
 *
 * @author ewerton.lucena
 */
public class TrabalhoA2 {
    public static void main(String[] args) {
        
        Carro car[] = new Carro[10];
        Moto m1[] = new Moto[10];
        Onibus o1[] = new Onibus[10];
        
    for(int i = 0; i<car.length; i++){
        Carro car[i] = new Carro();
        car[i].entradaDados();
        car[i].imprimir();
        car[i].acelerar();
        car[i].rpmAtual();
        car[i].desacelerar();
        car[i].rpmAtual();
        car[i].frear();
        car[i].virarDireita();
        car[i].virarEsquerda();
        
        m1[i].entradaDados();
        o1[i].entradaDados();
    }
    }    
}
