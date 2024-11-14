import java.util.ArrayList;

public class Foret {
    private int dimension;
    private Object [][] terrain;
    public Foret(int x){
        dimension = x;
        terrain = new Object [dimension][dimension];
    }

    public boolean placer(Object o){
        int x = (int)(Math.random()*(dimension));
        int y = (int)(Math.random()*(dimension));
        if (terrain[x][y]==null){
            terrain[x][y]=o;
        }

        return (terrain[x][y] == o);
    }

    public ArrayList<Champignon> ramasserChampignons(){
        ArrayList<Champignon> list = new ArrayList<Champignon>();
        for (int i=0;i<dimension;i++){
            for (int j=0;j<dimension;j++){
                if (terrain[i][j] instanceof Champignon && !(terrain[i][j] instanceof Toxique)){
                    list.add((Champignon)(terrain[i][j]));
                    terrain[i][j]=null;
                }
            }
        }
        return list;
    }

    public ArrayList<Ramassable> ramasserTout(){
        ArrayList<Ramassable> list = new ArrayList<Ramassable>();
        for (int i=0;i<dimension;i++){
            for (int j=0;j<dimension;j++){
                if (terrain[i][j] instanceof Ramassable){
                    list.add((Ramassable)(terrain[i][j]));
                    terrain[i][j]=null;
                }
            }
        }
        return list;
    }

    public String toString(){
        String s=" ";
        for (int i = 0; i<dimension;i++){
            s+="_";
        }
        s+=" \n";
        for (int i = 0; i<dimension; i++){
            s+="|";
            for (int j = 0; j<dimension; j++){
                if (terrain[i][j]==null){
                    s+=" ";
                }
                else{
                    String a = (terrain[i][j]).toString();
                    s+=a.charAt(0);
                }
            }
            s+="|\n";
        }
        s+=" ";
        for (int i = 0; i<dimension;i++){
            s+="_";
        }
        s+=" ";
        return s;
    }

}
