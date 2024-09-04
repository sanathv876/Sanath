public class Intcomp {
    public boolean pCompare(int x,int y){
        return x==y;
    }

    public boolean oCompare(Integer x, Integer y){
        return x==y;
    }
    public static void main(String[] args){

        Intcomp intcomp = new Intcomp();

        boolean pAnswer = intcomp.pCompare(3,3);
        Integer x = new Integer(3);
        Integer y = new Integer(3);
        boolean oAnswer = intcomp.oCompare(x,y);

        System.out.println(pAnswer);
        System.out.println(oAnswer);
        y = x;
        oAnswer = intcomp.oCompare(x,y);
        System.out.println(oAnswer);
    }
}
