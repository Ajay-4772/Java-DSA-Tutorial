import java.util.Scanner;

public class EarliestFinishTime {

    public static int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                         int[] waterStartTime, int[] waterDuration) {

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {

            for (int j = 0; j < waterStartTime.length; j++) {


                int landFinish = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int finish1 = waterStart + waterDuration[j];


                int waterFinish = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterFinish, landStartTime[i]);
                int finish2 = landStart + landDuration[i];

                answer = Math.min(answer, Math.min(finish1, finish2));
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of land rides: ");
        int n = sc.nextInt();

        int[] landStartTime = new int[n];
        int[] landDuration = new int[n];

        System.out.println("Enter land start times:");
        for (int i = 0; i < n; i++) {
            landStartTime[i] = sc.nextInt();
        }

        System.out.println("Enter land durations:");
        for (int i = 0; i < n; i++) {
            landDuration[i] = sc.nextInt();
        }

        System.out.print("Enter number of water rides: ");
        int m = sc.nextInt();

        int[] waterStartTime = new int[m];
        int[] waterDuration = new int[m];

        System.out.println("Enter water start times:");
        for (int i = 0; i < m; i++) {
            waterStartTime[i] = sc.nextInt();
        }

        System.out.println("Enter water durations:");
        for (int i = 0; i < m; i++) {
            waterDuration[i] = sc.nextInt();
        }

        int result = earliestFinishTime(
                landStartTime,
                landDuration,
                waterStartTime,
                waterDuration
        );

        System.out.println("Earliest finish time: " + result);

        sc.close();
    }
}