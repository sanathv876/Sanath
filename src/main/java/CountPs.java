public class CountPs {
    public int countPs(String word)
    {
        int sum = 0;
        for(int i = 0; i < word.length(); i++)
        {
            word = word.toLowerCase();
            if(word.substring(i,i+1).equals("p"))
            {
                sum++;
            }
        }
        return sum;
    }
    public void num(){
        String num = "12345";
        int counter = 0;
        String result = "";
        while(counter < num.length())
        {
            int newNum = Integer.valueOf(num.substring(counter,counter+1));
            result+= (newNum + 1);
            counter++;
        }
        System.out.println(result);

    }

    public static void main(String[] args){
        CountPs countPs =  new CountPs();

        int x =countPs.countPs(args[0]);

        countPs.num();



    }
}
