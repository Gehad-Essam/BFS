/**
 * Created by gehad on 4/2/2016.
 */
public class paths {
    public int heur;
    public paths[] availablePaths;
    private String name;

    public paths(int heur,int connectTo,String name){
        this.heur = heur;
        this.availablePaths = new paths[connectTo];
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeur() {
        return heur;
    }

    public paths[] getAvailablePaths() {
        return availablePaths;
    }
    public void setHeur(int heur) {
        this.heur = heur;
    }

    public void setAvailablePaths(paths[] availablePaths) {
        this.availablePaths = availablePaths;
    }


}
