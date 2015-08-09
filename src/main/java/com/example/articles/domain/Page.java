package com.example.articles.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Page {

    /**
     */
    @ManyToOne
    private Article article;

    /**
     */
    private Integer pageNumber;

    /**
     */
    @NotNull
    @Size(max = 200)
    private String title;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private Set<Page> pages = new HashSet<Page>();
}
