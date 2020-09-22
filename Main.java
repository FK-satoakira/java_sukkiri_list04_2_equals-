package practice;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Set<Hero> list = new HashSet<>();
    	Hero h1 = new Hero();

    	System.out.println("h1 = "+h1);
//    	System.out.println(h1.hashCode());
//11行目は、Heroクラスにhashcode()があるとエラーになる。理由はname.hashcode()としてるので、
//nameを設定しないと計算ができないからと思われる。
    	h1.setName("TARO");
    	System.out.println(h1.hashCode());
    	System.out.println("h1 = "+h1);

    	list.add(h1);
    	h1 = new Hero();
//    	System.out.println(h1.hashCode());
    	System.out.println("h1 = "+h1);

    	h1.setName("TARO");
    	System.out.println(h1.hashCode());
       	System.out.println("list.size() = "+list.size());

    	list.remove(h1);

    	System.out.println("list.size() = "+list.size());

    }
}