/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map = new Map();
    const n = nums.length;

    for(let i = 0; i < n; i++){
        const reqNum = target-nums[i];
        if(map.has(reqNum)){
            return [map.get(reqNum),i];
        }else{
            map.set(nums[i],i);
        }
    }

};