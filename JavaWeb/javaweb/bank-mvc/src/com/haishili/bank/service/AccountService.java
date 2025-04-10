package com.haishili.bank.service;

import com.haishili.bank.entity.Account;

/**
 * Service类，用作业务层操作，这个类只做各业务的逻辑实现
 *
 * @author 海士栗
 * @version 1.0
 */
public class AccountService {


    private Account account = new Account();

    /**
     *
     * @param from 转出账户
     * @param to 转入账户
     * @param amount 转账金额
     */
    public void transfer(Account from, Account to, double amount) {

    }
}
