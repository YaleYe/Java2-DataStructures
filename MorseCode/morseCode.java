public class morseCode extends MorseNode{
     
    private MorseNode root;
 
    /**
     * constructor to build the tree
     */
    public morseCode() {
        root = new MorseNode();
        insertTreee();
    }

    private void insertTreee(){
    String[] treeList = new String[]{"." ,"-" ,".." ,".-", "-.", "--","...", "..-",".-.",".--","-..", "-.-","--.","---", "....","...-","..-.",
      ".-..", ".--.",".---","-...","-..-","-.-.","-.--","--..","--.-"};
    char[] abcList = new char[]{'E','T','I','A','N','M','S','U','R','W','D','K','G','O','H','V','F','L','P','J','B','X','C','Y','Z','Q'};
    for(int index = 0;index <= 25;index++) {
      char abc = abcList[index];
      String tree = treeList[index];
      add(tree,abc);}}
    
    private void add(String tree, char abc) {
        MorseNode current = root;
        char signal = ' ';
       
        char[] charArray = tree.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            signal = charArray[i];
            if (signal == ('.')) {
                if (current.getLeft() != null) {
                    current = current.getLeft();} 
                else {
                    current.newLeftNode(new MorseNode());
                    current = current.getLeft();}} 
            else {
                if (current.getRight() != null) {
                    current = current.getRight();} 
                else {
                    current.newRightNode(new MorseNode());
                    current = current.getRight();}}
        }
        current.setLetter(abc);}
 
    public void printNode() {        
        MorseNode current = root;
        printNode(current);
    }

    private void printNode(MorseNode current) {      
        if (current != null) {
            printNode(current.getLeft());
            System.out.print(current.setLetter());  
            printNode(current.getRight());
        }
    }
 

    public String decode(String str) {
        char signal = ' ';
        StringBuffer result = new StringBuffer("");
        MorseNode current = root;
         
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
          signal = charArray[i];
            if (signal == '.') {
                if (current.getLeft() != null) {
                    current = current.getLeft();} 
                else {
                    current.newLeftNode(new MorseNode());
                    current = current.getLeft();}}
            else if (signal == '-') {
                if (current.getRight() != null) {
                    current = current.getRight();}
                else {
                    current.newRightNode(new MorseNode());
                    current = current.getRight();}} 
            else {
                result = result.append(current.setLetter());
                current = root;}}
        result = result.append(current.setLetter());
 
        return result.toString();
    }
    
    public String encode(char abc){
      String[] treeList = new String[]{"." ,"-" ,".." ,".-", "-.", "--","...", "..-",".-.",".--","-..", "-.-","--.","---", "....","...-","..-.",
        ".-..", ".--.",".---","-...","-..-","-.-.","-.--","--..","--.-"};
      char[] abcList = new char[]{'E','T','I','A','N','M','S','U','R','W','D','K','G','O','H','V','F','L','P','J','B','X','C','Y','Z','Q'};
      String temp = " ";
      for (int i = 0; i < 25; i++) {
        if(abc == abcList[i]){
          System.out.print(abc);
          temp = treeList[i];}}
      return temp;}
    
    public String encode(String abcd){
      String[] treeList = new String[]{"." ,"-" ,".." ,".-", "-.", "--","...", "..-",".-.",".--","-..", "-.-","--.","---", "....","...-","..-.",
        ".-..", ".--.",".---","-...","-..-","-.-.","-.--","--..","--.-"};
      char[] abcList = new char[]{'E','T','I','A','N','M','S','U','R','W','D','K','G','O','H','V','F','L','P','J','B','X','C','Y','Z','Q'};
      
      char[] abcArray = abcd.toCharArray();
      int length = abcArray.length;
      

      String finalString = " ";
      
      for(int index = 0;index < length;index++){
        for (int i = 0; i < 25; i++) {
          if(abcArray[index] == abcList[i]){
            finalString += treeList[i] + "  ";
            System.out.print(abcArray[index]);}}}
      return finalString;}
}
    
    
  /*
    public String encodeString(String str) {
        MorseNode current = root;
        String result = "";
        String s = "";
        char abc;
         
        for (int i = 0; i < str.length(); i++) {
            abc = str.charAt(i);
            result = searchTree(current, abc, s);}
        return result;}   
 

    public String searchTree(MorseNode current, char abc, String s) {
        char temp = current.setLetter();  
 
        if (current.setLetter() == abc) { 
            return s;}
        else {
            if (current.getLeft() != null) {
                return searchTree(current.getLeft(), abc, s + ".");} // if . find left
            if (current.getRight() != null) {
                return searchTree(current.getRight(), abc, s + "-");}  //  if - find right   
            return s;}}}
            */