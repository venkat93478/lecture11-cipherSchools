abstract class Car 
{
    int maxSpeed;
    abstract void brake();
    abstract void accelerate();
    abstract void horn();
}
class BMW extends Car{
    void brake(){
        System.out.println("BMW is applying Brake");
    }
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
    void horn(){
        System.out.println("BMW is making noise with Horn");
    }
}

class Audi extends Car{
    void brake(){
        System.out.println("Audi is applying Brake");
    }
    void accelerate(){
        System.out.println("Audi is accelerating");
    }
    void horn(){
        System.out.println("Audi is making noise with Horn");
    }
}


class AbstractStudy{
    public static void main(String[] args){
        //Car c = new Car();
        BMW B = new BMW();
        B.brake();
        B.accelerate();
        B.horn();
        System.out.println("***************************************");
        Audi A = new Audi();
        A.brake();
        A.accelerate();
        A.horn();
    }
}
