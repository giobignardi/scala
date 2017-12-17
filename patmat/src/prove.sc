import patmat.Huffman._

val decodedSecret: List[Char] = decode(frenchCode, secret)

def quickEncode(tree: CodeTree)(text: List[Char]): List[Bit] = {
  val myTable : CodeTable = convert(tree)
  text.flatMap(c => codeBits(myTable)(c))
}
convert(frenchCode)

decode(frenchCode,encode(frenchCode)(decodedSecret))

decode(frenchCode,quickEncode(frenchCode)(decodedSecret))

val a = 'a' :: 'b' :: List()
val b = 'c' :: 'd' :: List()
a ::: b

encode(frenchCode)(decodedSecret)
quickEncode(frenchCode)(decodedSecret)

