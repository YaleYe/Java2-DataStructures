import java.io.*;
import java.util.*;
class testHashing{
public static void main(String[] args)throws Exception{   
    hashTable table = null;
    File file = new File("test.txt");
      
    BufferedReader reader = null;   
    reader = new BufferedReader(new FileReader(file));
    int line = 0;
    String lineString;
    while((lineString = reader.readLine()) != null){ 
        line++; } 
    reader.close();
    //create a table with given length
    
    //create the table
    table = new hashTable(line);
    reader = new BufferedReader(new FileReader(file));
    int newLine = 0;
    String temp;
    while((temp = reader.readLine()) != null){
      newLine ++;
      System.out.println(newLine + ": " + temp);
      table.insertTable(temp, newLine);}
    
    System.out.println("Your table item is below :");
    System.out.println(table.toString());
    
    int count = 0;
    
    for(int index = 0; index < table.table.length; index++){
      if(table.get(index) != null){
       count++; }}
    
    String words[] = new String[count];
    int indexForWord = 0;
    
    for(int index2 = 0; index2 < table.table.length; index2++){
      if(table.get(index2) != null)
      { words[indexForWord] = table.get(index2).word;
       indexForWord++;}}
    
    System.out.println("Sorted Array is:");
    Arrays.sort(words);
    System.out.println(Arrays.toString(words));}}

    
 
