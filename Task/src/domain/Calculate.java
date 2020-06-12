package domain;
/**
 * Main method for finding the longest word in an array
 * @author admin
 */
public class Calculate{
    String[] array = new String[]{};
    byte max = 0;
    byte flag = 0;
                
public Calculate(String[] array) {
    this.array = array;
}
        
public  String[] Calculate() {
    String[] result = new String[array.length];
    for (String i : array) {
        if(max < i.length()){
           max = (byte)i.length();
        } 
    }
                                           
    for (int i = 0; i < array.length; i++) {
        if(max == array[i].length()){
         result[i] = array[i];
        }    
    }
    return result;
  }
}
