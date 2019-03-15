package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry<K,V>> entries;

    public TableNested() {
        this.entries = new ArrayList();
    }


    public class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }


    public V get(K key) {

        for (Entry<K,V> entry : entries) {
            if(key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void put(K key, V value) {
        if(get(key) == null) {
            entries.add(new Entry<K, V>(key, value));
        }
    }

    public void remove(K key){
        int keyIndex = -1;
        for (int i = 0; i < entries.size(); i++) {
            if(key == entries.get(i)){
                keyIndex = i;
            }
        }

        if (keyIndex != -1){
            entries.remove(keyIndex);
        }
    }

}
