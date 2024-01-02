package com.zipcodewilmington.singlylinkedlist;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;


class SinglyLinkedListTest {

    @Test
    public void singlyLinkedListIsNotNullTest(){
        SinglyLinkedList  singlyLinkedList = new SinglyLinkedList();

        Assert.assertNotNull(singlyLinkedList);
    }
    @Test
    public void singlyLinkedListIsALinkListTest(){
        SinglyLinkedList  singlyLinkedList = new SinglyLinkedList();

        Assert.assertTrue(singlyLinkedList instanceof LinkedList);
    }
    @Test
    public void isAbleToAddToTheLinkedListTest(){
        SinglyLinkedList  singlyLinkedList = new SinglyLinkedList();
        String bill = "Bill";
        singlyLinkedList.add(bill);

        Integer expected = 1;
        Integer actual= singlyLinkedList.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void isAbleToRemoveFormTheLinkedListTest(){
        SinglyLinkedList  singlyLinkedList = new SinglyLinkedList();
        String bill = "Bill";
        singlyLinkedList.add(bill);
        singlyLinkedList.remove(bill);

        Integer expected = 0;
        Integer actual= singlyLinkedList.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void isTrueContainTheLinkedListTest(){
        SinglyLinkedList  singlyLinkedList = new SinglyLinkedList();
        String bill = "Bill";
        singlyLinkedList.add(bill);
        String jill = "Jill";
        singlyLinkedList.add(jill);
        String dill = "Dill";
        singlyLinkedList.add(dill);
        String will = "Will";
        singlyLinkedList.add(will);


        Boolean actual= singlyLinkedList.contains(will);
        Assert.assertTrue(actual);
    }
    @Test
    public void isFalseContainTheLinkedListTest(){
        SinglyLinkedList  singlyLinkedList = new SinglyLinkedList();
        String lill = "lill";
        String bill = "Bill";
        singlyLinkedList.add(bill);
        String jill = "Jill";
        singlyLinkedList.add(jill);
        String dill = "Dill";
        singlyLinkedList.add(dill);
        String will = "Will";
        singlyLinkedList.add(will);


        Boolean actual= singlyLinkedList.contains(lill);
        Assert.assertFalse(actual);
    }
//    @Test
//    public void FindTheLinkedListTest(){
//        SinglyLinkedList  singlyLinkedList = new SinglyLinkedList();
//        String bill = "Bill";
//        singlyLinkedList.add(bill);
//        String jill = "Jill";
//        singlyLinkedList.add(jill);
//        String dill = "Dill";
//        singlyLinkedList.add(dill);
//        String will = "Will";
//        singlyLinkedList.add(will);
//
//       String expected = dill;
//        String actual= singlyLinkedList.find(3);
//        Assert.assertEquals(expected,actual);
//
//    }
}