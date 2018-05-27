package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Bank.BankInterface;
import client.PhoneDirectoryInterface;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import java.awt.Scrollbar;
import java.awt.Button;
import java.awt.ScrollPane;
import java.awt.Label;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;

public class GUI extends JFrame
{

	private JPanel contentPane;
	private JTextField tFquantity;
	private JComboBox cBchooseProduct;
	private JLabel lbquantity;
	private JButton btnOrder;
	private JButton btnMyBills;
	private JButton btnMyExpenses;
	private JButton btnAdvertisement;
	private JScrollPane scrollPane;
	private JScrollPane scroll;
	private JTextArea display;
	private JButton btnAddMoney;
	private JButton btnWithdrawMoney;
	private Context ctx = null;

	public GUI()
	{
		try
		{
			ctx = new InitialContext();
			Object objref = ctx.lookup("BankService");
			BankInterface aif; // uwaga: zawsze interfejs!
			aif = (BankInterface) PortableRemoteObject.narrow(objref, BankInterface.class);
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		RegisterToBankGUI d = new RegisterToBankGUI();
		d.setModal(true);
		d.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		cBchooseProduct = new JComboBox();
		cBchooseProduct.setBounds(10, 30, 220, 20);
		contentPane.add(cBchooseProduct);

		tFquantity = new JTextField();
		tFquantity.setBounds(307, 30, 46, 20);
		contentPane.add(tFquantity);
		tFquantity.setColumns(10);

		lbquantity = new JLabel("Quantity:");
		lbquantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbquantity.setBounds(236, 32, 61, 14);
		contentPane.add(lbquantity);

		btnOrder = new JButton("Order");
		btnOrder.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});
		btnOrder.setBounds(363, 29, 61, 23);
		contentPane.add(btnOrder);

		btnMyBills = new JButton("My Bills");
		btnMyBills.setBounds(10, 80, 142, 23);
		contentPane.add(btnMyBills);

		btnMyExpenses = new JButton("My expenses");
		btnMyExpenses.setBounds(162, 80, 118, 23);
		contentPane.add(btnMyExpenses);

		btnAdvertisement = new JButton("Advertisement");
		btnAdvertisement.setBounds(290, 80, 134, 23);
		contentPane.add(btnAdvertisement);

		display = new JTextArea(2, 6);
		// display.setEditable ( false ); // set textArea non-editable
		scroll = new JScrollPane(display);
		scroll.setSize(420, 135);
		scroll.setLocation(10, 145);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		// Add Textarea in to middle panel
		contentPane.add(scroll);

		btnAddMoney = new JButton("Add money");
		btnAddMoney.setBounds(10, 111, 89, 23);
		contentPane.add(btnAddMoney);

		btnWithdrawMoney = new JButton("Withdraw money");
		btnWithdrawMoney.setBounds(149, 114, 131, 23);
		contentPane.add(btnWithdrawMoney);

		Label lbAccountNumber = new Label("Your acoount number:");
		lbAccountNumber.setBounds(10, 286, 118, 22);
		contentPane.add(lbAccountNumber);

		Label lbAccountNumberVar = new Label("");
		lbAccountNumberVar.setBounds(134, 286, 62, 22);
		contentPane.add(lbAccountNumberVar);

	}

	private static void addPopup(Component component, final JPopupMenu popup)
	{
		component.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				if (e.isPopupTrigger())
				{
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e)
			{
				if (e.isPopupTrigger())
				{
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e)
			{
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
