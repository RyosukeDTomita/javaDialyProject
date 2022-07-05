package dataaccess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LoginDaoTest {

	@Test
	public void DaoTest() {
		assertEquals(true, LoginDAO.hasAccount("hoge", "password"));
		assertEquals(false, LoginDAO.hasAccount("hogehoge", "password"));
	}

}
