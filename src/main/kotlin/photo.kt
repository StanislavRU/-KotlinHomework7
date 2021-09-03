class PhotoAttachment(override val type: String = "photo", val photo: Photo = Photo()) : Attachment {
}

class Photo (
    id: Long = 0,
    val albumId: Long = 0,
    val ownerId: Long = 0,
    val text: String = "",
    val width: String = "",
    val height: String = "") {
    var id = id
        set (value) {
            field = value
        }
}