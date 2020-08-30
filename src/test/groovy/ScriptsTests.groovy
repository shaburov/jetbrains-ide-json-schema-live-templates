import org.junit.Assert
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ScriptsTests {

    @Test
    @DisplayName("Get schema id with src folder")
    void test_123() {
        def editor = new Editor()
                .withVirtualFile("/home/user/project/src/service/api/v1/recourse/schemas/file.json")
                .withProjectBaseDir("/home/user/project")
        String actId = Scripts.getSchemaId(editor)
        Assert.assertEquals("service/api/v1/recourse/schemas/file.json", actId)
    }

    @Test
    @DisplayName("Get schema id without src folder")
    void test_1232() {
        def editor = new Editor()
                .withVirtualFile("/home/user/project/without/service/api/v1/recourse/schemas/file.json")
                .withProjectBaseDir("/home/user/project")
        String actId = Scripts.getSchemaId(editor)
        Assert.assertEquals("without/service/api/v1/recourse/schemas/file.json", actId)
    }

}
