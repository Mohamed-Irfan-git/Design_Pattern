package creationl_pattern.builder_pattern;

/**
 * in this method we're reducing the construction lot of variables
 * which parameter need, and then they can send that one only no need to create construction for
 * evey variable
 *
 * using builder, we can do getter setter method easily it reduce lot of extra codes
 *
 */
public class Burger {
    private final boolean cheese;
    private final boolean lettuce;
    private final boolean tomato;
    private final boolean chicken;

    // if you want getter method, then here we can write getter method

    // we can not access this in another file that why i mark as a private here
    private Burger(Builder builder) {
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.chicken = builder.chicken;

    }

    @Override
    public String toString() {
        return "Burger{" +
                "cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", chicken=" + chicken +
                '}';
    }

    // inside this class we tell what we want
    // when we called the build method this class is over
    public static class Builder{
        private boolean cheese;
        private boolean lettuce;
        private boolean tomato;
        private boolean chicken;

        public Builder addCheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }


        public Builder addLettuce(boolean lettuce){
            this.lettuce = lettuce;
            return this;
        }

        public Builder addTomato(boolean tomato){
            this.tomato = tomato;
            return this;
        }

        public Builder addChicken(boolean chicken){
            this.chicken = chicken;
            return this;
        }

        // it will return whatever variable u want
        // one call this one programme will close
        public Burger build(){
            return new Burger(this);
        }
    }
}
