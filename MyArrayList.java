class MyArrayList {
 int[] arr = new int[10]; 
 int size = 0; 
 
 public int size() {
  return size;
 }
 
 public void set(int index, int item) {
  if(index <0 || index >= size) {
   throw new ArrayIndexOutOfBoundsException(index); 
  }
  arr[index] = item;
 }
 
 public void append(int item) {
  checkCapacity(); 
  arr[size] = item;
  size++; 
 }
 
 private void checkCapacity() {
  if (arr.length == size) {
   int[] copy = new int[size*2]; 
   System.arraycopy(arr, 0, copy, 0, size); 
   arr = copy; 
  }
 }
 
 public int get(int index) {
  if(index <0 || index >= size) {
   throw new ArrayIndexOutOfBoundsException(index); 
  }
  return arr[index]; 
 }
 
}


public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        MyArrayList li = new MyArrayList(); 
        
        li.append(10); 
        li.append(20); 
        
        System.out.println(li.get(0)); 
       
     }
}
