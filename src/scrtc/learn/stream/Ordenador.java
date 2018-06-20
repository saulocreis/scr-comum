package scrtc.learn.stream;

import java.util.stream.Stream;

/**
 * 
 * 
 * https://docs.oracle.com/javase/tutorial/collections/streams/
 * 
 * http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */
public class Ordenador {

	public static void main(String[] args) {
		
		Stream<String> lista = Stream.of("ba", "aa", "ba", "ab");
		
		lista.forEach(System.out::println);
		
	}

}
