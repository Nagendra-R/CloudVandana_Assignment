var a = [53, 11, 34, 12, 18];

for(var i = 0; i < a.length; i++) {
    for(var j=0; j < a.length; j++) {
        if(a[i] > a[j]) {
            var temp = a[i];
            a[i] = a[j];
            a[j] = temp;        
        }
    }
}

console.log("Array:: ", a);