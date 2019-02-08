package mx.com.site.persistence;

import mx.com.site.model.UserTypeDO;
import org.springframework.data.repository.CrudRepository;

public interface UserTypeDAO extends CrudRepository<UserTypeDO,Long> {

}
