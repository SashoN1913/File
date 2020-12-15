package File;

public class File extends FileSystemObject 
{
	int size;
	public File () 
	{
		super ("NewFile");
		size = 0;
	}
	public File (int size, String  name) 
	{
		super (name);
		if(size >= 0)
		this.size=size;	
	}
	
	@Override
	public int getSize() 
	{
		// TODO Auto-generated method stub
		return size;
	}

}
