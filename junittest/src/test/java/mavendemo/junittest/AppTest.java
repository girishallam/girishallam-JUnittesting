/**
 * 
 */
package mavendemo.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		assertEquals("BCD",App.rem("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("BCD",App.rem("BACD"));
	}
	@Test
	public void test3() {
		assertEquals("CD",App.rem("AACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",App.rem("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",App.rem("AABAA"));
	}

}
