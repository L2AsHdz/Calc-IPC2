package calculadora;

import java.math.BigInteger;

public class Funciones {
    
    public static double suma(double[] sumandos){
    double resultado = 0;
    for (int i = 0; i < sumandos.length; i++){
      resultado = resultado + sumandos[i];
      }
    return resultado;
    }
    
    public static double resta(double minuendo, double sustraendo){
        double diferencia = minuendo-sustraendo;
        return diferencia;
    }
    
    public static double multiplicacion(double[] factores){
    double resultado = 1;
    for (int i = 0; i < factores.length; i++){
      resultado = resultado * factores[i];
      }
    return resultado;
    }
    
    public static double division(double divisor, double dividendo){
        double cociente = dividendo/divisor;
        return cociente;
    }
    
    public static double residuo(double divisor, double dividendo){
        double residuo = dividendo%divisor;
        return residuo;
    }
    
    public static double raiz(double indice, double radicando){
        double resultado = (double)Math.pow(radicando, (1/indice));
        return resultado;
    }
    
    public static double potencia(double exponente, double base){
        double resultado = (double)Math.pow(base, exponente);
        return resultado;
    }
    
    public static String factorial(int numero){
        BigInteger resultado = new BigInteger("1");
        for (int i = 1; i <= numero; i++) {
            resultado = resultado.multiply(new BigInteger(Integer.toString(i)));
        }
        return resultado.toString();
    }
    
    public static String permutacion(int n, int r){
        BigInteger resultado = new BigInteger("1");
        BigInteger N = new BigInteger(factorial(n));
        BigInteger R = new BigInteger(factorial(n-r));
        resultado = N.divide(R);
        
        return resultado.toString();
    }
    
    public static String combinacion(int n, int r){
        BigInteger resultado = new BigInteger("1");
        BigInteger N = new BigInteger(factorial(n));
        BigInteger R = new BigInteger(factorial(n-r));
        BigInteger R2 = new BigInteger(factorial(r));
        resultado = N.divide(R.multiply(R2));
        return resultado.toString();
    }
    
    public static String decToBin(int numero){
        return Integer.toBinaryString(numero);
    }
    
    public static String decToOct(int numero){
        return Integer.toOctalString(numero);
    }
    
    public static String decToHex(int numero){
        return Integer.toHexString(numero);
    }
}
