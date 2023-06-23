import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
		try
		{
			lettura.leggiBinario("IN.DAT","OUT.DAT");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}