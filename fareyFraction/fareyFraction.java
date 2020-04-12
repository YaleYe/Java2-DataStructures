//**************************************************************************************
//                                   Yihong Ye
//                                  Program  #3
//                                 due 09/027/2018
//        This program takes one interger and return the farey fraction 
//    
//**************************************************************************************
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class fareyFraction{
  public static void main(String[] args){
    int num;
    int den;
    int level;
    Scanner input = new Scanner(System.in);
    Fraction FC = new Fraction();
    LinkedList<String> fareyFraction = new LinkedList<>();
    
    fareyFraction.add("0/1"); //add first node

    
    System.out.println("How many levels you wanted");
    level = input.nextInt();
    for(den =1; den <= level; den++){
      for(num = 0; num <= den; num++){
        if (FC.equal(num, den) && num != 0){
          if(num == den - 1 || num == 1 || den == level || den + num == level){
            fareyFraction.add(FC.toString(num,den));}
      }}}
    fareyFraction.add("1/1");
    System.out.println("Here is your farey Fraction");
    System.out.print(fareyFraction);
  }
}


class Fraction{
public int num;
public int den;
public String fraction;

public String toString(int num, int den){
   fraction = num +  "/"+ den;
    return fraction;
}
public boolean equal(int num, int den){
  if(num == den){
    return false;}
  else{
    return true;}
}}
    
    
    
    