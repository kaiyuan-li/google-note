for (int i = 1; i<idxArr.length; i++) {
    int idx = idxArr[i-1];
    while (idx>0 && chArr[idx] != chArr[i]) { idx = idxArr[idx-1];}
    idxArr[i] = idx;
    if (chArr[i] == chArr[idx]) idxArr[i]++;
}