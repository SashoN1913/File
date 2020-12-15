package File;

public  class Folder extends FileSystemObject
{
	private FileSystemObject [] files;
	private int index;
	private int size;
	
	public Folder() 
	{
		files = new FileSystemObject [5];
		index = 0;
		setSize(0);
	}
	public Folder(int lenght,String name) 
	{
		super(name);
		files = new FileSystemObject [lenght];
		index = 0;
		setSize(0);
	}
	public Folder(Folder f) 
	{
		super(f.getName());
		this.files = f.getFiles();
		this.index = f.getIndex();
		this.setSize(f.getSize());
	}
	
	@Override
	public int getSize() 
	{
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0;i < index;i++) 
		{
			sum += files[i].getSize();
		}
		setSize(sum);
		return size;
	}



	public FileSystemObject[] getFiles() 
	{
		return files;
	}



	public void setFiles(FileSystemObject[] files) 
	{
		this.files = files;
	}



	public int getIndex() 
	{
		return index;
	}



	public void setIndex(int index) 
	{
		this.index = index;
	}
	void add(FileSystemObject pop) 
	{
		if(index < files.length) 
		{
			files[index] = pop;
			index++;
		}
	}
	public void setSize(int size) 
	{
		this.size = size;
	}
	public void print () 
	{
		for(int i = 0; i < index; i++) 
		{
			System.out.println(files[i].getName());
		}
	}
}
