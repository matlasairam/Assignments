package operatorsAndLoops;

public class Loops {

	public static void main(String[] args) {
		        
		        // Array to store all transactions
		        int transactions[] = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};
		        
		        // Variables to store counts and totals
		        int creditCount = 0;
		        int debitCount = 0;
		        int totalCredit = 0;
		        int totalDebit = 0;
		        int suspiciousCount = 0;
		        
		        // Go through each transaction
		        for (int i = 0; i < transactions.length; i++) {
		            
		            // Credit transaction
		            if (transactions[i] > 0) {
		                creditCount = creditCount + 1;
		                totalCredit = totalCredit + transactions[i];
		                
		                // Check for suspicious credit
		                if (transactions[i] > 10000) {
		                    System.out.println("Suspicious credit transaction with Amount: " + transactions[i]);
		                    suspiciousCount = suspiciousCount + 1;
		                }
		            }
		            
		            // Debit transaction
		            if (transactions[i] < 0) {
		                debitCount = debitCount + 1;
		                totalDebit = totalDebit + transactions[i];
		                
		                // Check for suspicious debit
		                if (transactions[i] < -10000) {
		                    System.out.println("Suspicious debit transaction with Amount: " + transactions[i]);
		                    suspiciousCount = suspiciousCount + 1;
		                }
		            }
		        }
		        
		        // Calculate remaining balance
		        int balance = totalCredit + totalDebit;
		        
		        // Print all results
		        System.out.println();
		        System.out.println("Total Credit Transactions = " + creditCount);
		        System.out.println("Total Debit Transactions = " + debitCount);
		        System.out.println("Total Amount Credited = " + totalCredit);
		        System.out.println("Total Amount Debited = " + Math.abs(totalDebit));
		        System.out.println("Remaining Balance in Bank Account = " + balance);
		        System.out.println("Total Suspicious Transactions = " + suspiciousCount);
		   
		}


	}

