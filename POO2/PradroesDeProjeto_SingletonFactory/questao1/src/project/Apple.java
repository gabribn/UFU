package project;

public class Apple implements FabricanteCelular {
    
    @Override
    public Celular constroiCelular(String modelo){
        if(modelo.equals("iphones")){
            return new IPhoneS();
        }
        return null;
    }
}
