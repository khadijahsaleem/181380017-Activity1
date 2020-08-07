public class Rectangle {
    private double width, height;

    Rectangle(){
        width = 0.0;
        height = 0.0;
    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea(){
        return (width * height);
    }
    public double getPerimeter(){
        return (2 * (height + width));
    }
}