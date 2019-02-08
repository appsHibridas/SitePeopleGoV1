package mx.com.site.services.facade.impl;

import mx.com.site.commons.exceptions.SitePeopleException;
import mx.com.site.commons.to.UserTypeTO;
import mx.com.site.commons.to.UsersTO;
import mx.com.site.commons.util.ExceptionID;
import mx.com.site.commons.util.SiteUtilException;
import mx.com.site.services.facade.ILoginAppFacade;
import mx.com.site.services.service.ILoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginAppFacadeImpl implements ILoginAppFacade {

    @Autowired
    ILoginUserService  loginUserService;

    @Override
    public List<UserTypeTO> getAllTypeUsers() {
        try {
            return this.loginUserService.getAllTypeUsers();
        } catch (Exception e) {
            throw new SitePeopleException(e.getMessage(), e);
        }
    }

    @Override
    public UsersTO getUserByEmail(String email) {
        try {
            return this.loginUserService.getUserByEmail(SiteUtilException.ofDefaultNullable(email,
                    () ->  new  NullPointerException(
                            SiteUtilException.messageException(
                                    ExceptionID.NULL_POINTER_EXCEPTION_MESSAGE.getMessage(),"getUserByEmail"))));
        }catch (Exception e){
            throw new SitePeopleException(e.getMessage(),e);
        }
    }

    @Override
    public void saveUser(UsersTO user) {
        try{
            this.loginUserService.saveUser(SiteUtilException.ofDefaultNullable(user,
                    () -> new NullPointerException(ExceptionID.NULL_POINTER_EXCEPTION_MESSAGE.getMessage())));
        }catch (Exception e){
            throw new SitePeopleException(e.getMessage(),e);
        }

    }


}
