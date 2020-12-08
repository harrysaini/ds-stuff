package main

import "fmt"

func sumExistInArray(arr []int, sum int) bool {
	dict := make(map[int]struct{})

	for _, elem := range arr {
		diff := sum - elem
		_, ok := dict[diff]
		if ok {
			return true
		}
		dict[elem] = struct{}{}
	}

	return false
}

func main() {

	arr := []int{3, 2, 3, 10}
	sum := 22

	fmt.Println(sumExistInArray(arr, sum))
}
