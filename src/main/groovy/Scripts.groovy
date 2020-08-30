class Scripts {

    static def getSchemaId(Editor _editor) {
        def path = _editor.getVirtualFile().getPath().replace(_editor.getProject().getBaseDir().getPath() + '/', "");
        if (path.contains("src")) {
            def index = path.indexOf("src");
            return path.substring(index + 4);
        }
        else {
            return path;
        }
    }

}
