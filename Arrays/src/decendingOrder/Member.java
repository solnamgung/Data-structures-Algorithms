package decendingOrder;

public class Member {
    private int    customerNum;
    private String customerName;
    private String phone;
    private String address;
    private String joinDate;
    private String grade;
    private String city;

    public Member() {
    }

    public Member(int customerNum, String customerName, String phone, String address, String joinDate, String grade, String city) {
        this.customerNum = customerNum;
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
        this.joinDate = joinDate;
        this.grade = grade;
        this.city = city;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
