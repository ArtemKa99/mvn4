package kr;

/* ����������� ���������� JUnit, ����������� ��������� ����� ��� �������� */
import org.junit.Assert;
import org.junit.Test;

/* �������� ������, ����������� ��� ����� */
public class Test1 {
    
	/* ��������� @Test ��������� JUnit, ��� � ������ ��������� ��� ����� */
    @Test
    public void test1(){
		/* ��������� ���������� �� ������ ������������� ������ � �������� ���������� ����� */
			/* �������� ������� ������, ����������� ��������� */
    	Credit_Calculator_4_CalcForm lc = new Credit_Calculator_4_CalcForm();
			/* ���������� ���� ����� ��������� ������������ ������������������� �������� */
            lc.vvod.setText("0");
            lc.vvod1.setText("0");
            lc.vvod2.setText("0");
			/* ������ ��������� */
            lc.Credit_Calculator_4_CalcForm1();
			/* ��������� ����������, ����������� ����������, � ��������� ��������� */
            Assert.assertTrue("0.0".equals(lc.vuvod.getText()));
    }
}
