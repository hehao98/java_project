package shootgame;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Help extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Help() {
		setLayout(null);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Baoli SC", Font.BOLD | Font.ITALIC, 60));
		lblHelp.setBounds(217, -25, 177, 110);
		add(lblHelp);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 103, 467, 484);
		add(scrollPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 97));
		scrollPane.setViewportView(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		textField.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		JLabel lblReturn = new JLabel("返回");
		lblReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblReturn.setForeground(Start.onPress);
				GameFrame.card.show(GameFrame.container, "Start");
			}
		});
		lblReturn.setFont(new Font("Baoli TC", Font.BOLD | Font.ITALIC, 32));
		lblReturn.setBounds(414, 610, 127, 52);
		add(lblReturn);
		
	}
}
