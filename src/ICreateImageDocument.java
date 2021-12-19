public class ICreateImageDocument implements ICreateDocument{
    private final ImageDocument imageDocument=new ImageDocument();

    @Override
    public IDocument CreateNew() {
        return imageDocument;
    }

    @Override
    public IDocument CreateOpen() {
        return imageDocument;
    }

    @Override
    public IDocument CreateSave() {
        return imageDocument;
    }

    @Override
    public IDocument CreateExit() {
        return imageDocument;
    }
}
