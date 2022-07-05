package bean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * AccountTest
 * @author tomita
 *
 */
public class AccountTest {

	@Test
	public void instantiate() {
		Account a = new Account("testid", "password");
		assertEquals("testid", a.getId());
		assertEquals("password", a.getPassword());
	}

}
