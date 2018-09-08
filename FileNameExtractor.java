package codewars;

public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        int atIndex = dirtyFileName.indexOf("_")+1;
        int toIndex = dirtyFileName.lastIndexOf(".");
        return dirtyFileName.substring(atIndex, toIndex);
    }
}
