
public class FabricanteCelularSingleton {
    
    private static FabricanteCelular apple;
    private static FabricanteCelular samsung;
    
    
    public static FabricanteCelular getInstance(String tipo){
        
        if(tipo.equals("apple")){
            if(apple == null)
                apple = new Apple();
            return apple;
        }
        else {
            if(samsung == null)
                samsung = new Samsung();
            return samsung;
        }
        
        
    }
    
}
