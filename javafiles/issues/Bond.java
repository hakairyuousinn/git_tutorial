package issues;

public class Bond {
    private String name;
    private String code;

    public Bond(String name, String code) {
        this.setName(name);
        this.setCode(code);
    }

    //getter,setter
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
}
