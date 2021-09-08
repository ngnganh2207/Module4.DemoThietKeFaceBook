package repository;

import model.Like;
import model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User,Integer> {
    User findByName(String name);

}
