package questao3;
/* sistema de gerenciamento de acesso a documentos*/
public class Main {
    public static void main(String[] args) {
        theDocument sensitiveDocument = new theDocument("Conteúdo confidencial...");
        
        User user1 = new User("Alexandre", "admin");
        User user2 = new User("Roberto", "notAdmin");
        
        Document documentProxy1 = new DocumentProxy(sensitiveDocument, user1);
        Document documentProxy2 = new DocumentProxy(sensitiveDocument, user2);
        
        System.out.println("User 1(Alexandre):");
        documentProxy1.open();
        System.out.println("User 2(Roberto):");
        documentProxy2.open();
    }
}
