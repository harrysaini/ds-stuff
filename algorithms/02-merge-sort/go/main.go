package main

import "fmt"

func combineSortedArrays(arr1 []int, arr2 []int) []int {
	resultArr := make([]int, 0, len(arr1)+len(arr2))

	i, j := 0, 0

	for i < len(arr1) && j < len(arr2) {
		if arr1[i] < arr2[j] {
			resultArr = append(resultArr, arr1[i])
			i++
		} else {
			resultArr = append(resultArr, arr2[j])
			j++
		}
	}

	resultArr = append(resultArr, arr1[i:]...)
	resultArr = append(resultArr, arr2[j:]...)

	return resultArr
}

func mergeSort(arr []int) []int {
	if len(arr) <= 1 {
		return arr
	}
	mid := len(arr) / 2
	leftArray := arr[:mid]
	rightArray := arr[mid:]

	leftArray = mergeSort(leftArray)
	rightArray = mergeSort(rightArray)

	return combineSortedArrays(leftArray, rightArray)
}

func main() {
	arr := []int{1, 4, 3, 2, 5, 6, 7, 2, 3, 6, 1}

	fmt.Println(mergeSort(arr))
}
