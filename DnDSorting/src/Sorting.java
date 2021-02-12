import java.io.*;
import java.util.*;


public class Sorting 
{


	public static void main(String[] args) throws IOException 
	{
		boolean run = true;
		LinkedList<String> Stores = new LinkedList<String>();
		LinkedList<String> classes = new LinkedList<String>();
		
		while(run)
		{
	
		String pick = Welcome();
		choose(pick);
		Find(Stores, pick, classes);
		run = quit();
		
		}
		

	}
	
	public static boolean quit()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\nIf you would like to quit please type: recursion!");
		System.out.println("If not just type any key to continue:");
		String end = in.nextLine();
		
		if (end.equals("recursion!"))
		{
			System.out.println("GOOD JOB MY DUDE!");
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static String Welcome()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the D&D sorting program!!!\n");
		System.out.print("What skill would you like to sort by, here are the options:");
		System.out.println("\n___________________________________________________________\n\n");
		System.out.println("Strength\nDexterity\nConstitution\nIntelligence\nWisdom\nCharisma\n");
		System.out.println("Please input the skill you would like!");
		String pick = in.nextLine();
		return pick;
	}
	
	public static void choose(String pick)
	{
		switch(pick.charAt(0))
		{
		case 'S':
		case 's':
		{
			System.out.println("You picked Strength!!!");
			break;
		}
		case 'D':
		case 'd':
		{
			System.out.println("You picked Dexterity!!!");
			break;
		}
		case 'I':
		case 'i':
		{
			System.out.println("You picked Intelligence!!!");
			break;
		}
		case 'W':
		case 'w':
		{
			System.out.println("You picked Wisdom!!!");
			break;
		}
		case 'C':
		case 'c':
		{
			switch(pick.charAt(1))
			{
				case 'O':
				case 'o':
				{
					System.out.println("You picked Constitution!!!");
					break;
				}
				case 'H':
				case 'h':
				{
					System.out.println("You picked Charsima!!!");
					break;
				}
			}
			
		}
			
			
		}
		
	}
	
	public static void store(LinkedList<String> Stores, LinkedList<String> classes) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("characters.txt"));
		
		String Line = "hi";
	
		
		while(Line!=null)
		{
			Line = br.readLine();
			Stores.add(Line);
			
		}
		for(int i = 0; 0<Stores.size(); i++)
		{
			if (Stores.get(i)==null)
			{
				break;
			}
			if (Stores.get(i).contains("-"))
			{
				classes.add(Stores.get(i));
			}
		}
		
	
		
	}
	
	
	public static void Find(LinkedList<String> Stores, String pick, LinkedList<String> classes ) throws IOException
	{
		int sort [] = new int[12];
		String convert [] = new String [12];
		store(Stores, classes);
		int size = 0;
		
		
		switch(pick.charAt(0))
		{
		case 'S':
		case 's':
		{
			for(int i = 0; 0<Stores.size(); i++)
			{
						if (Stores.get(i)==null)
						{
							break;
						}
				
						if (Stores.get(i).contains(":") && Stores.get(i).contains("Strength"))
						{
						String [] s = Stores.get(i).split(":");
						String r = s[1].substring(0);
						int t = Integer.parseInt(r);
						convert[size] = r;
						sort[size] = t;
						
						size++;
						}
			
			}
			MergeSort ko = new MergeSort();
			ko.sorte(sort, 0, sort.length-1);
			int scroll = 0;
			int lim = 13;
			
			try
			{
				
			for (int g = 0; 0<13; g++)
			{
				if (sort[g]==16)
				{
					scroll++;
				}
				
				for (int c = 0; 0<lim; c++)
				{
					if (sort[g] == Integer.parseInt(convert[c]))
					{
						
						System.out.print(classes.get(c) + " ");
						break;
						
					}
					
					if (scroll==2)
					{
						for (int h = convert.length-1; h>=0; h--)
						{
							
							if (sort[g] == Integer.parseInt(convert[h]))
							{
								System.out.print(classes.get(h) + " ");
								scroll--;
								break;
							}
						}
					}
					
						
					
				}
			
				System.out.print("(");
				System.out.print(sort[g]);
				System.out.println(")");
				
			}
			}catch(java.lang.ArrayIndexOutOfBoundsException e)
			{
				
			}
			break;
		}
		case 'D':
		case 'd':
		{
			for(int i = 0; 0<Stores.size(); i++)
			{
						if (Stores.get(i)==null)
						{
							break;
						}
				
						if (Stores.get(i).contains(":") && Stores.get(i).contains("Dexterity"))
						{
						String [] s = Stores.get(i).split(":");
						String r = s[1].substring(0);
						int t = Integer.parseInt(r);
						convert[size] = r;
						sort[size] = t;
						
						size++;
						}
			
			}
			MergeSort ko = new MergeSort();
			ko.sorte(sort, 0, sort.length-1);
			int scroll = 0;
			int lim = 13;
			
			try
			{
				
			for (int g = 0; 0<13; g++)
			{
				if (sort[g]==17)
				{
					scroll++;
				}
				for (int c = 0; 0<lim; c++)
				{
					if (sort[g] == Integer.parseInt(convert[c]))
					{
					System.out.print(classes.get(c) + " ");
					break;
					}
					
					
					if (scroll==2)
					{
						for (int h = convert.length-1; h>=0; h--)
						{
							
							if (sort[g] == Integer.parseInt(convert[h]))
							{
								System.out.print(classes.get(h) + " ");
								scroll--;
								break;
							}
						}
					}
				}
				
				System.out.print("(");
				System.out.print(sort[g]);
				System.out.println(")");
				
			}
			}catch(java.lang.ArrayIndexOutOfBoundsException e)
			{
				
			}
			break;
		}
		case 'I':
		case 'i':
		{
			for(int i = 0; 0<Stores.size(); i++)
			{
						if (Stores.get(i)==null)
						{
							break;
						}
				
						if (Stores.get(i).contains(":") && Stores.get(i).contains("Intelligence"))
						{
						String [] s = Stores.get(i).split(":");
						String r = s[1].substring(0);
						int t = Integer.parseInt(r);
						convert[size] = r;
						sort[size] = t;
						
						size++;
						}
			
			}
			MergeSort ko = new MergeSort();
			ko.sorte(sort, 0, sort.length-1);
			int scroll = 0;
			int lim = 13;
			
			try
			{
				
			for (int g = 0; 0<13; g++)
			{
				
				for (int c = 0; 0<lim; c++)
				{
					if (sort[g] == Integer.parseInt(convert[c]))
					{
					System.out.print(classes.get(c) + " ");
					break;
					}
					
					if (scroll==2)
					{
						for (int h = convert.length-1; h>=0; h--)
						{
							
							if (sort[g] == Integer.parseInt(convert[h]))
							{
								System.out.print(classes.get(h) + " ");
								scroll--;
								break;
							}
						}
					}
				}
				
				System.out.print("(");
				System.out.print(sort[g]);
				System.out.println(")");
				
			}
			}catch(java.lang.ArrayIndexOutOfBoundsException e)
			{
				
			}
			break;
		}
		case 'W':
		case 'w':
		{
			for(int i = 0; 0<Stores.size(); i++)
			{
						if (Stores.get(i)==null)
						{
							break;
						}
				
						if (Stores.get(i).contains(":") && Stores.get(i).contains("Wisdom"))
						{
						String [] s = Stores.get(i).split(":");
						String r = s[1].substring(0);
						int t = Integer.parseInt(r);
						convert[size] = r;
						sort[size] = t;
						
						size++;
						}
			
			}
			MergeSort ko = new MergeSort();
			ko.sorte(sort, 0, sort.length-1);
			int scroll = 0;
			int lim = 13;
			
			try
			{
				
			for (int g = 0; 0<13; g++)
			{
				if (sort[g]==9)
				{
					scroll++;
				}
				for (int c = 0; 0<lim; c++)
				{
					if (sort[g] == Integer.parseInt(convert[c]))
					{
					System.out.print(classes.get(c) + " ");
					break;
					}
					
					if (scroll==2)
					{
						for (int h = convert.length-1; h>=0; h--)
						{
							
							if (sort[g] == Integer.parseInt(convert[h]))
							{
								System.out.print(classes.get(h) + " ");
								scroll--;
								break;
							}
						}
					}
				}
				
				System.out.print("(");
				System.out.print(sort[g]);
				System.out.println(")");
				
			}
			}catch(java.lang.ArrayIndexOutOfBoundsException e)
			{
				
			}
			break;
		}
		case 'C':
		case 'c':
		{
			switch(pick.charAt(1))
			{
				case 'O':
				case 'o':
				{
					for(int i = 0; 0<Stores.size(); i++)
					{
								if (Stores.get(i)==null)
								{
									break;
								}
						
								if (Stores.get(i).contains(":") && Stores.get(i).contains("Constitution"))
								{
								String [] s = Stores.get(i).split(":");
								String r = s[1].substring(0);
								int t = Integer.parseInt(r);
								convert[size] = r;
								sort[size] = t;
								
								size++;
								}
					
					}
					MergeSort ko = new MergeSort();
					ko.sorte(sort, 0, sort.length-1);
					int scroll = 0;
					int scroll2 = 0;
					int lim = 13;
					
					try
					{
						
					for (int g = 0; 0<13; g++)
					{
						if (sort[g]==15)
						{
							scroll++;
						}
						if (sort[g]==19)
						{
							scroll2++;
						}
						for (int c = 0; 0<lim; c++)
						{
							if (sort[g] == Integer.parseInt(convert[c]))
							{
							System.out.print(classes.get(c) + " ");
							break;
							}
							
							if (scroll==2 || scroll2==3)
							{
								for (int h = convert.length-1; h>=0; h--)
								{
									
									if (sort[g] == Integer.parseInt(convert[h]))
									{
										System.out.print(classes.get(h) + " ");
										scroll--;
										scroll2++;
										break;
									}
								}
							}
						}
						
						
						System.out.print("(");
						System.out.print(sort[g]);
						System.out.println(")");
						
					}
					}catch(java.lang.ArrayIndexOutOfBoundsException e)
					{
						
					}
					break;
				}
				case 'H':
				case 'h':
				{
					for(int i = 0; 0<Stores.size(); i++)
					{
								if (Stores.get(i)==null)
								{
									break;
								}
						
								if (Stores.get(i).contains(":") && Stores.get(i).contains("Charisma"))
								{
								String [] s = Stores.get(i).split(":");
								String r = s[1].substring(0);
								int t = Integer.parseInt(r);
								convert[size] = r;
								sort[size] = t;
								
								size++;
								}
					
					}
					MergeSort ko = new MergeSort();
					ko.sorte(sort, 0, sort.length-1);
					int scroll = 0;
					int scroll2 = 0;
					int lim = 13;
					
					try
					{
						
					for (int g = 0; 0<13; g++)
					{
						if (sort[g]==11)
						{
							scroll++;
						}
						if (sort[g]==30)
						{
							scroll2++;
						}
						for (int c = 0; 0<lim; c++)
						{
							if (sort[g] == Integer.parseInt(convert[c]))
							{
							System.out.print(classes.get(c) + " ");
							break;
							}
							
							if (scroll==2 || scroll2==3)
							{
								for (int h = convert.length-1; h>=0; h--)
								{
									
									if (sort[g] == Integer.parseInt(convert[h]))
									{
										System.out.print(classes.get(h) + " ");
										scroll--;
										scroll2++;
										break;
									}
								}
							}
						}
						
						System.out.print("(");
						System.out.print(sort[g]);
						System.out.println(")");
						
					}
					}catch(java.lang.ArrayIndexOutOfBoundsException e)
					{
						
					}
					break;
				}
			}
			
		
	}
	

}
	}

	
}
