//Import hai thư viện JButton và JFrame
import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo {

    public static void main(String[] args) {

        JFrame f = new JFrame();// Khai bào và khởi tạo một Jframe

        JButton a = new JButton("Processes Running");
        a.setBounds(20,100,100,300);
        JButton b = new JButton("Application Running");
        b.setBounds(130,100,200,100);
        JButton c = new JButton("Keylock");
        c.setBounds(130,210,200,80);
        JButton d = new JButton("Sceenlock");
        d.setBounds(130, 300, 250, 100);
        JButton e = new JButton("Shutdown");
        e.setBounds(340,100,120,190);
        JButton g = new JButton("Exit");
        g.setBounds(390,300,70,100);
        
        f.setTitle("Remove Control Client");
        f.add(a);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);
        f.add(g);

        f.setSize(500, 500);// thiết lập kích thước cho của sổ
        f.setLayout(null);// không sử dụng trình quản lý bố cục
        f.setVisible(true);// hiển thị cửa sổ
    }
}