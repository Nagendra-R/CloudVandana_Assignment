
function wordsReverser(string){
    var words = string.split(' ');
    var result = [];
    for(var i = 0; i < words.length; i++){
      result.push(words[i].split('').reverse().join(''));
    }  
    return result.join(' ');
 }
 
 console.log(wordsReverser('I am applying for CloudVandana'));



