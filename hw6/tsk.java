package hw6;

public class tsk {
    public static void main(String[] args) {
        
        Cats cat1 = new Cats();
        cat1.nickname = "Elsa";
        cat1.age = 6;
        cat1.breed = "sfinks";
        cat1.high = 0.44;
        cat1.weight = 5.3;
        cat1.sex = "female";
        cat1.owner = true;

        Cats cat2 = new Cats();
        cat2.nickname = "Vasia";
        cat2.age = 6;
        cat2.breed = "street";
        cat2.high = 0.24;
        cat2.weight = 2.3;
        cat2.sex = "male";
        cat2.owner = false;

        System.out.println(cat1.toString());
        cat1.Owner();
        System.out.println();
        System.out.println(cat1.Chars());

        System.out.println("\n");

        System.out.println(cat2.toString());
        cat2.Owner();
        System.out.println(cat2.Chars());

    }
}
