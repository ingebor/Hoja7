import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit {
	BinaryTree bt = new BinaryTree();
	@Test
	void test() {
		String resultado = "gato";
		String esperado = "gato";
		assertEquals(esperado,resultado);
	}

}
