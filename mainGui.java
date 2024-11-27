import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainGui {
    private JFrame frame;
    public void showmain(){
       frame = new JFrame("Main GUI");
       frame.setSize(1080,720);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel panel = new JPanel();
       frame.add(panel);
       placeComponents(panel);
       frame.setVisible(true);
    }
    private void placeComponents(JPanel panel){
        panel.setLayout(null);

        JTextField searchFile=new JTextField(40);
        searchFile.setBounds(10,10,200,30);
        panel.add(searchFile);

        JButton search=new JButton("search");
        search.setBounds(220,10,100,30);
        panel.add(search);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                searchFile.setText("searching...");
                String searchText=searchFile.getText();
                sql sql=new sql();
                //sql.search(searchText);
            }

        });
    }
}

