package task1

import java.time.LocalDateTime

fun main() {

    var idNumber = 1

    var post1 = Post(
        id = idNumber++,
        date = LocalDateTime.now(),
        text = "Первый пост"
    )

    var post2 = Post(
        id = idNumber++,
        date = LocalDateTime.now(),
        text = "Второй пост"
    )

    var post3 = Post(
        id = idNumber++,
        date = LocalDateTime.now(),
        text = "Третий пост"
    )

    var postUpdate = Post(
        id = 3,
        date = LocalDateTime.now(),
        text = "Обновленный пост"
    )

    var posts = WallService(
        posts = emptyArray()
    )

    posts.add(post1)
    posts.add(post2)
    posts.add(post3)

    println(posts.showLast())

    posts.update(postUpdate)

    println(posts.showLast())
}