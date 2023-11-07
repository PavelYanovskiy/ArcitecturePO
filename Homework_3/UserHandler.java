package Homework_3;

public class UserHandler {
    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    public void registerUser(User user) {
        // Логика обработки регистрации пользователя
        userService.registerUser(user);
    }

}
