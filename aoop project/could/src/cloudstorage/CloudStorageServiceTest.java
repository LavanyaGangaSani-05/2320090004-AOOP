package cloudstorage;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CloudStorageServiceTest {

    private CloudStorageService cloudStorageService;

    @Before
    public void setUp() {
        cloudStorageService = new CloudStorageService();
    }

    @Test
    public void testFileUpload() {
        String fileName = "testFile.txt";
        String fileContent = "This is a test file.";

        String uploadStatus = cloudStorageService.uploadFile(fileName, fileContent);

        assertEquals("File uploaded successfully.", uploadStatus);
    }

    @Test
    public void testFileRetrieval() {
        String fileName = "testFile.txt";
        String expectedContent = "This is a test file.";

        cloudStorageService.uploadFile(fileName, expectedContent);
        String retrievedContent = cloudStorageService.retrieveFile(fileName);

        assertEquals(expectedContent, retrievedContent);
    }

    @Test
    public void testFileSharing() {
        String fileName = "testFile.txt";
        cloudStorageService.uploadFile(fileName, "This is a test file.");

        String shareableLink = cloudStorageService.shareFile(fileName);

        assertNotNull(shareableLink);
        assertTrue(shareableLink.contains("sharelink.com/"));
    }
}
