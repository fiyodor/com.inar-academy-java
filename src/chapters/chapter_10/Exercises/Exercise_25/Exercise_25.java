/*package chapters.chapter_10.Exercises.Exercise_25;

public class Exercise_25 {

    public static void main(String[] args) {

        split("ER#TUG%RUL/DON=MEZ", "#%/=");

    }

    public static String[] split(String str, String regex){

        int strPlusRegex = findArrayLength(str, regex);

        String[] splittedWithRegex = new String[strPlusRegex];

        String elementOfArray = "";

        for(int i = 0; i < str.length(); i++) {

            if(!isRegex(str.charAt(i),regex)){

                elementOfArray += str.charAt(i);
            }
            if(isRegex(str.charAt(i) , regex)){

                splittedWithRegex[i++] = elementOfArray;

            }
            splittedWithRegex[i++] = str.charAt(i) + "";
        }
    }

    public static boolean isRegex(char ch, String regex){

        for(int i = 0; i < regex.length(); i++) {

            if(ch != regex.charAt(i)){

                return false;
            }
            return true;
        }
    }

    public static int findArrayLength(String str, String regex){

        int counter = 0;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == regex)
        }

        }
}
*/