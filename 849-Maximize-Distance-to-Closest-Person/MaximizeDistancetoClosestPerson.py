class Solution(object):
    def maxDistToClosest(self, seats):
        """
        :type seats: List[int]
        :rtype: int
        """
        res = self._maxZeroDistance(seats)
        if res%2 == 1:
            return res/2+1
        return res/2

    def _maxZeroDistance(self, seats):
        """
        :type seats: List[int]
        :rtype: int
        """
        isB=True
        res=0
        count = 0
        for i in seats:
            if i == 0:
                count+=1
            else:
                if isB:
                    res = max(res, count*2)
                else:
                    res = max(res, count)
                isB = False
                count = 0
        if count!= 0:
            res = max(res, count*2)
        return res
