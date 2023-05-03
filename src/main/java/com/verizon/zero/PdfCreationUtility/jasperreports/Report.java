package com.verizon.zero.PdfCreationUtility.jasperreports;

import java.awt.Color;

import ar.com.fdvs.dj.domain.DynamicReport;
import ar.com.fdvs.dj.domain.builders.DynamicReportBuilder;
import ar.com.fdvs.dj.domain.chart.DJChart;
import ar.com.fdvs.dj.domain.chart.DJChartOptions;
import ar.com.fdvs.dj.domain.chart.builder.*;
import ar.com.fdvs.dj.domain.chart.plot.DJAxisFormat;
import ar.com.fdvs.dj.domain.constants.Font;
import ar.com.fdvs.dj.domain.entities.columns.PropertyColumn;

/**
 * This class contain the report builder for various types of charts such as Stacked Area Chart, Bar Charts,
 * Pie Charts along with the setup and configuration
 */
public class Report extends ReportBase {

    private DynamicReportBuilder builder;

    public Report() {
        builder = new DynamicReportBuilder();

        builder.addColumn(modelCol);
        builder.addColumn(mfgCol);
        builder.addColumn(qtyCol);
        builder.addColumn(yearCol);

        builder.setUseFullPageWidth(true);
        builder.setDefaultStyles(null, null, getHeaderStyle(), null);
    }

    public DJChart createBarChart() {

        DJAxisFormat categoryAxisFormat = new DJAxisFormat("category");
        categoryAxisFormat.setLabelFont(Font.ARIAL_SMALL);
        categoryAxisFormat.setLabelColor(Color.DARK_GRAY);
        categoryAxisFormat.setTickLabelFont(Font.ARIAL_SMALL);
        categoryAxisFormat.setTickLabelColor(Color.DARK_GRAY);
        categoryAxisFormat.setTickLabelMask("");
        categoryAxisFormat.setLineColor(Color.DARK_GRAY);

        DJAxisFormat valueAxisFormat = new DJAxisFormat("SINR(db)");
        valueAxisFormat.setLabelFont(Font.ARIAL_SMALL);
        valueAxisFormat.setLabelColor(Color.DARK_GRAY);
        valueAxisFormat.setTickLabelFont(Font.ARIAL_SMALL);
        valueAxisFormat.setTickLabelColor(Color.DARK_GRAY);
        valueAxisFormat.setTickLabelMask("#,##0.0");
        valueAxisFormat.setLineColor(Color.DARK_GRAY);

        DJChart chart = new DJStackedBar3DChartBuilder()
                .setX(20).setY(10).setWidth(500)
                .setHeight(250).setCentered(false)
                .setBackColor(Color.LIGHT_GRAY).setShowLegend(true)
                .setPosition(DJChartOptions.POSITION_FOOTER)
                .setTitle("LTE SINR (Verizon)").setTitleColor(Color.DARK_GRAY)
                .setTitleFont(Font.ARIAL_BIG_BOLD)
                .setSubtitle("Standard Deviation With Overall Average")
                .setSubtitleColor(Color.DARK_GRAY)
                .setSubtitleFont(Font.GEORGIA_SMALL_BOLD)
                .setLegendColor(Color.DARK_GRAY)
                .setLegendFont(Font.ARIAL_SMALL_BOLD)
                .setLegendBackgroundColor(Color.WHITE)
                .setLegendPosition(DJChartOptions.EDGE_BOTTOM)
                .setTitlePosition(DJChartOptions.EDGE_TOP)
                .setLineStyle(DJChartOptions.LINE_STYLE_DOTTED)
                .setLineWidth(1)
                .setLineColor(Color.DARK_GRAY).setPadding(5)
                .setCategory((PropertyColumn) yearCol).addSerie(qtyCol)
                .setShowLabels(false).setCategoryAxisFormat(categoryAxisFormat)
                .setValueAxisFormat(valueAxisFormat).build();
        return chart;
    }

    public DJChart createAreaChart() {

        DJAxisFormat categoryAxisFormat = new DJAxisFormat("category");
        categoryAxisFormat.setLabelFont(Font.ARIAL_SMALL);
        categoryAxisFormat.setLabelColor(Color.DARK_GRAY);
        categoryAxisFormat.setTickLabelFont(Font.ARIAL_SMALL);
        categoryAxisFormat.setTickLabelColor(Color.DARK_GRAY);
        categoryAxisFormat.setTickLabelMask("");
        categoryAxisFormat.setLineColor(Color.DARK_GRAY);

        DJAxisFormat valueAxisFormat = new DJAxisFormat("SINR(db)");
        valueAxisFormat.setLabelFont(Font.ARIAL_SMALL);
        valueAxisFormat.setLabelColor(Color.DARK_GRAY);
        valueAxisFormat.setTickLabelFont(Font.ARIAL_SMALL);
        valueAxisFormat.setTickLabelColor(Color.DARK_GRAY);
        valueAxisFormat.setTickLabelMask("#,##0.0");
        valueAxisFormat.setLineColor(Color.DARK_GRAY);

        DJChart chart = new DJAreaChartBuilder()
                .setX(20).setY(10).setWidth(500)
                .setHeight(250).setCentered(false)
                .setBackColor(Color.LIGHT_GRAY).setShowLegend(true)
                .setPosition(DJChartOptions.POSITION_FOOTER)
                .setTitle("LTE SINR (Verizon)").setTitleColor(Color.DARK_GRAY)
                .setTitleFont(Font.ARIAL_BIG_BOLD)
                .setSubtitle("Standard Deviation With Overall Average")
                .setSubtitleColor(Color.DARK_GRAY)
                .setSubtitleFont(Font.GEORGIA_SMALL_BOLD)
                .setLegendColor(Color.DARK_GRAY)
                .setLegendFont(Font.ARIAL_SMALL_BOLD)
                .setLegendBackgroundColor(Color.WHITE)
                .setLegendPosition(DJChartOptions.EDGE_BOTTOM)
                .setTitlePosition(DJChartOptions.EDGE_TOP)
                .setLineStyle(DJChartOptions.LINE_STYLE_DOTTED)
                .setLineWidth(1)
                .setLineColor(Color.DARK_GRAY).setPadding(5)
                .setCategory((PropertyColumn) yearCol).addSerie(qtyCol)
                .setValueAxisFormat(valueAxisFormat).build();
        return chart;
    }

    private DJChart createStackAreaChart() {

        DJAxisFormat categoryAxisFormat = new DJAxisFormat("category");
        categoryAxisFormat.setLabelFont(Font.ARIAL_SMALL);
        categoryAxisFormat.setLabelColor(Color.DARK_GRAY);
        categoryAxisFormat.setTickLabelFont(Font.ARIAL_SMALL);
        categoryAxisFormat.setTickLabelColor(Color.DARK_GRAY);
        categoryAxisFormat.setTickLabelMask("");
        categoryAxisFormat.setLineColor(Color.DARK_GRAY);

        DJAxisFormat valueAxisFormat = new DJAxisFormat("SINR(db)");
        valueAxisFormat.setLabelFont(Font.ARIAL_SMALL);
        valueAxisFormat.setLabelColor(Color.DARK_GRAY);
        valueAxisFormat.setTickLabelFont(Font.ARIAL_SMALL);
        valueAxisFormat.setTickLabelColor(Color.DARK_GRAY);
        valueAxisFormat.setTickLabelMask("#,##0.0");
        valueAxisFormat.setLineColor(Color.DARK_GRAY);

        DJChart chart = new DJStackedAreaChartBuilder()
                .setX(20).setY(10).setWidth(300)
                .setHeight(150).setCentered(false)
                .setBackColor(Color.decode("#0000FF"))
                .setPosition(DJChartOptions.POSITION_FOOTER)
                .setTitle("LTE SINR (AT&T)").setTitleColor(Color.DARK_GRAY)
                .setTitleFont(Font.ARIAL_BIG_BOLD)
                .setSubtitle("Standard Deviation With Overall Average")
                .setSubtitleColor(Color.DARK_GRAY)
                .setSubtitleFont(Font.GEORGIA_SMALL_BOLD)
                .setLegendColor(Color.DARK_GRAY)
                .setLegendFont(Font.ARIAL_SMALL_BOLD)
                .setLegendBackgroundColor(Color.WHITE)
                .setLegendPosition(DJChartOptions.EDGE_BOTTOM)
                .setTitlePosition(DJChartOptions.EDGE_TOP)
                .setLineStyle(DJChartOptions.LINE_STYLE_DOTTED)
                .setLineWidth(1)
                .setLineColor(Color.DARK_GRAY).setPadding(5)
                .setCategory((PropertyColumn) yearCol).addSerie(qtyCol)
                .setValueAxisFormat(valueAxisFormat).build();
        return chart;
    }

    private DJChart createStackAreaChart2() {

        DJAxisFormat categoryAxisFormat = new DJAxisFormat("category");
        categoryAxisFormat.setLabelFont(Font.ARIAL_SMALL);
        categoryAxisFormat.setLabelColor(Color.DARK_GRAY);
        categoryAxisFormat.setTickLabelFont(Font.ARIAL_SMALL);
        categoryAxisFormat.setTickLabelColor(Color.DARK_GRAY);
        categoryAxisFormat.setTickLabelMask("");
        categoryAxisFormat.setLineColor(Color.DARK_GRAY);

        DJAxisFormat valueAxisFormat = new DJAxisFormat("SINR(db)");
        valueAxisFormat.setLabelFont(Font.ARIAL_SMALL);
        valueAxisFormat.setLabelColor(Color.DARK_GRAY);
        valueAxisFormat.setTickLabelFont(Font.ARIAL_SMALL);
        valueAxisFormat.setTickLabelColor(Color.DARK_GRAY);
        valueAxisFormat.setTickLabelMask("#,##0.0");
        valueAxisFormat.setLineColor(Color.DARK_GRAY);

        DJChart chart = new DJStackedAreaChartBuilder()
                .setBackColor(Color.decode("#0000FF")).setShowLegend(true)
                .setX(20).setY(10).setWidth(300)
                .setHeight(150).setCentered(false)
                .setPosition(DJChartOptions.POSITION_FOOTER)
                .setTitle("LTE SINR (Verizon)").setTitleColor(Color.DARK_GRAY)
                .setTitleFont(Font.ARIAL_BIG_BOLD)
                .setSubtitle("Standard Deviation With Overall Average")
                .setSubtitleColor(Color.DARK_GRAY)
                .setSubtitleFont(Font.GEORGIA_SMALL_BOLD)
                .setLegendColor(Color.DARK_GRAY)
                .setLegendFont(Font.ARIAL_SMALL_BOLD)
                .setLegendBackgroundColor(Color.WHITE)
                .setLegendPosition(DJChartOptions.EDGE_BOTTOM)
                .setTitlePosition(DJChartOptions.EDGE_TOP)
                .setLineStyle(DJChartOptions.LINE_STYLE_DOTTED)
                .setLineWidth(1)
                .setLineColor(Color.DARK_GRAY).setPadding(5)
                .setCategory((PropertyColumn) yearCol).addSerie(qtyCol)
                .setValueAxisFormat(valueAxisFormat).build();
        return chart;
    }

    public DJChart createPieChart() {
        DJChart chart = new DJPieChartBuilder()
                .setX(40).setY(20).setWidth(500)
                .setHeight(250).setCentered(false)
                .setBackColor(Color.LIGHT_GRAY).setShowLegend(true)
                .setPosition(DJChartOptions.POSITION_FOOTER)
                .setTitle("LTE SINR (Verizon)").setTitleColor(Color.DARK_GRAY)
                .setTitleFont(Font.ARIAL_BIG_BOLD)
                .setSubtitle("Standard Deviation With Overall Average")
                .setSubtitleColor(Color.DARK_GRAY)
                .setSubtitleFont(Font.GEORGIA_SMALL_BOLD)
                .setLegendColor(Color.DARK_GRAY)
                .setLegendFont(Font.ARIAL_SMALL_BOLD)
                .setLegendBackgroundColor(Color.WHITE)
                .setLegendPosition(DJChartOptions.EDGE_BOTTOM)
                .setTitlePosition(DJChartOptions.EDGE_TOP)
                .setLineStyle(DJChartOptions.LINE_STYLE_DOTTED)
                .setLineWidth(1)
                .setLineColor(Color.DARK_GRAY).setPadding(5)
                .setKey((PropertyColumn) modelCol).addSerie(qtyCol)
                .setCircular(true).build();
        return chart;
    }

    public DynamicReport getPieReport() {
        builder.addChart(createPieChart());
        return builder.build();
    }
    public DynamicReport getBarReport() {
        builder.addChart(createBarChart());
        return builder.build();
    }

    public DynamicReport getAreaReport() {
        builder.addChart(createAreaChart());
        return builder.build();
    }
    public DynamicReport getStackedAreaReport() {
        builder.addChart(createStackAreaChart());
        return builder.build();
    }

    public DynamicReport getCombination() {
        builder.addChart(createStackAreaChart());
        builder.addChart(createStackAreaChart2());
        builder.addChart(createStackAreaChart());
        return builder.build();
    }
}