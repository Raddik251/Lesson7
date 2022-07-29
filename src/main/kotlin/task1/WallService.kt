package task1

class WallService (posts:Array<Post>){
    var posts = emptyArray<Post>()

    fun add (post:Post) {
        posts += post
    }

    fun update (postIn:Post) {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postIn.id) {
                post[index] = postIn
                } else {
                    println("Пост не найден")
            }
        }
    }

    fun showLast (): Post {
        return posts.last()
    }
}