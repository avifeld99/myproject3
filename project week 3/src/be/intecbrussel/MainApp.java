package be.intecbrussel;

public class MainApp {

    public static void main(String []args) {

        StringBuilder sbl = new StringBuilder("");

        if(sbl.length() == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }

        sbl.append("hi");

        if(sbl.length() == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }


        String str01 = "Hi";
        String str02 = "Hello";
        String str03 = "Hi";
        String str04 = new String("Hi");


        System.out.println(str01 == str04);
        System.out.println(str01 == str03);
        System.out.println(str01.equals(str04));





        String str = "a";
        String str1 = "123";
        String str2 = "55.99";
        String str3 = new String("a");

        boolean equal01 = str == str3;
        boolean equal02 = str2 == str3;

        System.out.println(equal01);
        System.out.println(str == str3);
        System.out.println(str.equals(str3));











    }
}
