package test;

import domain.Calculate;
/**
 * Test
 * @author admin
 */
public class Test {
  public static void main(String[] args) {
    String[] array= new String[]{"cat", "flat", "ground", "country", "revolution"};
    Calculate calculate = new Calculate(array);
    System.out.println("Масив:");
    for (String i : array){
        System.out.print(i+" ");
    }
    System.out.println("\nНайдовше слово в масиві:");
    for(String i : calculate.Calculate()){
        if(i!=null)
        System.out.println(i+" ");
    }             
  }
}