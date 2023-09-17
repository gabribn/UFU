package questao3;

public class theDocument implements Document {
    private String documentContent;

    public theDocument(String content) {
        this.documentContent = content;
    }

    public void open() {
        System.out.println("Abrindo o documento:\n" + documentContent +"\n");
    }
}
