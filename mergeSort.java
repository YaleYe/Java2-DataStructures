//*******************************************************************************************
//                             Yihong Ye 
//                              11/29/18
// implement and analyze the complexity of non-recursive version of mergesort.
//*******************************************************************************************
public class mergeSort {
 public static void merge(int data[], int left, int right, int middle) {
  System.out.println("Merge Happened");  //whenever merge happens, display the message to see how many merges happened during the sorting
  int leftArrayLength = middle - left + 1;
  int rightArrayLength = right - middle;

  int leftNumIndex = 0, rightNumIndex = 0, leftIndex = left;
  int Left[] = new int[leftArrayLength];
  int Right[] = new int[rightArrayLength];
  for (int index_left_array = 0; index_left_array < leftArrayLength;index_left_array++) {
   Left[index_left_array] = data[left + index_left_array];}
  for (int index_right_array = 0; index_right_array < rightArrayLength; index_right_array ++) {
   Right[index_right_array ] = data[middle + 1 + index_right_array ];}

  while (leftNumIndex < leftArrayLength && rightNumIndex < rightArrayLength) {
    if (Left[leftNumIndex] < Right[rightNumIndex]) {
      data[leftIndex] = Left[leftNumIndex];
      leftNumIndex++;
      leftIndex++;} 
    else {data[leftIndex] = Right[rightNumIndex];
      rightNumIndex++;
      leftIndex++;}}
  while (leftNumIndex < leftArrayLength) {
    data[leftIndex] = Left[leftNumIndex];
    leftNumIndex++;
    leftIndex++;}
  
  while (rightNumIndex < rightArrayLength) {
    data[leftIndex] = Right[rightNumIndex];
    rightNumIndex++;
    leftIndex++;}}
 
 public static void MergeSort(int data[], int start, int end) {
   int i = 2, tempIndex = 0; //if length == 2, only need one merge
   while (i < data.length) {
     tempIndex = 0;
      while (tempIndex < data.length - 1) {
        int right = (tempIndex + i) - 1;
        int left = tempIndex;
        if (right > data.length) {
          right = data.length - 1;}
        int middle = (left + right) / 2;
        merge(data, left, right, middle);
        tempIndex = tempIndex + i;}
      i = i * 2;
      if (i >= data.length) {
        i = i / 2;
        merge(data, 0, data.length - 1, (i - 1));
        i = data.length;}}}

 public static void main(String[] args) {
  int data[] = {7,5,4,3,2,1,9,4,534,56};
  System.out.println("Everytime Merge happened, alarm will display");
  System.out.println("Your unsorted array is: ");
  int len = data.length;
  for (int i = 0; i < len; i++) {
   System.out.print(data[i] + " ");}
  System.out.println();  //print out unsorted data

  System.out.println();
  MergeSort(data, 0, data.length); 
  for (int i = 0; i < len; i++) {
   System.out.print(data[i] + " ");
  }}}  //print out sorted data