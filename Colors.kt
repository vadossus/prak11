enum class Colors(val color: String, val value: Int){
    Yellow("Желтый",1),
    Red("Красный",2),
    Blue("Синий",3),
    White("Белый",4),
    Black("Черный",5);

    fun HEXNumber()
    {
        println("Желтый - #FFDB8B")
        println("Красный - #FF0000")
        println("Синий - #0000ff")
        println("Белый - #FFFFFF")
        println("Черный  - #000000")
    }

    fun TepliColor(): Boolean
    {
        return this == Yellow || this == Red
    }

    fun TextColor()
    {
        var colorkod = when (this)
        {
            Yellow -> "\u001B[33m"
            Red -> "\u001B[31m"
            Blue -> "\u001B[34m"
            White -> "\u001B[37m"
            Black -> "\u001B[30m"
        }
        println("$colorkod${this.color}\u001B[0m")
    }




}