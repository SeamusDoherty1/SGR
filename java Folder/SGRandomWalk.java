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
        Ellipse border = new Ellipse(50, 50, 200, 200);
        Rectangle backGround = new Rectangle(0,0,300,300);
        backGround.setColor(Color.BLUE);
        backGround.fill();
        border.draw();
        circle.setColor(Color.RED);
        circle.fill();
        System.out.println(border.getX());
        System.out.println(border.getWidth());
        while((circle.getX() < border.getHeight() && circle.getY() < border.getWidth()) && (circle.getX() > border.getX() && circle.getY() > border.getY())){
            circle.moveOnce(circle);
            try {Thread.sleep(100);}
            catch(Exception ex) {};
        }
        circle.getMoves();
    }
}
