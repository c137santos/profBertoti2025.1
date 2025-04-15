package factory;

public abstract class StoreKnife {
    public void orderKnife(String type) {
        Knife knife = createKnife(type);
        knife.sharpen();
        knife.polish();
        knife.packageKnife();
    }

    protected abstract Knife createKnife(String type);
}
