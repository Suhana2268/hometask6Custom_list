package com.epam.Hometask6;
import java.util.Arrays;

public class CustomList<E> {

	private int list_size = 0;
	private Object elements[];
	private static final int DEFAULT_SIZE = 10;
	public CustomList() {
		elements = new Object[DEFAULT_SIZE];
	}
	public void addItem(E e) {
		if (list_size== elements.length) {
			ensureSize();
		}
		elements[list_size++] = e;
	}
	@SuppressWarnings("unchecked")
	public E getItem(int i) {
		if (i >= list_size || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		return (E) elements[i];
	}
	@SuppressWarnings("unchecked")
	public E deleteItem(int i) {
		if (i >= list_size || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		Object ele = elements[i];
		int numElements = elements.length - ( i + 1 ) ;
		System.arraycopy(elements, i + 1, elements, i, numElements ) ;
		list_size--;
		return (E) ele;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(int i = 0; i < list_size ;i++) {
			sb.append(elements[i].toString());
			if(i<list_size-1){
				sb.append(",");
				}
			}
			sb.append(']');
			return sb.toString();
		}
		public int size() {
			return list_size;
		}
		private void ensureSize() {
			int newSize = elements.length * 2;
			elements = Arrays.copyOf(elements, newSize);
		}
}

