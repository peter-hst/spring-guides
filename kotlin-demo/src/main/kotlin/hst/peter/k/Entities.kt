package hst.peter.k

import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "T_ARTICLE")
class Article(
        var title: String,
        var headline: String,
        var content: String,
        @ManyToOne var author: User,
        var slug: String = title.toSlug(),
        var addedAt: LocalDateTime = LocalDateTime.now(),
        @Id @GeneratedValue var id: Long? = null
)

@Entity(name = "T_USER")
class User(
        var login: String,
        var firstName: String,
        var lastName: String,
        var description: String? = null,
        @Id @GeneratedValue var id: Long? = null
)