package code;

public class Incremental {
	private static Incremental inc = null;
	private static int numero;
	private static int count;
	private Incremental() {
		System.out.println("Foi criado!");
	}
	
	public static String getInstance() {
		if (inc == null) {
			numero = ++count;
		}
		else {
			System.out.println("Já Incrementado!");
		}
		return "-" + numero;
	}
}
