package MyShowable;
// This code was imported from the Java tutorial (https://docs.oracle.com/javase/tutorial/java/generics/methods.html).
public class Pair<K, V>{
  private K key;
  private V value;
  public Pair(K key, V value){
    this.key = key;
    this.value = value;
  }
  public void setKey(K key) { this.key = key; }
  public void setValue(V value) { this.value = value; }
  public K getKey()   { return key; }
  public V getValue() { return value; }
}
