public class MorseNode {

    private char letter;
    private MorseNode left;
    private MorseNode right;

    public MorseNode() {
        letter = ' ';
        left = null;
        right = null;}
 
    
    public char setLetter() {
        return letter;}
 
    
    public void setLetter(char letter) {
        this.letter = letter;}
 
   
    public MorseNode getLeft() {
        return left;}
    
    public MorseNode getRight() {
        return right;}
   
    public void newLeftNode(MorseNode left) {
        this.left = left;}
 
    public void newRightNode(MorseNode right) {
        this.right = right;}}