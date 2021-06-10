package week5.SList;

public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();

        list.appendEnd("Linked");
        list.appendEnd("list,");
        list.appendEnd("is,");
        list.appendEnd("easy.");
        list.display();

        System.out.println("Removed: " + list.removeInitial() + "  " + list.removeInitial());

        System.out.println("Is 'difficult' in the list?: " + list.contains("difficult"));
        list.clear();
    }
}
