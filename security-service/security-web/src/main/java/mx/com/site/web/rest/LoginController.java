package mx.com.site.web.rest;


import mx.com.site.commons.to.UserTypeTO;
import mx.com.site.commons.to.UsersTO;
import mx.com.site.services.facade.ILoginAppFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    ILoginAppFacade loginAppFacade;

    @RequestMapping(value = "/getUsersType", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<UserTypeTO>> getAllTypeUsers() {
        return new ResponseEntity<>(this.loginAppFacade.getAllTypeUsers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getUserByEmail", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<UsersTO> getUserByEmail(@RequestParam(value = "email") String email) {
        return new ResponseEntity<>(this.loginAppFacade.getUserByEmail(email), HttpStatus.OK);
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveUser(@RequestBody UsersTO user) {
       this.loginAppFacade.saveUser(user);
       return new ResponseEntity(HttpStatus.OK);
    }
}
