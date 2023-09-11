public class Database {

    private Superhero[] helteListe;
    int count = 0;

    public Database() {
        this.helteListe = new Superhero[5];
    }



    public void tilføjSuperhelt(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        helteListe[count++] = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
    }
    public Superhero getHero1(){
        return helteListe[0];
    }
    public Superhero getHero2(){
        return helteListe[1];
    }
    public Superhero getHero3(){
        return helteListe[2];
    }
    public Superhero getHero4(){
        return helteListe[3];
    }
    public Superhero getHero5(){
        return helteListe[4];
    }


}
