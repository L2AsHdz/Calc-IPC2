package calculadora;

import java.math.BigInteger;

public class Funciones {
    
    //Recibe como parametro un array de tipo double para luego sumarlos
    //y devolver el resultado.
    public static double suma(double[] sumandos){
    double resultado = 0;
    for (int i = 0; i < sumandos.length; i++){
      resultado = resultado + sumandos[i];
      }
    return resultado;
    }
    
    //Recibe como parametro minuendo y sustraendo, los resta y devuelve ese valor.
    public static double resta(double minuendo, double sustraendo){
        double diferencia = minuendo-sustraendo;
        return diferencia;
    }
    
    //Recibe como parametro un array de tipo double para luego multiplicarlos
    //y devolver el resultado.
    public static double multiplicacion(double[] factores){
    double resultado = 1;
    for (int i = 0; i < factores.length; i++){
      resultado = resultado * factores[i];
      }
    return resultado;
    }
    
    //Recibe como parametro divisor y dividendo, realiza la division y devuelve el valor.
    public static double division(double divisor, double dividendo){
        double cociente = dividendo/divisor;
        return cociente;
    }
    
    //recibe como parametro dos numeros y encuentra el residuo entre ellos.
    public static double residuo(double divisor, double dividendo){
        double residuo = dividendo%divisor;
        return residuo;
    }
    
    //Recibe un indice y un radicando, opera la raiz y devuelve el valor.
    public static double raiz(double indice, double radicando){
        double resultado = (double)Math.pow(radicando, (1/indice));
        return resultado;
    }
    
    //Se le pasa como parametro la base y el exponente, opera la potencia y devuelve el valor.
    public static double potencia(double exponente, double base){
        double resultado = (double)Math.pow(base, exponente);
        return resultado;
    }
    
    //recibe como parametro un numero entero, calcula su factorial y lodevuelve.
    //Se usa la case BigInteger por que el resultado puede ser muy grande.
    public static String factorial(int numero){
        BigInteger resultado = new BigInteger("1");
        for (int i = 1; i <= numero; i++) {
            resultado = resultado.multiply(new BigInteger(Integer.toString(i)));
        }
        return resultado.toString();
    }
    
    //Recibe como parametro un numero n y un numero r, calcula la permutacion y 
    // devuelve e valor.
    public static String permutacion(int n, int r){
        BigInteger resultado = new BigInteger("1");
        BigInteger N = new BigInteger(factorial(n));
        BigInteger R = new BigInteger(factorial(n-r));
        resultado = N.divide(R);
        
        return resultado.toString();
    }
    
    //Recibe como parametro un numero n y un numero r, calcula la combinacion y 
    // devuelve e valor.
    public static String combinacion(int n, int r){
        BigInteger resultado = new BigInteger("1");
        BigInteger N = new BigInteger(factorial(n));
        BigInteger R = new BigInteger(factorial(n-r));
        BigInteger R2 = new BigInteger(factorial(r));
        resultado = N.divide(R.multiply(R2));
        return resultado.toString();
    }
    
    //Convierte el numero que recibe como parametro a binario
    public static String decToBin(int numero){
        return Integer.toBinaryString(numero);
    }
    
    //Convierte el numero que recibe como parametro a octal
    public static String decToOct(int numero){
        return Integer.toOctalString(numero);
    }
    
    //Convierte el numero que recibe como parametro a hexagesimal
    public static String decToHex(int numero){
        return Integer.toHexString(numero);
    }
}
