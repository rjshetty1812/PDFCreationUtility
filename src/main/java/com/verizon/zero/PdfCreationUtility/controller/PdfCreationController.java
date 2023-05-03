package com.verizon.zero.PdfCreationUtility.controller;

import com.verizon.zero.PdfCreationUtility.service.PdfCreationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/pdf")
@RequiredArgsConstructor
public class PdfCreationController {

    private final PdfCreationService pdfCreationService;

    /**
     * This API is used to create a PDF from the sample data using Dynamic Jasper Reports
     * @throws Exception
     */
    @GetMapping("/jasperReport")
    public ResponseEntity<String> jasperReportsPdfCreation() throws Exception {
        return ResponseEntity.ok( pdfCreationService.createPdfThroughJasperReport());

    }

    /**
     * This API is used to create a PDF from the HTML sample input containing highcharts using ironPDF
     * @throws Exception
     */
    @GetMapping("/ironBox")
    public ResponseEntity<String> ironBoxPdfCreation() throws IOException {
        return ResponseEntity.ok( pdfCreationService.createPdfUsingIronBox());

    }



}
