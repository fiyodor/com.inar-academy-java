package weeks.week_07;

import java.util.Scanner;

public class isPresentInNewString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first String : ");
        String str1 = input.nextLine();

        System.out.print("Enter the second String : ");
        String str2 = input.nextLine();

        System.out.println(removeStr2FromStr1(str1, str2));
    }
    public static String removeStr2FromStr1(String str1 , String str2){

        String removedStr1 = "";

        boolean addOrNot = true;
        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {

                if(str1.charAt(i) == str2.charAt(j)){

                    addOrNot = false;
                    break;
                }
                else{
                    addOrNot = true;
                }


            }
            if(addOrNot == true){

                removedStr1 += str1.charAt(i);
            }
        }
        return removedStr1;
    }
}