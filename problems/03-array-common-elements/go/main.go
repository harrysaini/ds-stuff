package main

import "fmt"

func arrayContainsCommonElements(arr1 []int, arr2 []int) bool {
	dict := make(map[int]struct{})

	for _, elem := range arr1 {
		dict[elem] = struct{}{}
	}

	for _, elem := range arr2 {
		_, ok := dict[elem]
		if ok {
			return true
		}
	}

	return false
}

func main() {

	arr1 := []int{1, 2, 3, 4, 5, 6, 7}
	arr2 := []int{11, 12}

	fmt.Println(arrayContainsCommonElements(arr1, arr2))

}
