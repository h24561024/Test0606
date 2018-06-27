package com.example.cjcu.test0531;

/**
 * Created by CJCU on 2018/6/13.
 */

public class person {
    private String cdate;
    private String info;
    private int amount;

    public person(String cdate, String ingo, int amount) {
        this.cdate = cdate;
        this.info = ingo;
        this.amount = amount;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getIngo() {
        return info;
    }

    public void setIngo(String ingo) {
        this.info = ingo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
