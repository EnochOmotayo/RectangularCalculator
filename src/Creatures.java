public class Creatures{

    String[] carnivore;
    String[] omnivoree;
    String[] herbivore;
    String meat;
    String herb;
    String both;

    public Creatures(){
        
    }

    public Creatures(String meat){
        this.meat = meat;

    }

    public Creatures(String meat, String herb , String both){
        this.meat = meat;
        this.herb = herb;
        this.both = both;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getHerb() {
        return herb;
    }

    public void setHerb(String herb) {
        this.herb = herb;
    }

    public String getBoth() {
        return both;
    }

    public void setBoth(String both) {
        this.both = both;
    }


    public void setcarnivore(String[] carnos){

        carnivore = carnos;

    }

    public String[] getCarnivore() {
        return carnivore;
    }

    public void setHerbivore(String[] herbis) {
        herbivore = herbis;
    }

    public String[] getHerbivore() {
        return herbivore;
    }
    
    public void setOmnivoree(String[] omnis) {
        omnivoree = omnis;
    }

    public String[] getOmnivoree() {
        return omnivoree;
    }
}