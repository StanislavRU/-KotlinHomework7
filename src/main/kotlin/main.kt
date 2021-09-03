class PostNotFoundException(message: String): RuntimeException(message)

fun main() {
}

class WallService {
    var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var counter: Int = 0
    private var counterComment: Int = 0

    fun createComment(comment: Comment): Comment {
        val id = findById(comment.postId)?.id ?: throw PostNotFoundException("нет поста с данным id")
        comment.id = ++counterComment
        comments += comment
        return comments.last()
    }

    fun findById(id: Int?): Post? {
        for (post in posts) {
            if (post.id == id) {
                return post
            }
        }
        return null
    }

    fun add(post: Post): Post {
        counter++
        val postId = post.copy(id = counter)
        posts += postId
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (post.id == postInArray.id) {
                posts[index] = post.copy(ownerId = postInArray.ownerId, date = postInArray.date)
                return true
            }
        }
        return false
    }
}

class AttachmentService {
    var attachments = emptyArray<Attachment>()
    private var counter: Long = 0

    fun addVideo(attachment: VideoAttachment): Attachment {
        attachment.video.id = ++counter
        attachments += attachment
        return attachments.last()
    }

    fun addAudio(attachment: AudioAttachment): Attachment {
        attachment.audio.id = ++counter
        attachments += attachment
        return attachments.last()
    }

    fun addPhoto(attachment: PhotoAttachment): Attachment {
        attachment.photo.id = ++counter
        attachments += attachment
        return attachments.last()
    }

    fun addDocument(attachment: DocumentAttachment): Attachment {
        attachment.document.id = ++counter
        attachments += attachment
        return attachments.last()
    }

    fun addWikiPage(attachment: WikiPageAttachment): Attachment {
        attachment.wikiPage.id = ++counter
        attachments += attachment
        return attachments.last()
    }
}
