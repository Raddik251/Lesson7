package task1

import org.junit.Test

import org.junit.Assert.*
import java.time.LocalDateTime

class Main1KtTest {

    @Test
    fun testAdd() {
        //arrange
        var posts = WallService(
            posts = emptyArray()
        )

        val idTest = 50
        val dateTest = LocalDateTime.now()
        val textTest = "Тестовый пост"

        //act
        val post = Post(
            id = idTest,
            date = dateTest,
            text = textTest
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
                id = idTest+i,
                date = dateTest,
                text = "Тестовый пост № $i"
            )
            posts.add(post)
        }

        val postUpdateTrue = Post(
            id = 104,
            date = dateTest,
            text = "Обновленный пост"
        )

        posts.update(postUpdateTrue)

        var checkUpdate = posts.showSearch(postUpdateTrue)


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
                id = idTest+i,
                date = dateTest,
                text = "Тестовый пост № $i"
            )
            posts.add(post)
        }

        val postUpdateTrue = Post(
            id = 504,
            date = dateTest,
            text = "Обновленный пост"
        )

        posts.update(postUpdateTrue)

        var checkUpdate = posts.showSearch(postUpdateTrue)


        //assert
        assertEquals(false, checkUpdate)
    }
}