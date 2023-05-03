package com.verizon.zero.PdfCreationUtility.jasperreports;

import java.awt.Color;

import ar.com.fdvs.dj.domain.Style;
import ar.com.fdvs.dj.domain.builders.ColumnBuilder;
import ar.com.fdvs.dj.domain.constants.Border;
import ar.com.fdvs.dj.domain.constants.Font;
import ar.com.fdvs.dj.domain.constants.HorizontalAlign;
import ar.com.fdvs.dj.domain.constants.Transparency;
import ar.com.fdvs.dj.domain.constants.VerticalAlign;
import ar.com.fdvs.dj.domain.entities.columns.AbstractColumn;
import com.verizon.zero.PdfCreationUtility.repository.SampleDataSet;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * This class has the basic columns and style setup which is used for most of the reports.
 */
public abstract class ReportBase {

    protected AbstractColumn modelCol;
    protected AbstractColumn mfgCol;
    protected AbstractColumn qtyCol;
    protected AbstractColumn yearCol;

    public ReportBase() {
        modelCol = ColumnBuilder.getNew()
                .setColumnProperty("operator", String.class.getName())
                .setTitle("Operator").setWidth(70).build();
        mfgCol = ColumnBuilder.getNew()
                .setColumnProperty("rsrp", String.class.getName())
                .setTitle("RSRP").setWidth(70).build();
        qtyCol = ColumnBuilder.getNew()
                .setColumnProperty("rsrq", Integer.class.getName())
                .setTitle("RSRQ").setWidth(70).build();
        yearCol = ColumnBuilder.getNew()
                .setColumnProperty("sinr", String.class.getName())
                .setTitle("SINR").setWidth(70).build();
    }

    public Style getHeaderStyle() {
        Style headerStyle = new Style();
        headerStyle.setFont(Font.VERDANA_MEDIUM_BOLD);
        headerStyle.setBorderBottom(Border.PEN_2_POINT());
        headerStyle.setHorizontalAlign(HorizontalAlign.CENTER);
        headerStyle.setVerticalAlign(VerticalAlign.MIDDLE);
        headerStyle.setBackgroundColor(Color.DARK_GRAY);
        headerStyle.setTextColor(Color.WHITE);
        headerStyle.setTransparency(Transparency.OPAQUE);
        return headerStyle;
    }

    protected JRDataSource getDataSource() {
        JRDataSource dataSource = new JRBeanCollectionDataSource(
                SampleDataSet.getListOfLTEData());
        return dataSource;

    }

}
