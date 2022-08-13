import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	 
	
	public static void main(String[] args) {
		
		int[] x = {1,2,5,8,4,6,7,8,1};
		
		Optional opt = Stream.of(1,2,5,8,4,6,7,8,1).sorted().distinct().skip(3).findFirst();
		
		System.out.println("5th highest Element : "+opt.get());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			
			list.add(i+1);
			list.add(i+1);
			list.add(i+1);
		}
		
		System.out.println("Elements of list are : "+list);
		
		list.stream().filter(e-> Collections.frequency(list, e)>1)
		.collect(Collectors.toSet()).forEach(System.out::println);
		
		String str = "Programming";
		
		StringBuffer sb = new StringBuffer();
		
		str.chars().distinct().forEach(s-> sb.append((char)s));
		
		System.out.println(sb);
		
		
	}
}
