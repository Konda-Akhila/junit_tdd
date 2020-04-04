package epamauto.Epamaut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Maven {
	@Test
	void test1char() {
		remove removechar=new remove();
		String actual=removechar.delete("ABCD");
	    assertEquals("BCD",actual);
	}
	@Test
	void test2char() {
		remove remove2char=new remove();
		String actual=remove2char.delete("AACD");
	    assertEquals("CD",actual);
	}
	void test3char() {
		remove remove3char=new remove();
		String actual=remove3char.delete("BADC");
	    assertEquals("BDC",actual);
	}
	void test4char() {
		remove remove4char=new remove();
		String actual=remove4char.delete("AABAA");
	    assertEquals("BAA",actual);
	}
	
	

}
