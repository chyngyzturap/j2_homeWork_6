public class GameVersion<T extends Number> implements Playable<T>{
private T num;

    public T getNum() {
        return num;
    }

    public GameVersion(T num) {
        this.num = num;
    }

    @Override
    public void addPatch(T t) {

    }
}
