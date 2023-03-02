package com.ventes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventes.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
