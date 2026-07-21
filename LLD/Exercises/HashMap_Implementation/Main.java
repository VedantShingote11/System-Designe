import java.util.ArrayList;
import java.util.LinkedList;

public class Main{
    public static class HashMap<K , V>{
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        private double k;

        public HashMap(){
            this.N = 4;
            this.n = 0;
            this.k = 2.0;
            this.buckets = new LinkedList[N];
            for(int i=0 ; i<N ; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        public void put(K key , V value){

            int bi = hashFunction(key);
            int di = searchInLL(bi, key);

            if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{
                buckets[bi].get(di).value = value;
            }

            double lambda = (double)n/N;
            if(lambda > k) reHash();

        }
        
        public V get(K key){

            int bi = hashFunction(key);
            int di = searchInLL(bi, key);

            if(di == -1){
                return null;
            }
            else{
                return buckets[bi].get(di).value;
            }

        }

        public boolean containsKey(K key){

            int bi = hashFunction(key);
            int di = searchInLL(bi, key);

            if(di == -1) return false;

            return true;

        }

        public V remove(K key){

            int bi = hashFunction(key);
            int di = searchInLL(bi, key);

            if(di == -1) return null;
            else{
                V value = buckets[bi].get(di).value;
                buckets[bi].remove(di);
                n--;
                return value;
            }

        }

        public ArrayList<K> keySet(){

            ArrayList<K> keys = new ArrayList<>();

            for(int i=0 ; i<N ; i++){
                for(int j=0 ; j<buckets[i].size() ; j++){
                    keys.add(buckets[i].get(j).key);
                }
            }

            return keys;

        }

        public int size(){
            return n;
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public void reHash(){

            LinkedList<Node>[] prev = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;

            n=0;

            for(int i=0 ; i<N ; i++) buckets[i] = new LinkedList<>();

            for(int i=0 ; i<prev.length ; i++){
                for(int j=0 ; j<prev[i].size() ; j++){
                    Node node = prev[i].get(j);
                    put(node.key, node.value);
                }
            }

        }

        public int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        public int searchInLL(int bi , K key){

            for(int i=0 ; i<buckets[bi].size() ; i++){
                Node node = buckets[bi].get(i);
                if(node.key == key) return i;
            }

            return -1;

        }
    }
    public static void main(String[] args) {

        HashMap<Integer , String> map = new HashMap();

        map.put(1, "joe");
        map.put(2, "peater");

        System.out.println(map.get(2));

    }
}