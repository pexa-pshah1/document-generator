package openHtmltoPdfWithFreemarkerTemplate;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import freeMarkerTemplate.FreeMarkerTemplate;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class Controller {

    public static void main(String[] args) throws Exception {
        FreeMarkerTemplate template = new FreeMarkerTemplate();
        String htmlContent = template.convertToHtml();
        String baseUrl = "file:///<absolute path to style.css>";
        String outputPdf = "./standardised-mortgage-deed.pdf";

        try (OutputStream outputStream = new FileOutputStream(outputPdf)) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.withHtmlContent(htmlContent,baseUrl);
            builder.toStream(outputStream);
            builder.run();
            System.out.println("PDF creation completed");
        }
    }
}
