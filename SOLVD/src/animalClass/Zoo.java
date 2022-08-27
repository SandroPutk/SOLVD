package animalClass;

public class Zoo {
    private Vivarium[] vivarry = new Vivarium[3];
    private int area;

    public Zoo(int area, Vivarium[] galiebi){
        this.area = area;
        this.vivarry = galiebi;
    }

    public void addVivaria(Vivarium galia){
        for(int i = 0; i < vivarry.length; i++ ){
            if(vivarry[i] == null){
                vivarry[i] = galia;
                break;
            }
        }
    }
    public void removeVivaria(Vivarium galia){
        for (int i = 0; i < vivarry.length; i++) {
            if(vivarry[i].getType() == galia.getType()){
                vivarry[i] = null;
            }
        }
    }
}