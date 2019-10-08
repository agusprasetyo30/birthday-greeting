/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.Scanner;

/**
 *
 * @author gokpraz
 */
public class Main {
   public static void main(String[] args) {
      String name, hope;
      Scanner sc = new Scanner(System.in);
      
      Person obj = new Person();
      
      System.out.print("Masukan Nama : " );
      name = sc.nextLine();
      
      System.out.print("Harapan kedepannya : " );
      hope = sc.nextLine();
      
      obj.setName(name);
      obj.setHope(hope);
      
      obj.getExpression();
      
   }
}
