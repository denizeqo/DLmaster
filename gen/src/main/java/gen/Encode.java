package gen;
import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.PDF417Writer;
import com.google.zxing.pdf417.encoder.Dimensions;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import java.util.Map;
public class Encode {
	 public void generateBarcode(String ansiCode) {
	        try {
	     System.out.println("Initiation started");
	            PDF417Writer pdf417Writer = new PDF417Writer();
	            Dimensions dimensions = new Dimensions(20, 15,20, 15); // minCols, minRows, maxCols, maxRows
	            Map<EncodeHintType, Object> hints = new HashMap();
	            
	            hints.put(EncodeHintType.ERROR_CORRECTION, 7);
	            hints.put(EncodeHintType.PDF417_DIMENSIONS, dimensions);
	            BitMatrix bitMatrix = pdf417Writer.encode(ansiCode, BarcodeFormat.PDF_417, 300, 150, hints);
	            Path outputPath = new File("baasdarrra.png").toPath();
	            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", outputPath);

	            System.out.println("Barcode generated and saved to: " + outputPath);
	            
	            
	        } catch (Exception e) {
	        	System.out.println("barcode did not generate");
	            e.printStackTrace();
	        }
	 }
}
