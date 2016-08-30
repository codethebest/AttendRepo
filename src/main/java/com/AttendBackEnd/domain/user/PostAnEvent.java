package com.AttendBackEnd.domain.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Leo on 8/13/2016.
 */
@Entity
public class PostAnEvent implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String post;
    private Date date;
    private String tagline;

    public PostAnEvent ()
    {

    }
    public PostAnEvent (Builder builder)
    {
        this.tagline =builder.tagline;
        this.date=builder.date;
        this.id=builder.id;
        this.post=builder.post;
    }


    public Long getId() {
        return id;
    }

    public String getPost() {
        return post;
    }

    public String getTagline() {
        return tagline;
    }

    public Date getDate() {
        return date;
    }


    public static class Builder
    {
        private Long id;
        private String post;
        private Date date;
        private String tagline;

        public Builder id(Long value) {
            this.id = value;
            return this;
        }

        public Builder post (String value)
        {
            this.post = value;
            return this;
        }

        public Builder tagline (String value)
        {
            this.tagline = value;
            return this;
        }
        public Builder date (Date value)
        {
            this.date = value;
            return this;
        }

        public Builder copy (PostAnEvent postAnEvent)
        {
            this.date =postAnEvent.date;
            this.id=postAnEvent.id;
            this.post=postAnEvent.post;
            this.tagline = postAnEvent.tagline;
            return this;
        }

        public PostAnEvent build()
        {
            return new PostAnEvent(this);
        }
    }
}
