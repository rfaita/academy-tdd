package com.academy.tests.fold.left;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Entry {

    private final LocalDateTime occurAt;
    private final BigDecimal value;
    private final EntryType type;

    public Entry() {
        this.occurAt = null;
        this.value = null;
        this.type = null;
    }

    private Entry(LocalDateTime occurAt, BigDecimal value, EntryType type) {
        this.occurAt = occurAt;
        this.value = value.abs();
        this.type = type;
    }

    public LocalDateTime getOccurAt() {
        return occurAt;
    }

    public BigDecimal getValue() {
        return value;
    }

    public EntryType getType() {
        return type;
    }

    public static class Builder {

        public static Entry newDeposit(BigDecimal value) {
            return new Entry(LocalDateTime.now(), value, EntryType.DEPOSIT);
        }

        public static Entry newWithdraw(BigDecimal value) {
            return new Entry(LocalDateTime.now(), value, EntryType.WITHDRAW);
        }

    }

    @Override
    public String toString() {
        return "Entry{" +
                "occurAt=" + occurAt +
                ", value=" + value +
                ", type=" + type +
                '}';
    }
}
