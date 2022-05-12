package decendingOrder;

import java.util.ArrayList;

public class Manager {
    public ArrayList<Member> memberList = new ArrayList<Member>();
    public ArrayList<Money> moneyList = new ArrayList<Money>();
    public ArrayList<Price> priceList = new ArrayList<>();
    public ArrayList<Answer> answerList = new ArrayList<>();

    public void init() {

        memberList.add(new Member(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));
        memberList.add(new Member(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
        memberList.add(new Member(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
        memberList.add(new Member(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
        memberList.add(new Member(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
        memberList.add(new Member(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));

        moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
        moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
        moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
        moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
        moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
        moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
        moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
        moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
        moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
        moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));

    }
    public void sortedData() {
        for(Member member : memberList) {
            int sum = 0;
            for(Money money : moneyList) {
                if(member.getCustomerNum() == money.customerNum)
                   sum += money.getPrice();
            }
            priceList.add(new Price( member.getCustomerNum(), member.getCustomerName(), sum));
        }

        for(int i= 0; i < priceList.size(); i++) {
            Price p1 = priceList.get(i);
            for(int j = i; j < priceList.size(); j++) {
                Price p2 = priceList.get(j);

                if(p1.price < p2.price) {
                    Price temp = p1;
                    priceList.set(i, p2);
                    priceList.set(j, temp);
                }
            }
        }
    }
    public void answer() {
        for(int k = 0; k < priceList.size(); k++) {
            answerList.add(new Answer(priceList.get(k).customerNumber, priceList.get(k).customerName, priceList.get(k).price));

            if(answerList.get(k).sumPrice != 0)
                System.out.println(answerList.get(k).customerNumber + " " + answerList.get(k).customerName + " " + answerList.get(k).sumPrice);
        }
    }
}
