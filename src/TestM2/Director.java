package TestM2;

public class Director {
    private String name,address,email,facebook,sex,group,birth;
    private String phoneNumber;

    public Director() {
    }

    public Director(String name, String address, String email, String facebook, String sex, String group, String birth, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
        this.sex = sex;
        this.group = group;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirdth(String birth) {
        this.birth = birth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                ", sex='" + sex + '\'' +
                ", group='" + group + '\'' +
                ", birth='" + birth + '\'' +
                ", phonenumber=" + phoneNumber +
                '}';
    }
}
