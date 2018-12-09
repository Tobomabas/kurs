package pl.com.tkarolczyk.anonymous_classes.new_anonymous_classes;

public class Main {

    Plant rose = new Plant() {
        @Override
        public void grow() {
            System.out.println("rose grow()");
        }

        @Override
        public void smell() {
            System.out.println("rose smell()");

        }

        @Override
        public void wilt() {
            System.out.println("Hiacynt grow()");

        }
    };

    public static void main(String[] args) {
        Gardener gardener = new Gardener();
        gardener.processPlant(new Plant() {
            @Override
            public void grow() {
                System.out.println("total anonymous grow");
            }

            @Override
            public void smell() {
                System.out.println("total anonymous smell");
            }

            @Override
            public void wilt() {
                System.out.println("total anonymous smell");
            }
        });
    }





}
