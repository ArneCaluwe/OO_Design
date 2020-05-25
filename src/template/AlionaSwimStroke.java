package template;

public class AlionaSwimStroke extends SwimTemplate {
    @Override
    void getInWater() {
        System.out.println("Bommetjeeeuh");
    }

    @Override
    void stroke() {
        System.out.println("Plets Plets Plets, op zijn hondjes");
    }

    @Override
    void breath() {
        System.out.println("Proest, kuch, blub");
    }

    @Override
    void getOut() {
        System.out.println("Sierlijk en elegant, met heupbewegingen om flauw van te worden. Maar vooral content dat ze uit het water kan wandelt ze eruit");
    }
}
