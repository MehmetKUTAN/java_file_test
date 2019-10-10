package file_java;
import java.io.File;
import java.util.Scanner;
public class file_test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.print("analiz edilecek dosya yazýnýz=");
		dosya_analiz(input.nextLine());	
	}
	private static void dosya_analiz(String nextLine) {
		// TODO Auto-generated method stub
		File dosya=new File(nextLine);
		if(dosya.exists())
		{
			System.out.print(dosya.getName()+" \n mevcut. \n");
			System.out.print(dosya.isFile()?"normal dosya \n":"normal dosya deðil \n");
			System.out.print(dosya.isDirectory()?"klasör \n":"klosör deðil \n");
			System.out.print(dosya.isAbsolute()?"açýk adres \n":"açýk adres  deðil \n");
			System.out.print("açýk adres="+dosya.getAbsolutePath());
			System.out.print(dosya.getParent());
			System.out.println(dosya.length());
			System.out.print(dosya.isHidden());
			if(dosya.isDirectory())
			{
				String dosyalar[]=dosya.list();
				System.out.print("\n Klasör içindeki dosyalar \n");
				for(String dosya_isim:dosyalar)
					System.out.print(dosya_isim+"\n");
			}
		}
	}
}