import java.io.*;
class Example9_1 {
	public static void  main(String arg[]){
		File inputFile = new File("file1.txt");
		File outputFile = new File("file2.txt");
		int ch;
		try{
			FileReader in =  new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);
			System.out.println("�ļ����Ƴ���ʼ����");
			while((ch = in.read())!=-1){
				out.write(ch);
			}
		}catch(FileNotFoundException e1){
			System.out.println("�ļ�û���ҵ�"+e1);
		}catch(IOException e2){
			System.out.println("File read Error:"+e2);
		}	
	}
}
