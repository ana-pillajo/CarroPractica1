package negocio;

public class MainCarro {
    static void main() {
        Carro c1= new Carro();
        Carro c2=new Carro();
        /*c1.potencia=2;
        c1.velocidad=60;
        c2.potencia=7;
        c2.velocidad=140;*/
        c1.setPotencia(2);
        c1.setVelocidad(60);
        c2.setVelocidad(100);
        c2.setPotencia(5);
        //System.out.println("La potencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);
        System.out.println("La potencia del carro 1 es "+c1.getPotencia()+" y la velocidad es "+c1.getVelocidad());
        System.out.println("La potencia del carro 2 es "+c2.getPotencia()+" y la velocidad es "+c2.getVelocidad());
        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        //System.out.println("La potencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        //System.out.println("La potencia del carro es "+c2.potencia+" y la velocidad es "+c2.velocidad);
    }
}
