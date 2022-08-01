package task1

import java.time.LocalDateTime

class Comment (
    val id:Int,
    val fromId:Int?,
    val date:LocalDateTime,
    val text:String,
    val donutComment: donutComment?,
    val replyToUser:Int?,
    val replyToComment:Int?,
    val attachment: Attachment?,
    val parentsStack:Array<Int>?,
    val thread: task1.Thread?
        ){
}