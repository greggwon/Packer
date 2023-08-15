#Packer
Packer is a Javax/Swing class and interface (PackAs) which provides a chaining API in front of the
java.awt.GridBagLayout layout manager.  The GridBagConstraints class is hidden from view so that you
can create simple layouts using simple chaining APIs.

import javax.swing.*;
import java.awt.*;

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
		pk.pack( new JSparator() ).gridx(0).gridy(++y).gridw(2).fillx();
		JButton ok = new JButton("Okay");
		pk.pack( ok ).gridx(0).gridy(++y).gridw(2).fillx(0);
		ok.addActionListener( (ActionEvent ev) -> {
			System.exit(0);
		});
	}
}

## Makefile
The makefile has a target to build the classes in this repo and run the Example.

### make all
Build all the classes

### make run
Run the example after building all the classes.

### make jar
Make the jar file of the Packer and PackAs source files output.
