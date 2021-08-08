package hu.ulyssys.java.course.javaee.demo.vehicle.service.impl;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import hu.ulyssys.java.course.javaee.demo.vehicle.entity.Car;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.CarService;
import hu.ulyssys.java.course.javaee.demo.vehicle.service.PDFExportService;

import javax.inject.Inject;
import java.io.*;

public class PDFExportServiceImpl implements PDFExportService {

    @Inject
    private CarService carService;

    @Override
    public InputStream processExport() {
        try {
            Document document = new Document();
            //memoriaba betoltsuk a fajl tartalmat
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            PdfWriter.getInstance(document, stream);
            document.open();
            for (Car car: carService.getAll()) {
                document.add(new Paragraph("Id: "+car.getId()+", gyarto: "+car.getManufacturer()+", tipus: "+car.getType()));
            }
            Chunk chunk = new Chunk("European Business Award!");
            chunk.setAnchor("http://itextpdf.com/blog/european-business-award-kick-ceremony");
            document.add(chunk);
            document.close();
            return new ByteArrayInputStream(stream.toByteArray());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
