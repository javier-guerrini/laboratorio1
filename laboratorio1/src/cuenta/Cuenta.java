/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 * 
 * @author Javier Guerrini
 */
public class Cuenta {
    String nombre;
    String numeroCuenta;
    double interes;
    double saldo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getInteres() {
        return interes;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cuenta() {
    }
    public Cuenta(String nombre, String numeroCuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    public boolean ingreso(double ingreso){  
        if(ingreso > 0){
            saldo += ingreso;
            return true;
        }
        else return false;  
    }
    
    public boolean reintegro(double reintegro){  
        if(saldo >= reintegro && reintegro > 0){
            saldo -= reintegro;
            return true;
        }
        else return false;
    }
    public boolean transferencia(Cuenta cuentaDestino, double importe){              
        if(saldo >= importe) {
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + importe);
            saldo -= importe;
            return true;
        }
        else return false;
    }
}
