package questao3;

public class DocumentProxy implements Document {
    private theDocument realDocument;
    private User currentUser;

    public DocumentProxy(theDocument realDocument, User user) {
        this.realDocument = realDocument;
        this.currentUser = user;
    }

    public void open() {
        if (currentUser.hasPermission(realDocument)) {
            realDocument.open();
        } else {
            System.out.println("Acesso negado ao documento.");
        }
    }
}
