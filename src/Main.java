public class Main {
    public static void main(String[] args) {
        ICreateDocument createDocument=new ICreateTextDocument();
        IDocument document=createDocument.CreateNew();
         document=createDocument.CreateOpen();
         document=createDocument.CreateSave();
         document=createDocument.CreateExit();
         System.out.println(document);


    }
}
