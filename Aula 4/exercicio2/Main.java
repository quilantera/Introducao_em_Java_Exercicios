package exercicio2;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Main {
  public static ArrayList <Student> students = new ArrayList<Student>();

    public static void main(String[] args){  
        
        JFrame  frame = new JFrame("atividade 2 aula 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        JPanel panel = new JPanel();
        JLabel txtname = new JLabel("Nome");
        JLabel txtp1 = new JLabel("P1");
        JLabel txtp2 = new JLabel("P2");

        JTextField inputName = new JTextField(8);
        JTextField inputP1 = new JTextField(5);
        JTextField inputP2 = new JTextField(5);

        JLabel txtMedia = new JLabel("");
        JButton  buttonSaveName = new JButton("Salvar Estudante");
        JLabel txtIsApproved = new JLabel("");
        
        JComboBox comboboxNames = new JComboBox();
        
        buttonSaveName.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                String name = inputName.getText();
                double p1 = Double.parseDouble(inputP1.getText());
                double p2 = Double.parseDouble(inputP2.getText());
                Boolean isInserted = false;
                for(Student s: students){
                    if(s.getName() != null && s.getName().contains(name) ){
                        s.setP1(p1);
                        s.setP1(p2);
                        s.mediaCalculator();
                        System.out.println("aluno modificado");
                        txtMedia.setText(Double.toString(s.getMedia()));
                        isInserted =true;
                        txtIsApproved.setText(s.isApproved());
                    }
                }
                if(isInserted == false){
                    Student s = new Student(name,p1,p2);
                    students.add(s);
                    System.out.println("aluno novo");
                    comboboxNames.addItem(name);
                    txtMedia.setText(Double.toString(s.getMedia()));
                    txtIsApproved.setText(s.isApproved());
                }
            }
        });   
        comboboxNames.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                students.stream().forEach(student -> {
                    if(student.getName().contains((String)comboboxNames.getSelectedItem())){
                        inputName.setText(student.getName());
                        inputP1.setText(Double.toString(student.getP1()));
                        inputP2.setText(Double.toString(student.getP2()));
                        txtMedia.setText(Double.toString(student.getMedia()));
                            
                    }

                });
                
            }});
        panel.add(txtname);
        panel.add(inputName);
        panel.add(txtp1);
        panel.add(inputP1);
        panel.add(txtp2);
        panel.add(inputP2);
        panel.add(buttonSaveName);
        panel.add(txtMedia);
    
        panel.add(txtIsApproved);
        panel.add(comboboxNames);
        frame.add(panel);

        frame.setVisible(true);

    }
}