package GUI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegisterTest {

	@Test
	void testInsertCustomer() {
		assertEquals(1, new Register().insertCustomer(0, "0", "0", "0", "0", "0"));
	}

}
