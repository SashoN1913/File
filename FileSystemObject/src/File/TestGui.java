package File;

import java.awt.Graphics;

import javax.swing.JFrame;

public class TestGui {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		File file1 = new File (25,"file1");
		File file = new File (300,"file");
	
		
		
		FileSystemObject [] fso = {file1,file};
		Folder folder = new Folder (5, "Folder1");
		folder.setFiles(fso);
		File file2 = new File (25,"file");
		Folder folder2 = new Folder(3,"Folder 2");
		folder.add(folder2);
		folder.add(file2);
		folder.print();
		System.out.println(folder.getSize());
		
		GUI test = new GUI(folder);
		test.setBounds(20,20,300,300);
		test.setVisible(true);
		frame.add(test);
	}

}
