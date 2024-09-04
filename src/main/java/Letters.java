public class Letters {
    public static void main(String[] args){
        String letters = "ABCde";
        String name = "Karel the Dog";
        String letter = "D";

        System.out.println(name.indexOf(letter));
        System.out.println(letters.indexOf(name.substring(3,4)));
        System.out.println(letters.indexOf(letter));

        String str = "I am";
        str+=10+3;
        String age = "years old";

        System.out.println(str+age);

        String sentence ="Grab the last word";
        String lastWord = sentence.substring(sentence.length()-4, sentence.length());
        String lastWord1 = sentence.substring(sentence.indexOf("w"), sentence.indexOf("d"));
        String lastWord2 = sentence.substring(14,16) + sentence.substring(1,2) + sentence.substring(sentence.length()-1, sentence.length());
        System.out.println(lastWord);
        System.out.println(lastWord1);
        System.out.println(lastWord2);
    }
}
