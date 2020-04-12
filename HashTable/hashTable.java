//*******************************************************************************************
//                             Yihong Ye 
//                              11/6/18
// Write a cross reference program implemented with hashing so that the program outputs alphabetized list
// of all words in an file along with the line of the numbers
//

import java.io.*;
import java.util.*;

class hashNode{
  String word;
  wordList item;
  hashNode(){
    word ="";
    item = new wordList();}
  
  hashNode(String word,int line){
    this.word = word;
    item = new wordList(line);}
  
  void add(int line){
    item.add(line);}
  
  public String toString(){
    String output = word + ""+item.toString();
    return output;}}

public class hashTable{
  hashNode table[];      //init the table
  Node[] array;
  int arraySize;
  int itemInArray = 0;
  hashTable(int size){
    table = new hashNode[size];
    for(int i = 0; i < size; i++){
      table[i] = null;}}
  
  int hashFunction(String word){
    int hashFunction = word.hashCode() %table.length;  //fiven the range of hashFucntion 
    if(hashFunction > 0){
      return hashFunction;}
    else{
      return -hashFunction;}}
  
  void insertTable(String word,int line){
    int index = hashFunction(word);
    if(table[index] == null){
      table[index] = new hashNode(word,line);} // if word doesn't exist, create a new node
    else{ //if word == word, add into the node
      if(table[index].word == (word)){
        table[index].add(line);}
      else{ //when collision happens
        index = collision(index);
        if(index == -1){
          System.out.println("Table is full");}
        else{
          table[index] = new hashNode(word,line);}}}}
  
  
  int collision(int index){
    int temp = index;
    int count = 0; //count the cycle of looping
    if (count < 2){ 
      if (temp < table.length -1 && table[temp] != null){
        temp ++;
        return collision(temp);}
      else if(temp == table.length -1){
        temp = 0;
        count += 1;
        return collision(temp);}
    else if(count == 2)
        temp = -1;}
    return temp;}
  
  hashNode get(int index){
    return table[index]; }
  
  public String toString(){
    String temp = "";
    for(int index = 0;index <table.length -1;index++){
      if(table[index] != null){
        temp += table[index].toString() + " ";}}
    return temp;}}

  
  
        
  