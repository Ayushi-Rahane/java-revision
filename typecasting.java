public class typecasting {
    public static void main(String[] args){
        String s="hello";

        //  String.valueOf()
        // String <- int
        int num = 123;

        String s1 = String.valueOf(num);
        System.out.println(s1);

        //Integer.toString(num)
        // Str <- Int
        int num2 = 321;
        System.out.println( ((Object) Integer.toString(num2)).getClass().getName());

        // Integer.parseInt(str)
        // Int <- str

        String s3 = "1234";
        System.out.println(Integer.parseInt(s3));
    }
}
