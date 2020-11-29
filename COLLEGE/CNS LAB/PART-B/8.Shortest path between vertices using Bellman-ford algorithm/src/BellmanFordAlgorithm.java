import java.util.Scanner;

public class BellmanFordAlgorithm {

    private static void shortest_path(int n, int start, Double[][] a){
        Double[] D = new Double[n+1];

        for(int i = 1; i <= n; i++) {
            D[i] = Double.POSITIVE_INFINITY;
        }

        D[start] = 0.0;           // Distance From Source To Itself Is Zero

        for(int k = 1; k <= n-1; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    if((a[i][j] != Double.POSITIVE_INFINITY) && (D[i] + a[i][j] < D[j])) {
                        D[j] = D[i] + a[i][j];
                    }
                }
            }
        }


        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(a[i][j] != Double.POSITIVE_INFINITY) {
                    if(D[i] + a[i][j] < D[j]) {
                        System.out.println("The Graph contains negative edge cycle. *PROGRAM TERMINATED*");
                        System.exit(0);
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            if((D[i] == Double.POSITIVE_INFINITY) || (D[i] == Double.NEGATIVE_INFINITY)) {
                System.out.println(i+" Is Not Reachable from Source " + start);
            }
            else {
                System.out.println("Distance of " + i + " from Source " + start + " is: " + D[i] +" Units");
            }

        }

    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of vertices:");
        int n = in.nextInt();

        Double[][] a = new Double[n+1][n+1];

        System.out.println("Enter the values into the distance matrix, Use 'Infinity' For No Link");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                a[i][j] = in.nextDouble();
            }
        }

        System.out.print("Enter the source vertex: ");
        int source = in.nextInt();

        if((source <= 0) || (source > n)) {
            System.out.println("Invalid source vertex entered");
            System.exit(0);
        }

        shortest_path(n, source, a);
    }

}
