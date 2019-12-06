package hst.peter.k

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/article")
class ArticleController(private val repository: ArticleRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAllByOrderByAddedAtDesc().map {
        it.render()
    }

    @GetMapping("/{sulg}")
    fun findOne(@PathVariable sulg: String) = repository.findBySlug(sulg)
            ?: notFound("This article does not exist")
}

@RestController
@RequestMapping("/api/user")
class UserController(private val repository: UserRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{login}")
    fun findOne(@PathVariable login: String) = repository.findByLogin(login)
            ?: notFound("This user does not exist")


}

fun Article.render() = RenderedArticle(
        slug,
        title,
        headline,
        content,
        author,
        addedAt.format()
)

data class RenderedArticle(
        val slug: String,
        val title: String,
        val headline: String,
        val content: String,
        val author: User,
        val addedAt: String)


fun notFound(msg: String) = ResponseStatusException(HttpStatus.NOT_FOUND, msg)