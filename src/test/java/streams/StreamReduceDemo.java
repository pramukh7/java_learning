package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceDemo {

	public static void main(String[] args) {
		List list = Arrays.asList(1,2,4,"A","B","C");
		
		//reduce
		Optional<String> os = list.stream().reduce((a,b)->" "+b+a);
		System.out.println(os.get());
		
		//toArray method
		Object[] str = list.stream().toArray();
		System.out.println(Arrays.toString(str));
		
	}

}
