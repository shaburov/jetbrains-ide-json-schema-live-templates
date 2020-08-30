class Editor {

    def file = new File(".")
    def project = new Project()

    def withVirtualFile(String path) {
        file = new File(path)
        return this
    }

    def withProjectBaseDir(String path) {
        project = new Project().withBaseDir(path)
        return this
    }

    def getVirtualFile() {
        return file
    }

    def getProject() {
        return project
    }

    class Project {

        def baseDir = new BaseDir()

        def withBaseDir(String path) {
            baseDir = new BaseDir().withPath(path)
            return this
        }

        def getBaseDir() {
            return baseDir
        }

        class BaseDir {

            def path = ""

            def withPath(String str) {
                path = str
                return this
            }

            def getPath() {
                return path
            }


        }

    }
}
