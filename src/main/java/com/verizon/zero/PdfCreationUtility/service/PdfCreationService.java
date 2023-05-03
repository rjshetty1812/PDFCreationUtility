package com.verizon.zero.PdfCreationUtility.service;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import com.ironsoftware.ironpdf.PdfDocument;
import com.verizon.zero.PdfCreationUtility.repository.SampleDataSet;
import com.verizon.zero.PdfCreationUtility.jasperreports.Report;
import net.sf.jasperreports.engine.*;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;
import java.util.Objects;

/**
 * This service class contains the logic to convert the inputs(html, datasets etc) containing charts into corresponding PDF content
 */
@Service
public class PdfCreationService {
    /**
     * This method contains the logic to convert the sample dataset into PDF using DJ(Dynamic Jasper) classes
     * @throws Exception
     */
    public String createPdfThroughJasperReport() throws Exception {
        String outputFilePath="src/main/resources/jasperoutput/jasper_output.pdf";
        JasperPrint jp3 = DynamicJasperHelper.generateJasperPrint(
                new Report().getPieReport(), new ClassicLayoutManager(),
                SampleDataSet.getListOfLTEData());

        JasperPrint jp2 = DynamicJasperHelper.generateJasperPrint(
                new Report().getBarReport(), new ClassicLayoutManager(),
                SampleDataSet.getListOfLTEData());


        JasperPrint jp1 = DynamicJasperHelper.generateJasperPrint(
                new Report().getCombination(), new ClassicLayoutManager(),
                SampleDataSet.getListOfLTEData());

        List<JRPrintPage> page1 = jp2.getPages();
        List<JRPrintPage> page2 = jp3.getPages();
        page1.addAll(page2);

        for (JRPrintPage jrPrintPage : page1) {
            jp1.addPage(jrPrintPage);
        }

        JasperExportManager.exportReportToPdfFile(jp1,outputFilePath);

        return "PDF created successfully at "+ outputFilePath;
    }

    /**
     * This method contains the logic to convert the html containing highcharts into PDF using IronPDF
     * @throws IOException
     */
    public String createPdfUsingIronBox() throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(Objects.requireNonNull(PdfCreationService.class.getClassLoader().getResource("highcharts-input.html")).getPath()));
            String str;
            while ((str = in.readLine()) != null) {
                contentBuilder.append(str);
            }
            in.close();
        } catch (IOException e) {

        }
        String content = contentBuilder.toString();
        PdfDocument pdf = PdfDocument.renderHtmlAsPdf(content);
        String outputFilePath= Objects.requireNonNull(PdfCreationService.class.getClassLoader().getResource("highcharts_output.pdf")).getPath();
        pdf.saveAs(outputFilePath);
        return "PDF created successfully at "+ outputFilePath;
    }

}
