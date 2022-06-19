import java.util.Random;

public class Proxy implements Standard{
    //On dois pas instancier l'objet dés le départ
    private StandardImpl1 target;
    @Override
    public void process() {
        System.out.println("Vérification du contexte de sécurité");
        boolean b=new Random().nextBoolean();
        if(b){
            //quant tous est passe bien en ce mement on instancier l'objet
            //c'est ça on utilise le pattern Proxy
            System.out.println("Avant l'appel");
            target=new StandardImpl1();
            target.process();
            System.out.println("Après l'appel");
        }
        else {
            throw new RuntimeException("Forbidden 403");
        }

    }
}
