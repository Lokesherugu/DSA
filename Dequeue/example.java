//✅  Real Example: Sliding Window Max

Deque<Integer> dq = new ArrayDeque<>();
int[] res = new int[n - k + 1];

for (int i = 0; i < n; i++) {
    // Remove from front if out of window
    if (!dq.isEmpty() && dq.peekFirst() == i - k)
        dq.pollFirst();

    // Remove smaller values from back
    while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
        dq.pollLast();

    dq.offerLast(i); // Push current index

    if (i >= k - 1)
        res[i - k + 1] = nums[dq.peekFirst()];
}