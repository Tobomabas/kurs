package pl.com.tkarolczyk.homeWork.anonymous_class;

public class Main {

        public static class Robot {
            private final GreetingModule greetingModule;

            public Robot(GreetingModule greetingModule) {
                this.greetingModule = greetingModule;
            }

            public void saySomething() {
                greetingModule.sayHello();
            }
        }

        public interface GreetingModule {
            void sayHello();
        }

        public static void main(String[] args) {
            Robot jan = new Robot(() -> System.out.println("dzien dobry"));
            Robot john = new Robot(new GreetingModule() {
                @Override
                public void sayHello() {
                    System.out.println("good morning");
                }
            });
            Robot tomek = new Robot (() -> System.out.println("GutenNacht"));


            jan.saySomething();
            john.saySomething();
            tomek.saySomething();
        }
    }

