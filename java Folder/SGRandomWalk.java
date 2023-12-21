public class SGRandomWalk {
    public static void main(String[] args){
        ////Rectangle is (location x, location y, width, height)
        //Rectangle box = new Rectangle(5, 10, 60, 80);
        //box.draw();
        ////Ellipse is the same
        //Ellipse egg = new Ellipse(100, 100, 40, 60);
        //egg.setColor(Color.YELLOW);
        //egg.fill();
        ////translate brings the rectangle over said distance
        ////grow increases the volume of the egg
        //box.translate(20, 30);
        //egg.grow(5,5);
        Ellipse circle = new Ellipse(150, 150, 10, 10);
        circle.setColor(Color.RED);
        circle.fill();
        circle.draw();
    }
}
