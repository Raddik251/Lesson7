package task1

import org.junit.Test

import org.junit.Assert.*
import java.time.LocalDateTime

class Main1KtTest {

    val attachmentForTest = AttachmentVideo(
        "Video", video = Video(
            id = 1,
            type = "mp4",
            size = 11024,
            duration = 600,
            name = "Поздравление с днем рождения"
        )
    )

    @Test
    fun testAdd() {
        //arrange
        var posts = WallService(
            posts = emptyArray()
        )

        val idTest = 50
        val dateTest = LocalDateTime.now()
        val textTest = "Тестовый пост"
        val attachmentTest = arrayOf<Attachment>(attachmentForTest)

        //act
        val post = Post(
            id = idTest,
            date = dateTest,
            text = textTest,
            attachment = attachmentTest
        )
        posts.add(post)

        //assert
        assertEquals(50, posts.showLast().id)
    }

    @Test
    fun testUddateTrue() {
        //arrange
        var posts = WallService(
            posts = emptyArray()
        )

        val idTest = 100
        val dateTest = LocalDateTime.now()

        //act
        var i = 1
        for (i in 1..5) {
            val post = Post(
                id = idTest + i,
                date = dateTest,
                text = "Тестовый пост № $i",
                attachment = arrayOf<Attachment>(attachmentForTest)
            )
            posts.add(post)
        }

        val postUpdateTrue = Post(
            id = 104,
            date = dateTest,
            text = "Обновленный пост",
            attachment = arrayOf<Attachment>(attachmentForTest)
        )

        posts.update(postUpdateTrue)

        var checkUpdate = posts.checkUpdate(postUpdateTrue)


        //assert
        assertEquals(true, checkUpdate)
    }

    @Test
    fun testUddateFalse() {
        //arrange
        var posts = WallService(
            posts = emptyArray()
        )

        val idTest = 100
        val dateTest = LocalDateTime.now()

        //act
        var i = 1
        for (i in 1..5) {
            val post = Post(
                id = idTest + i,
                date = dateTest,
                text = "Тестовый пост № $i",
                attachment = arrayOf<Attachment>(attachmentForTest)
            )
            posts.add(post)
        }

        val postUpdateTrue = Post(
            id = 504,
            date = dateTest,
            text = "Обновленный пост",
            attachment = arrayOf<Attachment>(attachmentForTest)
        )

        posts.update(postUpdateTrue)

        var checkUpdate = posts.checkUpdate(postUpdateTrue)


        //assert
        assertEquals(false, checkUpdate)
    }
}