package com.app.stockmanegement.dto;

import lombok.Builder;
import lombok.Data;
import com.app.stockmanegement.Model.TypeMvtStk;
import java.time.Instant;
@Data
@Builder
public class MvtStrockDto {
    private Integer id;

    private Instant dateMvt;

    private Instant quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvt;
}
