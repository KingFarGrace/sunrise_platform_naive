package team.sunrise.managementplatform.entity;

import java.util.Objects;

public class UserInputData {
    private String uid;
    private String username;
    private String password;
    private String telephone;
    private String mail;

    public UserInputData() {}

    public UserInputData(String uid, String username, String telephone, String mail, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.mail = mail;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, password, telephone, mail);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInputData that = (UserInputData) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(mail, that.mail);
    }
}
