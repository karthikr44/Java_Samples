import java.util.*; 
import java.net.*; 
import java.io.*; 

class UrlLibrary implements Iterable<String> {
  List<String> urlList  = new ArrayList<String>(); 
  
  private class UrlIterator implements Iterator<String> {
    private int index = 0; 
    public boolean hasNext() {
      return index < urlList.size(); 
    }
    
    public String next() {
      String val = urlList.get(index); 
      StringBuilder sb = new StringBuilder(); 
      
           
      try {        
        URL url = new URL(val);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); 
        
        String line = null; 
        while ((line = br.readLine()) != null) {
          sb.append(line); 
          sb.append("\n"); 
        }
        br.close(); 
      } catch(Exception e) {
        e.printStackTrace(); 
      }
      
      index++; 
      return sb.toString(); 
    }
    
    public void remove() {
      urlList.remove(index);      
    }
  }
  
  public UrlLibrary() {
    urlList.add("https://www.example.com"); 
    urlList.add("https://www.facebook.com/caveofprogramming"); 
  }
  
  public Iterator<String> iterator() {
    return new UrlIterator(); 
  }
}

public class MyClass {
  public static void main(String[] args) {
    UrlLibrary urls = new UrlLibrary(); 
    
    for (String url:urls) {
      System.out.println(url); 
    }
  }
}