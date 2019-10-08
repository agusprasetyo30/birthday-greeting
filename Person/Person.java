/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author gokpraz
 */
public class Person {

   private String hope;
   private String name;
   
   public Person() 
   {
   }

   public String getHope() {
      return hope;
   }

   public void setHope(String hope) {
      this.hope = hope;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   public void getExpression()
   {
      System.out.println("\n\n-=== HAPPY BIRTHDAY " + this.getName() + " ===-");
      System.out.println("Semoga harapanmu yang ingin \n[ " + this.getHope() + " ] \nbisa terwujud semua amiin "
        + "dan luweh rajin ngoding e wkwokowkowkw :v");
   }
   
   
}
