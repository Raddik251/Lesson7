package task1

import java.time.LocalDateTime

data class Post (
    val id:Int,
/*    val ownerId:UInt,
    val fromId:UInt,
    val createdBy:UInt,*/
    val date:LocalDateTime,
    val text:String,
/*    val replyOwnerId:UInt,
    val replyPostId:UInt,
    val friendsOnly:Boolean,
    val comments:Comment,
    val copyright:Copyright,*/
/*    val likes:Like,
    val reposts:Repost,
    val views:View,
    val postType:String,
    val signerId:UInt,
    val canPin:Boolean,
    val canDelete:Boolean,
    val canEdit:Boolean,
    val isPinned:Boolean,
    val markedAsAds:Boolean,
    val isFavorite:Boolean,
    val donut:Donut,
    val postponedId:UInt*/
        ){
    fun equals(other: Post): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    operator fun set(index: Int, value: Post) {

    }
}