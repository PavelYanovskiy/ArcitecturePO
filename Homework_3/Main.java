package Homework_3;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryIpml();
        UserService userService = new UserService(userRepository);
        UserHandler userHandler = new UserHandler(userService);
        
        User user = new User("John", "Doe");
        userHandler.registerUser(user);
    }

}
