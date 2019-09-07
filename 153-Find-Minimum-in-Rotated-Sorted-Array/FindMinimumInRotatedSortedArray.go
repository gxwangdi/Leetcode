func findMin(nums []int) int {
	left := 0
	right := len(nums) - 1
	target := nums[right]
	for left+1 < right {
		mid := left + (right-left)/2
		if nums[mid] <= target {
			right = mid
		} else {
			left = mid
		}
	}
	if nums[left] <= target {
		return nums[left]
	}
	return nums[right]
}
