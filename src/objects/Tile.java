package src.objects;

public class Tile {
    public String attribute; 
    private int id; 
    private int pathId;

    public Tile(int id) {
        this.id = id; 
        if(pathId == -1) { 
            pathId = id; 
        }
    }    

    public void activateAttribute() { 

    }

    public int getId() { 
        return id;
    }
}
