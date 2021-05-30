public class Test {


    private static Test2 test2 = new Test2("5");
    Person person = Person.newBuilder()
            .setName("Sasha")
            .setAge(31)
            .build();


    public static void main(String[] args) throws InterruptedException {
        int a = Integer.parseInt(test2.testMethod(test2.getA()));

        System.out.println("Hello");

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
