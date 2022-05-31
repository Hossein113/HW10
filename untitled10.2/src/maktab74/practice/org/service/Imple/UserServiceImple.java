package maktab74.practice.org.service.Imple;

import maktab74.practice.org.Base.service.Imple.BaseServiceImple;
import maktab74.practice.org.domain.User;
import maktab74.practice.org.repository.UserRepository;
import maktab74.practice.org.service.UserService;

import java.io.IOException;

public class UserServiceImple extends BaseServiceImple<User, Long, UserRepository> implements
        UserService {

    public UserServiceImple(UserRepository repository) {
        super(repository);
    }

    @Override
    public void save(User user) throws IOException {
        if (user != null)
            repository.save(user);

    }
}
