import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;

class GenericGlass<K,V>{
	private K key;
	private V value;

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericGlass other = (GenericGlass) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}






	public GenericGlass(K key, V value) {
		this.key = key;
		this.value = value;
	}






	@Override
	public String toString() {
		return "GenericGlass [key=" + key + ", value=" + value + "]";
	}






	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	
}

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> student = new  TreeMap<Integer, String>();
		student.put(2, "cinoy");
		student.put(1, "fem");
		student.put(3, "vinu");
		
		for(Map.Entry<Integer, String> entry : student.entrySet()) {
			System.out.println(entry);
		}
				
	}
}
