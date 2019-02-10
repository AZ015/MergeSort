import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SplitBigFile {
    private List<File> files;
    private ReadFile readFile;
    MergeSort sort;
    private boolean asc;


    public SplitBigFile(List<File> files, MergeSort sort, boolean asc) {
        this.files = files;
        this.sort = sort;
        this.asc = asc;
    }

    public long bestSizeBlocks(File filetobesorted) {
        long sizeFile = filetobesorted.length();
        final int MAXTEMPFILES = 1024;
        long blockSize = sizeFile / MAXTEMPFILES;
        long freeMemory = Runtime.getRuntime().freeMemory();
        if (blockSize < freeMemory / 2)
            blockSize = freeMemory / 3;
        else {
            if (blockSize >= freeMemory)
                System.err.println("Не хватает памяти");
        }
        return blockSize;
    }

    public List<File> splitFiles(File file) throws IOException {
        long blockSize = bestSizeBlocks(file);
        if (file.length() < blockSize) {
            files.add(file);
        } else {
            files.add((File) sortInBatch(file, asc));
        }
        return files;
    }

    public List<File> sortInBatch(File file, boolean asceding) throws IOException {
        List<File> files = new ArrayList<>();
        long blocksize = bestSizeBlocks(file);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> data = new ArrayList<>();
            String str = "";
            long currentblocksize = 0;
            while ((str = reader.readLine()) != null && currentblocksize < blocksize) {
                data.add(str);
                currentblocksize += str.length();
            }
            files.add(sortAndSave(data, asc));
            data.clear();
        }
        return files;
    }


    public File sortAndSave(List<String> tempList, boolean asceding) throws IOException {
        //sort(tempList, asceding);
        File tempFile = File.createTempFile("sort", "file");
        tempFile.deleteOnExit();

        try (BufferedWriter fbw = new BufferedWriter(new FileWriter(tempFile))) {
            for (String data : tempList) {
                fbw.write(data);
                fbw.newLine();
            }
        }
        return tempFile;
    }

    public int mergeSortedFiles(List<File> files, File outputfile, boolean asc) {
       return 1;
    }
}
