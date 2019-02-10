package mx.com.site.services.service.impl;

import mx.com.site.commons.to.UserTypeTO;
import mx.com.site.commons.to.UsersTO;
import mx.com.site.commons.util.SiteUtilException;
import mx.com.site.model.UsersDO;
import mx.com.site.persistence.UserTypeDAO;
import mx.com.site.persistence.UsersDAO;
import mx.com.site.services.service.ILoginUserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static mx.com.site.commons.util.Constants.EXCEPTION_MESSAGE_GET_ALL_TYPE_USERS;
import static mx.com.site.commons.util.Constants.EXCEPTION_MESSAGE_GET_USER_BY_EMAIL;
import static mx.com.site.commons.util.Constants.EXCEPTION_MESSAGE_SAVE_USER;

@Service
public class LoginUserServiceImpl implements ILoginUserService {


    @Autowired
    UserTypeDAO userTypeDAO;

    @Autowired
    UsersDAO usersDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<UserTypeTO> getAllTypeUsers() {
      var allUsers = this.modelMapper.map(this.userTypeDAO.findAll(),new TypeToken<List<UserTypeTO>>(){}.getType());
      return (List<UserTypeTO>) SiteUtilException.ofCollectionNullable(allUsers, EXCEPTION_MESSAGE_GET_ALL_TYPE_USERS);
    }

    @Override
    public UsersTO getUserByEmail(String email) {
        var userDB = SiteUtilException.ofEntityNullable(this.usersDAO.findByEmail(email), EXCEPTION_MESSAGE_GET_USER_BY_EMAIL);
        return  this.modelMapper.map(userDB,UsersTO.class);
    }

    @Override
    public void saveUser(UsersTO user) {
        SiteUtilException.ofEntityNullable(this.usersDAO.save(this.modelMapper.map(user, UsersDO.class)), EXCEPTION_MESSAGE_SAVE_USER);
    }

}
