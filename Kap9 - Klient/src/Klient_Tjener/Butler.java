package Klient_Tjener;

/**
 *
 * @Skrevet av Christian
 */
public class Butler {
    int no;
    String name;
    boolean certified;

    public Butler(int no, String name, boolean certified) {
        this.no = no;
        this.name = name;
        this.certified = certified;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

    @Override
    public String toString() {
        return "Butler{" + "no=" + no + ", name=" + name + ", certified=" + certified + '}';
    }

}
