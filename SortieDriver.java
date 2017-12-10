import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;

public class SortieDriver extends JFrame {
	private JTextField[] input = new JTextField[10];
	double[] number = new double[10];
	public static String result;

	public SortieDriver() {
		JPanel panel = new JPanel(new GridLayout(11,0,0,10));

		JButton sort = new JButton("sort");
		sort.addActionListener(new SortHandle());

		panel.add(sort);
		for(int i=0;i<input.length;i++) {
			input[i] = new JTextField(5);
			panel.add(input[i]);
		}
		setContentPane(panel);
	}

	public static void main(String[] args) {
		SortieDriver window = new SortieDriver();
		window.setSize(300,600);
		window.setTitle("sort the list");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		//String result = Arrays.toString(number);
		//JOptionPane.showMessageDialog(null,number,JOptionPane.INFORMATION_MESSAGE);
		//System.out.println(result);
	}

	private class SortHandle implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//double[] number = new double[10];
			//String result = "";
			for(int i=0;i<input.length;i++) {
				number[i] = Double.parseDouble(input[i].getText());
			}
			Sortie.sort(number);
			result = Arrays.toString(number);
			//System.out.println(result);
			JOptionPane.showMessageDialog(null,result);
			dispose();
			/*
			for(int i=0;i<number.length-1;i++) {
				for(int j=1;j<number.length;j++) {
					if(number[i]>number[j]) {
						Sortie.swap(i, j, number);
					}
				}
			}
			*/
		}
	}
}
