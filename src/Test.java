public class Test {


    private static Test2 test2 = new Test2("5");
    Person person = Person.newBuilder()
            .setName("Sasha")
            .setAge(31)
            .build();


    public static void main(String[] args) {
        int a = Integer.parseInt(test2.testMethod(test2.getA()));
        System.out.println(a);
        System.out.println("Hello everyone!");
        System.out.println();
    }
}
