package scr.Programa;

import Classes.Avião;
import Classes.Piloto;

public class Programa{
    
    public static void main(String[] args) {
        Piloto pilot= new Piloto("Lucas Afonso", 12345);
        Avião Avi = new Avião("ATR600", 10001, pilot);
     

        System.out.println("Aeronave: Aulrura de Cruzeiro 2000k/h!!");
        System.out.println("Piloto: Ok! Subindo");
        pilot.Altura(2000);

        System.out.printf("Altura do avião : %s km/h", Avi.getAlturadeCruzeiro());
    }
}