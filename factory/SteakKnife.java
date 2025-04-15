package factory;

public class SteakKnife implements Knife {
    
    @Override
    public String toString() {
        return "Faca de steak";
    }

    @Override
    public String sharpen() {
        throw new UnsupportedOperationException("Unimplemented method 'sharpen'");
    }

    @Override
    public String polish() {
        throw new UnsupportedOperationException("Unimplemented method 'polish'");
    }

    @Override
    public String packageKnife() {
        throw new UnsupportedOperationException("Unimplemented method 'packageKnife'");
    }
}
