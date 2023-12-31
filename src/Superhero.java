public class Superhero {

    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private String strength;

    public Superhero(String name, String realName, String superPower, int yearCreated, String isHuman, String strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getRealName(){
        return realName;
    }

    public String getSuperPower(){
        return superPower;
    }

    public int getYearCreated(){
        return yearCreated;
    }

    public String getIsHuman(){
        return isHuman;
    }

    public String getStrength(){
        return strength;
    }

    public void setName(String n) {
            name = n;
    }

    public void setRealName(String r) {
            realName = r;
    }

    public void setSuperPower(String s) {
        superPower = s;
    }

    public void setYearCreated(int y) {
        yearCreated = y;
    }

    public void setIsHuman(String i) {
        isHuman = i;
    }

    public void setStrength(String s) {
        strength = s;
    }

    public String toString() {
        return "Superhelte navn: " + name + '\n' +
                "Virkelige navn: " + realName + '\n' +
                "Superkraft: " + superPower + '\n' +
                "Oprindelsesår: " + yearCreated + '\n'+
                "Er superhelten et menneske? " + isHuman + '\n' +
                "Styrke: " + strength  + '\n';
    }
}