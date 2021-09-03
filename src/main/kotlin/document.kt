class DocumentAttachment(override val type: String = "document", val document: Document = Document()) : Attachment {
}

class Document (
    id: Long = 0,
    val ownerId: Long = 0,
    val title: String = "",
    val size: Long = 0,
    val ext: String = "") {
    var id = id
        set (value) {
            field = value
        }
}