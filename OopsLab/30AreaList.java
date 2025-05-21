package mode4;
import java.util.*;
import java.util.ArrayList;
class ArrayList{
  public static void main(String[] args){
    ArrayList <Integer>num=new ArrayList<>();
    num.add(10);
    num.add(20);
    num.add(30);
    Scanner s=new Scanner(System.in);
    System.out.println("Enter new element");
    num.add(s.nextInt());
    System.out.println("List: "+num);
    int number=num.get(2);
    System.out.println("Accessed element"+number);
    int renum=num.remove(1);
    System.out.println("Removed element"+renum);
    for(int i=0;i<num.size(),i++){
      System.out.print(num.get(i)+" ");
    }
  }
}
