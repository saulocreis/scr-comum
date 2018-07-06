package scrtc.learn.certification;

@FunctionalInterface
public interface UmaInterface {
	
	static void metodoEstatico() {
		System.out.println(UmaInterface.class.toString().concat(" -> metodoEstatico"));
	}
	
	default void metodoPadrao() {
		System.out.println(this.toString().concat(" -> metodoPadrao"));
	}
	
	void metodoImplementado();

}
