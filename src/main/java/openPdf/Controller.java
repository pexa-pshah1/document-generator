package openPdf;

import com.lowagie.text.DocumentException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Controller {

    public static void main(String[] args) throws IOException, DocumentException {

        File inputHTML = new File("/Users/pshah1/Projects/spike/document-generator/src/main/resources/input.html");
        Document document = Jsoup.parse(inputHTML, "UTF-8");

        String outputPdf = "./generated-file-openpdf.pdf";
        try (OutputStream outputStream = new FileOutputStream(outputPdf)) {
            ITextRenderer renderer = new ITextRenderer();
            SharedContext sharedContext = renderer.getSharedContext();
            sharedContext.setPrint(true);
            sharedContext.setInteractive(false);
            sharedContext.getTextRenderer().setSmoothingThreshold(0);

            renderer.setDocumentFromString(document.html());
            renderer.layout();
            renderer.createPDF(outputStream);
            System.out.println("PDF creation completed");
        }



    }
}
