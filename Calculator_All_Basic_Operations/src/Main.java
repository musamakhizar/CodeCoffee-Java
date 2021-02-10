import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        ArrayList<Double> input =new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        
        int menuSelector = 0;
        int optionSelector = 0;
        
        do {
        System.out.print("--- Main Menu ---"
        		
        		+ "\n"
        		+ "\n1- Get Input(number) From User"
        		+ "\n2- Show Inputs(numbers) in List"
        		+ "\n3- Operations"
        		+ "\n4- Clear All Inputs"
        		+ "\n5- Exit"
        		+ "\n\nInput: ");
        menuSelector = scanner.nextInt();
        System.out.println();
        
        switch (menuSelector) {
		case 1: {
			
			System.out.print("Enter Number : ");
			input.add(scanner.nextDouble());
			System.out.println("\nNumber Added To List !"
					+ "\n--Add Another number or perform operation from menu--\n");
			break;
		}
		case 2: {
			for (Double d : input) {
				System.out.println("-------------------------------------");
				System.out.println("Number is: "+d.doubleValue());
				System.out.println("-------------------------------------");
			}	
			break;
		}
		case 3: {
			do
	        {
	        	System.out.print("\n--- Operation Menu ---"
	        		+ "\n-Select Operation From Menu List-"
	        		+ "\n"
	        		+ "\n1- Addition (+)"
	        		+ "\n2- Subtraction (-)"
	        		+ "\n3- Multiplication(*)"
	        		+ "\n4- Division(/)"
	        		+ "\n5- Modulus//Remainder(%)"
	        		+ "\n6- Square (n*n)"
	        		+ "\n7- Square Root"
	        		+ "\n8- Natural Log"
	        		+ "\n9- Exit"
	        		+ "\n--Please Enter Number According to operation you want to Perform!"
	        		+ " \n Input: ");
	        
	        optionSelector = scanner.nextInt();
	        System.out.println();
	        
	        double output = 0;
	        
	        switch (optionSelector) {
			
	        case 1: {
	        	
	        	for( double num : input) {
                    output =+  num;
                }
                System.out.println("-----------------------------------\n"
                		+"Sum of All Number is "+ output
                		+"\n-----------------------------------");
                optionSelector = 9;
				break;
			}
			case 2: {
				for( double num : input) {
                    output = output-num;
                }
                System.out.println("-----------------------------------\n"
                		+"Subtraction of All Number is "+output
                		+"\n-----------------------------------");
                optionSelector = 9;
                break;
			}
			case 3: {
				for( double num : input) {
                    output = output*num;
                }
                System.out.println("-----------------------------------\n"
                		+"Multiple of All Number is "+output
                		+"\n-----------------------------------");
                optionSelector = 9;
                break;
			}
			case 4: {
				for( double num : input) {
                    if (num!=0)
                        output = output/num;
                    else
                        System.out.println("Division is not possible as you input 0");
                }
                System.out.println("-----------------------------------\n"
                		+"Division of All Number is "+output
                		+"\n-----------------------------------");
                optionSelector = 9;
                break;
			}
			case 5: {
				for( double num : input) {
                    output = output%num;
                }
                System.out.println("-----------------------------------\n"
                		+ "Reminder of All Number is "+output
                		+"\n-----------------------------------");
                optionSelector = 9;
                break;
			}
			case 6: {
				for( int  num=0;num< input.size();num++) {
                    System.out.println("-----------------------------------\n"
							+"Square of "+input.get(num) +" = "+input.get(num)*input.get(num)
							+"\n-----------------------------------"
                    		);
                }
				optionSelector = 9;
				break;
			}
			case 7: {
				for( int  num=0;num< input.size();num++) {
                    System.out.println("-----------------------------------\n"
							+"SquareRoot of "+input.get(num) +" = "+Math.sqrt(input.get(num))
							+"\n-----------------------------------"
                    		);
                }
				optionSelector = 9;
				break;
			}
			case 8: {
				for( int  num=0;num< input.size();num++) {
                    
					System.out.println("-----------------------------------\n"
							+ "Log of "+input.get(num) +" = "+Math.log(input.get(num))
							+"\n-----------------------------------"
							);
					
                }
				optionSelector = 9;
				break;
			}
			case 9: {
				optionSelector = 9;
				break;
			}
			
			default:
				throw new IllegalArgumentException("You have entered wrong operator! \nUnexpected value: " + optionSelector);
			}
	        
	        }while(optionSelector == 0 || optionSelector !=9);	
			break;
		}
		case 4: {
			input.clear();
			System.out.println("The List Is Cleared!");
			break;
		}
		case 5: {
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + menuSelector);
		}
        }while(menuSelector!=5);
        
        System.out.println("\n-- Program Ended --");
         }
}