public class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }
}
