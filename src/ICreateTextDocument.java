public class ICreateTextDocument implements ICreateDocument{
    private final TextDocument textDocument=new TextDocument();

    @Override
    public IDocument CreateNew() {
        return textDocument;
    }

    @Override
    public IDocument CreateOpen() {
        return textDocument;
    }

    @Override
    public IDocument CreateSave() {
        return textDocument;
    }

    @Override
    public IDocument CreateExit() {
        return textDocument;
    }
}
