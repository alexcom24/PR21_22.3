public class ICreateMusicDocument implements ICreateDocument{


    private final MusicDocument musicDocument=new MusicDocument();
    @Override
    public IDocument CreateNew() {
        return musicDocument;
    }

    @Override
    public IDocument CreateOpen() {
        return musicDocument;
    }

    @Override
    public IDocument CreateSave() {
        return musicDocument;
    }

    @Override
    public IDocument CreateExit() {
        return musicDocument;
    }
}
