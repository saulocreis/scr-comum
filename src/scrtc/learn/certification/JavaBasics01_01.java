package scrtc.learn.certification;

public class JavaBasics01_01 {

	public static void main(String[] args) {
		
		String s1 = "/* Harry */ Paul";
		System.out.println(s1);
	
		UmaInterface.metodoEstatico();
		
		UmaInterface u = () -> System.out.println("u -> metodoImplementado");
		u.metodoImplementado();
		
		UmaInterface obj = new UmaClasse();
		obj.metodoPadrao();
		obj.metodoImplementado();		
		
	}

}
