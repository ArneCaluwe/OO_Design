package template;

public abstract class SwimTemplate  {
    abstract void getInWater();
    abstract void stroke();
    abstract void breath();
    abstract void getOut();

    public int strokesPerBreath(){
        return 1;
    }

    public void swim(){
        getInWater();
        for (int i = 0; i < 4; i++) {
            stroke();
            if(i % strokesPerBreath() ==0)
                breath();
        }
        getOut();
    }
}
