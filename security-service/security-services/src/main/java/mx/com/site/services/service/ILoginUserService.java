package mx.com.site.services.service;

import mx.com.site.commons.to.UserTypeTO;
import mx.com.site.commons.to.UsersTO;

import java.util.List;

public interface ILoginUserService {
   List<UserTypeTO> getAllTypeUsers();

   UsersTO getUserByEmail(String email);

   void saveUser(UsersTO user);

}
