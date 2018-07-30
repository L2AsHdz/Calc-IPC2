//Funciones aritmeticas (Suma, resta, residuo y potencia)

public class Aritmetica
{
	private static  Double resultado;
//Funcion suma de 'n' valores	
	public static Double suma(Double[] n)
	{
		resultado = 0.0;
		for (int i = 0; i<n.length; i++)
		{
			resultado += n[i];
		}
		return resultado;
	}
//Funcion resta, enviando como parametro un arreglo
	public static Double resta(Double[] n)
	{
		resultado = 0.0;
		resultado = n[0] - n[1];
		return resultado;
	}

//Funcion residuo, enviando como parametro un arreglo	
	public static Double residuo(Double[] n)
	{
		resultado = 0.0;
		if(n[1] != 0) resultado += n[0].intValue()%n[1].intValue();
		return resultado;
	}	
//Funcino potencia, enviando como parametro un arreglo	
	public static Double potencia(Double[] n)
	{
		resultado = 1.0;
		resultado = Math.pow(n[0], n[1]);
		return resultado;
	}	
}

//By Daniel