package calculadora;

public class Validaciones {
    
    //Valida la suma para evitar signos seguidos que provoquen un error
    public static boolean validarSuma(String operacion){
        return (!operacion.endsWith("+") && !operacion.contains("-") && !operacion.contains("*")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.isEmpty());
    }
    
    //Valida la multiplicacion para evitar signos seguidos que provoquen un error
    public static boolean validarMultiplicaion(String operacion){
        return (!operacion.endsWith("*") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.isEmpty());
    }
    
    //valida la operacion de residuo ya que solo trabaja con numeros enteros
    public static boolean validarResiduo(String operacion){
        return (!operacion.contains("%") && !operacion.contains("+") && !operacion.contains("-")
        && !operacion.contains("*") && !operacion.contains("/") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.contains(".") && !operacion.isEmpty());
    }
    
    //valida todas las demas operaciones para evitar errores con signos concatenados.
    public static boolean validarOperaciones(String operacion){
        return (!operacion.contains("+") && !operacion.contains("-") && !operacion.contains("*")
        && !operacion.contains("/")&& !operacion.contains("%") && !operacion.contains("^")
        && !operacion.contains("R") && !operacion.isEmpty());
    }
    
    //valida las operaciones de calculos discretos, para evitar signos concatenados.
    public static boolean validarCalcDiscretos(String operacion){
        return (!operacion.contains("!") && !operacion.contains("P") 
        && !operacion.contains("C") && !operacion.isEmpty());
    }
    
    //Validacion para el boton igual de la antalla estandar para evitar errores cuado
    //se ingresa un signo y no un operando despues.
    public static boolean validarIgual(String operacion){
        return (!operacion.endsWith("+") && !operacion.endsWith("-") && !operacion.endsWith("*")
        && !operacion.endsWith("/")&& !operacion.endsWith("%") && !operacion.endsWith("^")
        && !operacion.endsWith("R") && !operacion.endsWith("P") && !operacion.endsWith("C")
        && !operacion.isEmpty());
    }
}
