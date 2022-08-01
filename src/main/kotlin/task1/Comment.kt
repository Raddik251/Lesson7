package task1

import java.time.LocalDateTime

class Comment (
    val id:Int = 0,
    val fromId:Int = 0,
    val date:LocalDateTime = LocalDateTime.now(),
    val text:String = "Пустой комментарий",
    val donutComment: donutComment? = null,
    val replyToUser:Int? = null,
    val replyToComment:Int? = null,
    val attachment: Attachment? = null,
    val parentsStack:Array<Int>? = null,
    val thread: task1.Thread? = null
        ){
}