//UserMessage.java
package org.didnelpsun.Common;

public class UserMessage {
    private String id;
    private String sex;
    private String telephone;
    private Integer age;
    public void setId(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
}
