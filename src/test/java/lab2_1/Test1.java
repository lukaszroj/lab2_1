package lab2_1;

import static org.junit.Assert.*;
import org.junit.*;
import edu.iis.mto.bsearch.*;
import lab2_1.IllegalArgumentException;

public class Test1 {

	int key;
	int[] seq;
	
	@Before
	public void init(){
		key=1;
		seq[0] = 1;
	}
	
	@After
	public void after(int seq[]) throws IllegalArgumentException{
		
		if(seq.length <= 0)
			throw new IllegalArgumentException("D³ugoœæ sekwencji wejœciowej nie mo¿e byæ równy 0");
	}
	
	@Test
	public void test() throws IllegalArgumentException{

		SearchResult searchResult = search(key, seq);
		
	}

}
