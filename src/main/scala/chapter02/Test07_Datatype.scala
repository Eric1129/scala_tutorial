package chapter02

import chapter01.Student

object Test07_Datatype {

    def main(args: Array[String]): Unit = {
        // 1. 整数类型
        val a1: Byte = 127;
        // val a2: Byte = 128;

        val a3 = 12 // 整数默认类型为Int

        val a4 = 123456789L // 长整型数值定义

        val b1: Byte = 10
        val b2: Byte = (10 + 29) // 编译器的bug报错，其实能运行
        val b4: Byte = (b1 + 29).toByte

        // 2. 浮点类型
        val f1: Float = 1.2345f
        val d1 = 34.2245    // 小数点默认为double

        // 3. 字符类型
        val c1 = 'a'
        println(c1)

        val c2: Char = '9'
        println(c2)

        // 特殊字符
        val c3: Char = '\t'
        val c4: Char = '\n'

        // 转义字符
        val c5 = '\\'
        val c6 = '\"'

        // 字符变量底层保存ASCII码
        val i1: Int = c1;
        println("i1: " + i1)
        val i2: Int = c2;
        println("i2: " + i2)

        val c7 = (i1+1).toChar
        println(c7)
        val c8 = (i2-1).toChar
        println(c8)

        // 4. boolean
        val isTrue: Boolean = true;
        println(isTrue)

        // 5. 空类型
        // 5.1 空值 Unit
        def m1():Unit = {
            println("m1被调用执行")
        }

        val a = m1();
        println(a)

        // 5.2 空引用
        var student: Student = new Student("alice", 20)
        student = null
        println(student)

        // 5.3 Nothing
        def m2(n: Int): Nothing = {
            throw new NullPointerException
        }

        val b = m2(0);
        println(b)
    }


}
