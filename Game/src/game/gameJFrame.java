package game;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class gameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] arr1 = new int[4][4];
    int x = 0;
    int y = 0;
    String path = "Game\\image\\animal\\animal3\\";
    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    int count = 0;
    JMenu change = new JMenu("更换图片");
    JMenuItem jMenuItem = new JMenuItem("重新开始");
    JMenuItem jMenuItem1 = new JMenuItem("重新登录");
    JMenuItem jMenuItem2 = new JMenuItem("退出游戏");
    JMenuItem jMenuItem3 = new JMenuItem("公众号");
    JMenuItem grils = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    public gameJFrame() {
        initJFrame();
        initJFramebar();
        initData();
        intiImage();
       /* JButton jButton = new JButton("按钮");
        jButton.setBounds(100,0,100,100);
        this.getContentPane().add(jButton);*/
    }

    private void initData() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random random = new Random();
        for(int i = 0;i < arr.length;i++){
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        /*int Index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i] == 0){
                    x = i;
                    y = j;
                }else {
                    arr1[i][j] = arr[Index];
                }
                Index++;
            }
        }*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                x = i / 4;
                y = i % 4;
            }
                arr1[i / 4][i % 4] = arr[i];
        }
    }

    private void intiImage() {
        this.getContentPane().removeAll();
        if (iswin()){
            JLabel win = new JLabel(new ImageIcon("Game\\image\\win.png"));
            win.setBounds(203,283,197,73);
            this.getContentPane().add(win);
        }
        JLabel countJLabel = new JLabel("移动次数：" + count);
        countJLabel.setBounds(50,30,100,20);
        this.getContentPane().add(countJLabel);
        int num = 1;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int num1 = arr1[j][i];
                JLabel jLabel = new JLabel(new ImageIcon(path + num1 + ".jpg"));
                jLabel.setBounds(i * 105 + 83, j * 105 + 134, 105, 105);
                //        this.add(jLabel);
                jLabel.setBorder(new BevelBorder(0));
                this.getContentPane().add(jLabel);
            }
        }
        JLabel background = new JLabel(new ImageIcon("Game\\image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
        this.getContentPane().repaint();
    }


        /*for (int i = 0; i < 4; i++) {
            JLabel jLabel = new JLabel(new ImageIcon("D:\\develop\\untitled2\\Game\\image\\girl\\girl11\\" + (i + 1) + ".jpg"));
            jLabel.setBounds(i * 105, 0, 105, 105);
            //        this.add(jLabel);
            this.getContentPane().add(jLabel);
        }

            for (int i = 4; i < 8; i++) {
                JLabel jLabel = new JLabel(new ImageIcon("D:\\develop\\untitled2\\Game\\image\\girl\\girl11\\" + (i + 1) + ".jpg"));
                jLabel.setBounds((i - 4) * 105, 105, 105, 105);
//        this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
            for (int i = 8; i < 12; i++) {
                JLabel jLabel = new JLabel(new ImageIcon("D:\\develop\\untitled2\\Game\\image\\girl\\girl11\\" + (i + 1) + ".jpg"));
                jLabel.setBounds((i - 8) * 105, 210, 105, 105);
//        this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
            for (int i = 12; i < 16; i++) {
                JLabel jLabel = new JLabel(new ImageIcon("D:\\develop\\untitled2\\Game\\image\\girl\\girl11\\" + (i + 1) + ".jpg"));
                jLabel.setBounds((i - 12) * 105, 315, 105, 105);
//        this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
        }*/

        private void initJFramebar () {
            JMenuBar jMenuBar = new JMenuBar();
            JMenu jMenu = new JMenu("功能");
            JMenu jMenu1 = new JMenu("关于我们");
            change.add(grils);
            change.add(animal);
            change.add(sport);
            jMenu.add(change);
            jMenu.add(jMenuItem);
            jMenu.add(jMenuItem1);
            jMenu.add(jMenuItem2);
            jMenu1.add(jMenuItem3);
            jMenuBar.add(jMenu);
            jMenuBar.add(jMenu1);
            jMenuItem.addActionListener(this);
            jMenuItem1.addActionListener(this);
            jMenuItem2.addActionListener(this);
            jMenuItem3.addActionListener(this);
            grils.addActionListener(this);
            animal.addActionListener(this);
            sport.addActionListener(this);
            this.setJMenuBar(jMenuBar);
            this.setVisible(true);
        }

        private void initJFrame () {
            this.setSize(603, 680);
            this.setTitle("拼图游戏");
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(3);
            this.addKeyListener(this);
            setLayout(null);
        }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();
    if (code == 65){
        this.getContentPane().removeAll();
        JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
        all.setBounds(83,134,420,420);
        this.getContentPane().add(all);
        JLabel background = new JLabel(new ImageIcon("Game\\image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
        this.getContentPane().repaint();
    }
    }

    @Override
    public void keyReleased(KeyEvent e) {
            if (iswin()){
                return;
            }
            int code = e.getKeyCode();
            if (code == 37){
                if (y == 0){
                    return;
                }
                count++;
                arr1[x][y] = arr1[x][y - 1];
                arr1[x][y - 1] = 0;
                y--;
                intiImage();
            } else if (code == 38) {
                if (x == 0){
                    return;
                }
                count++;
                arr1[x][y] = arr1[x - 1][y];
                arr1[x - 1][y] = 0;
                x--;
                intiImage();
            } else if (code == 39) {
                if (y == 3){
                    return;
                }
                count++;
                arr1[x][y] = arr1[x][y + 1];
                arr1[x][y + 1] = 0;
                y++;
                intiImage();
            } else if (code == 40) {
                if (x == 3){
                    return;
                }
                count++;
                arr1[x][y] = arr1[x + 1][y];
                arr1[x + 1][y] = 0;
                x++;
                intiImage();
            } else if (code == 65){
                intiImage();
        } else if (code == 87) {
                arr1 = new int[][]{
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}
                };
                intiImage();
            }
    }

    public boolean iswin(){
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (arr1[i][j] != win[i][j]){
                            return false;
                        }
                    }
                }
                return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jMenuItem){
                    this.getContentPane().removeAll();
                    count = 0;
                    initData();
                    intiImage();

                } else if (e.getSource() == jMenuItem1) {
                    new loginJFrame();
                    this.dispose();
                } else if (e.getSource() == jMenuItem2) {
                    System.exit(0);
                } else if (e.getSource() == jMenuItem3) {
                    JDialog jdialog = new JDialog(this,"关于我们");
                    JLabel jLabel = new JLabel(new ImageIcon("Game\\image\\about.png"));
                    jLabel.setBounds(0,0,258,258);
                    jdialog.getContentPane().add(jLabel);
                    jdialog.setSize(340,340);
                    jdialog.setAlwaysOnTop(true);
                    jdialog.setLocationRelativeTo(null);
                    jdialog.setModal(true);
                    jdialog.setVisible(true);
                } else if (e.getSource() == grils) {
                    Random random = new Random();
                    int num = random.nextInt(13) + 1;
                    path = "Game\\image\\girl\\girl" + num + "\\";
                    initData();
                    intiImage();
                } else if (e.getSource() == animal) {
                    Random random = new Random();
                    int num = random.nextInt(8) + 1;
                    path = "Game\\image\\animal\\animal" + num + "\\";
                    initData();
                    intiImage();
                } else if (e.getSource() == sport) {
                    Random random = new Random();
                    int num = random.nextInt(10) + 1;
                    path = "Game\\image\\sport\\sport" + num + "\\";
                    initData();
                    intiImage();
                }
    }
}

