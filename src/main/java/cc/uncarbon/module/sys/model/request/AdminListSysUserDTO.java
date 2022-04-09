package cc.uncarbon.module.sys.model.request;

import cc.uncarbon.framework.core.constant.HelioConstant;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 后台管理-分页列表后台用户
 * @author Uncarbon
 */
@Accessors(chain = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminListSysUserDTO implements Serializable {

    @ApiModelProperty(value = "手机号(关键词)")
    private String phoneNo;

    @ApiModelProperty(value = "时间区间起")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = HelioConstant.Jackson.DATE_TIME_FORMAT)
    @DateTimeFormat(pattern = HelioConstant.Jackson.DATE_TIME_FORMAT)
    private LocalDateTime beginAt;

    @ApiModelProperty(value = "时间区间止")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = HelioConstant.Jackson.DATE_TIME_FORMAT)
    @DateTimeFormat(pattern = HelioConstant.Jackson.DATE_TIME_FORMAT)
    private LocalDateTime endAt;

}
