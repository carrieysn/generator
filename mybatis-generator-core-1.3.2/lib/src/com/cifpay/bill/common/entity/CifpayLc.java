package ;

import java.io.Serializable;

public class CifpayLc implements Serializable {

private static final long serialVersionUID = 19700101000000000L;
/** 银信证ID **/
private Long lcId;
/** 批次号，批量开证时使用 **/
private String batchNo;
/** 银信证产品ID **/
private Long productId;
/** 银信证产品代码 **/
private String productCode;
/** 银信证展示编号 **/
private String lcNo;
/** 银信证类型：CP300、CP500、CP700 **/
private String lcType;
/** 币种：CHY **/
private String lcCurrency;
/** 银信证开证总额(单位分) **/
private Double lcAmount;
/** 银信证冻结金额(单位分)，系统冻结金额，而非银行的冻结金额，包含已履约和已申请解付的金额 **/
private Double lcFreezingAmount;
/** 银信证可用余额(单位分) **/
private Double lcBalance;
/** 商户号 **/
private String mid;
/** 订单号 **/
private String orderId;
/** 开证人标识信息 **/
private String payerId;
/** 银行卡号、支付宝账号 **/
private String payerAccno;
/** 开证人类型：个人:PERSONAL  企业:ENTERPRISE **/
private String payerType;
/** 开证人银行代码：ICBC、ALIPAY **/
private String payerBankCode;
/** 开证人银行名称 **/
private String payerBankName;
private String payerMobile;
/** 收证人信息 **/
private String recvId;
/** 银行卡号、支付宝账号 **/
private String recvAccno;
/** 收证人类型：个人:PERSONAL  企业:ENTERPRISE **/
private String recvType;
/** 机构代码：工商银行、平安银行、支付宝 **/
private String recvBankCode;
/** 收证人银行名称 **/
private String recvBankName;
private String recvMobile;
/** 银信证状态：10已开证、20已收证、30已履约、31部分履约、32已展期、40已申请解付、41已刹车、50已执行解付、88已解付完成、90已解冻退回、91预失效 **/
private String lcStatus;
/** 收证有效期 **/
private Date recvValidTime;
/** 履约有效期 **/
private Date sendValidTime;
/** 申请解付有效期 **/
private Date confirmValidTime;
/** 执行解付有效期（到期执行解付） **/
private Date payValidTime;
/** 银信证开证回调URL **/
private String lcStateReturnUrl;
/** 银信证状态变更通知URL **/
private String lcStateNotifyUrl;
/** 银信证商户订单详情URL **/
private String lcOrderDetailUrl;
/** 第三方认证机构代码 **/
private String thirdPartyCode;
/** 解付类型：SINGLE单次解付、MULTIPLE同收款人多次解付、 **/
private String payType;
/** 是否有效，1有效，0无效 **/
private Boolean isValid;
/** 创建时间 **/
private Date createTime;
/** 更新时间 **/
private Date updateTime;
/** 备注 **/
private String remark;

}
