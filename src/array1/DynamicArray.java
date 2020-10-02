package array1;

import java.util.Arrays;

public class DynamicArray {
      private int array[];  
      private int size;       // holds the current size of array
      private int capacity;  // holds the current size of array
      
   // default constructor to initialize the array and values
      public DynamicArray()
      {
    	  array=new int[2];
    	  size=0;
    	  capacity=2;
      }
    
   // to add an element at the end
      public void addElement(int data)
      {
    	  if(size==capacity)
    	  {
    		  growSize(2);
    	  }
    	  array[size]=data;
    	  size++;
      }
      
   // to add an element at a particular index
      public void addAtIndex(int data,int index)
      {
    	// double the capacity if all the allocated space is utilized
    	  if(size==capacity)
    	  {
    		  growSize(2);
    	  }
    	  for(int i=size-1;i>=index;i++)
    	  {
    		  array[i+1]=array[i];
    	  }
    	  array[index]=data;
    	  size++;
      }
      public void growSize(int size)
      {
    	  int temp[]= new int[capacity*size];
    	  for(int i=0;i<capacity;i++)
    	  {
    		  temp[i]=array[i];
    	  }
    	  array=temp;
    	  capacity=capacity*size;
      }
    // to get an element at an index
      public int getElement(int index){
          return array[index];
      }
      
   // function remove last element or put 
      // zero at last index 
      public void remove() 
      { 
          if (size > 0) { 
              array[size - 1] = 0; 
              size--; 
          } 
          if(capacity/2==size)
          {
        	  shrinkSize();
          }
      
      }
      // to remove an element at a particular index
      public void removeAt(int index)
      {
    	  int temp=size();
          if(index>=temp || index<0)
          {
              System.out.println("No element at this index");
          }
          else
          {	  
              for(int i=index;i<temp-1;i++)
              {
                   array[i] = array[i+1];
              }
              array[temp-1]=0;
              size--;
          }
          
          if(capacity/2==size)
          {
        	  shrinkSize();
          }
      }
      //to shrink the array 
      public void shrinkSize()
      {
    	  int temp[] = null;
    	  if(size>0)
    	  {
    		temp=new int[size];
    		for(int i=0;i<size;i++)
    		{
    			temp[i]=array[i];
    		}
    		array=temp;
    		capacity=array.length;
    	  }
      }
      // to get current size;
      public int size()
      {
    	  return size;
      }
      //to get current capacity
      public int capacity()
      {
    	  return capacity;
      }
     // method to print elements in array
      public void printElements(){
          System.out.println("elements in array are :"+Arrays.toString(array));
      }
	public static void main(String[] args) 
	{
		DynamicArray da=new DynamicArray();
		da.addElement(12);
		da.addElement(13);
		da.addElement(14);
		da.addElement(15);
		da.addElement(16);
		System.out.println(da.size());
		System.out.println(da.capacity());
		da.remove();
		System.out.println(da.size());
		System.out.println(da.capacity());	
		da.remove();
		System.out.println(da.size());
		System.out.println(da.capacity());	
		da.remove();
		System.out.println(da.size());
		System.out.println(da.capacity());
		da.remove();
		System.out.println(da.size());
		System.out.println(da.capacity());	
		da.remove();
		System.out.println(da.size());
		System.out.println(da.capacity());	
		da.remove();
		System.out.println(da.size());
		System.out.println(da.capacity());
		da.addElement(12);
		da.addElement(13);
		da.addElement(14);
		da.addElement(15);
		da.addElement(16);
		System.out.println(da.size());
		System.out.println(da.capacity());
	}
	
}
