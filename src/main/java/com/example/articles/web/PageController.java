package com.example.articles.web;
import com.example.articles.domain.Page;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pages")
@Controller
@RooWebScaffold(path = "pages", formBackingObject = Page.class)
public class PageController {
}
