package java8fetures;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PreInteger {

	public static void main(String[] args) {
		
		Predicate<Integer> p = x->x%2 == 0;
		
		System.out.println(p.test(12));
		System.out.println(p.test(66));
		System.out.println(p.test(27));
		System.out.println(p.test(2));
		
		String[] names = {"rajuu","kartheek","Kushal","abhiiii"};  
		
		Predicate<String> p1 =  s->s.length()>6;
		
		for(String st : names) {
			 if(p1.test(st)) {
				 System.out.println(st);
			 }
		}
		// function : INPUT RETURN TYPE perform some action some result 
		
		Function <Integer,Integer> f1  = i->i*i;
		
		System.out.println(f1.apply(2));
		System.out.println(f1.apply(4));
		System.out.println(f1.apply(6));
		System.out.println(f1.apply(8));
		
		Function <String,Integer> f2 = s->s.length();
		System.out.println(f2.apply("Rajuu"));
		System.out.println(f2.apply("Abhiii"));
		System.out.println(f2.apply("Kartheek"));
		
	
		Function <String,String> f3 = str-> str.toUpperCase();
		System.out.println(f3.apply("Tejuu"));
		System.out.println(f3.apply("Murari"));
		System.out.println(f3.apply("Manishh"));
		
		// Consumer input -- void Accept 
		
		Consumer<String> cs = s ->System.out.println(s);
		cs.accept("Rajuu");
		cs.accept("Kartheek");
	}

}
