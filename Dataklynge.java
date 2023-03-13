import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Dataklynge {

private ArrayList<Rack> racks = new ArrayList<Rack>();


public Dataklynge(String filNavn){
  
    Scanner filLeser = null;

    try {
        File fil = new File(filNavn); 
        filLeser = new Scanner(fil);
    } catch (FileNotFoundException e) {
        System.out.println("Fant ikke fil");
        System.exit(-1);
    }

    racks = new ArrayList<>();

    LesFraFil(filLeser);

    filLeser.close();
}


    public void LesFraFil(Scanner filLeser){

    while (filLeser.hasNextLine()){
        String linje = filLeser.nextLine();
        String[] info = linje.split(" ");

        if (info.length == 3){
            int antNoder = Integer.parseInt(info[0]);
            int prosessorer = Integer.parseInt(info[1]);
            int minne = Integer.parseInt(info[2]);
        

        for (int i = 0; i < antNoder; i++){
            this.SettNode(new Node(prosessorer, minne));
             }
        }
    }  
 }

public void SettNode(Node nynode){
    
    boolean sattInn = false;
    int teller = 0;

    while (teller < racks.size() && sattInn == false) {
        if (racks.get(teller).harPlass()){
            racks.get(teller).settInn(nynode);;
            sattInn = true;
        }
        teller++;
    }

    if (sattInn != true) {
        Rack nyttrack = new Rack();
            racks.add(nyttrack);
            nyttrack.settInn(nynode);
            
         }   
    }        

    public int antallRacks(){
        return racks.size();
        }


    public int AntProsessorer(){
        int antProsessorer = 0;

    for(int i = 0; i < racks.size(); i++){
        antProsessorer = antProsessorer + racks.get(i).antProsessorer();
        }
    return antProsessorer;
}


    public int noderMedNokMinne(int paakrevdMinne){
        int antallNoder = 0;

    for(int i=0; i < racks.size(); i++){
        antallNoder += racks.get(i).noderMedNokMinne(paakrevdMinne);
         }
    return antallNoder;

    }
}

        
    