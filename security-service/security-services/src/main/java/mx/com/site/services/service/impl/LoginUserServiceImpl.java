package mx.com.site.services.service.impl;

import mx.com.site.commons.exceptions.SitePeopleException;
import mx.com.site.commons.to.UserTypeTO;
import mx.com.site.commons.to.UsersTO;
import mx.com.site.model.UsersDO;
import mx.com.site.persistence.UserTypeDAO;
import mx.com.site.persistence.UsersDAO;
import mx.com.site.services.service.ILoginUserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
      var allUsers = (List<UserTypeTO>) this.modelMapper.map(this.userTypeDAO.findAll(),new TypeToken<List<UserTypeTO>>(){}.getType());
      return allUsers;
    }

    @Override
    public UsersTO getUserByEmail(String email) {
        var userDB = this.usersDAO.findByEmail(email);
        Optional.ofNullable(userDB).orElseThrow(()-> new NullPointerException("No se encontro el registro en la base de datos"));
        return  this.modelMapper.map(userDB,UsersTO.class);
    }

    @Override
    public void saveUser(UsersTO user) {
        this.usersDAO.save(this.modelMapper.map(user, UsersDO.class));
    }

}
