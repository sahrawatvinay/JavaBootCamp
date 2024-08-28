package strings;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Vinay";
        String name1 = "Vinay";
        String stringObj = new String("Vinay");

        if (name == name1)
            System.out.println("Both are same");

        if (name == stringObj)
            System.out.println("Both are same, pointing to same location");
        else
            System.out.println("name and new, pointing to different locations");

        if (name.equals(stringObj))
            System.out.println("same using equals, values are evaluated");

        int x = 123;
        String strX = String.valueOf(x);
        System.out.println("int to string : " + strX);

        String sentence = "I love Java, java is good";
        String newSent = sentence.replace("Java", "c++");
        System.out.println(sentence);
        System.out.println(newSent);

        System.out.println(newSent.contains("c++"));

        //inclusive, starting index, ending index exclusive
        //if we provide start idx only, then it will pick everything till end
        String subString = sentence.substring(2, 6);
        System.out.println(subString);

        String[] words = sentence.split(" ");
        for(String word: words)
            System.out.print(word + " ");
        System.out.println();

        String color = "Yellow";
        char[] chArray = color.toCharArray();
        for(char ch : chArray)
            System.out.print(ch + " ");
    }
}
