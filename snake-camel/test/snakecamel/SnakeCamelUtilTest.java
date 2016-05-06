package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcasetest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AppleBanana";
		String actual = scu.snakeToCamelcase("apple_banana");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecasetest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple_banana";
		String actual = scu.camelToSnakecase("AppleBanana");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizetest(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Apple";
		String actual = scu.capitalize("apple");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizetest(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple";
		String actual = scu.uncapitalize("Apple");
		assertThat(actual, is(expected));
	}
}
