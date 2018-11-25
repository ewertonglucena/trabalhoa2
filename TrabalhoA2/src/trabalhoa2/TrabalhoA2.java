package trabalhoa2;
import dados.*;
/**
 *
 * @author ewerton.lucena
 */
public class TrabalhoA2 {
    public static void main(String[] args) {
        int j =10;
        Carro car[] = new Carro[j];
        Moto m1[] = new Moto[j];
        Onibus o1[] = new Onibus[j];
        
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
        
        m1[i].entradaDados();
        o1[i].entradaDados();
    }
    }    
}
