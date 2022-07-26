package openHtmltoPdf;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.FileSystems;


public class Controller {

    public static void main(String[] args) throws Exception {

        File inputHTML = new File("/Users/pshah1/Projects/spike/document-generator/src/main/resources/input.html");

        String outputPdf = "./generated-file-openHtmlToPdf.pdf";

        try (OutputStream outputStream = new FileOutputStream(outputPdf)) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.withUri(inputHTML.toURI().toString());
            builder.toStream(outputStream);
            builder.run();
            System.out.println("PDF creation completed");
        }
    }
}
