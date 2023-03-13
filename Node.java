public class Node {

private int AntProsessorer;
private int minnestorrelse;


public Node(int AntPros, int MinneStr){
    AntProsessorer = AntPros;
    minnestorrelse = MinneStr;
}


public int hentProsessorer(){
    return AntProsessorer;
}

public int hentMinne(){
    return minnestorrelse;

    }
}

