package lab2_1;

import static org.junit.Assert.*;

import org.junit.*;

import edu.iis.mto.bsearch.*;
import org.junit.Test;

public class Test1 {

	int key;
	int[] seq;
	
	@Before
	public void init(){
		key=1;
		seq[0] = 1;
	}
	
	@After
	public void after(int seq[]){
		if(seq.length <= 0)
			throw IllegalArgumentException("D�ugo�� sekwencji wej�ciowej nie mo�e by� r�wny 0");
	}
	
	@Test
	public void test() throws IllegalArgumentException{

		SearchResult searchResult = search(key, seq);
		
	}

}
