package calculadora;

public class Validaciones {
    
    public static boolean validarSuma(String operacion){
        return (!operacion.endsWith("+") && !operacion.contains("-") && !operacion.contains("*")
        && !operacion.contains("/"));
    }
    
    public static boolean validarResta(String operacion){
        return (!operacion.endsWith("-") && !operacion.contains("+") && !operacion.contains("*")
        && !operacion.contains("/"));
    }
    
    public static boolean validarMultiplicaion(String operacion){
        return (!operacion.endsWith("*") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("/"));
    }
    
    public static boolean validarDivision(String operacion){
        return (!operacion.endsWith("/") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("*"));
    }
}
