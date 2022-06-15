package bean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class AccountTest {
	
	@Test
	public void instantiate() {
		Account a = new Account("sigma", "password");
		assertEquals("sigma", a.getId());
		assertEquals("password", a.getPassword());
	}

}
