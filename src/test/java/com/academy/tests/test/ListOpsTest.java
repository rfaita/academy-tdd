package com.academy.tests.test;

import com.academy.tests.list.ListOpsJava;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOpsTest {

    @Test
    public void testAppendingEmptyLists() {
        Assert.assertEquals(
                Collections.emptyList(),
                ListOpsJava.append(Collections.emptyList(), Collections.emptyList())
        );
    }

    @Test
    public void testAppendingNonEmptyListOnEmptyList() {
        Assert.assertEquals(
                Arrays.asList('1', '2', '3', '4'),
                ListOpsJava.append(Collections.emptyList(), Arrays.asList('1', '2', '3', '4'))
        );
    }

    @Test
    public void testAppendingNonEmptyListOnNonEmptyList() {
        Assert.assertEquals(
                Arrays.asList("1", "2", "2", "3", "4", "5"),
                ListOpsJava.append(Arrays.asList("1", "2"), Arrays.asList("2", "3", "4", "5"))
        );
    }

    @Test
    public void testConcatOnEmptyListOfLists() {
        Assert.assertEquals(
                Collections.emptyList(),
                ListOpsJava.concat(Collections.emptyList())
        );
    }

    @Test
    public void testConcatOnNonEmptyListOfLists() {
        List<List<Character>> listOfLists = Arrays.asList(
                Arrays.asList('1', '2'),
                Collections.singletonList('3'),
                Collections.emptyList(),
                Arrays.asList('4', '5', '6')
        );

        Assert.assertEquals(
                Arrays.asList('1', '2', '3', '4', '5', '6'),
                ListOpsJava.concat(listOfLists)
        );
    }

    @Test
    public void testConcatOnNonEmptyListOfNestedLists() {
        List<List<List<Character>>> listOfNestedLists = Arrays.asList(
                Arrays.asList(
                        Collections.singletonList('1'),
                        Collections.singletonList('2')
                ),
                Collections.singletonList(
                        Collections.singletonList('3')
                ),
                Collections.singletonList(
                        Collections.emptyList()
                ),
                Collections.singletonList(
                        Arrays.asList('4', '5', '6')
                )
        );

        Assert.assertEquals(
                Arrays.asList(
                        Collections.singletonList('1'),
                        Collections.singletonList('2'),
                        Collections.singletonList('3'),
                        Collections.emptyList(),
                        Arrays.asList('4', '5', '6')
                ),
                ListOpsJava.concat(listOfNestedLists)
        );
    }

    @Test
    public void testFilteringEmptyList() {
        Assert.assertEquals(
                Collections.emptyList(),
                ListOpsJava.filter(Collections.<Integer>emptyList(), integer -> integer % 2 == 1)
        );
    }

    @Test
    public void testFilteringNonEmptyList() {
        Assert.assertEquals(
                Arrays.asList(1, 3, 5),
                ListOpsJava.filter(Arrays.asList(1, 2, 3, 5), integer -> integer % 2 == 1)
        );
    }

    @Test
    public void testSizeOfEmptyList() {
        Assert.assertEquals(0, ListOpsJava.size(Collections.emptyList()));
    }

    @Test
    public void testSizeOfNonEmptyList() {
        Assert.assertEquals(4, ListOpsJava.size(Arrays.asList("one", "two", "three", "four")));
    }

//    @Test
//    public void testTransformingEmptyList() {
//        Assert.assertEquals(
//                Collections.emptyList(),
//                ListOpsJava.map(Collections.<Integer>emptyList(), integer -> integer + 1)
//        );
//    }

//    @Test
//    public void testTransformingNonEmptyList() {
//        Assert.assertEquals(
//                Arrays.asList(2, 4, 6, 8),
//                ListOpsJava.map(Arrays.asList(1, 3, 5, 7), integer -> integer + 1)
//        );
//    }

//    @Test
//    public void testFoldLeftOnEmptyList() {
//        Assert.assertEquals(
//                new Double(2.0), // Boxing required for method overload disambiguation.
//                ListOpsJava.foldLeft(
//                        Collections.<Double>emptyList(),
//                        2.0,
//                        (x, y) -> x * y
//                )
//        );
//    }

//    @Test
//    public void testFoldLeftWithDirectionIndependentOperationOnNonEmptyList() {
//        Assert.assertEquals(
//                new Integer(15), // Boxing required for method overload disambiguation.
//                ListOpsJava.foldLeft(
//                        Arrays.asList(1, 2, 3, 4),
//                        5,
//                        (x, y) -> x + y
//                )
//        );
//    }
//
//    @Test
//    public void testFoldLeftWithDirectionDependentOperationOnNonEmptyList() {
//        Assert.assertEquals(
//                new Integer(0), // Boxing required for method overload disambiguation.
//                ListOpsJava.foldLeft(
//                        Arrays.asList(2, 5),
//                        5,
//                        (x, y) -> x / y
//                )
//        );
//    }

//    @Test
//    public void testFoldRightOnEmptyList() {
//        Assert.assertEquals(
//                new Double(2.0), // Boxing required for method overload disambiguation.
//                ListOpsJava.foldRight(
//                        Collections.<Double>emptyList(),
//                        2.0,
//                        (x, y) -> x * y
//                )
//        );
//    }
//
//    @Ignore("Remove to run test")
//    @Test
//    public void testFoldRightWithDirectionIndependentOperationOnNonEmptyList() {
//        Assert.assertEquals(
//                new Integer(15), // Boxing required for method overload disambiguation.
//                ListOpsJava.foldRight(
//                        Arrays.asList(1, 2, 3, 4),
//                        5,
//                        (x, y) -> x + y
//                )
//        );
//    }
//
//    @Ignore("Remove to run test")
//    @Test
//    public void testFoldRightWithDirectionDependentOperationOnNonEmptyList() {
//        Assert.assertEquals(
//                new Integer(2), // Boxing required for method overload disambiguation.
//                ListOpsJava.foldRight(
//                        Arrays.asList(2, 5),
//                        5,
//                        (x, y) -> x / y
//                )
//        );
//    }

    @Test
    public void testReversingEmptyList() {
        Assert.assertEquals(
                Collections.emptyList(),
                ListOpsJava.reverse(Collections.emptyList())
        );
    }

    @Test
    public void testReversingNonEmptyList() {
        Assert.assertEquals(
                Arrays.asList('7', '5', '3', '1'),
                ListOpsJava.reverse(Arrays.asList('1', '3', '5', '7'))
        );
    }

    @Test
    public void testListOfListIsNotFlattened() {
        List<List<Character>> listOfLists = Arrays.asList(
                Arrays.asList('1', '2'),
                Collections.singletonList('3'),
                Collections.emptyList(),
                Arrays.asList('4', '5', '6')
        );

        Assert.assertEquals(
                Arrays.asList(
                        Arrays.asList('4', '5', '6'),
                        Collections.emptyList(),
                        Collections.singletonList('3'),
                        Arrays.asList('1', '2')
                ),
                ListOpsJava.reverse(listOfLists)
        );
    }

}