package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Monster{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object o) {
		if(this==o)return true;
		if(o==null)return false;
		if(!(o instanceof Monster))return false;
		Monster h = (Monster) o;
		if(!(h.name.trim().equals(this.name.trim())))return false;
		return true;
	}
	public int hashCode() {
		int r = 13;
		int rr = 17;
		r = name.hashCode()*r*rr;
		return r;
	}
}
public class Main {
    public static void main(String[] args) {
    	Set<Object> list = new HashSet<>();
    	Hero h1 = new Hero();
    	h1.setName("TARO");
    	Monster m = new Monster();
    	m.setName("TARO");
    	list.add(h1);
    	list.add(m);
    	System.out.println("list.size() = "+list.size());

    	System.out.println("m.hashCode()="+m.hashCode());
    	System.out.println("h1.hashCode()="+h1.hashCode());

    	Iterator<Object> it = list.iterator();
    	while(it.hasNext()) {
    		String name ="";
//    		String mn;

    		Object e = it.next();
    		if(e instanceof Hero) {
    			Hero hr = (Hero)e;
    			name = hr.getName();
//    			if(name.equals("TARO")) {
//    				list.remove(hr);
//    			}
    		}
    		if(e instanceof Monster) {
    			Monster mr = (Monster)e;
    			name = mr.getName();
//    			if(name.equals("TARO")) {
//    				list.remove(mr);
//    			}
    		}
    		System.out.println("test");
    		System.out.println(list);
    	}
//    	ifがあるとなぜダメなのかhashsetを勉強する必要がある
    }
}