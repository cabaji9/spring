/**
 * Created by Hyun Woo Son on 12/13/17
 **/
public enum  EnumPrueba implements EnumInterface {


    UNO("1"),DOS("2");

    EnumPrueba(String value) {
        this.value = value;
    }

    private String value;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getName() {
        return this.name();
    }


}
