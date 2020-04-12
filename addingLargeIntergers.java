//**************************************************************************************
//                                   Yihong Ye
//                                  Program  #2
//                                 due 09/20/2018
//        This program calculate the addition result of two large numbers by using stack
//**************************************************************************************
import java.util.Stack;
public class addingLargeIntergers{
  public static void main(String[] args){
    Stack<Integer> num1Stack = new Stack();
    Stack<Integer> num2Stack = new Stack();
    Stack<Integer> additionNum = new Stack();
    Stack<Integer> reversedStack = new Stack();
    Stack<Integer> reStack = new Stack();
    Stack<Integer> finalStack = new Stack(); 
    
    String num1 = "123456789";
    String num2 = "987654321";
    String sum = "";
    
    
    // convert String into sparate interger and add into stack
    for (int i = 0;i < num1.length(); i++){
      int temp = Character.getNumericValue(num1.charAt(i));
      num1Stack.push(temp);}
    System.out.println("Your first stack is "+num1Stack);
    
    // convert String into sparate interger and add into stack
    for (int i = 0;i < num2.length(); i++){
    int temp = Character.getNumericValue(num2.charAt(i));
      num2Stack.push(temp);}
    System.out.println("Your second stack is "+num2Stack);
    System.out.println("size of stack1 is "+num1Stack.size());
    System.out.println("size of stack2 is "+num2Stack.size());
    
    int sizeNum1 = num1Stack.size();
    int sizeNum2 = num2Stack.size();
    
    if(sizeNum1 > sizeNum2){
      while(!num2Stack.isEmpty()){
        int t = num1Stack.pop();
        int s = num2Stack.pop();
        additionNum.push(t+s);}
      while(!num1Stack.isEmpty()){
        int tsm = num1Stack.pop();
        additionNum.push(tsm);}}

    if(sizeNum2 == sizeNum1){
      while(!num1Stack.isEmpty()){
        int t = num1Stack.pop();
        int s = num2Stack.pop();
        additionNum.push(t+s);}}
    
    if(sizeNum2 > sizeNum1){
      while(!num1Stack.isEmpty()){
        int t = num1Stack.pop();
        int s = num2Stack.pop();
        additionNum.push(t+s);}
      while(!num2Stack.isEmpty()){
        int tsm = num2Stack.pop();
        additionNum.push(tsm);}}
     
      
    

    
    
    while(!additionNum.isEmpty()){
      int temp = additionNum.pop();
      reStack.push(temp);}
    
    
    //resolve the carry 
    int carry = 0;

    while(!reStack.isEmpty()){
      int temp = reStack.pop();
      if (carry == 1){
        if (temp > 9){
          temp = temp - 10 + carry;
          reversedStack.push(temp);
          //throw exception when the stack has one remain but last digit still higher than 10
          if(reStack.size() == 0 && temp >= 0){
            reversedStack.push(1);}}
        else{
          temp += carry;
          reversedStack.push(temp);
          carry = 0;}}
      else if(carry == 0) {
        if (temp > 9){
          temp = temp - 10;
          reversedStack.push(temp);
          carry = 1;
          if(reStack.size() == 0 && temp >= 0){
            reversedStack.push(1);}}
        else{
          reversedStack.push(temp);}}}
     
    //reversed back to final stack
    //add number into sum
    while(!reversedStack.isEmpty()){
      int tmpt = reversedStack.pop();
      finalStack.push(tmpt);
      sum += Integer.toString(tmpt); }

    System.out.println("Your addition stack is "+finalStack);
        
    System.out.println("The addition result is "+ sum);
    
    }}