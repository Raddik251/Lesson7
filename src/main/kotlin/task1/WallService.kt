package task1

class WallService(posts: Array<Post>) {
    protected var posts = emptyArray<Post>()

    fun add(post: Post) {
        posts += post
    }

    fun update(postIn: Post) {
        var a = 0
        for ((index, post) in posts.withIndex()) {
            if (post.id == postIn.id) {
                posts[index] = postIn
                a = 1
            }
        }
        if (a === 0) {
            println("Пост не найден")
        } else {
            println("Пост обновлен")
        }
    }

    fun showLast(): Post {
        return posts.last()
    }

    fun checkUpdate(postIn: Post): Boolean {
        return if (postIn in posts) {
            return true
        } else false
    }

    private var comments = emptyArray<Comment>()
    fun createComment(postId: Int, comment: Comment): Comment {
        var b = 0
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                comments += comment
                b = 1
            }
        }
        if (b != 0) {
            return comments.last()
        }
        throw PostNotFoundException ("Пост, на который ссылается комментарий не найден")
    }
}

class PostNotFoundException(s: String) : Throwable() {
}
