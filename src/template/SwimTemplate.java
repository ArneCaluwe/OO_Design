package template;

public abstract class SwimTemplate  {
    abstract void getInWater();
    abstract void stroke();
    abstract void breath();
    abstract void getOut();

    public void swim(){
        getInWater();
        for (int i = 0; i < 4; i++) {
            stroke();
            breath();
        }
        getOut();
    }
}
