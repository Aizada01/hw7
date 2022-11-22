public class Main {
    public static void main(String[] args) {
        HavingSuperAbility magic = new Magic();
        HavingSuperAbility[] havingSuperAbilities = {magic, new Medic(), new Warrior()};
        System.out.println();
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility();

        }
    }
}