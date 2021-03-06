package mx.com.site.model;

import javax.persistence.*;

@Entity
@Table(name = "dt_users")
public class UsersDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "name_user")
    private String nameUser;

    @Column(name = "surnames")
    private String surnames;

    @Column(name = "email")
    private String email;

    @Column(name = "user_password")
    private String userPassword;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_user_type")
    private UserTypeDO id_user_type;

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

    public UserTypeDO getId_user_type() {
        return id_user_type;
    }

    public void setId_user_type(UserTypeDO id_user_type) {
        this.id_user_type = id_user_type;
    }
}
