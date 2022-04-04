package day26;

public class DefaultPair<K,V> implements Pair<K,V>{
    private K key;
    private V value;
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public DefaultPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
