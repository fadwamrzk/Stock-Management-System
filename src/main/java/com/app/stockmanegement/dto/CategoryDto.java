package com.app.stockmanegement.dto;

import com.app.stockmanegement.Model.Article;
import com.app.stockmanegement.Model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class CategoryDto {
    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore //ne pas inclure ce champ lors de la convertion l'objet en un format JSON (sérialisation)
    private List<ArticleDto> articles;

    public CategoryDto fromEntiy(Category category) {
        if (category == null) {
    //throw an exception
            return null;
        }
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode()).designation(category.getDesignation()).build();
    }
}

