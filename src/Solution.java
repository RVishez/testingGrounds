/*
import java.io.*;
import java.util.stream.Stream;
import java.util.Scanner;

/*
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        var guitar = new musicInstruments("Yamaha", "red", true);
        var dudka = new musicInstruments("Rus", "yellow", false);
        var piano = new musicInstruments();

        System.out.println(guitar);
        System.out.println(dudka);

        Artifact sphynks = new Artifact(1023, "Egypt", 68);
        System.out.println("Artifacts in base: " + Artifact.count);
        Scanner kbrd = new Scanner(System.in);
        System.out.println("Enter an artifact name:");
        String userArtifactName = kbrd.nextLine();
        if (userArtifactName.equals("sphynks")) {
            System.out.println("Artifact name: " + "sphynks");
            System.out.println("Artifact id: " + sphynks.getId() + ", Culture of artifact: " + sphynks.getArtCulture() + ", Production year: " + sphynks.getYear());
        }
        System.out.println("There is no artifact with name " + userArtifactName + " in the database");

    }
}
       class TimeMachine {

            public int goToFuture(int currentYear) {
                return currentYear = currentYear+10;
            }

            public int goToPast(int currentYear) {
                System.out.println("Метод goToPast начал работу!");
                System.out.println("Значение currentYear внутри метода goToPast (в начале) = " + currentYear);
                return currentYear = currentYear-10;
            }

            public static void main(String[] args) {
                TimeMachine timeMachine = new TimeMachine();
                int currentYear = 2020;

                System.out.println("Какой год в самом начале работы программы?");
                System.out.println(currentYear);

                timeMachine.goToPast(currentYear);
                System.out.println("А сейчас какой год?");
                System.out.println(currentYear);
            }
        }




public class Main {
    public static void main(String[] args) {

        ArrayList<String> cats = new ArrayList<>();
        cats.add("Ased");
        cats.add("Foter");
        cats.add("Maxus");
        cats.add("Dereck");
        for(int i=0;i<cats.size();i++){
            if(cats.get(i).equalsIgnoreCase("maxus"))
                cats.remove(i);
        }
        for (String name : cats)
            System.out.println(name);
    }
*/
/*
public class Main {

    public static void rotate(ArrayList<Integer> list, int distance) {
        for (int i = 0; i < distance; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        rotate(list, 3);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}



import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var AnimalList = new ArrayList<String>() {{
            add("x");
            add("e");
            add("f");
        }};

        for (int i = 0; i < AnimalList.size(); i++) {
            String str = AnimalList.get(i);
            if (str.equals("e")) {
                AnimalList.remove(str);
            }
            System.out.println(str);
        }

        Integer a = 1000;
        Integer b = 1000;
        a = a * 2;
        System.out.println(a);
    }
}



public class Main {
    public static void main(String[] args) {
        String dest = "C://Проекты и каталоги/Butterfly copy.txt";

        Scanner kbrd = new Scanner(System.in);

        try (FileOutputStream writer = new FileOutputStream(dest))
        {
            while(kbrd.hasNext()) {
                String p = kbrd.nextLine() + " ";
                if (p.equals("exit ")) {
                    break;
                }
                writer.write(p.getBytes());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("file is not found");
        }
        catch (IOException e) {
            System.out.println("IO exception");
        }



    }
}

*/


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Перепутанные байты
*/

/*
public class Solution {
    public static void main(String[] args) {
        try (Scanner kbrd = new Scanner(System.in)) {
            System.out.println("Enter source adress: ");
            String src = kbrd.nextLine();
            System.out.println("Enter destination adress: ");
            String dest = kbrd.nextLine();
            copyFileTask(src, dest);
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
    public static void copyFileTask(String src, String dest) {
        try (InputStream input = Files.newInputStream(Paths.get(src)); OutputStream output = Files.newOutputStream(Paths.get(dest))) {
            byte[] buffer = Files.readAllBytes(Paths.get(src));
            for (int i = 0; i < buffer.length-1; i++){
                byte z = buffer[i];
                byte x = buffer[i+1];
                buffer[i] = x;
                buffer[i+1] = z;
                i++;
            }
            output.write(buffer);
        }
        catch (IOException e) {
            System.out.println("IO exception");
        }


    }
}

 */
public class Solution {

    public static void main(String[] args) {

        Cat cat = new Cat("кот", 5);
        System.out.println("name = " + cat.getName() + "; его возраст = " + cat.getAge());
        cat.setAge(-20);
        System.out.println("name = " + cat.getName() + "; его возраст = " + cat.getAge());

    }
}
















