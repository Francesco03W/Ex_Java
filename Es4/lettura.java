import java.io.*;
public class lettura
{
	public static void leggiBinario(String nomeFileI,String nomeFileO)
	throws IOException,FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(nomeFileI);
		DataInputStream dis= new DataInputStream(fis);

		FileOutputStream fos= new FileOutputStream(nomeFileO);
		DataOutputStream dos = new DataOutputStream(fos);
		try
		{

			int val=0;
			while (true) //ESCO CON ECCEZIONE EOFEXCEPTION
			{
				val=dis.readInt();
				if(val>=-5 && val<=5)
				{
					//scrivo in altro file binario
					dos.writeInt(val);
				}
			}
		}
		catch(IOException e) 
		{
			fos.close();

			fis.close();
		}
	}
}