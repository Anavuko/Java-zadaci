package predavanje3.zad1;

public class Test {

	public static void main(String[] args) {
		GeometriskaSlika trougao = new NejednakostracnicniTrougao(4, 5, 7);
		System.out.println(trougao.toString());
		
		GeometriskaSlika kvadrat = new Pravougaonik (4, 5);
		System.out.println(kvadrat.toString());
		
		GeometriskaSlika krug = new Elipsa (4,5);
		System.out.println(krug.toString());
		 
	}
}
