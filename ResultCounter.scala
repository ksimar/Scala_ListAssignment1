/*package simar.ListAssignment {

case class Marks(subjectId:Int,studentId:Long,marksObtained:Float){
  def isPass(percentage:Int):Boolean={
    if(marksObtained>=percentage) true else false
  }

}

case class Student(id:Long,name:String)


  object ResultCounter extends App {


    val marksList = List(Marks(1, 1, 95), Marks(1, 2, 67), Marks(1, 3, 89), Marks(1, 4, 78), Marks(1, 5, 90), Marks(1, 6, 54), Marks(1, 7, 40), Marks(1, 8, 70), Marks(1, 9, 35), Marks(1, 10, 60), Marks(5, 1, 95), Marks(5, 2, 67), Marks(5, 3, 89), Marks(5, 4, 78), Marks(5, 5, 90), Marks(5, 6, 54), Marks(5, 7, 40), Marks(5, 8, 70), Marks(5, 9, 35), Marks(5, 10, 60), Marks(2, 1, 95), Marks(2, 2, 67), Marks(2, 3, 89), Marks(2, 4, 78), Marks(2, 5, 90), Marks(2, 6, 54), Marks(2, 7, 40), Marks(2, 8, 70), Marks(2, 9, 35), Marks(2, 10, 60), Marks(3, 1, 95), Marks(3, 2, 67), Marks(3, 3, 89), Marks(3, 4, 78), Marks(3, 5, 90), Marks(3, 6, 54), Marks(3, 7, 40), Marks(3, 8, 70), Marks(3, 9, 35), Marks(3, 10, 60), Marks(4, 1, 95), Marks(4, 2, 67), Marks(4, 3, 89), Marks(4, 4, 78), Marks(4, 5, 90), Marks(4, 6, 54), Marks(4, 7, 40), Marks(4, 8, 70), Marks(4, 9, 35), Marks(4, 10, 60))

    val studentList = List(Student(1, "Kunal"), Student(2, "Himanshu"), Student(3, "Anmol"), Student(4, "Geetika"), Student(5, "Mahesh"), Student(6, "Simarpreet"), Student(7, "Ramandeep"), Student(8, "Anuj"), Student(9, "Jatin"), Student(10, "Pankhuri"))

    /*object Extremes extends Enumeration {

  }
  import Extremes._
*/


    def checkPassCount(subjectId: Int, percentage: Int, result: String): String = {


      result.toLowerCase match {
        case "pass" =>
          s"Pass count: ${marksList.flatMap(x => if (x.subjectId == subjectId && x.isPass(percentage)) Some(x) else None).length.toString}"
        case "fail" =>
          s"Fail count: ${marksList.flatMap(x => if (x.subjectId == subjectId && !x.isPass(percentage)) Some(x) else None).length.toString}"
        case _ => "Heyy"
      }

    }

    private def max(count: Int, marks: Marks ) = {
      val list = List[Int]()
      for(i<-1 to count)yield{

      }
    }
    def extractParticulars(subjectId: Int, count: Int, extremes : String) = //extracts student details on the basis of value of type and count parameters
    {                                                                     // here type can be either top or bottom
            extremes.toLowerCase() match {
            //  case "top" => marksList.flatMap(x => if(x.subjectId == subjectId && x.marksObtained))
            }                                                              //eg. if input is like (1, 5, top) => it displays the details of top 5 students in subjectId 1

    }


    println("Pass/Fail Count is: " + checkPassCount(1, 50, "pass"))
    println("Pass/Fail Count is: " + checkPassCount(1, 95, "fail"))
  }

}
*/