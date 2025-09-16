
Deque<Integer> dq = new ArrayDeque<>();
int[] res = new int[n - k + 1];

for (int i = 0; i < n; i++) {
    if (!dq.isEmpty() && dq.peekFirst() == i - k)
        dq.pollFirst();

    while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
        dq.pollLast();

    dq.offerLast(i); 
    if (i >= k - 1)
        res[i - k + 1] = nums[dq.peekFirst()];
}
