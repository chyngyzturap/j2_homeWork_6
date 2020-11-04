public class Main {

    public static void main(String[] args) {
	GameVersion<Double> dota2 = new GameVersion(2.0);
	dota2.addPatch(7.27);

	GameVersion<Double> worldOfWarcraft = new GameVersion(3.0);
	worldOfWarcraft.addPatch(4.3);
    }
}
