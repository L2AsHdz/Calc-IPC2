package calculadora;

public class Validaciones {
    
    public static boolean validarSuma(String operacion){
        return (!operacion.endsWith("+") && !operacion.contains("-") && !operacion.contains("*")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R"));
    }
    
    public static boolean validarResta(String operacion){
        return (!operacion.contains("-") && !operacion.contains("+") && !operacion.contains("*")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R"));
    }
    
    public static boolean validarMultiplicaion(String operacion){
        return (!operacion.endsWith("*") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R"));
    }
    
    public static boolean validarDivision(String operacion){
        return (!operacion.contains("/") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("*")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R"));
    }
    
    public static boolean validarResiduo(String operacion){
        return (!operacion.contains("%") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("*") && !operacion.contains("/") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.contains("."));
    }
    
    public static boolean validarPotencia(String operacion){
        return (!operacion.contains("+") && !operacion.contains("-") && !operacion.contains("*")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R"));
    }
    
    public static boolean validarRaiz(String operacion){
        return (!operacion.contains("+") && !operacion.contains("-") && !operacion.contains("*")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R"));
    }
}
