PdfCreationUtility
----------------------------

This application contains APIs used to convert the input values into the required PDF format using different Java Libraries.

Dependencies used in the Java application are:
1) Dynamic Jasper
    - The output PDF file for this API will be generated in the resources/jasperoutput folder as: [highcharts_output.pdf](ironbox%2Fhighcharts_output.pdf)
2) IronBoxPDF
    - The output PDF file for this API will be generated in the resources/ironbox folder as: [jasper_output.pdf](jasperoutput%2Fjasper_output.pdf)


The application can be run through the main class:
PdfCreationUtilityApplication

Swagger Documentation has been setup for this application.
The URL to view the Swagger APIs:
http://localhost:8090/swagger-ui/index.html

Note: To add advanced chart formatting for Jasper Reports chart,
the jrxml file needs to be created and the chart should be formatted using JasperSoft studio which is a reporting tool equipment for doing the process.
The sample jrxml files are present in the resources/samplejasperjrxmlfiles for reference