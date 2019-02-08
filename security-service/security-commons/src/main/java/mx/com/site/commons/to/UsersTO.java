package mx.com.site.commons.to;

import java.io.Serializable;

public class UsersTO implements Serializable {


    private Long idUser;
    private String nameUser;
    private String surnames;
    private String email;
    private String userPassword;
    private UserTypeTO id_user_type;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public UserTypeTO getId_user_type() {
        return id_user_type;
    }

    public void setId_user_type(UserTypeTO id_user_type) {
        this.id_user_type = id_user_type;
    }
}
