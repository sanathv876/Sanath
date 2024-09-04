public class Rectangle {
    int width;
    int height;

    public Rectangle(){
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int rectWidth, int rectHeight){
        width = rectWidth;
        height = rectHeight;
    }

    public int getArea(){
        return height*width;
    }

    public int getPerimeter(){
        return 2*(width+height);
    }

    public String toString(){
        return "A rectangle with width "+ width +" and height "+ height ;
    }

    public static void main(String[] args){

        Rectangle rect = new Rectangle(7,8 );
        Rectangle rect1 = new Rectangle(10,20 );
        Rectangle rect2 = new Rectangle();
        //int area = rect.getArea();
        int width = rect.getWidth();
        int height = rect.getHeight();
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);


        rect1.setHeight(200);
        width = rect1.getWidth();
        System.out.println(width);
        width = rect2.getWidth();
        height = rect2.getHeight();
        rect2.setWidth(4);
        rect2.setHeight(5);
        width=rect2.getWidth();
        height = rect2.getHeight();

        System.out.println(width);
        System.out.println(height);

        int rectArea = rect1.getArea();
        System.out.println(rectArea);
        int rectPerimeter= rect.getPerimeter();
        System.out.println(rectPerimeter);
        int rectPerimeter1= rect1.getPerimeter();
        System.out.println(rectPerimeter1);
        int rectPerimeter2= rect2.getPerimeter();
        System.out.println(rectPerimeter2);


        System.out.println(rect);
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
        Rectangle rect4=null;

        System.out.println(rect4.getWidth());







    }

}
