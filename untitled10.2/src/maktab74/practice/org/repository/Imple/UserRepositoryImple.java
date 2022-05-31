package maktab74.practice.org.repository.Imple;

import maktab74.practice.org.Base.repository.Imple.BaseRepositoryImple;
import maktab74.practice.org.domain.User;
import maktab74.practice.org.repository.UserRepository;

import java.io.FileWriter;
import java.io.IOException;

public class UserRepositoryImple extends BaseRepositoryImple<User, Long> implements UserRepository {

    private FileWriter fileWriter;

    public UserRepositoryImple(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void save(User user) throws IOException {

        String writeByFormating = user.getName() + ";" + user.getService() + ";" + user.getAmount() + "$" + "\n";

        fileWriter.write(writeByFormating);
        fileWriter.flush();
        //fileWriter.close() -> exeption
    }
}
