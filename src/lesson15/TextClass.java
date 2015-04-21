package lesson15;

import javax.swing.JTextArea;

public class TextClass {
    private final static JTextArea texts = new JTextArea();
    public static JTextArea textpanel() {
        return texts;
    }
    static void show_text(String showme)
    {
        texts.append(showme);
    }
}