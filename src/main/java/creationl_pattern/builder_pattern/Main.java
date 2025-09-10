package creationl_pattern.builder_pattern;

// this builder method work as a setter not a getter that's it

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder()
                .addCheese(true)
                .addLettuce(true)
                .addTomato(true)
                .addChicken(true)
                .build();

        System.out.println(burger);
    }
}
