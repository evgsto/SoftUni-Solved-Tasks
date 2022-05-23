package JavaBasics.JavaBookPrograms;
import static javax.swing.JOptionPane.*;
public class TextInput {
    public static void main(String[] args) {

        String txt , str;

        txt = showInputDialog("Text input: ");
        int size = txt.length();
        char A = txt.charAt(0);
        char B = txt.charAt(size-1);
        str = "Text : " + txt +"\n";
        str+="Symbols in text : " +size +"\n";
        str+="First symbol :" + A + "\n";
        str+="Last symbol :" + B + "\n";
        showMessageDialog(null,str);






    }
}
