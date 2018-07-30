package calculadora;

public class Validaciones {
    
    public static boolean validarSuma(String operacion){
        return (!operacion.endsWith("+") && !operacion.contains("-") && !operacion.contains("*")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.isEmpty());
    }
    
    public static boolean validarMultiplicaion(String operacion){
        return (!operacion.endsWith("*") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.isEmpty());
    }
    
    public static boolean validarResiduo(String operacion){
        return (!operacion.contains("%") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("*") && !operacion.contains("/") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.contains(".") && !operacion.isEmpty());
    }
    
    public static boolean validarOperaciones(String operacion){
        return (!operacion.contains("+") && !operacion.contains("-") && !operacion.contains("*")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.isEmpty());
    }
    
    public static boolean validarCalcDiscretos(String operacion){
        return (!operacion.contains("!") && !operacion.contains("P") 
        && !operacion.contains("C") && !operacion.isEmpty());
    }
    
    public static boolean validarIgual(String operacion){
        return (!operacion.endsWith("+") && !operacion.endsWith("-") && !operacion.endsWith("*")
        && !operacion.endsWith("/")&& !operacion.endsWith("%") && !operacion.endsWith("^")
        && !operacion.endsWith("R") && !operacion.endsWith("P") && !operacion.endsWith("C")
        && !operacion.isEmpty());
    }
}
