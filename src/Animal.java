class Animal {
    private static String name;
    private static int age;

    public Animal(String name, int age) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Wrong age");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Wrong age");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void makeSound() {
        System.out.println("Its puking");
    }
}

