package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry<K,V>> entries;

    public Table() {
        this.entries = new ArrayList();
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
            entries.add(new Entry<K, V>(key, value));

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
