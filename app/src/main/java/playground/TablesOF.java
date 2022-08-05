//Print multiplication table of 24, 50 and 29 using loop.
package playground;

public class TablesOF {
    public static void main(String[] args) {
        int n1 = 24 , n2 = 50, n3 = 29;
        System.out.println("-------------------------------------------------");
        for (int i = 1; i<=10 ; i++){

            System.out.println(n1*i+"\t\t"+n2*i+"\t\t"+n3*i);
        }
        System.out.println("-------------------------------------------------");
    }
}
