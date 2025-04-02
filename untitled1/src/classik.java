import java.util.Random;

public class classik {
    private int age;
    private String clan;
    private int height;
    private String beard;
public classik(int height,String clan,String beard,int age){
    this.height=height;
    this.clan=clan;
    this.beard=beard;
    this.age=age;}
    public int mineGems() {
        Random random = new Random();
        return random.nextInt(15) + 1;
    }
    public int drinkBeer(){
    Random random=new Random();
    int beersDrunk=random.nextInt(5)+1;
    return beersDrunk;
    }
    public int getHeight(){return  height;}
    public String getClan(){return clan;}
    public String getBeard(){return beard;}

    public int getAge() {
        return age;
    }
}

