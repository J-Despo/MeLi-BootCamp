public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'

	public static String replicate(char c, int n)
	{
		String stringFinal = "";

		for (int i = 0; i < n; i++) {
			stringFinal += c;
		}
		return stringFinal;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String caracteresAIzquierda = "";
		int largoMaximo = s.length();
		int cantidadCaracteresAAgregar = n-largoMaximo;

		for (int i = 0; i < cantidadCaracteresAAgregar; i++) {
			caracteresAIzquierda += c;
		}
		return (caracteresAIzquierda + s);

	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] stringFinal = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			stringFinal[i] = Integer.toString(arr[i]);
		}
		return stringFinal;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] arrayFinal = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrayFinal[i] = Integer.parseInt(arr[i]);
		}
		return arrayFinal;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int largoMaximo = 0;
		for (int i = 0; i < arr.length; i++) {
			if (largoMaximo < arr[i].length()) {
				largoMaximo = arr[i].length();
			}
		}
		return largoMaximo;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int largoMaximo = maxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = lpad(arr[i], largoMaximo, c);
		}
	}

	public static String rpad(String s, char c, int n){
		if(s.length()==n){
			return s;
		}
		// se añaden a la derecha
		return s + replicate(c, n - s.length());
	}

	public static String ltrim(String s){
		return s.replaceAll("^\\s+", "");
	}
	public static String rtrim(String s) {
		return s.replaceAll("\\s+$", "");
	}
	public static String trim(String s){
		return s.trim();
	}
	public static int indexOfN(String s, char c, int n){
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c){
				count++;
			}
			if(count == n){
				return i;
			}
		}
		return -1;
	}
}
