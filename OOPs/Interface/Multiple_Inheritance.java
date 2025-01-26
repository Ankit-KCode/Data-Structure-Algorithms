public class Multiple_Inheritance{
    public static void main(String args[]){
        newPhone New = new newPhone();
        New.update();
        System.out.println(New.feature);
        System.out.println(New.feature2);
        System.out.println(New.Camera);
        System.out.println(New.Body);
        System.out.println(New.RAM);
        System.out.println(New.ROM);
    }
}
// Multiple Inheritance-----
// Super Class 1
interface samsungS25{
    String feature = "AI Voice";
    String Camera = "100X Zoom";
    int RAM = 8;
    void update();
}
// Super Class 2
interface iPhone{
    String feature2 = "Security";
    String Body = "Metalic";
    int ROM = 512;
}
// Sub Class
class newPhone implements samsungS25, iPhone{
    public void update(){
        System.out.println("This is new Phone Specifications --");
    }
}