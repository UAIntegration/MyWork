package lesson16;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyFrameWindow extends javax.swing.JFrame {
    
    public static String read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }
    
    
    
    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }
            try ( //PrintWriter обеспечит возможности записи в файл
                    PrintWriter out = new PrintWriter(file.getAbsoluteFile()) //После чего мы должны закрыть файл
            //Иначе файл не запишется
            ) {
                //Записываем текст у файл
                out.print(text);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public MyFrameWindow() {
        JFrame frame = new JFrame("Учет");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setJMenuBar(menuBar());
        
        frame.add(addAPanel());
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void main(String args[])  throws IOException {
        System.out.println("code run");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrameWindow();
            }
        });
    }
    final static JPanel panel = new JPanel();
    final static JTextArea texts1 = new JTextArea("Ввод имени");
    final static JTextArea texts2 = new JTextArea("Ввод фамилии");
    static String	listData1[] =
		{
			"До 18",
			"18...45",
			"После 45"
		};
    final static JList listbox1 = new JList( listData1 );
    static String	listData2[] =
		{
			"Менеджер",
			"Тестировщик",
			"Разработчик"
		};
    final static JLabel label1 = new JLabel("Имя:");
    final static JLabel label2 = new JLabel("Фамилия:");
    final static JLabel label3 = new JLabel("Возраст:");
    final static JLabel label4 = new JLabel("Должность:");
    final static JLabel label5 = new JLabel("Пол:");
    final static JComboBox combobox2 = new JComboBox( listData2 );
    final static JCheckBox check1 = new JCheckBox("Дополнительная инфо");
    final static JTextArea textsinfo = new JTextArea("");
    final static JRadioButton male = new JRadioButton("мужчина");
    final static JRadioButton female = new JRadioButton("женщина");
    final static ButtonGroup bG = new ButtonGroup();
    final static JButton button1 = new JButton("Записать");
    final static JTextArea result = new JTextArea("Записанная информация:\n");
    final static JScrollPane scroll = new JScrollPane(result,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    final static JPopupMenu popup1 = new JPopupMenu();
    static ActionListener Mypopup1 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            try { 
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                SwingUtilities.updateComponentTreeUI(panel);
            } catch (Exception ex) { 
                ex.printStackTrace(); 
            }
        }
          
    };
    static ActionListener Mypopup2 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            /*UIManager.LookAndFeelInfo[] infoArray = UIManager.getInstalledLookAndFeels();
            for (int i = 0; i < infoArray.length; i++) System.out.println(infoArray[i]);*/
            try { 
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                SwingUtilities.updateComponentTreeUI(panel);
            } catch (Exception ex) { 
                ex.printStackTrace(); 
            }
        }
          
    };
    static ActionListener Mypopup3 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            try { 
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                SwingUtilities.updateComponentTreeUI(panel);
            } catch (Exception ex) { 
                ex.printStackTrace(); 
            }
        }
          
    };
    static ActionListener Mypopup4 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            try { 
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                SwingUtilities.updateComponentTreeUI(panel);
            } catch (Exception ex) { 
                ex.printStackTrace(); 
            }
        }
          
    };
    static ActionListener Mypopup5 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            try { 
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                SwingUtilities.updateComponentTreeUI(panel);
            } catch (Exception ex) { 
                ex.printStackTrace(); 
            }
        }
          
    };
    static ActionListener menuListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
              System.out.println("Popup menu item ["
                  + event.getActionCommand() + "] was pressed.");
            }
        };
    private static JPanel addAPanel() {
        //panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        JMenuItem jMenuItem_A = new JMenuItem("Стиль 1");
        JMenuItem jMenuItem_B = new JMenuItem("Стиль 2");
        JMenuItem jMenuItem_C = new JMenuItem("Стиль 3");
        JMenuItem jMenuItem_D = new JMenuItem("Стиль 4");
        JMenuItem jMenuItem_E = new JMenuItem("Стиль 5");
        popup1.add(jMenuItem_A);
        popup1.add(jMenuItem_B);
        popup1.add(jMenuItem_C);
        popup1.add(jMenuItem_D);
        popup1.add(jMenuItem_E);
        jMenuItem_A.addActionListener(Mypopup1);
        jMenuItem_B.addActionListener(Mypopup2);
        jMenuItem_C.addActionListener(Mypopup3);
        jMenuItem_D.addActionListener(Mypopup4);
        jMenuItem_E.addActionListener(Mypopup5);
        panel.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent event) {
        if (SwingUtilities.isRightMouseButton(event))
        popup1.show(panel, event.getX(), event.getY());
        }
        });
        label1.setBounds(10,5,50,20);
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label1);
        texts1.setBounds(80, 7, 95, 20);
        texts1.setBorder(BorderFactory.createEtchedBorder());
        panel.add(texts1);
        label2.setBounds(10,30,70,20);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label2);
        texts2.setBounds(80, 32, 95, 20);
        texts2.setBorder(BorderFactory.createEtchedBorder());
        panel.add(texts2);
        label3.setBounds(10,55,70,20);
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label3);
        listbox1.setBounds(80, 57, 95, 60);
        listbox1.setBorder(BorderFactory.createEtchedBorder());
        panel.add(listbox1);
        label4.setBounds(10,120,70,20);
        label4.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label4);
        combobox2.setBounds(80, 122, 95, 20);
        combobox2.setBorder(BorderFactory.createEtchedBorder());
        panel.add(combobox2);
        label5.setBounds(10,145,70,20);
        label5.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label5);
        bG.add(male);
        bG.add(female);
        male.setBounds(80, 147, 95, 20);
        female.setBounds(80, 167, 95, 20);
        panel.add(male);
        panel.add(female);
        button1.setBounds(43, 254, 100, 25);
        panel.add(button1);
        result.setBounds(190, 5, 290, 280);
        result.setBorder(BorderFactory.createEtchedBorder());
        result.setLineWrap(true);
        result.setEditable(false);
        result.setWrapStyleWord(true);
        scroll.setBounds(190, 5, 290, 280);
        panel.add(scroll);
        check1.setBounds(7, 192, 170, 20);
        panel.add(check1);
        check1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(check1.isSelected()){
                    textsinfo.setEnabled(true);
                    textsinfo.setBackground(Color.WHITE);
                } else {
                    textsinfo.setEnabled(false);
                    textsinfo.setBackground(Color.LIGHT_GRAY);
                }
            }
        });
        textsinfo.setBounds(10, 220, 167, 20);
        textsinfo.setBorder(BorderFactory.createEtchedBorder());
        textsinfo.setBackground(Color.LIGHT_GRAY);
        panel.add(textsinfo);
        button1.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String forprint = "";
                String addinfo = "";
                if (check1.isSelected()){
                    addinfo = " " + textsinfo.getText();
                }
                String age = "";
                if (listbox1.getSelectedIndex() > 0) age = " " + listbox1.getSelectedValue();
                String vacation = " " + combobox2.getSelectedItem();
                String sex = "";
                if(male.isSelected()){
                    sex = " " + "мужчина";
                }
                else if(female.isSelected()){
                    sex = " " + "женщина";
                }
                 if(texts1.getText().equals("Ввод имени")) {
                     if(texts2.getText().equals("Ввод фамилии")) {
                        final JFrame frame2 = new JFrame("info");
                        frame2.setVisible(true);
                        frame2.setSize(200,100);
                        frame2.setLocationRelativeTo(null);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JLabel label = new JLabel("Введите имя и/или фамилию");
                        JPanel panel = new JPanel();
                        frame2.add(panel);
                        panel.add(label);
                        JButton button = new JButton("ОК");
                        button.addActionListener (new ActionListener(){
                            public void actionPerformed(ActionEvent e) {
                                frame2.setVisible(false);
                            }
                        });
                        panel.add(button);
                     }else{
                         forprint = texts2.getText() + age + vacation + sex + addinfo + "\n";
                         result.append(forprint);
                     }
                 }else{
                     if(texts2.getText().equals("Ввод фамилии")) {
                         forprint = texts1.getText() + age + vacation + sex + addinfo +  "\n";
                         result.append(forprint);
                     }else {
                         forprint = texts1.getText() + " " +  texts2.getText() + age + vacation + sex + addinfo +  "\n";
                         result.append(forprint);
                     }
                 }
            }
            
        });
        return panel;
    }
    
    private static JLabel addALabel(String text, int x, int y, int w, int h) { 
        JLabel label = new JLabel(text);
        label.setBounds(x, y, w, h);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }
    
    public static JMenuBar menuBar() {
        JMenuBar menuBar = new JMenuBar();
        
        Font font = new Font("Verdana", Font.PLAIN, 11);
        JMenu fileMenu = new JMenu("Menu");
        fileMenu.setMnemonic(KeyEvent.VK_M);
        fileMenu.setFont(font);
        
        JMenu WindowMenu = new JMenu("Window");
        WindowMenu.setMnemonic(KeyEvent.VK_W);
        WindowMenu.setFont(font);
        
        final JCheckBox check2 = new JCheckBox("Person Info");
        check2.setSelected(true);
        check2.setFont(font);
        check2.setMnemonic(KeyEvent.VK_P);
        WindowMenu.add(check2);
        check2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(check2.isSelected()){
                    scroll.setBounds(190, 5, 290, 280);
                    texts1.setVisible(true);
                    texts2.setVisible(true);
                    listbox1.setVisible(true);
                    combobox2.setVisible(true);
                    check1.setVisible(true);
                    textsinfo.setVisible(true);
                    male.setVisible(true);
                    female.setVisible(true);
                    button1.setVisible(true);
                    label1.setVisible(true);
                    label2.setVisible(true);
                    label3.setVisible(true);
                    label4.setVisible(true);
                    label5.setVisible(true);
                } else {
                    scroll.setBounds(5, 5, 475, 280);
                    texts1.setVisible(false);
                    texts2.setVisible(false);
                    listbox1.setVisible(false);
                    combobox2.setVisible(false);
                    check1.setVisible(false);
                    textsinfo.setVisible(false);
                    male.setVisible(false);
                    female.setVisible(false);
                    button1.setVisible(false);
                    label1.setVisible(false);
                    label2.setVisible(false);
                    label3.setVisible(false);
                    label4.setVisible(false);
                    label5.setVisible(false);
                }
            }
        });
        
        JMenuItem newMenu = new JMenuItem("Auth");
        newMenu.setFont(font);
        newMenu.setMnemonic(KeyEvent.VK_A);
        newMenu.addActionListener (new Login_window());
        fileMenu.add(newMenu);
        
        JMenuItem ExpMenu = new JMenuItem("Export Data");
        ExpMenu.setFont(font);
        ExpMenu.setMnemonic(KeyEvent.VK_X);
        ExpMenu.addActionListener (new Export_Data());
        fileMenu.add(ExpMenu);
        
        JMenuItem ImpMenu = new JMenuItem("Import Data");
        ImpMenu.setFont(font);
        ImpMenu.setMnemonic(KeyEvent.VK_M);
        ImpMenu.addActionListener (new Import_Data());
        fileMenu.add(ImpMenu);
        
        fileMenu.addSeparator();
        
        JMenuItem ExitMenu = new JMenuItem("Exit");
        ExitMenu.setFont(font);
        ExitMenu.setMnemonic(KeyEvent.VK_E);
        ExitMenu.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_E, ActionEvent.ALT_MASK));
        fileMenu.add(ExitMenu);
         
        ExitMenu.addActionListener(new ActionListener() {      
            @Override
            public void actionPerformed(ActionEvent e) {
            int response = JOptionPane.showConfirmDialog(null,
    "Вы действительно желаете выйти?",
    "Выход",
    JOptionPane.OK_CANCEL_OPTION);
            if(response == JOptionPane.OK_OPTION){
                System.exit(0);
            }
            }
        });
        menuBar.add(fileMenu);
        menuBar.add(WindowMenu);
        return menuBar;
    }
    private static class Login_window implements ActionListener {        
        public void actionPerformed (ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Просто авторизация");
            //JOptionPane.showInputDialog("dasdasd");
        }
    }
    private static class Export_Data implements ActionListener {        
        public void actionPerformed (ActionEvent e) {
            JFileChooser fileopen = new JFileChooser();
            ExtFileFilter ff2 = new ExtFileFilter("txt", "*.txt — текстовые файлы");
            fileopen.addChoosableFileFilter(ff2);
            fileopen.setMultiSelectionEnabled(false);
            fileopen.setApproveButtonText("Выбрать");//выбрать название для кнопки согласия
            int ret = fileopen.showDialog(null, "Записать в файл");
            if (ret == JFileChooser.APPROVE_OPTION) {
                //File files = fileopen.getSelectedFile();
                String myfile = "" + fileopen.getSelectedFile();
                write(myfile, result.getText());
                //System.out.println(file);
                //Какие-то действия
            }
        }
    }
    private static class Import_Data implements ActionListener {        
        public void actionPerformed (ActionEvent e) {
            JFileChooser fileopen = new JFileChooser();
            ExtFileFilter ff2 = new ExtFileFilter("txt", "*.txt — текстовые файлы");
            fileopen.addChoosableFileFilter(ff2);
            fileopen.setApproveButtonText("Выбрать");//выбрать название для кнопки согласия
            int ret = fileopen.showDialog(null, "Открыть из файла");
            if (ret == JFileChooser.APPROVE_OPTION) {
                //File file = fileopen.getSelectedFile();
                String myfile = "" + fileopen.getSelectedFile();
                String topast;
                try {
                    topast = read(myfile);
                    result.setText(topast);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MyFrameWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                //System.out.println(file);
                //Какие-то действия
            }
        }
    }
    
}
class ExtFileFilter extends javax.swing.filechooser.FileFilter {

      String ext;
      String description;

      ExtFileFilter(String ext, String descr) {
          this.ext = ext;
          description = descr;
      }

      public boolean accept(File f) {
          if(f != null) {
              if(f.isDirectory()) {
                  return true;
              }
              String extension = getExtension(f);
              if( extension == null )
                  return (ext.length() == 0);
              return ext.equals(extension);
          }
          return false;
      }

      public String getExtension(File f) {
          if(f != null) {
              String filename = f.getName();
              int i = filename.lastIndexOf('.');
              if(i>0 && i<filename.length()-1) {
                  return filename.substring(i+1).toLowerCase();
              };
          }
          return null;
      }

      public String getDescription() {
          return description;
      }
}
