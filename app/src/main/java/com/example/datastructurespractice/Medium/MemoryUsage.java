package com.example.datastructurespractice.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MemoryUsage {
    public static int[] getMaxMemoryUsageRangeWithUsage(int[][] input) {

        int[] res = new int[3];
        Arrays.sort(input, (a, b) -> (a[0] - b[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> (a[1] - b[1]));

        pq.add(input[0]);
        int range = Integer.MAX_VALUE;
        for (int i = 1; i < input.length; i++) {

            int[] curProcess = input[i];
            int[] earliestProcess = pq.poll();

            int eEnd = earliestProcess[1];
            int sCur = curProcess[0];

            if (eEnd >= sCur) {
                int curUsage = curProcess[2] + earliestProcess[2];
                if (curUsage >= res[2]) {

                    int curRange = eEnd - sCur;
                    if (curRange != 0 && curRange < range) {

                        res[2] = curUsage;
                        res[0] = sCur;
                        res[1] = eEnd;
                        pq.offer(res);
                        range = curRange;
                    }
                }
            } else {
                if (res[2] != 0 && res[2] < curProcess[2]) {
                    res[0] = curProcess[0];
                    res[1] = curProcess[1];
                    res[2] = curProcess[2];
                    pq.offer(res);
                } else {
                    pq.offer(curProcess);
                }
            }
        }

        return res;
    }

    //SECOND CODE

        public static void main(String[] args) {

            int[][] test = new int[][]{{4, 8, 19}, {1, 5, 8}, {2, 8, 10}, {20, 30, 10}};
            //new int[]{4, 5, 37})
            // new int[][]{{4, 8, 19}, {1, 5, 8}, {2, 8, 10}, {20, 30, 80}}, new int[]{20, 30, 80});
            System.out.println("Tests :" + peakMemoryUsage(test));
        }

        /*private static boolean test(int[][] intervals, int[] expected) {
            System.out.println("\nIntervals :" + GenericPrinter.toString(intervals));
            System.out.println("Expected :" + GenericPrinter.toString(expected));

            int[] obtained = peakMemoryUsage(intervals);
            System.out.println("Obtained :" + GenericPrinter.toString(obtained));

            return GenericPrinter.equalsValues(expected, obtained);


        }*/

        /**
         * Algorithm:
         * <p>
         * Sort start times with an nlogn sorting algorithm and store it.
         * Sort end times with an nlogn sorting algorithm and store it.
         * <p>
         * We traverse sorted start times and add to an accumulator,
         * but after traversing one start time, we traverse as many end times as needed to "catch up"
         * to the start time and we subtract that from the accumulator. Take the max of accumulator vs the current max at each traversal.
         *
         * @param intervals
         * @return
         */
        private static int[] peakMemoryUsage(int[][] intervals) {
            if (null == intervals || intervals.length == 0)
                return new int[0];
            int n = intervals.length;


            class Interval {

                int id;
                int memoryUsage;
                int interval;

                public Interval(int id, int memoryUsage, int interval) {
                    this.id = id;
                    this.memoryUsage = memoryUsage;
                    this.interval = interval;
                }
            }
            //contains start time and its id
            List<Interval> start = new ArrayList<>(n);
            List<Interval> end = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {

                start.add(new Interval(i, intervals[i][2], intervals[i][0]));
                end.add(new Interval(i, intervals[i][2], intervals[i][1]));
            }

            //Sort start times .
            start.sort( Comparator.comparingInt( o -> o.interval));

            //Sort end times .
            end.sort(Comparator.comparingInt(o -> o.interval));


            int maxMemory = 0;
            int currentMemory = 0;
            int si = -1;
            int ei = -1;

            int i = 0;
            int j = 0;
            while (i < n && j < n) {

                int s = start.get(i).interval;
                int e = end.get(j).interval;

                if (s <= e) {
                    currentMemory += start.get(i).memoryUsage;
                    i++;
                } else {
                    currentMemory -= end.get(j).memoryUsage;
                    j++;
                }

                if (currentMemory > maxMemory) {
                    maxMemory = currentMemory;
                    si = s;
                    ei = e;
                }
            }

            return new int[]{si, ei, maxMemory};

        }

}
