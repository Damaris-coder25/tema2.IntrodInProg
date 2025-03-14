
public class Sertar {
	private int nr, l, L, H;
	
		public Sertar(int nr, int l, int L, int H ) {
			this.nr = nr;
			this.l = l;
			this.L = L;
			this.H = H;
		}
		
		public String toString() {
			return  "Sertar"+  nr + ": l" + l + " L" + L + " H" + H;
		}
	public void tipareste() {
		System.out.println("Sertar: " + "l" + l + " L" + L + " H" + H);
	}
}

	