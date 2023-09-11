public class Database {

    private Superhero[] helteListe;
    int count = 0;

    public Database() {
        this.helteListe = new Superhero[5];
    }

    public void tilføjSuperhelt(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        helteListe[count++] = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
    }

}
