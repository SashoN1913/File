package File;

public abstract class FileSystemObject 
{
	private String name;
	public FileSystemObject() 
	{
		name = "NewFile";
	}
	public FileSystemObject(String name) 
	{
		this.name = name;
	};
	public abstract int getSize();
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}
