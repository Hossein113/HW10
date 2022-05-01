package maktab74.practice10.org.service.Imple;

import maktab74.practice10.org.Base.service.Imple.BaseServiceImple;
import maktab74.practice10.org.repository.UserRepository;
import maktab74.practice10.org.service.UserService;

public class UserServiceImple extends BaseServiceImple<User,Long, UserRepository> implements
        UserService {
    public UserServiceImple(UserRepository repository) {
        super(repository);
    }
}
