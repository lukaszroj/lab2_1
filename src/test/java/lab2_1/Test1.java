package lab2_1;

import static org.junit.Assert.*;
import edu.iis.mto.bsearch.*;
import static org.hamcrest.CoreMatchers.*;

public class Test1 {

	private int keyFirstInSeq;
	private int keyCenterInSeq;
	private int keyLastInSeq;
	private int keyNotInSeq;
	private int[] seqWithOneElement;
	private int[] seqWithFewElements;
	private int[] seqEmpty;
	
	@org.junit.Before
	public void init(){
		keyFirstInSeq=1;
		keyCenterInSeq=3;
		keyLastInSeq=5;
		keyNotInSeq=11;
		seqWithOneElement = new int[] {1};
		seqWithFewElements = new int[] {1, 2, 3, 4, 5};
		seqEmpty = new int[0];
	}
	
	@org.junit.Test
	public void testKeyInOneElementSeq() throws IllegalArgumentException{
		SearchResult searchResult = BinarySearch.search(keyFirstInSeq, seqWithOneElement);
		assertThat(searchResult.getPosition(), equalTo(0));
		assertThat(searchResult.isFound(), is(true));
	}

	@org.junit.Test
	public void testKeyNotInOneElementSeq() throws IllegalArgumentException{
		SearchResult searchResult = BinarySearch.search(keyNotInSeq, seqWithOneElement);
		assertThat(searchResult.getPosition(), equalTo(-1));
		assertThat(searchResult.isFound(), is(false));
	}
	
	@org.junit.Test
	public void testKeyFirstInFewElemetSeq() throws IllegalArgumentException{
		SearchResult searchResult = BinarySearch.search(keyFirstInSeq, seqWithFewElements);
		assertThat(searchResult.getPosition(), equalTo(0));
		assertThat(searchResult.isFound(), is(true));
	}
	
	@org.junit.Test
	public void testKeyLastInFewElemetSeq() throws IllegalArgumentException{
		SearchResult searchResult = BinarySearch.search(keyLastInSeq, seqWithFewElements);
		assertThat(searchResult.getPosition(), equalTo(4));
		assertThat(searchResult.isFound(), is(true));
	}
	
	@org.junit.Test
	public void testKeyCenterInFewElemetSeq() throws IllegalArgumentException{
		SearchResult searchResult = BinarySearch.search(keyCenterInSeq, seqWithFewElements);
		assertThat(searchResult.getPosition(), equalTo(2));
		assertThat(searchResult.isFound(), is(true));
	}
	
	@org.junit.Test
	public void testKeyNotInFewElemetSeq() throws IllegalArgumentException{
		SearchResult searchResult = BinarySearch.search(keyNotInSeq, seqWithFewElements);
		assertThat(searchResult.getPosition(), equalTo(-1));
		assertThat(searchResult.isFound(), is(false));
	}
	
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testEmptySeq() throws IllegalArgumentException{
		SearchResult searchResult = BinarySearch.search(keyFirstInSeq, seqEmpty);
		
	}
}
