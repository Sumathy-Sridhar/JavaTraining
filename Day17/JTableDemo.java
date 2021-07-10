import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {

	JFrame f;

	JTable j;
	JTableDemo() {

		f = new JFrame();

		f.setTitle("Employee Details");

		String[][] employee= { 
			{ "A12","Sumathy" },
			 { "A23", "Mathew" }
 };

		String[] columnNames = { "EmpId", "Employee Name" };

		j = new JTable(employee, columnNames);
		j.setBounds(30, 40, 200, 300);

		JScrollPane sp = new JScrollPane(j);
		f.add(sp);

		f.setSize(500, 200);

		f.setVisible(true);
	}

	public static void main(String[] args) {
		new  JTableDemo();
	}
}
