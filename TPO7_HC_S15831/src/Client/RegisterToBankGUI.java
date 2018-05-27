package Client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class RegisterToBankGUI extends JDialog
{

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public RegisterToBankGUI()
	{
		setBounds(100, 100, 270, 209);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(119, 11, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(10, 14, 99, 14);
		contentPanel.add(lblName);
		
		JLabel lblLast = new JLabel("Last name");
		lblLast.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLast.setBounds(10, 39, 99, 14);
		contentPanel.add(lblLast);
		
		JLabel lblMoney = new JLabel("Money");
		lblMoney.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMoney.setBounds(10, 64, 99, 14);
		contentPanel.add(lblMoney);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 37, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 62, 86, 20);
		contentPanel.add(textField_2);
		
		JLabel lblAnswerFromBank = new JLabel("Answer from bank:");
		lblAnswerFromBank.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnswerFromBank.setBounds(10, 96, 125, 18);
		contentPanel.add(lblAnswerFromBank);
		
		JLabel lblOk = new JLabel("");
		lblOk.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblOk.setBounds(131, 99, 113, 14);
		contentPanel.add(lblOk);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
