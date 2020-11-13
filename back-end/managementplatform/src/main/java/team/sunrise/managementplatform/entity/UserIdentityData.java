package team.sunrise.managementplatform.entity;

import java.util.List;
import java.util.Objects;

public class UserIdentityData {
    private String uid;
    private String username;
    private String telephone;
    private String mail;
    private String password;
    private List<String> perms;

    public UserIdentityData() {}

    public UserIdentityData(String uid, String username, String telephone, String mail, String password, List<String> perms) {
        this.uid = uid;
        this.username = username;
        this.telephone = telephone;
        this.mail = mail;
        this.password = password;
        this.perms = perms;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getPerms() {
        return perms;
    }

    public void setPerms(List<String> perms) {
        this.perms = perms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserIdentityData that = (UserIdentityData) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(password, that.password) &&
                Objects.equals(perms, that.perms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, telephone, mail, password, perms);
    }
}
