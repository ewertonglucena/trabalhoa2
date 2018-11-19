/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author 20141104662
 */
public interface preRequisitos {
   int TEMPOMAXUSO = 30;
   int IDADEMINIMAMOTORISTA = 18;
   int CARRORPM = 100;
   int MOTORPM = 200;
   int ONIBUSRPM = 50;
   String CARRO = "Carro";
   String MOTO = "Moto";
   String ONIBUS = "Ônibus";
   
   void acelerar();
   void desacelerar();
   void frear();
   void virarDireita();
   void virarEsquerda();
   
}