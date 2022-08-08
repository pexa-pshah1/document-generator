# document generator (PDF)
This is the POC for the two tools we analysed for the comparative analysis to generate PDF from HTML.

#Language used
java

#Build Tool 
Gradle

#Technology
1. OpenHTMLToPdf
2. OpenPDF
3. FreemarkerTemplate with OpenHTMLToPdf
   This will create template based on dynamic data and render html and convert it to Pdf with expected view
   Data values for template are hardcoded now for spike purpose


#Steps to run project
1. git clone <project url>
2. Build project: gradle build
3. Provide input HTML path in Controller. (Harcoded now for spike purposes) 
4. Run Controller class directly from intellij 


