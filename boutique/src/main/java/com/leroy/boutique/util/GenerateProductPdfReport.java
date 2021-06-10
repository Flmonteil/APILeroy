/*package com.leroy.boutique.util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GenerateProductPdfReport {

    private static final Logger logger = LoggerFactory.getLogger(GenerateProductPdfReport.class);
    public static ByteArrayInputStream productReport(Product pro) {

        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            PdfWriter.getInstance(document, out);
            document.open();
            document.add(new Paragraph("Nom du produit: " + pro.getName()));
            if(pro.getMainPicture()!= null) {
                Picture pics = pro.getMainPicture();
                Image image = Image.getInstance(pics.getUrl());
                image.setAbsolutePosition(100, 350);
                document.add(image);
            }
            document.add(new Paragraph("Description du produit : " + pro.getDescription()));
            document.add(new Paragraph("Prix du produit : " + pro.getPrice()));
            document.add(new Paragraph("Catégorie : " + pro.getCategory().getName()));
            document.add(new Paragraph("Fournisseur : " + pro.getSupplier().getName()));
            document.close();

        } catch (DocumentException | IOException ex) {
            logger.error("Error occurred: {0}", ex);
        }

        return new ByteArrayInputStream(out.toByteArray());
    }
   
}
*/