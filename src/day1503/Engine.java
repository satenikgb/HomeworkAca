package day1503;

public class Engine {
    private int horsepow;
    private int millage;
    private int weight;
    public Engine(){}
    public Engine(int horsepow, int millage, int weight){
        this.horsepow=horsepow;
        this.millage=millage;
        this.weight=weight;
    }

    public int getHorsepow() {
        return horsepow;
    }

    public void setHorsepow(int horsepow) {
        this.horsepow = horsepow;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int hushCode(){
        int hash=1;
        hash=hash*11+millage;
        hash=hash*11+horsepow;
        hash=hash*11+weight;
        return hash;
    }
    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || o.getClass()!=this.getClass()){
            return false;
        }
        Engine e=(Engine) o;
        return (this.weight==e.weight &&
                this.millage==e.millage &&
                this.horsepow==e.horsepow);
    }

    public static void main(String[] args) {
        Engine e1=new Engine(12,25,45);
        Engine e2=new Engine(12,25,45);
        System.out.println(e1.equals(e2));
    }

}
