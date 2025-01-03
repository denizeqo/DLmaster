package pdf417gen;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.PDF417Writer;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Data to encode
        final String value = "@\n"
                + "\n"
                + "ANSI 636001030302DL00410275ZN03160070DLDCAE   \n"
                + "DCBNONE      \n"
                + "DCDNONE \n"
                + "DBA10162026\n"
                + "DCSZEQO                     \n"
                + "DCTTEST                     \n"
                + "DBD06132018\n"
                + "DBB10161986\n"
                + "DBC1\n"
                + "DAYBLU\n"
                + "DAU511   \n"
                + "DAG36 BENTON AVE            \n"
                + "DAIMONTICELLO          \n"
                + "DAJNY\n"
                + "DAK12701  \n"
                + "DAQ975725861\n"
                + "DCFFULWG3LIYY\n"
                + "DCGUSA\n"
                + "DDAF\n"
                + "DDB09282017\n"
                + "DDD0\n"
                + "ZNZNAZEQO@TEST           \n"
                + "ZNBHUTYK$YDMZMN/U`SABXCXZ>2IF.1_NKY2ZP4W***";

        // File path to save the barcode image
        final String filePath = "src/qrgend/barcode.png";

        try {
            // Create a PDF417Writer instance
            PDF417Writer writer = new PDF417Writer();

            // Set encoding hints (including error correction level)
            Map<EncodeHintType, Object> hints = new HashMap<>();
            hints.put(EncodeHintType.ERROR_CORRECTION, 6);
            // Generate the barcode BitMatrix
            BitMatrix matrix = writer.encode(value, BarcodeFormat.PDF_417, 300, 150, hints);

            // Save the barcode image to a file
            Path path = FileSystems.getDefault().getPath(filePath);
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);

            System.out.println("Barcode generated successfully: " + filePath);
        } catch (WriterException | IOException e) {
            System.err.println("Error while generating barcode: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
