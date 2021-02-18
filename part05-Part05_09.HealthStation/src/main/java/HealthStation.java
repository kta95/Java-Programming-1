public class HealthStation {
    private int weight;
    private int weigh;
    public HealthStation(){
        this.weight=0;
        this.weigh=0;
    }        
    public int weigh(Person person) {
        weigh+=1;
        return this.weight=person.getWeight();
        
    }
    public void feed(Person person){
        weigh(person);
        this.weight++;
        person.setWeight(this.weight);
    }
    public int weighings(){
        
        return weigh;
    }

}
