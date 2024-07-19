import java.util.*; 

class Siri1{
    public static void main(String args[]) {
        String data, tempData = "";
        Scanner S = new Scanner(System.in); 
        System.out.println("Enter the string:");
        data = S.nextLine();
        for (int i = data.length() - 1; i >= 0; i--) { 
            tempData += data.charAt(i); 
        }
        System.out.println(tempData); 
    
    }
}