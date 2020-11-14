package team.sunrise.managementplatform.entity;

import java.util.List;
import java.util.Objects;

/**
 * @author ZHANGKAIHENG
 */
public class UserLoginData {
    private String uid;
    private String username;
    private String password;
    private String telephone;
    private String mail;
    private int age;
    private String sex;
    private String department;
    private String signature;
    private List<Task> tasks;

    public UserLoginData() {}

    public UserLoginData(String uid, String username, String password, String telephone, String mail,
                         int age, String sex, String department, String signature, List<Task> tasks) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.mail = mail;
        this.age = age;
        this.sex = sex;
        this.department = department;
        this.signature = signature;
        this.tasks = tasks;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserLoginData that = (UserLoginData) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, password, telephone, mail, tasks);
    }
}
