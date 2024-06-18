public class palindrome_String{
    public static void main(String[] args){
        String s1 = "ele";
        String s2 = "helo";
        System.out.println(palindrome(s1));
        System.out.println(palindrome(s2));
    }

    static public String palindrome(String s){
           int len = s.length()-1;
           int flag=0;
           
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==s.charAt(len-i)){
               flag++;  
        }
    }
    if(flag==s.length()){
        return "String is palindrome";
    }
    else{
        return "String is not palindrome";
    }
    
    }
}