package com.crazyandcoder.university.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 省份选择
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TopUniversitySchoolTypeInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String schoolTypeId;
    private String schoolTypeName;
}