import javax.swing.*;

public class Formulario extends JFrame{
 
 private JTextField textfield;
 private JScrollPane scrollpane1;
 private JTextArea textarea1;

 public Formulario(){
  setLayout(null);
  textfield = new JTextField();
  textfield.setBounds(10,10,200,30);
  add(textfield);

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(10,50,400,300);
  add(scrollpane1);
 }

 public static void main(String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,540,400);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}