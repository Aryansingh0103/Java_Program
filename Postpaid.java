import java.io.*;

class InputValidationException extends Exception {
    public InputValidationException(String s1) {
        super(s1);
    }
}

class Postpaid_Bill {
    int mobile_no;
    int customer_id;
    String bill_date;
    int monthly_transactions[];

    void get_Postpaidbill() throws InputValidationException, IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter mob no: ");
            mobile_no = Integer.parseInt(br.readLine());
            System.out.println("Enter cust id: ");
            customer_id = Integer.parseInt(br.readLine());
            System.out.println("Enter bill date: ");
            bill_date = br.readLine();
            monthly_transactions = new int[5];
            System.out.println("Enter 5 monthly transactions: ");
            for (int i = 0; i < 5; i++) {
                monthly_transactions[i] = Integer.parseInt(br.readLine());
            }
        } catch (NumberFormatException e) {
            throw new InputValidationException("Invalid input");
        }
    }

    int getTotalAmount() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += monthly_transactions[i];
        }
        return sum;
    }
}

public class Postpaid {
    public static void main(String args[]) throws InputValidationException, IOException {
        Postpaid_Bill obj = new Postpaid_Bill();
        try {
            obj.get_Postpaidbill();
            int x = obj.getTotalAmount();
            System.out.println("Amount: " + x);
        } catch (InputValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
