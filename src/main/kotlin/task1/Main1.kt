package task1

import java.time.LocalDateTime

fun main() {

    var idAudio = 0
    var idVideo = 0
    var idPhoto = 0
    var idDocument = 0
    var idArchive = 0

    var idComments = 0

    var song = Audio(
        id = idAudio++,
        type = "mp3",
        size = 2048,
        duration = 180,
        name = "Песня про елочку"
    )

    var photoPrikol = Photo(
        id = idPhoto++,
        type = "gif",
        size = 1024,
        resolution = "1024x760",
        name = "Демотиватор"
    )

    var report = Document(
        id = idDocument++,
        type = "Word",
        size = 10768,
        name = "Отчет за июль"
    )

    var videoGift = Video(
        id = idVideo++,
        type = "mp4",
        size = 11024,
        duration = 600,
        name = "Поздравление с днем рождения"
    )

    var idNumber = 1

    var post1 = Post(
        id = idNumber++,
        date = LocalDateTime.now(),
        text = "Первый пост",
        attachment = arrayOf(AttachmentAudio("Audio", song), AttachmentPhoto("Photo", photoPrikol))
    )

    var post2 = Post(
        id = idNumber++,
        date = LocalDateTime.now(),
        text = "Второй пост",
        attachment = arrayOf(AttachmentAudio("Audio", song), AttachmentVideo("Video", videoGift))
    )

    var post3 = Post(
        id = idNumber++,
        date = LocalDateTime.now(),
        text = "Третий пост",
        attachment = arrayOf(AttachmentDocument("Document", report))
    )

    var postUpdate = Post(
        id = 3,
        date = LocalDateTime.now(),
        text = "Обновленный пост",
        attachment = arrayOf(AttachmentAudio("Audio", song))
    )

    var posts = WallService(
        posts = emptyArray()
    )

    posts.add(post1)
    posts.add(post2)
    posts.add(post3)

    println(posts.showLast().text)

    posts.update(postUpdate)

    println(posts.showLast().text)

    var goodComment = Comment(id = idComments++, text = "Пост классный, лайк")

    var badComment = Comment(id = 15, text = "Пост такой себе, дизлайк")

    posts.createComment(2, goodComment)

    posts.createComment(15, badComment)

}
