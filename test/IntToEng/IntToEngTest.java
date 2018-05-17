package IntToEng;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void てすと0() {
		IntToEng num = new IntToEng();
		String expected ="zero";
		String actual = num.translateEng(0);
		assertThat(actual,is(expected));
	} 
	
	@Test
	public void てすと1() {
		IntToEng num = new IntToEng();
		String expected ="one";
		String actual = num.translateEng(1);
		assertThat(actual,is(expected));
	} 
	
	@Test
	public void てすと11() {
		IntToEng num = new IntToEng();
		String expected ="eleven";
		String actual = num.translateEng(11);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void てすと17() {
		IntToEng num = new IntToEng();
		String expected ="seventeen";
		String actual = num.translateEng(17);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void てすと21() {
		IntToEng num = new IntToEng();
		String expected ="twenty one";
		String actual = num.translateEng(21);
		assertThat(actual,is(expected));
	} 

	
}
