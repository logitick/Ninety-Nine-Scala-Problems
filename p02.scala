object P02 {
  def main(args:Array[String]) = {
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
    println(penultimateBuiltIn(List(1, 1, 2, 3, 5, 8)))
  }

  def penultimate(list:List[Int]) = list(list.length - 2)

  def penultimateBuiltIn(list:List[Int]) = list.init.last

}
