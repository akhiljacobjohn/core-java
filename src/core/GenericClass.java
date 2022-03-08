package core;

public class GenericClass<K,V> implements GenericInterface<K, V>{
	
	private K key;
	private V value;;
	
	GenericClass(K key, V value){
		
		this.key = key;
		this.value = value;
		
		
	}
	
	
	public K getKey() {
		return key;
	}
	
	public V getVal() {
		return value;
	}
	
	
	
	
	public static void main(String[] args) {
		
		GenericInterface<String, Integer> gen = new GenericClass<>("Hey", 1); 
		System.out.println("getKey() - " + gen.getKey());
		System.out.println("getVal() - " + gen.getVal());
		
	}
	
	
	

}
