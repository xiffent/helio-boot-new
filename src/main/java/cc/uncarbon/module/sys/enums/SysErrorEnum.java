package cc.uncarbon.module.sys.enums;

import cc.uncarbon.framework.core.enums.HelioBaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * SYS异常枚举类
 */
@AllArgsConstructor
@Getter
public enum SysErrorEnum implements HelioBaseEnum<Integer> {

    INVALID_ID(400, "无效ID"),

    INCORRECT_PIN_OR_PWD(400, "账号或密码不正确"),

    BANNED_USER(400, "用户被封禁"),

    INVALID_TENANT(400, "所属租户无效"),

    DISABLED_TENANT(400, "所属租户已禁用"),

    INCORRECT_OLD_PASSWORD(400, "原密码有误"),

    NO_ROLE_AVAILABLE_FOR_CURRENT_USER(400, "当前用户没有可用角色"),

    NO_MENU_AVAILABLE_FOR_CURRENT_ROLE(400, "当前角色没有可用菜单"),

    UUID_CANNOT_BE_BLANK(400, "UUID不能为空"),

    ;
    private final Integer value;
    private final String label;

}
