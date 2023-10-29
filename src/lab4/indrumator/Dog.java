package lab4.indrumator;

class Dog {
    static int dogCount = 0;
    int dogCount2 = 1;
    public Dog() {
        dogCount += 1;
        dogCount2++;
    }
    public static void main(String[] args) {
        new Dog();
        System.out.println("Dog count is now " + dogCount);
        new Dog();
        System.out.println("Dog count is now " + dogCount);
        new Dog();
        System.out.println("Dog count is now " + dogCount);

        Dog d = new Dog();
        Dog d2 = new Dog();
        System.out.println("Field variable on object d is now " + d.dogCount2);
        System.out.println("Field variable is on object d2 is now" + d2.dogCount2);
    }
}
