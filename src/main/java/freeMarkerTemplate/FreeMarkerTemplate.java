package freeMarkerTemplate;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import model.*;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeMarkerTemplate {

    private Configuration freemarkerConfiguration;

    public FreeMarkerTemplate() {
        freemarkerConfiguration = new Configuration(Configuration.VERSION_2_3_31);
        freemarkerConfiguration.setDefaultEncoding("UTF-8");
    }

    public String convertToHtml() throws IOException, TemplateException {
        Reader targetReader = new InputStreamReader(getClass()
                .getClassLoader().getResourceAsStream("mortgage_deed.ftl"));
        Map<String, Object> model = new HashMap<>();
        StandardisedMortgageDeed mortgageDeed = mortgageDeed();
        model.put("mortgageDeed", mortgageDeed);
        Template template = new Template("mortgage_deed", targetReader, freemarkerConfiguration);
        String htmlContent = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
        return htmlContent;
    }

    public StandardisedMortgageDeed mortgageDeed(){
        return new StandardisedMortgageDeed(
                "2022-08-05",
                "London",
                10,
                "PN102",
                new Lender("Demo Bank","221 B Baker Street","PQR1237DBANK"),
                "John Smith",
                true,
                "restriction text",
                true,
                "obligation text",
                false,
                "additional provision text",
                deedRows()
        );
    }

    public List<DeedRow> deedRows(){
        List<DeedRow> allDeedRows = new ArrayList<>();
        Borrower borrower1 = new Borrower("John Doe");
        Witness witness1 = new Witness("John Cena","221B Baker Street");
        DeedRow deedRow1 = new DeedRow(borrower1,witness1);
        allDeedRows.add(deedRow1);
        Borrower borrower2 = new Borrower("Karl Peter");
        Witness witness2 = new Witness("John Smith","221 London Bridge");
        DeedRow deedRow2 = new DeedRow(borrower2,witness2);
        allDeedRows.add(deedRow2);
        Borrower borrower3 = new Borrower("Paulo");
        Witness witness3 = new Witness("Sherlock Homes","221B Baker Street London");
        DeedRow deedRow3 = new DeedRow(borrower3,witness3);
        allDeedRows.add(deedRow3);
        return allDeedRows;
    }
}