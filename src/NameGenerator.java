import java.util.Random;

/**
 * Created by Dominik on 17.12.2016.
 */
public class NameGenerator {
    private String[] prefixtable = {"Pref1", "Pref2", "Pref3"};
    private String[] sufixtable = {"Suf1", "Suf2", "Suf3"};

    public NameGenerator() {
    }

    public String[] getPrefixtable() {
        return prefixtable;
    }

    public String[] getSufixtable() {
        return sufixtable;
    }

    public void generate() {
        StringBuilder name = new StringBuilder();
        name.append(prefixtable[new Random().nextInt(prefixtable.length)] + sufixtable[new Random().nextInt(prefixtable.length)]);
        System.out.println(name);
    }

    public static void main(String[] args) {

        NameGenerator nick = new NameGenerator();
        nick.generate();

    }
}
