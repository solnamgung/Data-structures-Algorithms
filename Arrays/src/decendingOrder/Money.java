package decendingOrder;

public class Money {
    int customerNum;
    int saleNo;
    int pCost;
    int amount;
    int price;
    String pCode;
    String sDate;

    public Money() {
    }

    public Money(int customerNum, int saleNo, int pCost, int amount, int price, String pCode, String sDate) {
        this.customerNum = customerNum;
        this.saleNo = saleNo;
        this.pCost = pCost;
        this.amount = amount;
        this.price = price;
        this.pCode = pCode;
        this.sDate = sDate;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public int getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(int saleNo) {
        this.saleNo = saleNo;
    }

    public int getpCost() {
        return pCost;
    }

    public void setpCost(int pCost) {
        this.pCost = pCost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }
}
