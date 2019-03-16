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


    public class Entry<Key, Value> {
        private Key key;
        private Value value;

        public Entry(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        public Key getKey() {
            return key;
        }

        public Value getValue() {
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
        for (int i = 0; i < entries.size(); i++) {

            if (key == entries.get(i).getKey()) {
                remove(key);
            }
        }
            entries.add(this.new Entry<>(key, value));
        }

    public void remove(K key){
        int keyIndex = -1;
        for (int i = 0; i < entries.size(); i++) {
            if(key == entries.get(i).getKey()){
                keyIndex = i;
            }
        }

        if (keyIndex != -1){
            entries.remove(keyIndex);
        }
    }

}
