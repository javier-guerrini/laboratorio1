/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 * @author Javier Guerrini
 */
public class MainClass {
    
    
    public static void main(String[] args) {
        Cuenta cliente1 = new Cuenta("Javier Guerrini", "6356363", 0.03, 10000);
        Cuenta cliente2 = new Cuenta("Salvador Taboada","3324625", 0.03, 10000);
        
        System.out.println(cliente1.getSaldo());
        System.out.println(cliente2.getSaldo());
        cliente1.transferencia(cliente2, 5000);
        cliente1.ingreso(200);
        cliente2.reintegro(200);
        System.out.println(cliente1.getNombre() + " saldo -> " + cliente1.getSaldo());
        System.out.println(cliente2.getNombre() + " saldo -> " + cliente2.getSaldo());
     }


    
}
