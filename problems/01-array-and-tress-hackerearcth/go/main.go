package main

import (
	"fmt"
)

func findDistinctInner(arr []int, elem int, start int) int {
	count := 0
	visited := make(map[int]int)

	for i := start; i < len(arr); i++ {
		if elem == arr[i] {
			return count
		}

		_, ok := visited[arr[i]]
		if !ok {
			visited[arr[i]] = 1
			count++
		}

	}

	return 0
}

func solve(arr []int) []int {
	n := len(arr)
	res := make([]int, 0, n)
	i := 0
	visited := make(map[int]int)

	for i < n {
		elem := arr[i]
		_, ok := visited[elem]
		if !ok {
			visited[elem] = 1
			distInner := findDistinctInner(arr, elem, i+1)
			res = append(res, distInner+1)
		}

		i++
	}

	return res

}

func main() {
	var n int
	fmt.Scanf("%d", &n)

	arr := make([]int, 0, n)

	for i := 0; i < n; i++ {
		var num int
		fmt.Scanf("%d", &num)
		arr = append(arr, num)
	}

	// fmt.Println(arr)

	// arr := []int{1, 2, 1}
	res := solve(arr)
	fmt.Println(res)

	// fmt.Println(math.Pow(600, 1000))

}
