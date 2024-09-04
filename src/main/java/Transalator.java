public class Transalator {
    public String transalator(String word){
        return  word.substring(1) + word.substring(0,1) + "ay";
    }
    public static void main(String[] args){
        Transalator transalate = new Transalator();
        System.out.println(transalate.transalator("pokemon"));
    }
}
