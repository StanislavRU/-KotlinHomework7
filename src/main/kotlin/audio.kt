class AudioAttachment(override val type: String = "audio", val audio: Audio = Audio()) : Attachment {
}

class Audio (
    id: Long = 0,
    val ownerId: Long = 0,
    val artist: String = "",
    val title: String = "",
    val duration: Long = 0) {
    var id = id
        set (value) {
            field = value
        }
}