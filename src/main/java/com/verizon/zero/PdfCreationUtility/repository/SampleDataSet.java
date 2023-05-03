package com.verizon.zero.PdfCreationUtility.repository;

import com.verizon.zero.PdfCreationUtility.jasperreports.LTE;

import java.util.ArrayList;
import java.util.List;

public class SampleDataSet {
    public static List<LTE> getListOfLTEData() {
        List<LTE> list = new ArrayList<>();
        list.add(new LTE(1, "AT&T", "-7.8", 2, "4.1"));
        list.add(new LTE(2, "T-Mobile", "-2.0", 4, "1.4"));
        list.add(new LTE(3, "Verizon", "-0.2", 5, "0.7"));
        list.add(new LTE(4, "AT&T.", "-7.8", 14, "1.5"));
        list.add(new LTE(5, "Verizon.", "-2.5", 10, "1.1"));
        list.add(new LTE(6, "T-Mobile.", "-7.8", 5, "1.7"));
        list.add(new LTE(7, "Verizon..", "-2.5", 31, "1.6"));
        list.add(new LTE(8, "AT&T..", "-1.9", 78, "8.7"));
        list.add(new LTE(9, "AT&T..", "-5.6", 69, "6.1"));
        list.add(new LTE(10, "T-Mobile...", "-6.8", 1, "9.1"));
        list.add(new LTE(11, "Verizon...", "-2.5", 56,"8.1"));
        list.add(new LTE(12, "AT&T...", "-9.5", 7, "7.8"));
        list.add(new LTE(13, "T-Mobile/", "-2.7", 9,"8.7"));
        return list;
    }
}