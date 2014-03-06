
	public class OrdenedPair<K, V> implements Pair<K, V> {
		  
		  private K key;
		  private V Value;
		  
		  public OrdenedPair( K key, V Value) {
			  this.key = key;
			  this.Value = Value;
		  }
		  public K getKey() { return key; }
		  public V getValue() {return Value;}

	}

