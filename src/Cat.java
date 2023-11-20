class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
        //конструктор класса
    }
    @Override
    public void makeSound() {
        System.out.println("Its meowing");
    }


    public static void getTheFuckingStick() {
        //принеси палку кот
    }
}
