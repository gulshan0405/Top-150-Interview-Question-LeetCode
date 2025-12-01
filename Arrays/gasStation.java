public class gasStation {
       public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int curGas = 0;
        int sumGas = 0;
        int sumCost = 0;
       
        for (int i = 0; i < n; i++) {
            sumGas += gas[i];
            sumCost += cost[i];
            curGas += (gas[i] - cost[i]);
            if (curGas < 0) {
                start = i + 1;
                curGas = 0;
            }
        }
        
        if (sumGas < sumCost) {
            return -1;
        }
        return start;
    }
}
