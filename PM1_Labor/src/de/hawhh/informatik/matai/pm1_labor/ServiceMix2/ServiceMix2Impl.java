package de.hawhh.informatik.matai.pm1_labor.ServiceMix2;

public class ServiceMix2Impl implements ServiceMix2
{
	public ServiceMix2Impl()
	{

	}

	public int[][] ergaenzeUmSummenzeile(int[][] matrix)
	{
		int[][] erg = null;
		if (matrix == null || matrix.length == 0)
		{
			throw new IllegalArgumentException();
		}

		if (matrix.length != 3)
		{
			for (int i = 0; i < matrix.length; i++)
			{
				if (matrix[i].length != 3 || matrix[i] == null)
				{
					throw new IllegalArgumentException();
				}
			}
		}

		for (int i = 0; i < matrix.length; i++)
		{
			if (matrix[i].length != matrix[0].length || matrix[i] == null || matrix[i].length == 0)
			{
				throw new IllegalArgumentException();
			}
		}

		if (matrix.length == 3)
		{
			erg = new int[matrix.length][matrix[0].length + 1];
			for (int i = 0; i < matrix.length; i++)
			{
				for (int j = 0; j < matrix[i].length; j++)
				{
					erg[i][j] = matrix[i][j];
					erg[i][matrix[0].length] += matrix[i][j];
				}
			}
		} else
		{
			erg = new int[matrix.length + 1][matrix[0].length];
			for (int i = 0; i < matrix.length; i++)
			{
				erg[i] = matrix[i];
				for (int j = 0; j < matrix[i].length; j++)
				{
					erg[matrix.length][j] += matrix[i][j];
				}
			}
		}
		return erg;
	}

	public int[][] ss()
	{
		int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 } };
		return myArray;
	}
}
