import java.util.*;
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int n = heights.length;

        for (int i = 0; i < n - 1; i++) {
System.out.println(heights[i + 1] +"   "+ heights[i]);
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                if (ladders > 0) {
                    q.offer(diff);
                    if (q.size() > ladders) {
                        bricks -= q.poll();
                    }
                } else {
                    bricks -= diff;
                }
System.out.println(q);
                if (bricks < 0) {
                    return i;
                }
            }
        }

        return n - 1;
    }
}

class Demo1642
{
	public static void main(String [] ar)
	{
		int x [] = {4,12,2,7,3,18,20,3,19};
		int b = 10;
		int l = 2;
		Solution s = new Solution();
		int ans = s.furthestBuilding(x,b,l);
		System.out.println(ans);
	}
}