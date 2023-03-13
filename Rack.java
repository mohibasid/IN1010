
public class Rack {
    
    private Node[] noder = new Node[12];


   public void settInn(Node enNode){
       boolean sattInn = false;
       int teller = 0;
    
    while (teller < noder.length && sattInn == false){
        if (noder[teller] == null){
            noder[teller] = enNode;
            sattInn = true;
            }

        teller ++;
    }
}

    public Boolean harPlass(){
        int teller = 0;
        boolean ledigPlass = false;
        while (teller < noder.length && ledigPlass == false){
            if (noder[teller] == null){
                return ledigPlass = true;
            }
            teller++;
        }
        
        return ledigPlass;

    }

    public int antProsessorer(){
       
        int antProsessorer = 0;
   
        for (Node node : noder){
            if (node!=null){
                antProsessorer += node.hentProsessorer();
        }
    }
    return antProsessorer;
}

public int noderMedNokMinne(int paakrevdMinne){
    int teller = 0;

    for (Node node : noder){
        if(node != null && node.hentMinne()>= paakrevdMinne){
            teller++;
        }
    }
    return teller;
    }

}


   

    


