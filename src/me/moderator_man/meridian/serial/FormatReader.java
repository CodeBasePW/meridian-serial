package me.moderator_man.meridian.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FormatReader<T>
{
	@SuppressWarnings("unchecked")
	public T read(String path)
	{
		try
		{
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path))))
			{
				return (T) ois.readObject();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
