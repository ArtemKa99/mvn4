package kr;
//���� �������� � ���� �����������, ������ ���������.

import javax.swing.*;
import java.io.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

//����� ���� �����������.
public class Credit_Calc_4_main_AuthorizationForm extends JFrame {

	//�������� ��������� ��� ���� �����������.
	private JButton button1 = new JButton("�����");
	private JTextField input1 = new JTextField("", 5);
	private JTextField input2 = new JTextField("", 5);
	private JLabel label = new JLabel("�����");
	private JLabel label2 = new JLabel("������");
	private Credit_Calculator_4_CalcForm Credit_Calculator_4_CalcForm;
 
	//����������� �������� ����.
	public Credit_Calc_4_main_AuthorizationForm() {

		//�������� ����.
		super("����");

		//��������� ���������� ����.
		this.setBounds(100, 100, 400, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//���������� ���������� ��� ���������� ������� � ������.
		Container container = this.getContentPane();

		//��������� ���������� ������������ ������ ����������.
		container.setLayout(new GridLayout(3, 2, 2, 2));

		//���������� �����, ������, ������ � ���������, ����������� ����� ��������.
		container.add(label);
		container.add(label2);
		container.add(input1);
		container.add(input2);
		container.add(button1);

		//������� �������� ���� ������������ �� ������� ������.
		Credit_Calculator_4_CalcForm = new Credit_Calculator_4_CalcForm();

		//������������ ������� ��� ������� �� ������.
		button1.addActionListener(new ActionListener() {
			int loginAdmin, passwordAdmin, loginUser, passwordUser;
			int[] array = null;

			@Override
			//����������� + �������� ��������� ���� ������������.
			public void actionPerformed(ActionEvent arg0) {

				//������ ��������� ���� "SQL.txt".
				try (BufferedReader in = new BufferedReader(new FileReader("SQL.txt")))
				{

					//��������� ������ ���������� �� ����.
					array = in.lines().mapToInt(Integer::parseInt).toArray();
				}

				//������������ ������ �������.
				catch (IOException | NumberFormatException e)
				{

					e.printStackTrace();
				}

				/*���������� ����� ������� � ����������� ����������� ������� � �������,
				* ����� ������ ���� ����� ���������� �������������, ����������� �� ���. */
				if (4 == array.length)
				{

					//�������� ���������� ��� ����� �������� �� �������.
					loginAdmin=array[0]; //����� ������� ������������.
					passwordAdmin=array[1]; //������ ������� ������������.
					loginUser=array[2]; //����� ������� ������������.
					passwordUser=array[3]; //������ ������� ������������.
				}

				//� ������, ���� ������� �� �����������, �� ���� ����������� ���������� �������� � ��������.
				else
				{

					//������ � ���� "SQL.txt".
					try(FileWriter writer = new FileWriter("SQL.txt", false))
					{

						//������� �������� ���.
						loginAdmin = 1; //��������� ����� ������� ������������.
						passwordAdmin = 2; //��������� ������ ������� ������������.
						loginUser = 3; //��������� ����� ������� ������������.
						passwordUser = 4; //��������� ������ ������� ������������.
						//������ � ����.
						writer.write(loginAdmin + "\r\n" + passwordAdmin + "\r\n" + loginUser + "\r\n"+ passwordUser);
					}

					//��� ������ ������ ��������� � �������, ������������ ��� ��������.
					catch(IOException ex)
					{

						System.out.println(ex.getMessage());
					}
				}

				//����������� �������� �� ��������� ����� ������ ������������ � ������.
				int login1 = Integer.parseInt(input1.getText());
				int password1 = Integer.parseInt(input2.getText());
				//���������� ��������� ������ � ������� �� �����.
				if ((login1 == loginAdmin && password1 == passwordAdmin) || (login1 == loginUser && password1 == passwordUser)) 
				{

					//������ ������� �������� ���� ������������.
					Credit_Calculator_4_CalcForm.setVisible(true);
					//�������� ���� �����������.
					setVisible(false);
				}

				//� ������ �������������� ������ � ������ �������� ���� �����������.
				else
				{

					//�������� ���� �����������.
					setVisible(false);
				}
			}
		});

		//����������� ���� ����������� � ������ ������.
		setLocationRelativeTo(null);

		//������ ��� �������.
		setVisible(true);

	}

	//��������� ���������.
	public static void main(String[] args) 
	{

		//��������� ���� �����������.
		SwingUtilities.invokeLater(new Runnable() 
		{

			public void run() 
			{

			new Credit_Calc_4_main_AuthorizationForm();
		}
	});
}
}
