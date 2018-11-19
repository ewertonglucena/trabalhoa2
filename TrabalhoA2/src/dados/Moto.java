
package dados;

public class Moto extends Veiculo {
    private int volumeBagageiro;
    
    public void setVolumeBagageiro(int volumeBagageiro){
        if(volumeBagageiro < 0){
            throw new IllegalArgumentException ("Não são permitidos valores negativos");
        }
        this.volumeBagageiro = volumeBagageiro;
    }
        public int getVolumeBagageiro(){
            return this.volumeBagageiro;
    }
        public Moto(){
            super.nomeVeiculo = MOTO;
            super.rpmVeiculo = MOTORPM;
        }
}
