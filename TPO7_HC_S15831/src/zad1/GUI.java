package zad1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame
{

	private JPanel contentPane;
	private JTextField tFquantity;

	public GUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 151);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox cBchooseProduct = new JComboBox();
		cBchooseProduct.setBounds(10, 30, 220, 20);
		contentPane.add(cBchooseProduct);

		tFquantity = new JTextField();
		tFquantity.setBounds(307, 30, 46, 20);
		contentPane.add(tFquantity);
		tFquantity.setColumns(10);

		JLabel lbquantity = new JLabel("Quantity:");
		lbquantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbquantity.setBounds(236, 32, 61, 14);
		contentPane.add(lbquantity);

		JButton btnOrder = new JButton("Order");
		btnOrder.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});
		btnOrder.setBounds(363, 29, 61, 23);
		contentPane.add(btnOrder);
	}
}
