package yzx.entity;

public class Fuck {
    private String wow;
    private String ass;

    public Fuck() {
    }

    public Fuck(String wow, String ass) {
        this.wow = wow;
        this.ass = ass;
    }

    public String getWow() {
        return wow;
    }

    @Override
    public String toString() {
        return "Fuck{" +
                "wow='" + wow + '\'' +
                ", ass='" + ass + '\'' +
                '}';
    }

    public void setWow(String wow) {
        this.wow = wow;
    }

    public String getAss() {
        return ass;
    }

    public void setAss(String ass) {
        this.ass = ass;
    }
}
