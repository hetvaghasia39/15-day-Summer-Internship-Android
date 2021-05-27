class StringMethod
{
    public static void main(String[] args) 
    {
        //length
        String s1="hello";
        String s2="whatsup";
        System.out.println("length "+s1.length());
        System.out.println("length 2 "+s2.length());

        //concat
        System.out.println("concat "+s1.concat(s2));
        System.out.println("concat "+s1.concat(", how are you?"));

        //IsEmpty
        String s3="";
        System.out.println("IsEmpty "+s3.isEmpty());
        System.out.println("IsEmpty "+s1.isEmpty());

        //Trim
        System.out.println("trim "+s1.trim()+"how are you?");

        //toLowerCase
        String s4="HET";
        System.out.println("toLowerCase "+s4.toLowerCase());

        //toUpperCase
        System.out.println("toUperCase "+s1.toUpperCase());

        //String.valueOf
        //int i=20;
      //  System.out.println(s1.ValueOf(int i));

        //Equals
        
    }
}