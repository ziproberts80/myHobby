
package myabstractexample;

public class MyException extends Exception {
   int id;

   public MyException(int x) {
      this.id = x;
   }

   public String toString() {
      return "MyException [" + this.id + "should never be returned";
   }
}
