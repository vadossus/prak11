enum class DayOfWeek(val day: String, val value: Int) {
    Monday("Понедельник",1),
    Tuesday("Вторник",2),
    Wednesday("Среда",3),
    Thursday("Четверг",4),
    Friday("Пятница",5),
    Saturday("Суббота", 6),
    Sunday("Воскресенье",7);

    fun ItsVixodnoi() : Boolean
    {
        return this == Saturday || this == Sunday
    }

    fun DayColor()
    {
        var colorkod = when (this)
        {
            Monday -> "\u001B[33m"
            Tuesday -> "\u001B[31m"
            Wednesday -> "\u001B[34m"
            Thursday -> "\u001B[37m"
            Friday -> "\u001B[30m"
            Saturday -> "\u001b[35m"
            Sunday -> "\u001B[32m"
        }
        println("$colorkod${this.day}\u001B[0m")
    }








}