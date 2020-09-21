package practice;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Set<Hero> list = new HashSet<>();
    	Hero h1 = new Hero();
    	h1.setName("TARO");
    	System.out.println("h1 = "+h1);
    	System.out.println("");
    	list.add(h1);
    	System.out.println("list.size() = "+list.size());
    	System.out.println("");
    	h1 = new Hero();
    	System.out.println("h1を初期化");
    	System.out.println("");
    	System.out.println("h1 = "+h1);
//    	ここ注意。Hashだとこれはjava.lang.NullPointerExceptionになる。
//    	toStringをオーバーライドするとOKなので、多分、toStringをオーバーライドしていないからと思われる。
    	System.out.println("");

    	System.out.println("名前を上書き");
    	System.out.println("");
    	h1.setName("TARO");
    	System.out.println("h1 = "+h1);
//    	System.out.println("list.get(0) = "+list.get(0));
    	System.out.println("");
    	System.out.println("removeを使う");
    	list.remove(h1);
    	System.out.println("");
    	System.out.println("list.size() = "+list.size());


   }
}