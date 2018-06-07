mid = l+(r-l)/2; // this is for the negative number case

see if current mid is a potential candidate, if yes, include mid by max = mid; if not, exclude mid by min = mid+1;