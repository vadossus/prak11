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
    println("")
    var number = 1
    val Den_V_klasse = DayOfWeek.PoiskPoChisly(number)
    Den_V_klasse?.let {
        println("День недели $number: ${it.day}")
    }
    var name = "Red"
    val Color_V_Klasse = Colors.PoiskPoName(name)
    Color_V_Klasse?.let {
        println("Цвет $name найден в классе: ${it.color}")
    }
    println("")
    val etot_den = DayOfWeek.Tuesday
    val sled_den = etot_den.SledDen()
    println("Следующий день после $etot_den: $sled_den")
    println("")
    Color_V_Klasse?.HEXNumber()

}