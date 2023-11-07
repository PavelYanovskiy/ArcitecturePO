package Homework_3;

public class UserService {
    private final UserRepository userRepository;

    public <UserRepository> UserService(Homework_3.UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        // Логика регистрации пользователя
        userRepository.saveUser(user);
    }

}
