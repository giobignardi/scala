import forcomp.Anagrams.{Word, Occurrences}

def wordOccurrences(w: Word): Occurrences = w.toLowerCase().toList.groupBy(c => c).mapValues(_.size).toList.sorted

val parol = "abcd"

wordOccurrences(parol)

val bo = "abcd".toList.groupBy(letter=>letter).toList.map(x => (x._1,x._2.length))

val sent = List("abc","cde","cba")

//sent.flatMap(x=>wordOccurrences(x)).groupBy(x=>x._1) reduceRight (_+_)

sent.map(w=>(w,wordOccurrences(w))).groupBy(tupla=>tupla._1)







