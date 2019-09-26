package com.academy.tests.list;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListOpsJava {

    public static <T> List<T> append(List<T> list1, List<T> list2) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static <T> List<T> concat(List<List<T>> listOfLists) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static <T> int size(List<T> list) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static <T> List<T> reverse(List<T> list) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static <T, U> U foldLeft(List<T> list, U initial, BiFunction<U, T, U> f) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static <T, U> U foldRight(List<T> list, U initial, BiFunction<T, U, U> f) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static <T, U> List<U> map(List<T> list, Function<T, U> transform) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    private ListOpsJava() {
        // No instances.
    }

}