package com.verizon.zero.PdfCreationUtility.jasperreports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object class is used to set the column details for the PDF table and charts
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LTE {
    private Integer id;
    private String operator;
    private String rsrp;
    private Integer rsrq;
    private String sinr;
}
