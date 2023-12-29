class str_class{
    public static void main(String[] args) {
        {
            String s="java is programming language";
            String s1="  hello  !";
            System.out.println("length  "+s+"  "+s.length()+"  s1=  "+s1+" "+s1.length());
            System.out.println("trim"+s1.trim());
            System.out.println("concate"+(s1+s));
            System.out.println("concate()"+s1.concat(s));
           
           System.out.println("trim"+s1.equals(s));
        }
    }
}