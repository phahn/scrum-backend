package scrum;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
 class PostController {

    @GetMapping("/api")
	fun listPosts(): List<Post> {
		val posts = ArrayList<Post>()
		for (i in 0..100) {
			posts.add(Post(i, "Kotlin Test Title " + i, "Lorem ipsum"));
		}
		return posts;
	}
}
