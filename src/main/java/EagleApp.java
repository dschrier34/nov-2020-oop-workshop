public class EagleApp {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();

        System.out.println("Name: " + myEagle.name);
        System.out.println("Reproduction: " +myEagle.reproduction);
        System.out.println("Outer Covering: " +myEagle.outerCoverings);
        System.out.println("Life Span: " + myEagle.lifeSpan);
        System.out.println("Number of Legs: " + Bird_I.numOfLegs);
        myEagle.flyUp();
        myEagle.flyDown();
    }
}
