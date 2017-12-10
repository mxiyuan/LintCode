### 问题描述

给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)

### 样例

对于字符串 "abcdefg".

offset=0 => "abcdefg"
offset=1 => "gabcdef"
offset=2 => "fgabcde"
offset=3 => "efgabcd"

### 求解

翻转前一半，翻转后一半，整体翻转

