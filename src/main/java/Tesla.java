public class Tesla extends Car
{
    private String color;

    public Tesla (String color)
    {
        this.color = color;
    }

    public static void main(String[] args)
    {
        Tesla newCar = new Tesla("blue");
    }
}
