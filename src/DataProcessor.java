import java.util.List;


/**
 * DataProcessor.
 */
public class DataProcessor
{
	public List<String> items;

	public DataProcessor(List<String> items)
	{
		this.items = items;
	}

	public void process()
	{
		if (items != null)
		{
			for (int i = 0; i < items.size(); i++)
			{
				if (items.get(i).length() > 0 && items.get(i).length() < 99)
				{
					System.out.println("Item: " + items.get(i).toUpperCase());
				}
			}
		}

		if (items != null)
		{
			int count = 0;
			for (String s : items)
			{
				if (s.length() > 0)
				{
					count++;
				}
			}
			System.out.println("Total count: " + count);
		}
	}
}
