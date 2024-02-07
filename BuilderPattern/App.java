public class App {
    public static void main(String[] args) {
        User theUser = new User.UserBuilder()
                .firstname("Wyatt")
                .lastName("Tom")
                .email("wyattTom@gmail.com")
                .address("CDO Misamis Oriental")
                .phone("0987654321")
                .age(15)
                .build();

        System.out.println(theUser);

    }

}
