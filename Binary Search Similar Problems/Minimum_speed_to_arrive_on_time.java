public class Minimum_speed_to_arrive_on_time {

    public static int minSpeedOnTime(int dist[], double hour) {
        if (hour < dist.length - 1)
            return -1;
        int left = 0;
        int right = 10000000;
        int ans = -1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (checkSpeed(dist, hour, mid) == true) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static boolean checkSpeed(int dist[], double hour, double speed) {
        double time = 0;
        int i = 0;
        while (time <= hour && i < dist.length - 1) {
            time += Math.ceil(dist[i] / speed);
            i++;
        }
        time += dist[dist.length - 1] / speed;
        return time <= hour;
    }

    public static void main(String[] args) {
        int dist[] = { 1, 3, 2 };
        double hour = 6;
        System.out.println(minSpeedOnTime(dist, hour));
    }
}


// Check 1011, 1522, 1553, 1555