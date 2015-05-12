import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class IntoToEngTest {

	@Test
	public void �e�X�g0() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void �e�X�g10() {
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.translateEng(10);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}

	@Test
	public void �e�X�g22() {
		IntToEng ite = new IntToEng();
		String expected = "twentytwo";
		String actual = ite.translateEng(22);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	@Test
	public void �e�X�g33() {
		IntToEng ite = new IntToEng();
		String expected = "thirtythree";
		String actual = ite.translateEng(33);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	@Test
	public void �e�X�g11() {
		IntToEng ite = new IntToEng();
		String expected = "eleven";
		String actual = ite.translateEng(11);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}

	@Test
	public void �e�X�g20() {
		IntToEng ite = new IntToEng();
		String expected = "twenty";
		String actual = ite.translateEng(20);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void �e�X�g40() {
		IntToEng ite = new IntToEng();
		String expected = "fourty";
		String actual = ite.translateEng(40);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void �e�X�g100() {
		IntToEng ite = new IntToEng();
		String expected = "hundred";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
}
