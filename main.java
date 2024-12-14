class Hillstations{
    void location(){
        System.out.println("Location is: ");
    }
    void famousfor(){
        System.out.println("Famous for: ");
    }
}

class Manali extends Hillstations{
    void location(){
        System.out.println("Manali is Himachal Pradesh");
    }
    void famousfor(){
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends Hillstations{
    void location(){
        System.out.println("Mussoorie is in uttrakhand");
    }
    void famousfor(){
        System.out.println("it is famous for education institutions");
    }
}

class Gulmarg extends Hillstations{
    void location(){
        System.out.println("Gulmarg is in J&K");
    }
    void famousfor(){
        System.out.println("It is famous for skiing");
    }
}

class main{ 
    public static void main(String args[]){
        Hillstations A = new Hillstations();
        Hillstations M = new Manali();

        Hillstations mu = new Mussoorie();
        Hillstations G = new Gulmarg();

        A.location();
        A.famousfor();
        M.location();
        M.famousfor();
        mu.location();
        mu.famousfor();
        G.location();
        G.famousfor();
    }
}