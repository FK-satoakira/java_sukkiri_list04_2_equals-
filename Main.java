package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

class Hero2 implements Comparable<Hero2>{
	String name;
	int hp;
	@Override
	public String toString() {
//		return "Hero2 [name=" + name + ", hp=" + hp + "]";
		return name;
	}
	public boolean equals(Object o) {
		if(o==this)return true;
		if(o==null)return false;
		if(!(o instanceof Hero2)) { return false;}
		Hero2 h = (Hero2) o;
		if(!(h.name.trim().equals(this.name.trim()))) { return false; }
		return true;
	}
	public int hashCode() {
		int d = 11;
		int j = 13;
		int r = j+d*(this.name.hashCode());
		return r;
	}
	public int compareTo(Hero2 h) {
//		if(this.hp < h.hp)return -1;
//		if(this.hp > h.hp)return 1;
		if(this.name.hashCode() < h.name.hashCode())return -1;
		if(this.name.hashCode() > h.name.hashCode())return 1;
		return 0;

	}
}
public class Main {

    public static void main(String[] args) {
    	List<Hero2> list = new ArrayList<>();
    	Set<Hero2> hashset = new HashSet<Hero2>();
    	List<String> s_array = new ArrayList<>();
    	for (int j = 0; j < 10; j++) {
    		String str = "";
    		for (int i = 0; i < 5; i++) {
    			String[] alfa = {"H","R","J","K","O","U","I","Y","M"};
    			Random r = new Random();
    			int rr = r.nextInt(9);
    			str+=alfa[rr];
    		}
    		System.out.println(str);
    		s_array.add(str);
    		Hero2 h = new Hero2();
    		h.name=str;
    		list.add(h);
    		hashset.add(h);
//    		System.out.println("a.name.hashCode()="+h.name.hashCode()+""+h.name);
//    		System.out.println("list.get("+j+").name.hashCode()="+list.get(j).name.hashCode()+""+list.get(j).name);
    	}

    	Iterator<Hero2> i_hash = hashset.iterator();
    	Iterator<Hero2> i_list = list.iterator();

    	while(i_hash.hasNext() && i_list.hasNext()) {
    		Hero2 hh = i_hash.next();
    		Hero2 hl = i_list.next();
    		System.out.print("hashset/hh.name.hashCode()="+hh.name.hashCode()+""+hh.name);
    		System.out.print(" ");
    		System.out.print("list/hl.name.hashCode()="+hl.name.hashCode()+""+hl.name);
    		System.out.println("");
    	}
    	Collections.sort(list);
//    	Collections.sort(hashset);
    	System.out.println(list);
//hashsetにsort()は不可能。
//    	文字自体にhashucodeがある。鬼の名前だろうと、桃太郎の名前だろうと「たけし」の名のhashucodeは同じ数字
    }
}



