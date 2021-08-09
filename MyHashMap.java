package HashTable;

import LinkedListProblems.MyLinkedListTest;

public class MyHashMap<K, V> {
	MyLinkedListTest<K> myLinkedListTest;
	
	public MyHashMap() {
		this.myLinkedListTest = new MyLinkedListTest<>();
	}

	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedListTest.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue() ; // TODO Auto-generated method stub	
	}

	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedListTest.search(key);// TODO Auto-generated method stub
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkedListTest.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}
	
	public String toString() {
		return "MyHashNodes{" + myLinkedListTest + "}";
	}
}