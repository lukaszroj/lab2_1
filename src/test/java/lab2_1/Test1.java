package lab2_1;

import static org.junit.Assert.*;
import org.junit.*;
import edu.iis.mto.bsearch.*;
import lab2_1.IllegalArgumentException;
import static org.hamcrest.CoreMatchers.*;

public class Test1 {

	private int key;
	private int[] seq;
	
	@Before
	public void init(){
		key=1;
		seq = new int[] {1};
	}
	
	@After
	public void after() throws IllegalArgumentException{
		
		if(seq.length <= 0)
			throw new IllegalArgumentException("D³ugoœæ sekwencji wejœciowej nie mo¿e byæ równy 0");
	}
	
	@Test
	public void test() throws IllegalArgumentException{

		SearchResult searchResult = BinarySearch.search(key, seq);
		assertThat(searchResult.getPosition(), equalTo(0));
		assertThat(searchResult.isFound(), is(true));
		
	}

}
