class VideoAttachment(override val type: String = "video", val video: Video = Video()) : Attachment {
}

class Video (
    id: Long = 0,
    val ownerId: Long = 0,
    val title: String = "",
    val description: String = "",
    val views: Long = 0) {
    var id = id
        set (value) {
            field = value
        }
}