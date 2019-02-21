
public class Main {

	public static void main(String[] args) {
		
		//calculamos el numero de vocales en una clase string
	
		String cadena = "Pedro esta picando en el ordenador";
		
		//System.out.println(cadena.length());
		
		int contador = 0;
		
		
		for(int i=0; i < cadena.length(); i++) {
			
			//charAt comprueba el valor de la vocal en el string ya que el estring es un array de caracteres
			
			if((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')) {
				
				
				contador++;
				
			}
		}
		
		System.out.println("La frase "+cadena+" contiene "+contador+" vocales");
		 
		//metodo para separar un array de palabras por cada palabra
		
		String[] palabras = cadena.split(" ");
		
		for(String palabra : palabras) {
			
			System.out.println(palabra);
		}
		
		
		String[] palabras1 = cadena.split(" ");
		
		for(String palabra : palabras1) {
			
			analizarVocales(palabra);
		}
		
		
		//--------------------------------------//
		
		String entrada = "     239048oifjdsfnsdt439523458wfjd43905782345wejfsjdfañklfjdarojwefjioetjmcoxj4i23,9058382c5948,c149523j4h23hjkwehdjsfdqwei";
		
		 //cuando llega algo de un usuario al recoger datos y quitar espacios
		
		entrada = entrada.trim();
		
		System.out.println(entrada);
		
		//aqui llamar al metodo 
		
		String[] respuesta = separar(entrada);
		
		System.out.println("Las letras son: "+respuesta[0]);
		 System.out.println("las letras son: "+respuesta[1]);
		
		
		
		
		
	}
	
	 // Crear Un metodo que te calcule el numero de vocales de cada palabra fuera del metodo main
	 
	 public static void analizarVocales(String palabra){	
	 int contador = 0;		
	 contador = 0;		
	 for (int i = 0; i < palabra.length(); i++) {
		 
	 char letra = palabra.charAt(i);			
	 
	 if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {	
		 
		 contador++;		
	 
	 }

	 }		
	 
	 System.out.println("El numero de vocales de "+ palabra+ " es " + contador);	
	 
	 }
	 
	 
	 
	//--------------------------------------//
	 
	 
	 //crear metodo para separar numero de letras y 
	 //devuelva un array con dos strings uno con letras y otro con numeros
	 
	 public static String[] separar(String palabra) {
		 String resultadonumero = "";
		 String resultadoletra = "";
		 
		 for (int i = 0; i< palabra.length(); i++) {
			 
			 char letra1 = palabra.charAt(i);
			 
			 if (letra1 == '1' || letra1 == '2' || letra1 == '3' || letra1 == '4' || letra1 == '5' 
					 || letra1 == '6' || letra1 == '7' || letra1 == '8' || letra1 == '9' || letra1 == '0') {
				 
				 resultadonumero = resultadonumero+letra1;
				 
				 
			 } else resultadoletra = resultadoletra+letra1;			 

		 }
		 
		 String[] resultado = {resultadoletra,resultadonumero};
		 return resultado;
 
		 
	 }
	
	
	
	 
	 
	 
	 
	 
	
}
