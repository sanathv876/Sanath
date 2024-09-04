public class lengthlist {
    int mysteryNumber = 0;
    String[] mysteryArray = {"Finn", "Jake", "Bubblegum"};
    int[] coolArray = {1, 2, 3};
    public int lenlist(){
        for(int i = 0;i<mysteryArray.length; i++){
            mysteryNumber += mysteryArray[i].length();
        }
        return mysteryNumber;
    }
    public static void main(String[] args){
        lengthlist lenth = new lengthlist();

        System.out.println(lenth.lenlist());
    }

}
