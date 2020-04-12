//**************************************************************************************
//                                   Yihong Ye
//                                  Program  #1
//                                 due 09/06/2018
//        This program create IntegerSet with hold Intergers in range of 1-10.
//    provided with method of union,intersection,insertElement,deleteElement,toString
//**************************************************************************************
class testClass{
  public static void main(String[] a){
    int size = 11;
    
    //setup integerset to be used in class
    int[] integerSet = {6,7,8,9,10};
    int[] integerSet2 = {1,2,4,5};
    IntegerSet set = new IntegerSet();
    IntegerSet set2 = new IntegerSet();
    
   
    IntegerSet compareSet = new IntegerSet();
    
    //make a compareSet 
    for(int index=0;index<size;index++){
      compareSet.array[index] = true;} 
    
    //pass the variable into set
    for(int index=0;index <integerSet.length;index++){
      int temp = integerSet[index];
      set.array[temp] = true;}
    
    //pass the variable into set2
    for(int index=0;index<integerSet2.length;index++){
      int temp = integerSet2[index];
      set2.array[temp] = true;}
    
    
    System.out.println("compareSet: " + compareSet );
    System.out.println("set: "+set);
    System.out.println("set2: "+set2);
    
    IntegerSet unionSet = new IntegerSet();
    IntegerSet intersectionSet = new IntegerSet();
    System.out.println();
    System.out.println("Union and intersection testing");
    unionSet = IntegerSet.union(set,set2);
    System.out.println("union of set and set2 will be: "+unionSet);
    intersectionSet = IntegerSet.intersection(set,set2);
    System.out.println("intersection of set and set2 will be: "+intersectionSet);
    
  

    System.out.println();
    System.out.println("Insert and delete testing");
    System.out.println("the original array is: "+compareSet);
    compareSet.deleteElement(5);
    System.out.println("new array delete 5: "+compareSet);
    compareSet.insertElement(5);
    System.out.println("new array insert 5: "+compareSet);
    System.out.println();
    System.out.println("isEqual methods testing");
    System.out.println("set and set2 are equal is " + set.isEqual(set2) );

}}//end of testClass
  
  


  
class IntegerSet{

  protected static final int size = 11; //{0,1,2,3,4,5,6,7,8,9,10} 11 items in total
  protected final boolean[] array = new boolean[size];

  
  public static IntegerSet union(IntegerSet set,IntegerSet set2){
    IntegerSet union = new IntegerSet();
    for(int index=0;index < size; index++){
      if(set.array[index] || set2.array[index]){
        union.array[index] = true;}}
  return union;} //end of method of union
  
  public static IntegerSet intersection(IntegerSet set,IntegerSet set2){
    IntegerSet intersection = new IntegerSet();
    for(int index=0;index < size; index++){
      if(set.array[index] && set2.array[index]){
        intersection.array[index] = true;}}
    return intersection;}//end of method of intersection
    
  public void insertElement(int n){
    if (n < 10 && n > 0){
      array[n] = true;}} //end of method of insertElement 
  
  public void deleteElement(int n){
    if (n < 10 && n > 0){
      array[n] = false;}} //end of method of deleteElement
  

  @Override
 public String toString()
  {
    String output = " ";
    for ( int i = 0; i < size; i++ )
    {
      if (array[i]){
        output += (i+" " );
      }
      else{
        output += (" --- ");} 
  }
    return output;} //return array into String type and display the string
  
  public boolean isEqual(IntegerSet set)
  {
    for ( int index = 0; index < size; index++ ){
      if (array[index] != set.array[index] ) {
        return false;
      }}
    return true;
  } // end of methods
} //end of class
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    