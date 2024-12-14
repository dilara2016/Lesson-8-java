abstract class Objects{
    abstract void showShape();
    public void shape(){
        System.out.println("Im from abstract class");
    }
}

class Shpere extends Objects{
    void showShape(){
        System.out.println("Object type is Shpere");
    }
}

class Cuboid extends Objects{
    void showShape(){
        System.out.println("Object type is Cuboid");
    }
}

class Prism extends Objects{
    void showShape(){
        System.out.println("Object type is Prism");
    }
}


public class Main1{
    public static void main(String args[]){
        Objects obj = new Shpere();
        obj.showShape();
        obj = new Cuboid();
        obj.showShape();
        obj = new Prism();
        obj.showShape();
        obj.shape();
    }
}