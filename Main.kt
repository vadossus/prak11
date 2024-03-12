fun main(){
    for (day in DayOfWeek.values())
    {
        println("${day.day} - ${day.value}")
    }
    println("")
    for (color in Colors.values())
    {
        println("${color.color} - ${color.value}")
    }
    println("")
    Colors.Yellow.TextColor()
    Colors.Blue.TextColor()
    Colors.Red.TextColor()
    Colors.White.TextColor()
    Colors.Black.TextColor()
    println("")
    DayOfWeek.Monday.DayColor()
    DayOfWeek.Tuesday.DayColor()
    DayOfWeek.Wednesday.DayColor()
    DayOfWeek.Thursday.DayColor()
    DayOfWeek.Friday.DayColor()
    DayOfWeek.Saturday.DayColor()
    DayOfWeek.Sunday.DayColor()
    println("")
    var color = Colors.Yellow
    println("${color.color} - это теплый цвет: ${color.TepliColor()}")
    var day = DayOfWeek.Monday
    println("${day.day} это выходной: ${day.ItsVixodnoi()}")
}