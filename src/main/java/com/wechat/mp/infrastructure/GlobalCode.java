package com.wechat.mp.infrastructure;


/**
 * 微信返回全局code
 *
 * @author luoyangwei
 */
public enum GlobalCode implements ResponseCode {

    /**
     * 微信会返回的都在这里
     */
    SYSTEM_BUSY("-1", "系统繁忙，此时请开发者稍候再试"),
    SUCCESSFUL("0", "请求成功"),
    APP_SECRET_ERROR("40001", "获取 access_token 时 AppSecret 错误，或者 access_token 无效。请开发者认真比对 AppSecret 的正确性，或查看是否正在为恰当的公众号调用接口"),
    ILLEGAL_CREDENTIAL_TYPE("40002", "不合法的凭证类型"),
    ILLEGAL_OPENID("40003", "不合法的 OpenID ，请开发者确认 OpenID （该用户）是否已关注公众号，或是否是其他公众号的 OpenID"),
    ILLEGAL_MEDIA_FILE_TYPE("40004", "不合法的媒体文件类型"),
    ILLEGAL_FILE_TYPE("40005", "不合法的文件类型"),
    ILLEGAL_FILE_SIZE("40006", "不合法的文件大小"),
    ILLEGAL_MEDIA_FILE_ID("40007", "不合法的媒体文件 id"),
    ILLEGAL_MESSAGE_TYPE("40008", "不合法的消息类型"),
    ILLEGAL_IMAGE_FILE_SIZE("40009", "不合法的图片文件大小"),
    ILLEGAL_VOICE_FILE_SIZE("40010", "不合法的语音文件大小"),
    ILLEGAL_VIDEO_FILE_SIZE("40011", "不合法的视频文件大小"),
    ILLEGAL_THUMBNAIL_FILE_SIZE("40012", "不合法的缩略图文件大小"),
    ILLEGAL_APPID("40013", "不合法的 AppID ，请开发者检查 AppID 的正确性，避免异常字符，注意大小写"),
    ILLEGAL_ACCESS_TOKEN("40014", "不合法的 access_token ，请开发者认真比对 access_token 的有效性（如是否过期），或查看是否正在为恰当的公众号调用接口"),
    ILLEGAL_MENU_TYPE("40015", "不合法的菜单类型"),
    ILLEGAL_NUMBER_OF_BUTTONS("40016", "不合法的按钮个数"),
    ILLEGAL_BUTTON_TYPE("40017", "不合法的按钮类型"),
    ILLEGAL_BUTTON_NAME_LENGTH("40018", "不合法的按钮名字长度"),
    ILLEGAL_BUTTON_KEY_LENGTH("40019", "不合法的按钮 KEY 长度"),
    ILLEGAL_BUTTON_URL_LENGTH("40020", "不合法的按钮 URL 长度"),
    ILLEGAL_MENU_VERSION_NUMBER("40021", "不合法的菜单版本号"),
    ILLEGAL_NUMBER_OF_SUB_MENU_LEVELS("40022", "不合法的子菜单级数"),
    ILLEGAL_NUMBER_OF_SUBMENU_BUTTONS("40023", "不合法的子菜单按钮个数"),
    ILLEGAL_SUBMENU_BUTTON_TYPE("40024", "不合法的子菜单按钮类型"),
    ILLEGAL_SUBMENU_BUTTON_NAME_LENGTH("40025", "不合法的子菜单按钮名字长度"),
    ILLEGAL_SUBMENU_BUTTON_KEY_LENGTH("40026", "不合法的子菜单按钮 KEY 长度"),
    ILLEGAL_SUBMENU_BUTTON_URL_LENGTH("40027", "不合法的子菜单按钮 URL 长度"),
    ILLEGAL_USER_OF_CUSTOM_MENU("40028", "不合法的自定义菜单使用用户"),
    INVALID_OAUTH_CODE("40029", "无效的 oauth_code"),
    ILLEGAL_REFRESH_TOKEN("40030", "不合法的 refresh_token"),
    ILLEGAL_OPENID_LIST("40031", "不合法的 openid 列表"),
    ILLEGAL_OPENID_LIST_LENGTH("40032", "不合法的 openid 列表长度"),
    ILLEGAL_REQUEST_CHARACTER("40033", "不合法的请求字符，不能包含 \\uxxxx 格式的字符"),
    ILLEGAL_PARAMETER("40035", "不合法的参数"),
    ILLEGAL_REQUEST_FORMAT("40038", "不合法的请求格式"),
    ILLEGAL_URL_LENGTH("40039", "不合法的 URL 长度"),
    INVALID_URL("40048", "无效的url"),
    ILLEGAL_GROUP_ID("40050", "不合法的分组 id"),
    ILLEGAL_GROUP_NAME("40051", "分组名字不合法"),
    ILLEGAL_DELETE_SINGLE_GRAPHIC_DESIGNATION_ARTICLE_IDX("40060", "删除单篇图文时，指定的 article_idx 不合法"),
    ILLEGAL_GROUP_NAME2("40117", "分组名字不合法"),
    ILLEGAL_MEDIA_ID_SIZE("40118", "media_id 大小不合法"),
    BUTTON_TYPE_ERROR("40119", "button 类型错误"),
    CHILD_BUTTON_TYPE_ERROR("40120", "子 button 类型错误"),
    INVALID_MEDIA_ID_TYPE("40121", "不合法的 media_id 类型"),
    INVALID_APP_SECRET("40125", "无效的app secret"),
    ILLEGAL_WECHAT_ID_IS("40132", "微信号不合法"),
    UNSUPPORTED_IMAGE_FORMAT("40137", "不支持的图片格式"),
    CANNOT_HOMEPAGE_LINKS_OF_OTHER_OFFICIAL_ACCOUNTS("40155", "请勿添加其他公众号的主页链接"),
    OAUTH_CODE_IS_USED("40163", "oauth_code已使用"),
    ACCESS_TOKEN_PARAMETER_IS_MISSING("41001", "缺少 access_token 参数"),
    MISSING_APPID_PARAMETER("41002", "缺少 appid 参数"),
    REFRESH_TOKEN_PARAMETER_IS_MISSING("41003", "缺少 refresh_token 参数"),
    MISSING_SECRET_PARAMETER("41004", "缺少 secret 参数"),
    MISSING_MULTIMEDIA_FILE_DATA("41005", "缺少多媒体文件数据"),
    MEDIA_ID_PARAMETER_IS_MISSING("41006", "缺少 media_id 参数"),
    MISSING_SUBMENU_DATA("41007", "缺少子菜单数据"),
    OAUTH_CODE_IS_MISSING("41008", "缺少 oauth code"),
    OPENID_MISSING("41009", "缺少 openid"),
    ACCESS_TOKEN_TIMEOUT("42001", "access_token 超时，请检查 access_token 的有效期，请参考基础支持 - 获取 access_token 中，对 access_token 的详细机制说明"),
    REFRESH_TOKEN_TIMEOUT("42002", "refresh_token 超时"),
    OAUTH_CODE_TIMEOUT("42003", "oauth_code 超时"),
    USER_HAS_CHANGED_THE_WECHAT_PASSWORD("42007", "用户修改微信密码， access_token 和 refresh_token 失效，需要重新授权"),
    GET_REQUEST_REQUIRED("43001", "需要 GET 请求"),
    POST_REQUEST_REQUIRED("43002", "需要 POST 请求"),
    HTTPS_REQUEST_REQUIRED("43003", "需要 HTTPS 请求"),
    NEED_THE_RECIPIENT_S_ATTENTION("43004", "需要接收者关注"),
    NEED_FRIENDSHIP("43005", "需要好友关系"),
    NEED_WILL_RECEIVE_REMOVE_BLACK_LIST("43019", "需要将接收者从黑名单中移除"),
    MULTIMEDIA_FILE_IS_EMPTY("44001", "多媒体文件为空"),
    POST_PACKET_IS_EMPTY("44002", "POST 的数据包为空"),
    TEXT_IMAGE_MESSAGE_CONTENT_IS_EMPTY("44003", "图文消息内容为空"),
    TEXT_MESSAGE_CONTENT_IS_EMPTY("44004", "文本消息内容为空"),
    MULTIMEDIA_FILE_SIZE_EXCEEDS_THE_LIMIT("45001", "多媒体文件大小超过限制"),
    MESSAGE_CONTENT_EXCEEDS_THE_LIMIT("45002", "消息内容超过限制"),
    TITLE_FIELD_EXCEEDS_LIMIT("45003", "标题字段超过限制"),
    DESCRIPTION_FIELD_EXCEEDS_THE_LIMIT("45004", "描述字段超过限制"),
    LINK_FIELD_EXCEEDS_LIMIT("45005", "链接字段超过限制"),
    IMAGE_LINK_FIELD_EXCEEDS_THE_LIMIT("45006", "图片链接字段超过限制"),
    VOICE_PLAYBACK_TIME_EXCEEDS_THE_LIMIT("45007", "语音播放时间超过限制"),
    GRAPHIC_MESSAGE_EXCEEDS_LIMIT("45008", "图文消息超过限制"),
    INTERFACE_CALL_EXCEEDS_THE_LIMIT("45009", "接口调用超过限制"),
    NUMBER_OF_MENUS_CREATED_EXCEEDS_THE_LIMIT("45010", "创建菜单个数超过限制"),
    PLEASE_TRY_AGAIN_LATER("45011", "API 调用太频繁，请稍候再试"),
    REPLY_TIME_EXCEEDS_LIMIT("45015", "回复时间超过限制"),
    SYSTEM_GROUPING_CANNOT_BE_MODIFIED("45016", "系统分组，不允许修改"),
    GROUP_NAME_IS_TOO_LONG("45017", "分组名字过长"),
    NUMBER_OF_GROUPS_EXCEEDS_THE_UPPER_LIMIT("45018", "分组数量超过上限"),
    CUSTOMER_SERVICE_INTERFACE_NUMBER_ARTICLES_LIMIT("45047", "客服接口下行条数超过上限"),
    CREATE_MENU_CONTAINS_UNASSOCIATED_APPLETS("45064", "创建菜单包含未关联的小程序"),
    IDENTICAL_CLIENT_MSG_ID("45065", "相同 client msg id 已存在群发记录，返回数据中带有已存在的群发任务的 msgid"),
    IDENTICAL_CLIENT_MSG_ID_RETRY_LIMIT("45066", "相同 client msg id 重试速度过快，请间隔1分钟重试"),
    CLIENT_MSG_ID_LENGTH_LIMIT("45067", "client msg id 长度超过限制"),
    NO_MEDIA_DATA_EXISTS("46001", "不存在媒体数据"),
    NON_EXISTENT_MENU_VERSION("46002", "不存在的菜单版本"),
    NONEXISTENT_MENU_DATA("46003", "不存在的菜单数据"),
    NONEXISTENT_USER("46004", "不存在的用户"),
    ANALYSIS_CONTENT_ERROR("47001", "解析 JSON/XML 内容错误"),
    API_FUNCTION_NOT_AUTHORIZED("48001", "api 功能未授权，请确认公众号已获得该接口，可以在公众平台官网 - 开发者中心页中查看接口权限"),
    FANS_REJECT_MESSAGES("48002", "粉丝拒收消息（粉丝在公众号选项中，关闭了 “ 接收消息 ” ）"),
    API_INTERFACE_IS_BLOCKED("48004", "api 接口被封禁，请登录 mp.weixin.qq.com 查看详情"),
    API_PROHIBITION("48005", "api 禁止删除被自动回复和自定义菜单引用的素材"),
    API_DISABLE_RESET_CALL_TIMES("48006", "api 禁止清零调用次数，因为清零次数达到上限"),
    NO_PERMISSION_TO_SEND_MESSAGES("48008", "没有该类型消息的发送权限"),
    USER_NOT_AUTHORIZED("50001", "用户未授权该 api"),
    USER_RESTRICTED("50002", "用户受限，可能是违规后接口被封禁"),
    USER_NOT_PAYING_ATTENTION_MP("50005", "用户未关注公众号"),
    PARAMETER_ERROR("61451", "参数错误 (invalid parameter)"),
    INVALID_CUSTOMER_SERVICE_ACCOUNT("61452", "无效客服账号 (invalid kf_account)"),
    CUSTOMER_SERVICE_ACCOUNT_ALREADY_EXISTS("61453", "客服帐号已存在 (kf_account exsited)"),
    CUSTOMER_SERVICE_ACCOUNT_NAME_LENGTH_LIMIT("61454", "客服帐号名长度超过限制 ( 仅允许 10 个英文字符，不包括 @ 及 @ 后的公众号的微信号 )(invalid kf_account length)"),
    CUSTOMER_SERVICE_ACCOUNT_NAME_ILLEGAL("61455", "客服帐号名包含非法字符 ( 仅允许英文 + 数字 )(illegal character in kf_account)"),
    CUSTOMER_SERVICE_ACCOUNT_QUANTITY_LIMIT("61456", "客服帐号个数超过限制 (10 个客服账号 )(kf_account count exceeded)"),
    INVALID_AVATAR_FILE_TYPE("61457", "无效头像文件类型 (invalid   file type)"),
    SYSTEM_ERROR("61450", "系统错误 (system error)"),
    DATE_FORMAT_ERROR("61500", "日期格式错误"),
    SOME_PARAMETERS_ARE_EMPTY("63001", "部分参数为空"),
    INVALID_SIGNATURE("63002", "无效的签名"),
    NON_EXISTENT_MENU_ID("65301", "不存在此 menu id 对应的个性化菜单"),
    NO_CORRESPONDING_USER("65302", "没有相应的用户"),
    THERE_IS_NO_DEFAULT_MENU("65303", "没有默认菜单，不能创建个性化菜单"),
    MATCH_RULE_INFORMATION_IS_EMPTY("65304", "MatchRule 信息为空"),
    NUMBER_OF_PERSONALIZED_MENUS_IS_LIMITED("65305", "个性化菜单数量受限"),
    ACCOUNTS_THAT_DO_NOT_SUPPORT_PERSONALIZED_MENUS("65306", "不支持个性化菜单的帐号"),
    PERSONALIZED_MENU_INFORMATION_IS_EMPTY("65307", "个性化菜单信息为空"),
    CONTAINS_BUTTON_WITHOUT_RESPONSE_TYPE("65308", "包含没有响应类型的 button"),
    PERSONALIZATION_MENU_SWITCH_IS_OFF("65309", "个性化菜单开关处于关闭状态"),
    COUNTRY_INFORMATION_CANNOT_BE_EMPTY("65310", "填写了省份或城市信息，国家信息不能为空"),
    PROVINCE_INFORMATION_CANNOT_BE_EMPTY("65311", "填写了城市信息，省份信息不能为空"),
    ILLEGAL_NATIONAL_INFORMATION("65312", "不合法的国家信息"),
    ILLEGAL_PROVINCE_INFORMATION("65313", "不合法的省份信息"),
    ILLEGAL_CITY_INFORMATION("65314", "不合法的城市信息"),
    SKIP_MULTIPLE_OUTSIDE_DOMAIN_NAME("65316", "该公众号的菜单设置了过多的域名外跳（最多跳转到 3 个域名的链接）"),
    ILLEGAL_URL("65317", "不合法的 URL"),
    INVALID_SIGNATURE2("87009", "无效的签名"),
    ILLEGAL_POST_DATA_PARAMETER("9001001", "POST 数据参数不合法"),
    REMOTE_SERVICE_UNAVAILABLE("9001002", "远端服务不可用"),
    ILLEGAL_TICKET("9001003", "Ticket 不合法"),
    FAILED_TO_GET_USER_INFORMATION("9001004", "获取摇周边用户信息失败"),
    FAILED_TO_OBTAIN_MERCHANT_INFORMATION("9001005", "获取商户信息失败"),
    FAILED_TO_GET_OPENID("9001006", "获取 OpenID 失败"),
    UPLOADED_FILE_IS_MISSING("9001007", "上传文件缺失"),
    FILE_TYPE_OF_UPLOADED_MATERIAL_IS_ILLEGAL("9001008", "上传素材的文件类型不合法"),
    FILE_SIZE_OF_UPLOADED_MATERIAL_IS_ILLEGAL("9001009", "上传素材的文件尺寸不合法"),
    UPLOAD_FAILED("9001010", "上传失败"),
    ILLEGAL_ACCOUNT("9001020", "帐号不合法"),
    YOU_CANNOT_ADD_A_NEW_DEVICE("9001021", "已有设备激活率低于 50% ，不能新增设备"),
    ILLEGAL_NUMBER_OF_EQUIPMENT_APPLICATIONS("9001022", "设备申请数不合法，必须为大于 0 的数字"),
    DEVICE_ALREADY_EXISTS_IN_AUDIT("9001023", "已存在审核中的设备 ID 申请"),
    ONE_QUERY_REQUEST_DEVICES_CANNOT_EXCEED_LIMIT("9001024", "一次查询设备 ID 数量不能超过 50"),
    ILLEGAL_DEVICE_ID("9001025", "设备 ID 不合法"),
    ILLEGAL_PAGE_ID("9001026", "页面 ID 不合法"),
    ILLEGAL_PAGE_PARAMETERS("9001027", "页面参数不合法"),
    ONE_DELETE_REQUEST_PAGE_CANNOT_EXCEED_LIMIT("9001028", "一次删除页面 ID 数量不能超过 10"),
    PAGE_HAS_BEEN_APPLIED_TO_THE_DEVICE("9001029", "页面已应用在设备中，请先解除应用关系再删除"),
    ONE_QUERY_REQUEST_PAGE_CANNOT_EXCEED_LIMIT("9001030", "一次查询页面 ID 数量不能超过 50"),
    ILLEGAL_TIME_INTERVAL("9001031", "时间区间不合法"),
    PAGE_BINDING_RELATIONSHIP_PARAMETER_ERROR("9001032", "保存设备与页面的绑定关系参数错误"),
    ILLEGAL_STORE_ID("9001033", "门店 ID 不合法"),
    EQUIPMENT_REMARK_INFORMATION_IS_TOO_LONG("9001034", "设备备注信息过长"),
    ILLEGAL_EQUIPMENT_APPLICATION_PARAMETERS("9001035", "设备申请参数不合法"),
    ILLEGAL_QUERY_START_VALUE("9001036", "查询起始值 begin 不合法");

    private final String code;
    private final String message;


    GlobalCode(String code, String message) {
        this.code = code;
        this.message = message;
    }


    @Override
    public String getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


    /**
     * 用code找到全局枚举
     *
     * @param code 需要找的code
     * @return 枚举
     */
    public static GlobalCode getGlobalCode(String code) {
        GlobalCode[] globalCodes = GlobalCode.values();
        for (GlobalCode globalCode : globalCodes) {
            if (globalCode.getCode().equals(code)) {
                return globalCode;
            }
        }
        throw new RuntimeException("code 没有找到对应的枚举");
    }

    @Override
    public String toString() {
        return getCode() + ": " + getMessage();
    }

}
