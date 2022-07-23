class SuperObect {
    public void paint() {
        draw();
    }

    public void draw() {
        draw();
        System.out.println("super object");
    }
}

class SubObject extends SuperObect {
    public void paint() {
        super.draw();
    }

    public void draw() {
        System.out.println("sub oject");
    }
}

public class Test18 {
    public static void main(String[] args) {
        SuperObect a = new SubObject();
        a.paint();
    }
}
