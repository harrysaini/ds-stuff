package main

import "fmt"

func binarySearch(arr []int, elem int, start int, end int) int {
	// END CASE
	if start >= end {
		return -1
	}
	mid := (start + end) / 2

	if arr[mid] == elem {
		return mid
	} else if arr[mid] > elem {
		return binarySearch(arr, elem, start, mid)
	} else {
		return binarySearch(arr, elem, mid+1, end)
	}
}

func findElemIndex(arr []int, elem int) int {
	return binarySearch(arr, elem, 0, len(arr))
}

func main() {
	arr := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}

	fmt.Println(findElemIndex(arr, 9))
}
