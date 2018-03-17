package fetchSequence;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class processSequence {
	public static DecimalFormat dec2 = new DecimalFormat("#.##");
	public void getProteinSeq() {
		
			try {
					File inputfile = new File("/path/to/sequence.fasta");
					Scanner fasta = new Scanner(inputfile);

						ArrayList<String> aar = new ArrayList<String>();
						
	       					while (fasta.hasNextLine()) {
	       						String crash = fasta.nextLine();
	                            aar.add(crash);
	       					}
	       					
	       						aar.remove(0); //remove element 0 = fasta header:
	       						String e = aar.toString();
	       						String regex = e.replaceAll("[\\s+\\-\\+\\.\\[\\]\\^:,]",""); //remove header using regex
	       						fasta.close();
       	   					
	       								System.out.println("\n"+"Starting Amino Acid Sequence: "+"\n");
	       								System.out.println(regex + "\n" +  "\n" +"Proein Sequence Length = " + regex.length());
       	   					
	       												String [] malta = regex.split("");

	       																String goodHeader = ""; 
	       																for (String everyoneLovesGoodHeader : malta) {
	       																			goodHeader += everyoneLovesGoodHeader ;
	       																}
	       						
	       													@SuppressWarnings("resource")
	       													Scanner input = new Scanner(System.in); //obtain user input
	       					
	       											System.out.println("\n"+"Enter Amino Acid Residue Number for Target Mutation: ");
	       											int a = input.nextInt(); //read first number from user
							
	       							System.out.println("\n"+"Enter Amino Acid Mutation (Letter): ");
	       								String b = input.next();
	       							
	       							System.out.println("\n"+"The Mutation Is: "+b+" At Residue Number "+a+"\n");

	       							int c = a-1; //eliminate element "0"
	       							
       			       				String s = goodHeader;
       			       				List<String> myList = new ArrayList<String>(Arrays.asList(s.split("(?!^)")));
       			       				
       			       				myList.set(c, b);
       			       			
       			       		String result;
       			       		result = myList.toString();
       			       		result = myList.toString().replace("[", "").replace("]", "").replace(",", "").replaceAll(" ","");
       			       		
       			       System.out.println("Mutant Protein Sequence: "+"\n" + "\n" + result);
       			       
				}	
                  catch (Exception e){ 
                  }  
            }
		}
