package com.batis.pojo;

/**
 * @ClassName: Account
 * @Description:
 * @Author: zskon
 * @Creat: 2021/2/17 23:35
 * @Version: 1.0
 */
public class Account {
    private Integer id;
    private String accountname;
    private Integer balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountname='" + accountname + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Account(Integer id, String accountname, Integer balance) {
        this.id = id;
        this.accountname = accountname;
        this.balance = balance;
    }

    public Account() {
    }
}
