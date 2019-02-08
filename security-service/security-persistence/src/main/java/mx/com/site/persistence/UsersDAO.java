package mx.com.site.persistence;

import mx.com.site.model.UsersDO;
import org.springframework.data.repository.CrudRepository;

public interface UsersDAO extends CrudRepository<UsersDO,Long> {
    UsersDO findByEmail(String email);
}
