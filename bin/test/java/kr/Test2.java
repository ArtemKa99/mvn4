package kr;

/* ����������� ���������� JUnit, ����������� ��������� ����� ��� �������� */
import org.junit.Assert;
import org.junit.Test;

/* �������� ������, ����������� ��� ����� */
public class Test2 {
    
	/* ��������� @Test ��������� JUnit, ��� � ������ ��������� ��� ����� */
    @Test
    public void test1(){
		/* ��������� ���������� �� ������ ������������� ������ � �������� ���������� ����� */
			/* �������� ������� ������, ����������� ��������� */
    	Credit_Calculator_4_CalcForm lc = new Credit_Calculator_4_CalcForm();
			/* ���������� ���� ����� ��������� ������������ ������������������� �������� */
            lc.vvod.setText("12");
            lc.vvod1.setText("12");
            lc.vvod2.setText("10");
			/* ������ ��������� */
            lc.Credit_Calculator_4_CalcForm1();
			/* ��������� ����������, ����������� ����������, � ��������� ��������� */
            Assert.assertTrue("12.65".equals(lc.vuvod.getText()));
		/* ���, ����������� ��� ������������� ������ � �������� ���������� ����� */
    }
}
