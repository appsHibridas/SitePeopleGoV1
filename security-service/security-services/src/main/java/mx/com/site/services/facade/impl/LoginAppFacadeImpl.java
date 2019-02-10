package mx.com.site.services.facade.impl;

import mx.com.site.commons.exceptions.SitePeopleException;
import mx.com.site.commons.to.UserTypeTO;
import mx.com.site.commons.to.UsersTO;
import mx.com.site.commons.util.ExceptionMessage;
import mx.com.site.commons.util.SiteUtilException;
import mx.com.site.services.facade.ILoginAppFacade;
import mx.com.site.services.service.ILoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static mx.com.site.commons.util.Constants.MESSAGE_EXCEPTION_GET_USER_BY_EMAIL;
import static mx.com.site.commons.util.Constants.MESSAGE_EXCEPTION_SAVE_EMAIL;

@Component
public class LoginAppFacadeImpl implements ILoginAppFacade {


    @Autowired
    ILoginUserService loginUserService;

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
            return this.loginUserService.getUserByEmail(SiteUtilException.ofStringNullableOrEmpty(email, MESSAGE_EXCEPTION_GET_USER_BY_EMAIL));
        } catch (Exception e) {
            throw new SitePeopleException(e.getMessage(), e);
        }
    }

    @Override
    public void saveUser(UsersTO user) {
        try {
            this.loginUserService.saveUser(SiteUtilException.ofEntityNullable(user, MESSAGE_EXCEPTION_SAVE_EMAIL));
        } catch (Exception e) {
            throw new SitePeopleException(e.getMessage(), e);
        }
    }


}
