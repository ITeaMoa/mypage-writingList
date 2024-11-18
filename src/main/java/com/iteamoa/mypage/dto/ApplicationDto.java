package com.iteamoa.mypage.dto;

import com.iteamoa.mypage.constant.StatusType;

import com.iteamoa.mypage.entity.ApplicationEntity;
import com.iteamoa.mypage.utils.KeyConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationDto {
    private String pk;
    private String sk;
    private String entityType;
    private String part;
    private StatusType status;
    private String feedType;
    private LocalDateTime timestamp;

    public static ApplicationDto toApplicationDto(ApplicationEntity applicationEntity) {
        return new ApplicationDto(
                KeyConverter.toStringId(applicationEntity.getPk()),
                KeyConverter.toStringId(applicationEntity.getSk()),
                applicationEntity.getEntityType().getType(),
                applicationEntity.getPart(),
                applicationEntity.getStatus(),
                applicationEntity.getFeedType(),
                applicationEntity.getTimestamp()
        );
    }
}
