package lab4.indrumator;

class Dog {
    static int dogCount = 0;
    public Dog() {
        dogCount += 1;
    }
    public static void main(String[] args) {
        new Dog();
        System.out.println("Dog count is now " + dogCount);
        new Dog();
        System.out.println("Dog count is now " + dogCount);
        new Dog();
        System.out.println("Dog count is now " + dogCount);
    }
}
