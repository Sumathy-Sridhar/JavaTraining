import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class BackgroundOnScrollPane {

    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {

	    @Override
	    public void run() {
		JFrame frame = new JFrame("Test back ground");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JLabel content = new JLabel(
			"This is the content of the scroll pane", JLabel.CENTER);
		content.setOpaque(true);
		JScrollPane scrollPane = new JScrollPane(content);
		scrollPane.getViewport().setBackground(Color.PINK);
		frame.add(scrollPane);
		frame.setJMenuBar(new JMenuBar());
		frame.getJMenuBar().add(
			new JCheckBoxMenuItem(new AbstractAction(
				"Content opaque") {

			    private static final long serialVersionUID = 1L;

			    {
				this.putValue(Action.SELECTED_KEY, content
					.isOpaque());
			    }

			    @Override
			    public void actionPerformed(ActionEvent e) {
				content.setOpaque((Boolean) this
					.getValue(Action.SELECTED_KEY));
				content.repaint();
			    }
			}));
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	    }
	});
    }

}