//**************************************************************************************
//                                   Yihong Ye
//                                  Program  #4
//                                 due 10/09/2018
//        This program fix the string with three methods: check,delete,add
//            print given length substring in the String using recursion
//**************************************************************************************

import java.util.Arrays;
class addString{
  public static void main(String[] args){
    String str = "donuts";

    fxString fx = new fxString(str);
    System.out.println("Your string is "+str);
    System.out.print("checkString testing:");
    System.out.println();
    System.out.print("check character 's' using recursion: ");
    System.out.print(fx.checkString('s'));
    System.out.println();
    System.out.print("check string 'don': ");
    System.out.print(fx.checkString("don"));
    System.out.println();
    System.out.print("check string 'zz' :");
    System.out.print(fx.checkString("zz"));
    System.out.println();
    System.out.println();
    System.out.println("addString testing:");
    System.out.print("add character 'a' :");
    System.out.print(fx.addString('a'));
    System.out.println();
    System.out.print("add string 'sss' :");
    System.out.println(fx.addString("sss"));
    System.out.println();
    System.out.println("delete String testing:");
    System.out.print("delete character 'a' using recursion :");
    System.out.println(fx.deleteString('a'));
    System.out.println();
    System.out.print("delete string 'sss' :");
    System.out.println(fx.deleteString("sss"));
    System.out.println(); 
    System.out.println("toString testing:");
    System.out.println(fx.toString());
    System.out.println(); 
    System.out.println("recursion testing:");
    System.out.println(fx.printSubStringAtGivenLength(4));

  }
}






class fxString{
  private String newString = "";
  private String s;
  private String[] stringList = newString.split("");
  private int length = stringList.length;
  private int index = 0;
  private int index2 = 0;

 

  public fxString(String newString){
    this.newString = newString;}
  
  //recursion
  public int printSubStringAtGivenLength(int length){
    String[] stringList = newString.split("");
    int leng = stringList.length;
    if (length <= 1){
      System.out.print(stringList[leng-length]);
      System.out.println();
      return 0;}
    else
      System.out.print(stringList[leng-length]);
      return printSubStringAtGivenLength(length -1);}
      
  //check char using recursion
  public int checkString(char a){
    String[] stringList = newString.split("");
    length = stringList.length;
    String s = Character.toString(a);
    if(stringList[index].equals(s)){
      System.out.print("True");
      System.out.println();
      return 0;}
    else if(index == (length -1) && stringList[index] != s){
      System.out.print("False");
      return 1;}
    else
      index += 1;
      return checkString(a);}
    
    
    
  //check string
  public boolean checkString(String b){
     String[] stringList = newString.split("");
     String[] newList = b.split("");
     int length = stringList.length;
     int newlen = newList.length;
     String[] List = new String[newlen];
     String[] list; 
     boolean flag = false;
     for(int index = 0; index < length; index++){
       for (int index2 = 0; index2 < newlen; index2++){
         if(stringList[index].equals(newList[index2])){
           List[index2] = newList[index2];}}}
     if(Arrays.equals(List,newList)){
       flag = true;}
      return flag;}
  
  //add char
  public String addString(char a){
    String s = Character.toString(a);
    newString = newString +a ;
    return newString;}
  
  //add string
  public String addString(String b){
    newString = newString + b;
    return newString;}
  
  
  public int deleteString(char a){
    String s = Character.toString(a);
    String[] stringList = newString.split("");
    length = stringList.length;
    if(index2 == length-1){
      System.out.println();
      return 1;}
    else if(!(stringList[index2]).equals(s)){
      System.out.print(stringList[index2]);
      index2 += 1;
      return deleteString(a);}
    else
      index2 += 1;
      return deleteString(a);}
    
  /*  
  //delete char
  public String deleteString(char a){
    String s = Character.toString(a);
    String[] stringList = newString.split("");
    String temp = "";
    int length = stringList.length;
    for(int index = 0; index < length; index++){
      if(s.equals(stringList[index])){
        stringList[index] = "";}
      temp += ""+stringList[index];}
    newString = temp;
    return newString;}
  */
  //delete string
  public String deleteString(String b){
    String[] stringList = newString.split("");
    String[] newList = b.split("");
    int length = stringList.length;
    int newlen = newList.length;
    String[] List = new String[newlen];
    String temp = "";
    for(int index = 0; index < length; index++){
      for (int index2 = 0; index2 < newlen; index2++){
        if(stringList[index].equals(newList[index2])){
          stringList[index] = "";}}
      temp += ""+stringList[index];}
    newString = temp;
    return newString;}
  
  public String toString(){
  String[] stringList = newString.split("");
  int length = stringList.length;
  for(int index = 0; index < length; index++){
    System.out.print(stringList[index]);}
  return "";}}
  
  
  
  
  
  
  