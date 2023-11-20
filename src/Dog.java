class Dog extends Animal {

    public Dog(String name, int age){
        super(name, age);
        //конструктор класса
    }
    @Override
    public void makeSound () {
        System.out.println("Вуф вуф нахуй");
    }

    public static void lickYourAss() {
        //вылежи жоппе пес
    }
}
