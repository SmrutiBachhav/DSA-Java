public class array8 {
    public boolean isPalindrome(String word){
        char[]chArr = word.toCharArray();
        char [] ogArr=chArr;
        int start=0;
        int end=chArr.length-1;
        
        while(start<end){
            if(chArr[start]!=chArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String[]args){
        array8 ispal=new array8();
        //System.out.println(ispal.isPalindrome("that"));
        if(ispal.isPalindrome("madam")){
            System.out.println("Given word is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
