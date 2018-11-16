
package dados;

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
        this.marca = marca;
    }
    public void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    public void setRpm(int rpm){
        this.rpm = rpm;
    }
    public void setRpmMaximo(int rpmMaximo){
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
    public Motor(){
        
    }
    public Motor(String marca, String tipoCombustivel, int rpm, int rpmMaximo){
        this.setMarca(marca);
        this.setTipoCombustivel(tipoCombustivel);
        this.setRpm(rpm);
        this.setRpmMaximo(rpmMaximo);
    }
    
}