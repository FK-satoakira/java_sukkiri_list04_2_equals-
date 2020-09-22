package practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	List<Hero> heros = new ArrayList<>();
    	Hero h1 = new Hero();
    	Sword s = new Sword();
    	s.setName("FIRE");
    	h1.setName("勇者");
    	h1.setHp(100);
    	h1.setSword(s);
    	Hero h2 = h1.clone();
//    	Hero h2 = h1
    	System.out.println("h1 = "+h1);
    	System.out.println("h2 = "+h2);
    	heros.add(h1);
    	heros.add(h2);
//    	h1.setName("YUSHA");
//    	h2.setName("正義");
    	h1.setHp(200);
    	h2.setHp(400);
    	System.out.println("h1 = "+h1);
    	System.out.println("h2 = "+h2);
    	h1.getSword().setName("ice");
    	for (int i = 0; i < 2; i++) {
//    		Hero h2 = h1.clone();
//    		heros.add(h2);
//    		String str = "";
//    		for (int j = 0; j < 10; j++) {
//    			Random r = new Random();
//    			int a = r.nextInt(26)+97;
//    			char s = (char)a;
//    			str+=s;
//    		}
//    		System.out.println(str);
    	System.out.println(heros.get(i).getSword());
		}
    	System.out.println(h1);
    	System.out.println(h2);
    }
//    nameを変える→     アドレス変わる
//    hpを変える→	           アドレス不変
//    swordのname変える→アドレス不変。sword自身のアドレスも不変。h1とh2のswordが同名であっても初めから違っていたのは意外だった。

}