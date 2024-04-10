
class Cylander{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;

    }
}


public class practice_os6 {
    public static void main(String[] args) {

        Cylander ce = new Cylander();
        ce.setHeight(20);
        ce.setRadius(4);
        System.out.println(ce.getHeight());
        System.out.println(ce.getRadius());

    }
}
