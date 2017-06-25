package lab2_1;

import static org.junit.Assert.*;
import org.junit.*;
import edu.iis.mto.bsearch.*;
import lab2_1.IllegalArgumentException;
import static org.hamcrest.CoreMatchers.*;

public class Test1 {

	private int keyFirstInSeq;
	private int keyNotInSeq;
	private int[] seqWithOneElement;
	private int[] seqWithFewElements;
	
	@Before
	public void init(){
		keyFirstInSeq=1;
		keyNotInSeq=11;
		seqWithOneElement = new int[] {1};
		seqWithFewElements = new int[] {1, 2, 3, 4, 5};
	}
	
	@After
	public void after() throws IllegalArgumentException{
		
		if(seqWithOneElement.length <= 0 || seqWithFewElements.length <= 0  )
			throw new IllegalArgumentException("D³ugoœæ sekwencji wejœciowej nie mo¿e byæ równy 0");
	}
	
	@Test
	public void testKeyInOneElementSeq(){
		SearchResult searchResult = BinarySearch.search(keyFirstInSeq, seqWithOneElement);
		assertThat(searchResult.getPosition(), equalTo(0));
		assertThat(searchResult.isFound(), is(true));
	}

	@Test
	public void testKeyNotInOneElementSeq(){
		SearchResult searchResult = BinarySearch.search(keyNotInSeq, seqWithOneElement);
		assertThat(searchResult.getPosition(), equalTo(-1));
		assertThat(searchResult.isFound(), is(false));
	}
	
	@Test
	public void testKeyFirstInFewElemetSeq(){
		SearchResult searchResult = BinarySearch.search(keyFirstInSeq, seqWithFewElements);
		assertThat(searchResult.getPosition(), equalTo(0));
		assertThat(searchResult.isFound(), is(true));
		
	}
	
}
