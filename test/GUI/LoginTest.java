package GUI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoginTest {

	@Test
	void testCheckPsw() {
		int id = 123;
		String psw = "111";
		assertEquals(2, new Login().checkPsw(id, psw));
	}

	
}
