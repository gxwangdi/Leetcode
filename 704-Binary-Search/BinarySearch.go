func search(nums []int, target int) int {
	if nums == nil || len(nums) < 1 {
		return -1
	}
	left := 0
	right := len(nums) - 1
	for left+1 < right {
		mid := left + (right-left)/2
		if nums[mid] == target {
			return mid
		}
		if nums[mid] < target {
			left = mid + 1
			continue
		}
		right = mid - 1
	}
	if nums[left] == target {
		return left
	}
	if nums[right] == target {
		return right
	}
	return -1
}
