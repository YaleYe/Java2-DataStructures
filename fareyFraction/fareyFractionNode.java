//**************************************************************************************
//                                   Yihong Ye
//                                  Program  #3
//                                 due 09/027/2018
//        This program takes one interger and return the farey fraction 
//    
//**************************************************************************************
public class fareyFractionNode{
  
  public int numenator;
  public int denominator;
  public fareyFractionNode next ;
  public fareyFractionNode temp;
  public fareyFractionNode first;
  public fareyFractionNode second;
  public fareyFractionNode tem;
  
  
  public fareyFractionNode(int numenator,int denominator){
    this.numenator = numenator;
    this.denominator= denominator;}
  
  public String toString(){
    return numenator + " /" + denominator;}


  public fareyFractionNode addNode(fareyFractionNode head, fareyFractionNode tail, int level){
    if(head == null){
      head.numenator = 0;
      head.denominator = 1;
      
      temp.numenator = 1;
      temp.denominator = 1;
      
      temp.next = null;
      head.next = temp;}
    
    for(int index = 2; index <= level; index ++){
      first = head;
      second = head.next;
      while(second != null){
        if (first.denominator + second.denominator == index){
          temp.numenator = first.numenator + second.numenator;
          temp.denominator = first.denominator + second.denominator;
          first.next = temp;
          temp.next = second;
        }
          first = second;
        second = second.next;}}
    return head;}
  
  
  public fareyFractionNode increaseOne(fareyFractionNode head, int level){
    level ++;
    first = head;
    second = first.next;
    while(second != null){
      if(first.denominator + second.denominator <= level){
        temp.numenator = first.numenator + second.numenator;
        first.next = temp;
        temp.next = second;
    }
      first = second;
      second = second.next;}
    return head;}
  
  public fareyFractionNode decreaseOne(fareyFractionNode head, int level){
    level --;
    first = head;
    head = first;
    temp = first.next;
    temp = temp.next;
    while(temp.next != null){
      if(first.next.denominator >= level){
        first.next = temp;
        first = first.next;
        temp = first.next;
        temp = temp.next;}
      else{
        first = first.next;
        temp = first.next;
        temp = temp.next;}
    if(first.next.denominator == level){
      first.next = temp;
      temp.next = null;}}
    level --;
    return head;
  }
  
  public void printList(fareyFractionNode head){
    if(head == null){
      System.out.println("Your Farey Fraction is empty");}
    else{
      temp = head;
      while(temp != null){
        System.out.print(numenator+"/"+denominator+" ");
        if(temp.next != null){
          System.out.print(",");}
        temp = temp.next;}}}
}

  
  