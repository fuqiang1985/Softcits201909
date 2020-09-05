package catchup_5;
import java.util.*;

// ��A��equals�������Ƿ���true����û����д��hashCode()����
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
// ��B��hashCode()�������Ƿ���1����û����д��equals()����
class B
{
	public int hashCode()
	{
		return 1;
	}
}
// ��C��hashCode()�������Ƿ���2������д��equals()�������Ƿ���true
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class HashSetTest
{
	public static void main(String[] args)
	{
		Set books = new HashSet();
		// �ֱ���books��������������A��������B��������C����
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}