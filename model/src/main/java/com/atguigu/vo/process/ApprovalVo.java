package com.atguigu.vo.process;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author 阳斌
 * @Data 2023/3/27 15:10
 */
@Data
public class ApprovalVo {

    private Long processId;

    private String taskId;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "审批描述")
    private String description;
}
