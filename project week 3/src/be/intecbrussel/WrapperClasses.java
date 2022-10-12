package be.intecbrussel;

public class WrapperClasses {

    public static void main(String[] args) {


        int number = 10;

        Integer numberInteger = 25; //typecasting werkt niet met objecten, enkel bij primitieve datatypes
        Double myDouble = numberInteger.doubleValue(); //tenzij!! -> .doubleValue bijvoegen!
        System.out.println(myDouble);



        System.out.println("integer " + numberInteger + " int number " + number);

        System.out.println(numberInteger.toString());

        String result = numberInteger.toString();

        System.out.println(result.length());


        //converteert int naar Integer.
        Integer covertedInt = number;
        System.out.println(covertedInt);


        //oefening 1
        int numberInInt = 25;
        double numberInDouble = 2.99;
        char notANumber = 'j';

        Integer myInt = numberInInt;
        Double myDouble2 = numberInDouble;
        Character myChar = notANumber;

        //oefening 2
        float myFloat = 89.00000F;
        Float myFloat2 = myFloat;

        System.out.println(myFloat2);

        String myString = myFloat2.toString();
        System.out.println(myString.length());













    }

}
