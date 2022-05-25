import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Dictionary 
{
	
	
	private static int index=1;
	static List<DictionarySource>Dictionary=new LinkedList<>();
	static Stack<DictionarySource>DictionaryStack=new Stack<>();
	static Set<DictionarySource> DictionarySet=new HashSet<>();
	static boolean REVERSE=false;
	static boolean DISTINCT=false;
	static  boolean notValid=false;

		
	static Set<Object>localSet=new HashSet<>();
	static Stack<Object>localStack=new Stack<>();
	
	static Stack<String> temp=new Stack<>();
	static String anotherOne="";
	static String anotherTwo="";
	static String anotherThree="";
	static String anotherFour="";
	

	static String[] commandArray= {"!help","!q","DISTINCT","REVERSE"};
	
	
	static String [] param= { "NOUN","ADJECTIVE","ADVERB","PRONOUN","INTERJECTION","PREPOSITION","CONJUNCTION","VERB","DISTINCT","REVERSE"} ;
	
	//for 4th param 
	
	static String[] keywordz= {"DISTINCT","REVERSE"};
	
	
	//2nd param tester
	static String [] speech= { "NOUN","ADJECTIVE","ADVERB","PRONOUN","INTERJECTION","PREPOSITION","CONJUNCTION","VERB"};
	
	
	//for first param
	static String [] serchTerm= {"BOOK","ARROW","REVERSE","PLACEHOLDER","DISTINCT","!q","!help"};

	
	//that is for 2nd param
	
	static String[]allTerms= {"BOOK","ARROW","REVERSE","PLACEHOLDER","!q","!help", "NOUN","ADJECTIVE","ADVERB","PRONOUN","INTERJECTION","PREPOSITION","CONJUNCTION","DISTINCT","REVERSE","VERB","!help","!q"};

	public enum AllEnums
	{
		
		
//I added enum values from line 64-85 because professor said u have to add  another 14 keywords
//__________________________________________________________________			
		WNOUN1("Work","[noun]",":a task or tasks to be undertaken"),
		WNOUN2("Work,","[noun]",":something has to be done or made"),
		WNOUN3("Work,","[noun]",":  to be updated "),
		WNOUN4("Work,","[noun]",":  to be updated "),
		WVERB1("Work", "[verb]",":have the desired result"),
		WVERB2("Word","[verb]",":to be updated "),
		KNOUN1("Key","[noun]",":to be updated "),
		KNOUN2("Key","[noun]",":to be updated "),
		KNOUN3("Key","[noun]",":to be updated "),
		KNOUN4("Key","[noun]",":to be updated "),
		ZNOUN("Zebra","[noun]",":to be updated "),
		LNOUN("LION","[noun]",":to be updated "),
		CNOUN("Car","[noun]",":to be updated "),
		ENOUN("Ethane","[noun]",":to be updated "),
		GNOUN("Gain","[noun]",":to be updated "),
		HADJ("Hot","[adjective]",":to be updated "),
		INOUN("Island","[noun]",":to be updated "),
		JNOUN("Joker","[noun]",":excellent movie of 2019 "),
		LNOUN2("Life","[noun]",":to be updated "),
		MNOUN("Money","[noun]",":to be updated "),
		ONOUN("Owl","[noun]",":to be updated "),
		PNOUN("Policy","[noun]",":to be updated "),
		
//__________________________________________________________________		
		
		
		
		
		
		
		
		
		BNOUN1("Book" ,"[noun]" ,": A set of pages"),
		BVERB1("Book", "[verb]", ": To arrange for someone to have a seat on a plane." ),
		BNOUN2("Book", "[noun]" ,": A written work published in printed or electronic form"),
		BVERB2("Book", "[verb]", ": To arrange something on a particular date." ),
		ANOUN("Arrow" ,"[noun]" ,": Here is one arrow: <IMG> -=>> </IMG>"),
		RADJECTIVE1("Reverse","[adjective]",  ": On back side."),
		RADJECTIVE2("Reverse", "[adjective]", ": Opposite to usual or previous arrangement."),
		RVERB1("Reverse","[verb]", ": Change something to opposite"),
		RVERB3("Reverse","[verb]", ": To be updated..."),
		RVERB2("Reverse","[verb]", ": Go back"),
		RVERB4("Reverse","[verb]", ": To be updated..."),
		RVERB5("Reverse","[verb]", ": Turn something inside out."),
		RVERB6("Reverse","[verb]", ": Revoke ruling"),
		RNOUN1("Reverse","[noun]" , ": A dictionary program's parameter"),
		RNOUN2("Reverse","[noun]" ,": Change to opposite direction."),
		RNOUN3("Reverse","[noun]" , ": The opposite."),
		RNOUN4("Reverse","[noun]" , ": To be updated..."),
		RNOUN5("Reverse","[noun]" , ": To be updated..."),
		RNOUN6("Reverse","[noun]" , ": To be updated..."),
		RNOUN7("Reverse","[noun]" , ": To be updated..."),
		DADJECTIVE1 ("Distinct" , "[adjective]" ,": Familiar. Worked in Java."),
		DNOUN2 ("Distinct", "[noun]", ": A keyword in this assignment."),
		DADJECTIVE2 ("Distinct", "[adjective]" , ": Unique. No duplicates. Clearly different or of a different kind."),
		DAVERB ("Distinct", "[adverb]",  ": Uniquely. Written \"distinctly\"."),
		DNOUN1 ("Distinct", "[noun]", ": A keyword in this assignment."),
		DNOUN3 ("Distinct", "[noun]", ": A keyword in this assignment."),
		DNOUN4 ("Distinct", "[noun]", ": An advanced search option"),
		DNOUN5 ("Distinct", "[noun]", ": Distinct is a parameter in this assignment."),
		PADJECTIVE1("Placeholder" ,"[adjective] ",": To be updated..."),
		PADJECTIVE2("Placeholder" ,"[adjective] ", ": To be updated..."),
		PADVERB("Placeholder", "[adverb] ", ": To be updated..."),
		PCONJUNCTION("Placeholder","[conjunction] ",": To be updated..."),
		PINTERJECTION("Placeholder" ,"[interjection] ",": To be updated..."),
		PNOUN1("Placeholder" , "[noun] ",": To be updated..."),
		PNOUN2("Placeholder", "[noun] ",": To be updated..."),
		PNOUN3("Placeholder", "[noun] ",": To be updated..."),
		PPREPOSITION("Placeholder", "[preposition] ", ": To be updated..."),
		PPRONOUN("Placeholder", "[pronoun] ", ": To be updated..."),
		PVERB("Placeholder" ,"[verb] ",": To be updated...");
		
		private String s1;
		private String s2;
		private String s3;
		
		
		private AllEnums(String s1,String s2,String s3)
		{
			
			this.s1=s1;
			this.s2=s2;
			this.s3=s3;
		}
		
		
		public String getBook()
		{
			return this.s1+ this.s2+ this.s3;
		}
		
	
		public String getFirstString()
		{
			return this.s1;
		}
		

		public String getSecondString()
		{
			return this.s2;
		}
		
		public String getThirdString()
		{
			return this.s3;
		}
		
		
		@Override
		public String toString()
		{
			return this.s1+ this.s2+ this.s3;
		}
	}
	
	
	//("\t |");
	
	private static void nextRelease()
	{	System.out.println("     "+ "|");
		System.out.println("      "+"<NOT FOUND> To be considered for the next release. Thank you.");
		System.out.println("     "+ "|");
	}
	
	private  static void defaultPrinter()
	{
		
		System.out.println("     "+ "|");
		System.out.println("      "+"PARAMETER HOW-TO, please enter:");
		System.out.println("      "+"1. A search key -then 2. An optional part of speech -then");
		System.out.println("      "+"3. An optional 'distinct' -then 4. An optional 'reverse'");
		//System.out.println("\t |");
		
	}
	
	private static void Display()
	{
		System.out.println("     "+ "|");
		System.out.print("Search "+ "["+index+"]" + ":  ");
		
		
	}
	
	private static List<String> wordCounter(String sentence)
	{
		
		List<String>temp= new ArrayList<>();
		String local="";
		char c;
		int counter=sentence.length();
		int index=0;
		
		while(sentence!=null && index!=counter)
		{
			c=sentence.charAt(index);
			if(c==' ')
			{
				if(local!="")
				{
					temp.add(local);
					local="";
				}
				
			}else
			{
				local+=c;
			}
			index++;
			
		}
		if(local!="")
		{
			temp.add(local);
		}
		return temp;	
	}
	

	
	private  static void  Switch(List<String>l1,String[]speech,String []allTerms,String[]serchTerm)
	{
			
		String s="Distinct";
		String g="REverse";
	
		switch(l1.size())
		{
		
		case 4:
	
			if(g.equalsIgnoreCase(l1.get(3)))
			{
				temp.add(g);
				anotherFour=g;
			}else
			{
				 System.out.println("     "+ "|");
				 System.out.println("      "+"<The entered 4th parameter '" + l1.get(3) + "' is NOT 'reverse'.>");
				 System.out.println("      "+"<The entered 4th parameter '" + l1.get(3) + "' was disregarded.>");
				 System.out.println("      "+"<The 4th parameter should be  'reverse'.>");
				 System.out.println("     "+ "|");
			}
			
	
		case 3:
		
			 s="Distinct";
			
			if(s.equalsIgnoreCase(l1.get(2)))
			{
				temp.add(s);
				anotherThree=s;
			}else if(g.equalsIgnoreCase((l1.get(2))))
			{
						
						temp.add(g);
						anotherThree=g;
					
						
			}else
			{
				
				
				
				System.out.println("     "+ "|");
				
				System.out.println("      "+"<The entered 3rd parameter '" + l1.get(2) + "' is NOT 'distinct'.>");
				System.out.println("      "+"<The entered 3rd parameter '" + l1.get(2) + "' is NOT 'reverse'.>");
				System.out.println("      "+"<The entered 3rd parameter '" + l1.get(2) + "' was disregarded.>");
				System.out.println("      "+"<The 3rd parameter should be 'distinct' or 'reverse'.>");
				System.out.println("     "+ "|");
			}
		
		
		
		case 2:
			
			boolean con=false;
		for(String t:allTerms)
			{
				if(t.equalsIgnoreCase(l1.get(1)))
				{
					temp.add(t);
					anotherTwo=t;
					con=true;
				}
			}
		if(!con)
		{
			
			
			System.out.println("     "+ "|");
			System.out.println("      "+"<The entered 2nd parameter '" + l1.get(1) + "' is NOT a part of speech.>");
			System.out.println("      "+"<The entered 2nd parameter '" + l1.get(1) + "' is NOT 'distinct'.>");
			System.out.println("      "+"<The entered 2nd parameter '" + l1.get(1) + "' is NOT 'reverse'.>");
			System.out.println("      "+"<The entered 2nd parameter '" + l1.get(1) + "' was disregarded.>");
			System.out.println("      "+"<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
			System.out.println("     "+ "|");
		}
		
		case 1:
		for(String t:serchTerm)
		{
			if(t.equalsIgnoreCase((l1.get(0))))
			{
					temp.add(t);
					anotherOne=t;
			}
		}
			
		break;
		
		
		default:
			
		defaultPrinter();
		
	}
	
		
	}
	
	
	static class DictionarySource implements Comparable<DictionarySource>
	{
		
		private String s1;
		private String s2;
		private String s3;
		
		
		public DictionarySource()
		{
			this(null,null,null);
		}
		public DictionarySource(String s1,String s2,String s3)
		{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		}
		public void setS1(String s1)
		{
			this.s1=s1;
		}
		public void setS2(String s2)
		{
			this.s2=s2;
		}
		public void setS3(String s3)
		{
			this.s3=s3;
		}
		public String getS1()
		{
			return this.s1;
		}
		
		public String getS2()
		{
			return this.s1;
		}
		
		public String getS3()
		{
			return this.s1;
		}
		
		@Override
		public int hashCode()
		{
			return Objects.hash(s1,s2,s3);
		}
		@Override
		public String toString ()
		{
			return  this.s1+ "  " +this.s2+" "+ this.s3;
		}
		
		@Override
		public boolean equals(Object obj)
		{
			
			if(obj instanceof DictionarySource)
			{
				
				DictionarySource other=(DictionarySource) obj;
				
				if(other.s1.equalsIgnoreCase(this.s1))
				{
					if(other.s2.equalsIgnoreCase(this.s2))
					{
						
						if(other.s3.equalsIgnoreCase(this.s3))
						{
							
							return true;
						}else
						{
							return false;
						}
						
					}else
					{
						return false;
					}
					
			}else
				{
					return false;
				}
				
				
				
				
				
			}else
			{
				return false;
			}
			
			
		}
		@Override
		public int compareTo(DictionarySource o) 
		{
			
			int firstComparison=this.s1.compareToIgnoreCase(o.s1);
			int secondComparison=this.s2.compareToIgnoreCase(o.s2);
			int thridComparison=this.s3.compareToIgnoreCase(o.s3);
			
			if(firstComparison==0)
			{
				if(secondComparison==0)
				{
					return thridComparison;
					
				}else
				{
					return secondComparison;
				}
			}else
			{
				return firstComparison;
			}
		}
	}
	
	public static  class DictionaryDataStorage
	{
	
		public DictionaryDataStorage()
		{
			
		}
		
	
		public List<DictionarySource> MatchingSearchesTwoParams(String word1 ,String word2)
		{
			
			List<DictionarySource>localList1=new LinkedList<>();
			List<DictionarySource>localList2=new LinkedList<>();
			localList1=this.MatchingSearchesSingleParam(word1);
			boolean validWord=false;
			
			for(String s:param)
			{
				if(s.equals(word2.toUpperCase()))
				{
					validWord=true;
					break;
				}
			}
			
			
			
			if(validWord)
			{
				
				if(word2.equalsIgnoreCase("Distinct"))
				{
					DISTINCT=true;
					while(!localList1.isEmpty())
					{
						
						DictionarySet.add(localList1.remove(0));
					}
					Iterator Set =DictionarySet.iterator();
					while(Set.hasNext())
					{
						localList2.add((DictionarySource) Set.next());
					}
					
					Collections.sort(localList2);
					DictionarySet.clear();
					
				}else if (word2.equalsIgnoreCase("Reverse"))
				{
					
					 REVERSE=true;
					 while(!localList1.isEmpty())
					 {
					 DictionarySource tempoarary=localList1.remove(0);
					 localList2.add(0,tempoarary);
					 }
					
				}else 
				{
					
					int localCounter=0;
					while(!localList1.isEmpty())
					{
						
						DictionarySource tempoarary=localList1.remove(0);
						
						if(tempoarary.s2.contains(word2.toLowerCase()))
						{
							localCounter++;
							localList2.add(tempoarary);
						}
						
					}
					if(localCounter==0)
					{
						nextRelease();
						defaultPrinter();
					}
					
				}
			}else
			{	System.out.println("     "+ "|");
				System.out.println("      "+"<The entered 2nd parameter '" + word2 + "' is NOT a part of speech.>");
				System.out.println("      "+"<The entered 2nd parameter '" + word2 + "' is NOT 'distinct'.>");
				System.out.println("      "+"<The entered 2nd parameter '" + word2 + "' is NOT 'reverse'.>");
				System.out.println("      "+"<The entered 2nd parameter '" + word2 + "' was disregarded.>");
				System.out.println("     "+ "|");
				localList2=localList1;
			}
			
			return localList2;
			
		}
		
		
		public List<DictionarySource> MatchingSearchesThreeParams(String word1,String word2,String word3)
		{
		
			Set<DictionarySource>localSet=new HashSet<>();
			List<DictionarySource>localList3=new LinkedList<>();
			List<DictionarySource>localList4=new LinkedList<>();
			localList3=this.MatchingSearchesTwoParams(word1, word2);
			
			if(REVERSE)
			{
				
				if(word3.equalsIgnoreCase("Distinct"))
				{
					DISTINCT=true;
					while(!localList3.isEmpty())
					{
						DictionarySet.add(localList3.remove(0));
					}
					Iterator Set=DictionarySet.iterator();
					while(Set.hasNext())
					{
						localList4.add((DictionarySource)Set.next());
					}
					
					Collections.sort(localList4);
					DictionarySet.clear();
			    } 
				
			}else if (DISTINCT)
			{
				
				if(word3.equalsIgnoreCase("REVERSE"))
				{
					REVERSE=true;
					
					while(!localList3.isEmpty())
					{
						localList4.add(0,localList3.remove(0));
					}
					
				}
				
				
			
			}else
			{
				 if(word3.equalsIgnoreCase("reverse"))
				     {
					    REVERSE=true;
					    while(!localList3.isEmpty())
					    {
					    	localList4.add(0,localList3.remove(0));
					    }
				     }else if (word3.equalsIgnoreCase("DIstinct"))
					    {
				    	    DISTINCT=true;
							while(!localList3.isEmpty())
							{
								DictionarySet.add(localList3.remove(0));
							}
				    	    Iterator Set=DictionarySet.iterator();
							while(Set.hasNext())
							{
								localList4.add((DictionarySource)Set.next());
							}
							
							Collections.sort(localList4);
							DictionarySet.clear();
							
					    }else 
					        {
				            localList4=localList3;
					        }
			}
			
			
			return localList4;
			
				
				
		
	}
		
		
		
		public List<DictionarySource> MatchingSearchesFourParams(String word1,String word2,String word3,String word4)
		{
			List<DictionarySource>localList5=new LinkedList<>();
			List<DictionarySource>localList6=new LinkedList<>();
			localList5=this.MatchingSearchesThreeParams(word1, word2, word3);
			
		
			if(REVERSE && DISTINCT)
			{
				localList6=localList5;
			}else if (DISTINCT)
				{
					
					if(word4.equalsIgnoreCase("REVERSE"))
							{
								REVERSE=true;
								while(!localList5.isEmpty())
								{
								localList6.add(0,localList5.remove(0));
								}
							}
				}else if(word4.equalsIgnoreCase("REVERSE") && !REVERSE)
					{
						REVERSE=true;
						while(!localList5.isEmpty())
						{
						localList6.add(0,localList5.remove(0));
						}
					}else
					{
						
						localList6=localList5;
					}
				
		
			return localList6;
			
		}

		
		public List<DictionarySource> MatchingSearchesSingleParam(String word)
		{
			
			List<DictionarySource>localList=new LinkedList<>();
				int  count=Dictionary.size()-1;
				int  increment=0;
				
				while(increment<=count)
				{
					if(Dictionary.get(increment).s1.equalsIgnoreCase(word))
					{
					  localList.add(Dictionary.get(increment));
					}
					increment++;
					}
				
			
				
				return localList;
			
			
		}
		
		
		
	
		public   void DictionaryWriter()
		{
			
		for(AllEnums local:AllEnums.values())
		{
			Dictionary.add(new DictionarySource(local.s1,local.s2,local.s3));
		}
		
			Collections.sort(Dictionary);
		}
}
	
	private static void paramResetter()
	{
		anotherOne="";
		anotherTwo="";
		anotherThree="";
		anotherFour="";
		DISTINCT=false;
		REVERSE=false;
	}
	
	
	
	public static void main (String args[])
	{
		
		
		
		
		new DictionaryDataStorage().DictionaryWriter();
		
		List<String> optionalCommand=new LinkedList<>();
		
		for(String s:commandArray)
		{
			optionalCommand.add(s);
		}
		
		for(String s:speech)
		{
			optionalCommand.add(s);
		}
		
		boolean isOver=true;
		

		List<String >cmndLine=new LinkedList<>();
		cmndLine.add("!help");
		cmndLine.add("!q");
		List<String>speechList=new LinkedList<>();
		
		for(String s:speech)
		{
			speechList.add(s);
		}
		
		
	
		
		List<String> SearchAbleTerm=new LinkedList<>();
		SearchAbleTerm.add("BOOK");
		SearchAbleTerm.add("ARROW");
		SearchAbleTerm.add("DISTINCT");
		SearchAbleTerm.add("PLACEHOLDER");
		SearchAbleTerm.add("REVERSE");
		SearchAbleTerm.add("NOUN");
		SearchAbleTerm.add("ADJECTIVE");
		SearchAbleTerm.add("ADVERB");
		SearchAbleTerm.add("PRONOUN");
		SearchAbleTerm.add("INTERJECTION");
		SearchAbleTerm.add("PREPOSITION");
		SearchAbleTerm.add("CONJUNCTION");
		
		System.out.println("! Loading data...\n" + 
				"! Loading completed...\n" + 
				"                       \n"+
				"===== DICTIONARY 340 JAVA =====\n " +
				"----- Keywords: 19\n" + 
				"----- Definitions: 61\n" + 
				"");
		
		
		Scanner scan=new Scanner(System.in);
		
		String input;
		while(isOver)
		{
			
			Display();
			input=scan.nextLine();
		List<String> inputword=new LinkedList<>();
		inputword=wordCounter(input);
		index++;
			
			
			if(inputword.size()!=0 && inputword.size()<=4) 
			{
			Switch(inputword,speech,allTerms,serchTerm);
		
			if(anotherOne!="") 
			{
		   if(anotherOne.equalsIgnoreCase(cmndLine.get(0))||anotherOne.equalsIgnoreCase(cmndLine.get(1)))
				{
					if(temp.peek().equalsIgnoreCase(cmndLine.get(0)))
					{
						temp.pop();
						defaultPrinter();
						
					}else  
					{
						System.out.println();
						System.out.println("-----THANK YOU-----");
						isOver=false;
					}
					paramResetter();
					
			}else if (SearchAbleTerm.contains(anotherOne.toUpperCase()))
				{
					if(anotherFour!="")
					{
						List<DictionarySource>localList=new DictionaryDataStorage().MatchingSearchesFourParams(anotherOne, anotherTwo, anotherThree, anotherFour);
						System.out.println("     "+ "|");
						while(!localList.isEmpty())
						{
						
						System.out.println("      "+localList.remove(0));
				
						}
						paramResetter();
						
					}else if (anotherThree!="")
					{
						List<DictionarySource>localList=new DictionaryDataStorage().MatchingSearchesThreeParams(anotherOne, anotherTwo, anotherThree);
						System.out.println("     "+ "|");
						while(!localList.isEmpty())
						{
							
						System.out.println("      "+localList.remove(0));
				
						}
						paramResetter();
							
						
						
					}else if(anotherTwo!="")
					{
						
						List<DictionarySource>localList=new LinkedList<>();
						localList=new DictionaryDataStorage().MatchingSearchesTwoParams(anotherOne, anotherTwo);
						System.out.println("     "+ "|");
						while(!localList.isEmpty())
						{
							
						System.out.println("      "+localList.remove(0));
				
						}
						paramResetter();
							
						}else 
					
						{
							List<DictionarySource>localList=new LinkedList<>();
						 localList=new DictionaryDataStorage().MatchingSearchesSingleParam(anotherOne);
						 System.out.println("     "+ "|");
						 while(!localList.isEmpty())
							{
									
							System.out.println("      "+localList.remove(0));
					
							}
						 paramResetter();
							
								
					}
					
       }else
				{
					defaultPrinter();
				}
		
		}else
		{				nextRelease();
						defaultPrinter();
			
		}

			}else
			{
				defaultPrinter();
			}	
	}
	
	}
	
}
