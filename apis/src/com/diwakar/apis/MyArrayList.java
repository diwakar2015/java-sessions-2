package com.diwakar.apis;

import java.util.Arrays;

/* @author  Diwakar
 * Date : 24-Feb-2016
 */

public class MyArrayList<E>
{
	//Default initial capacity. 
	private static final int DEFAULT_CAPACITY = 15;

	//Array to hold the elements
	private Object[] elementData;

	//Empty Array when User provides the initial capacity to 0
	private static final Object[] EMPTY_ELEMENTDATA = {};

	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

	//Size of ArrayList
	private int size;

	//Constructor with Initial Argument
	public MyArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
			this.elementData = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			this.elementData = EMPTY_ELEMENTDATA;
		} else {
			throw new IllegalArgumentException("Illegal Capacity: "+
					initialCapacity);
		}
	}

	// Constructs an empty list with an initial capacity of fifteen.
	public MyArrayList() {
		this.elementData = new Object[DEFAULT_CAPACITY];
	}

	private void grow(int minCapacity) {

		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		if (newCapacity - minCapacity < 0)
			newCapacity = minCapacity;
		if (newCapacity - MAX_ARRAY_SIZE > 0)
			throw new OutOfMemoryError();

		elementData = Arrays.copyOf(elementData, newCapacity);
	}


	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}


	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}


	public int indexOf(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++)
				if (elementData[i]==null)
					return i;
		} else {
			for (int i = 0; i < size; i++)
				if (o.equals(elementData[i]))
					return i;
		}
		return -1;
	}


	public Object[] toArray() {
		return Arrays.copyOf(elementData, size);
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {

		//check for range, throw exception if range is higher
		if (index >= size)
			throw new IndexOutOfBoundsException();

		return (E) elementData[index];
	}


	@SuppressWarnings("unchecked")
	public E set(int index, E element) {

		//check for range, throw exception if range is higher
		if (index >= size)
			throw new IndexOutOfBoundsException();

		E oldValue = (E) elementData[index];
		elementData[index] = element;
		return oldValue;
	}


	public boolean add(E e) {
		grow(size + 1);  // Increments modCount!!
		elementData[size++] = e;
		return true;
	}

	@SuppressWarnings("unchecked")
	public E remove(int index) {
		//check for range, throw exception if range is higher
		if (index >= size)
			throw new IndexOutOfBoundsException();
		E oldValue = (E) elementData[index];

		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(elementData, index+1, elementData, index,
					numMoved);
		elementData[--size] = null; // clear to let GC do its work

		return oldValue;
	}

	public void clear() {

		for (int i = 0; i < size; i++)
			elementData[i] = null;

		size = 0;
	}

	public void sort() {

		

		int n = elementData.length;
		Object temp = null;

		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){

				if(elementData[j-1].toString().compareToIgnoreCase(elementData[j].toString()) > 0){
					//swap the elements!
					temp = elementData[j-1];
					elementData[j-1] = elementData[j];
					elementData[j] = temp;
				}

			}
		}


	}
}
