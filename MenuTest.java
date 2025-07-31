import java.awt.*;

class MenuTest extends Frame {
    MenuTest() {
        MenuBar mbar = new MenuBar();
        this.setMenuBar(mbar);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(300, 300);
        
        Menu file = new Menu("File");
        file.add(new MenuItem("new"));
        MenuItem m2 = new MenuItem("open");
        file.add(m2);
        mbar.add(file);
    }

    public static void main(String args[]) {
        MenuTest m1 = new MenuTest();
    }
}
