package com.academy.tests.fold.left;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;

public class Bank {

    public static void main(String[] args) {


        List<Entry> entries = Arrays.asList(
                Entry.Builder.newDeposit(new BigDecimal(100)),
                Entry.Builder.newDeposit(new BigDecimal(120)),
                Entry.Builder.newWithdraw(new BigDecimal(20)),
                Entry.Builder.newWithdraw(new BigDecimal(30)),
                Entry.Builder.newWithdraw(new BigDecimal(40))
        );

        Account account1 = new Account();

        System.out.println(account1.getBalance());

        for (Entry entry : entries) {
            account1.apply(entry);
        }


        System.out.println(account1.getBalance());


        Account account2 = new Account();

        System.out.println(account2.getBalance());
        System.out.println(Account.rebuild(account2, entries).getBalance());



    }


}
