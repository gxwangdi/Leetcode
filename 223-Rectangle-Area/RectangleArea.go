func computeArea(A int, B int, C int, D int, E int, F int, G int, H int) int {
	if A > G || E > C {
		return (C-A)*(D-B) + (G-E)*(H-F)
	}
	if F > D || B > H {
		return (C-A)*(D-B) + (G-E)*(H-F)
	}
	right := min(C, G)
	left := max(A, E)
	top := min(H, D)
	bottom := max(F, B)

	return (G-E)*(H-F) + ((C-A)*(D-B) - (right-left)*(top-bottom))
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
