abstract class Employee(val name: String, val employeeId: Int) {
    abstract fun displayInfo()
}

class TemporaryStaff(name: String, employeeId: Int, val contractDuration: Int) : Employee(name, employeeId) {
    override fun displayInfo() {
        println("Temporary Staff - Name: $name, ID: $employeeId, Contract Duration: $contractDuration months")
    }
}

class PermanentStaff(name: String, employeeId: Int, val department: String) : Employee(name, employeeId) {
    override fun displayInfo() {
        println("Permanent Staff - Name: $name, ID: $employeeId, Department: $department")
    }
}

fun main() {
    val tempStaff = TemporaryStaff("Alice", 101, 6)
    val permStaff = PermanentStaff("Bob", 201, "HR")

    tempStaff.displayInfo()
    permStaff.displayInfo()
}
