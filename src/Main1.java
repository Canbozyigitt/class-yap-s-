public class Main1 {
    public static void main(String[] args) {
        car audi=new car();
        audi.model="audi A3";
        audi.speed=10;
        audi.increaseSpeed(30);
        System.out.println("modeli :"+audi.model+"hızı :"+audi.speed);

        car bmv =new car();
        bmv.model="BMW 3.20";
        bmv.speed=15;
        System.out.println(bmv.model+" model "+bmv.speed+" hızı");

        car mercedes =new car();
        mercedes.model="G63";
        mercedes.speed=20;
        System.out.println(mercedes.model+" model"+bmv.speed+"hızı");;


    }
}
