fun main(){
    var selection = 0
    println("Enter Selection")
    println("[1] Registration")
    println("[2] Compute Grades")
    selection = readln().toInt()

    when (selection){
        1-> {
            println("Student Registration!")
            println("Enter Name: ")
            var name = readln()
            println("Enter Course: ")
            var course = readln()

            println("Do you want to register $name with course $course?")
            var response = readln()

            if (response == "Yes" || response == "YES"){
                println("Registered successfully!")
            }else {
                println("Registration Failed!")
            }

        }
        2-> {
            println("Student Grade computation!")
            println("Enter your grade 1: ")
            var grade1 = readln().toDouble()
            println("Enter your grade 2: ")
            var grade2 = readln().toDouble()
            println("Enter your grade 3: ")
            var grade3 = readln().toDouble()

            var gradeAverage = (grade1 + grade2 + grade3)/3
            println("Average is $gradeAverage")
            if (gradeAverage > 74){
                println("Passed!")
            }else {
                println("Failed!")
            }
        }else ->{
            println("Invalid!!!")
        }
    }
}