package projectmanager.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the post database table.
 * 
 */
@Entity
@NamedQuery(name="Post.findAll", query="SELECT p FROM Post p")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer level;

	private String post;

    public Post() {
    }
    
	public Post(int level, String post) {
        super();
        this.level = level;
        this.post = post;
    }

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}