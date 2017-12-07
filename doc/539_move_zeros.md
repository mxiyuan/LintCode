### 问题描述

给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序

### 注意事项

1.必须在原数组上操作
2.最小化操作数

###　样例
给出 nums = [0, 1, 0, 3, 12], 调用函数之后, nums = [1, 3, 12, 0, 0].

### 求解

使用pos记录第一个0的位置，之后找到非0的值就和pos上的值进行交换