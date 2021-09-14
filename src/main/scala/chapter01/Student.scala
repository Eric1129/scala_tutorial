package chapter01

class Student(name:String, var age: Int) {
    def printInfo(): Unit = {
        println(this.name + " " + this.age + " " + Student.school)
    }


}

// 引入伴生对象
object Student{
    val school : String = "McGill"

    def main(args: Array[String]): Unit = {
        val alice = new Student("alice", 20)
        val bob = new Student("bob", 23)

        alice.printInfo()
        bob.printInfo()
    }
}
