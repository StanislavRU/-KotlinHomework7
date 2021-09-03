class Comment (
    val postId: Int, // идентификатор записи на стене.
    id: Int = 0, // идентификатор комментария.
    val fromId: Long = 0, // идентификатор автора комментария.
    val date: String, // дата создания комментария
    val text: String, // текст комментария.
    val donut: Boolean? = null, // информация о записи Донат
    val replyToUser: Long? = null, // идентификатор пользователя или сообщества, в ответ которому оставлен комментарий.
    val replyToComment: Long? = null, // идентификатор комментария, в ответ на который оставлен текущий.
    val attachments: Attachment? = null // медиавложения комментария (фотографии, ссылки и т.п.).
) {
    var id = id
        set (value) {
            field = value
        }
}