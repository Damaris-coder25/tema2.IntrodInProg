
public class SertarBirou {

	public static void main(String[] args) {
		Sertar s1 = new Sertar(1,3,7,6);
		System.out.println(s1);
	    Sertar s2 = new Sertar(2,4,8,5);
	    System.out.println(s2);
	    Birou b = new Birou (9,16,12);
	    System.out.println("Componentele biroului cu dimnesiunile " + b + " sunt: " + s1 + " si " + s2 );
	}

}
