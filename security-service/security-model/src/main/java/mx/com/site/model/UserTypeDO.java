package mx.com.site.model;

import javax.persistence.*;

@Entity
@Table(name = "cat_user_type")
public class UserTypeDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_type")
    private Long idUserType;
    
    @Column(name = "name_user_type")
    private String nameUserType;

    public Long getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(Long idUserType) {
        this.idUserType = idUserType;
    }

    public String getNameUserType() {
        return nameUserType;
    }

    public void setNameUserType(String nameUserType) {
        this.nameUserType = nameUserType;
    }
}
