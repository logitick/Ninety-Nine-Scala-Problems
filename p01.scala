object P01 {
	def main(args:Array[String]) = {
		println (last(List(1, 1, 2, 3, 5, 8)))
		println (lastBuiltIn(List(1, 1, 2, 3, 5, 8)))
	}

	def last(list:List[Int]):Int = list(list.length-1)
	

    def lastBuiltIn(list:List[Int]):Int = list.last
}
