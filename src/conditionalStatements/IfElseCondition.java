package conditionalStatements;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String customerName = "John Doe";
		        int creditScore = 720;
		        double income = 55000.0;
		        boolean isEmployed = true;
		        double debtToIncomeRatio = 35.0;
		        
		        System.out.println("Checking loan for " + customerName);
		        
		        if(creditScore > 750){
		            System.out.println("Loan Approved");
		        }
		        else if(creditScore >= 650 && creditScore <= 750){
		            if(income >= 50000){
		                if(isEmployed == true){
		                    if(debtToIncomeRatio < 40){
		                        System.out.println("Loan Approved");
		                    }
		                    else{
		                        System.out.println("Loan Denied due to high debt ratio");
		                    }
		                }
		                else{
		                    System.out.println("Loan Denied because customer is not employed");
		                }
		            }
		            else{
		                System.out.println("Loan Denied because income is less than 50000");
		            }
		        }
		        else{
		            System.out.println("Loan Denied because credit score is low");
		        }
		    }


	}

