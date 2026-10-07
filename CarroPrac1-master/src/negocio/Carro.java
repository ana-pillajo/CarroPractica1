package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    /*
    Métodos para ingresar información
    set()
    "Siempre" el tipo de retorno en void
    Siempre recibe un parámetro
    paràmetro generalmente es del mismo tipo del atributo
     */
    public void setPotencia(int potencia){
        //se actualiza solo si el dato es correcto
        if(potencia>0)
            this.potencia=potencia;
    }
    public void setVelocidad(double velocidad){
        //se actuliza si el dato es correcto sino se setea
        if(velocidad<0)
            velocidad=0;
        this.velocidad=velocidad;
    }
    /*
    Metodo para sacar informacion
    get()
    siempre retorna valor
    el tipo de retorno generalmente es del mismo tipo del atributo
     */
    public int getPotencia(){
        return potencia;
    }
    public double getVelocidad(){
        return velocidad;
    }
    public void acelerar(){
        velocidad+=potencia;

    }
    void frenar (){
        velocidad /=2;
    }
}
