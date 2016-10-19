package org.tabish.collect.mypractice;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class MyArrayList<E> extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, java.io.Serializable
	{
    private static final long serialVersionUID = 1L;
    
    private int size;
    
    private transient Object[] elementData;
    
    private static final Object[] EMPTY_ELEMENTDATA = {};
    
    
    
    // see iterator implementation also in ArrayList class
  public MyArrayList()
    	{
    		this.elementData=EMPTY_ELEMENTDATA;
    		
    	}
  public MyArrayList(int initialCapacity)
    {
    	if(initialCapacity<0)
    		throw new IllegalArgumentException("Illegal Capacity " +initialCapacity);
    	
         this.elementData=new Object[initialCapacity];    	
    }
    
    public MyArrayList(Collection<? extends E> c)
    	{
    		 elementData = c.toArray();
    	     size = elementData.length;
    	     
    	     
    	     
    	}

	@Override
    public E get(int index)
	    {
	    	 rangeCheck(index);

	         return elementData(index);
	    }
	 private void rangeCheck(int index) {
	        if (index >= size)
	            throw new IndexOutOfBoundsException("out of arrayy");
	    }
	 E elementData(int index) {
	        return (E) elementData[index];
	    }

	@Override
	 public int size() {
	        return size;
	    }
	public boolean add(E e) {
       // ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }
		

	}
