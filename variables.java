//We will use functions, variables, expressions, classes, and conditionals

public class variables {
    //functions :)
    public static int square(int x) {
        return x*x;
    }

    //conditional function
    public static String agecheck(int age) {
        if (age < 18) {
            return ("You are too young!");
        }
        else {
            return ("You are old enough");
        }
    }
    public static void main(String[] args) {
        int var = 5;
        int var2 = 10;
        int var3 = var*var2;
        System.out.println(var3);

        System.out.println(square(var2));
        System.out.println(agecheck(var2));
        System.out.println(agecheck(var3));

        Hello classes = new Hello();
        System.out.println(classes.x);
    }
}
