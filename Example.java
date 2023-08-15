import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import org.wonderly.awt.*;

public class Example extends JFrame {

        public static void main( String[] args ) {
                Example example = new Example(args);
                example.pack();
                example.setLocationRelativeTo(null);
                example.setVisible(true);
        }

        public Example( String args[] ) {
                super( args.length > 0 ? args[0] : "Example" );
                Packer pk = new Packer( this );
                int y = -1;
                pk.pack( new JLabel("Field #1:") ).gridx(0).gridy(++y).fillx(0);
                pk.pack( new JTextField( 10 ) ).gridx(1).gridy(y).fillx();
                pk.pack( new JLabel("Field #1:") ).gridx(0).gridy(++y).fillx(0);
                pk.pack( new JTextField( 10 ) ).gridx(1).gridy(y).fillx();
                pk.pack( new JLabel("Field #3:") ).gridx(0).gridy(++y).fillx(0);
                pk.pack( new JTextField( 10 ) ).gridx(1).gridy(y).fillx();
                pk.pack( new JLabel("Field #4:") ).gridx(0).gridy(++y).fillx(0);
                pk.pack( new JTextField( 10 ) ).gridx(1).gridy(y).fillx();
                pk.pack( new JSeparator() ).gridx(0).gridy(++y).gridw(2).fillx();
                JButton ok = new JButton("Okay");
                pk.pack( ok ).gridx(0).gridy(++y).gridw(2).fillx(0);
                ok.addActionListener( (ActionEvent ev) -> {
                        System.exit(0);
                });
        }
}

