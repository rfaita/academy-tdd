package com.academy.tests.fold.left;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Account {

    private BigDecimal balance = new BigDecimal(0);

    public BigDecimal getBalance() {
        return balance;
    }

    public Account apply(Entry entry) {
        if (EntryType.WITHDRAW.equals(entry.getType())) {
            this.balance = this.balance.subtract(entry.getValue());
        } else {
            this.balance = this.balance.add(entry.getValue());
        }

        return this;
    }

    public static Account rebuild(Account account, Collection<Entry> entries) {
        return foldLeft(account, entries, Account::apply);
    }

    public static Account rebuild(Account account, Collection<Entry> entries, LocalDateTime until) {
        Collection<Entry> filtered =
                entries.stream()
                        .filter(entry -> entry.getOccurAt().isBefore(until))
                        .collect(Collectors.toList());
        return foldLeft(account, filtered, Account::apply);
    }


    private static <T, U> T foldLeft(T initialState, Collection<U> events, BiFunction<T, U, T> apply) {

        for (U event : events) {
            initialState = apply.apply(initialState, event);
        }

        return initialState;

    }
}
