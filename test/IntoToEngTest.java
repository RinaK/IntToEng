import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class IntoToEngTest {

	@Test
	public void テスト0() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void テスト10() {
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.translateEng(10);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}

}
