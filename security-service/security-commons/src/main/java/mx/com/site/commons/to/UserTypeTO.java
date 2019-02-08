package mx.com.site.commons.to;

import java.io.Serializable;

public class UserTypeTO implements Serializable {

    private Long idUserType;
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