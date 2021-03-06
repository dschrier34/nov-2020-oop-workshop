public class Bird extends Animal {
    public String reproduction = "egg";
    public String outerCoverings = "feather";

    public void fly(){
        System.out.println("The bird is flying");
    }

    public void fly(int height){
        System.out.println("This bird is flying " + height + "feet high.");
    }

    public void fly(String name, int height){
        System.out.println("The " + name + " is flying " + height + " feet high.");
    }

    public void eat(){
        System.out.println("This bird eats seeds.");
    }

    public void flyUp(){
        System.out.println("Flying up...");
    }

    public void flyDown(){
        System.out.println("Flying down...");
    }
}
