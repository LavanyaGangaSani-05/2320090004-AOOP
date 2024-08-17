package cloudstorage;

import java.util.HashMap;
import java.util.Map;

public class CloudStorageService {

    private Map<String, String> storage;

    public CloudStorageService() {
        storage = new HashMap<>();
    }

    public String uploadFile(String fileName, String fileContent) {
        storage.put(fileName, fileContent);
        return "File uploaded successfully.";
    }

    public String retrieveFile(String fileName) {
        return storage.get(fileName);
    }

    public String shareFile(String fileName) {
        if (storage.containsKey(fileName)) {
            return "https://sharelink.com/" + fileName;
        }
        return null;
    }

    public static void main(String[] args) {
        CloudStorageService service = new CloudStorageService();
        
        // Uploading files
        System.out.println(service.uploadFile("testFile1.txt", "Content of test file 1"));
        System.out.println(service.uploadFile("testFile2.txt", "Content of test file 2"));
        
        // Retrieving files
        System.out.println("Retrieve testFile1.txt: " + service.retrieveFile("testFile1.txt"));
        
        // Sharing files
        System.out.println("Share link for testFile1.txt: " + service.shareFile("testFile1.txt"));
    }
}
