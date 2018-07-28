package calculadora;

import java.math.BigInteger;

public class Funciones {
    
    public static float multiplicacion(float[] factores){
    float resultado = 1;
    for (int i = 0; i <= factores.length; i++){
      resultado = resultado * factores[i];
      }
    return resultado;
    }
    
    public static float division(float divisor, float dividendo){
        float cociente = dividendo/divisor;
        return cociente;
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
    
    public static String decToHex(float numero){
        return Float.toHexString(numero);
    }
}
