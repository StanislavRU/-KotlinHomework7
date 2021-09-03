class WikiPageAttachment(override val type: String = "video", val wikiPage: WikiPage = WikiPage()) : Attachment {
}

class WikiPage (
    id: Long = 0,
    val groupId: Long = 0,
    val creatorId: Long = 0,
    val title: String = "",
    val views: Long = 0) {
    var id = id
        set (value) {
            field = value
        }
}