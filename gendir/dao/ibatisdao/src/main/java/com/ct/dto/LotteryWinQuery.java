package com.ct.dto;

                                                                            import java.util.*;
import java.io.Serializable;
import com.ct.Base.Page;
/**
 *查询实体类
 * @author Wu shaoming(361726442@qq.com)
 */
public class LotteryWinQuery extends Page implements Serializable {

 	/**
	 *序列化ID
	 */
	private static final long serialVersionUID = 1L;
	
	/**==============================批量查询、更新、删除时的Where条件设置==================================**/
	/** 中奖纪录ID **/
    private Long winaid;
	public Long getWinaid () {
    	return winaid;
   	}
    public LotteryWinQuery setWinaid(Long winaid) {
    	this.winaid = winaid;
    	return this;
    }
	/** 中奖用户名称 **/
    private String username;
	public String getUsername () {
    	return username;
   	}
    public LotteryWinQuery setUsername(String username) {
    	this.username = username;
    	return this;
    }
	/** 中奖用户ID **/
    private Long userid;
	public Long getUserid () {
    	return userid;
   	}
    public LotteryWinQuery setUserid(Long userid) {
    	this.userid = userid;
    	return this;
    }
	/** 奖品名称 **/
    private String lotteryname;
	public String getLotteryname () {
    	return lotteryname;
   	}
    public LotteryWinQuery setLotteryname(String lotteryname) {
    	this.lotteryname = lotteryname;
    	return this;
    }
	/** 奖品Id **/
    private Long pid;
	public Long getPid () {
    	return pid;
   	}
    public LotteryWinQuery setPid(Long pid) {
    	this.pid = pid;
    	return this;
    }
	/** 中奖人手机号码 **/
    private String userphone;
	public String getUserphone () {
    	return userphone;
   	}
    public LotteryWinQuery setUserphone(String userphone) {
    	this.userphone = userphone;
    	return this;
    }
	/** 是否中奖（0 为未中奖 1为中奖） **/
    private String winorfailure;
	public String getWinorfailure () {
    	return winorfailure;
   	}
    public LotteryWinQuery setWinorfailure(String winorfailure) {
    	this.winorfailure = winorfailure;
    	return this;
    }
    /** 中奖时间 **/
    private Date windateStart;
    public Date getWindateStart () {
        return windateStart;
    }
    public LotteryWinQuery setWindateStart(Date windate) {
        this.windateStart = windate;
        return this;
    }

    private Date windateEnd;
    public Date getWindateEnd () {
        return windateEnd;
    }
    public LotteryWinQuery setWindateEnd(Date windate) {
        this.windateEnd = windate;
        return this;
    }

    private Date windateEqual;
    public Date getWindateEqual () {
        return windateEqual;
    }
    public LotteryWinQuery setWindateEqual(Date windate) {
        this.windateEqual = windate;
        return this;
    }
	/** 奖品是否发出（0奖品未送出 1奖品已送出） **/
    private Integer checkout;
	public Integer getCheckout () {
    	return checkout;
   	}
    public LotteryWinQuery setCheckout(Integer checkout) {
    	this.checkout = checkout;
    	return this;
    }
	/** 接受人_联系电话 **/
    private String phoneint;
	public String getPhoneint () {
    	return phoneint;
   	}
    public LotteryWinQuery setPhoneint(String phoneint) {
    	this.phoneint = phoneint;
    	return this;
    }
	/** 接收人_姓名 **/
    private String receiveName;
	public String getReceiveName () {
    	return receiveName;
   	}
    public LotteryWinQuery setReceiveName(String receiveName) {
    	this.receiveName = receiveName;
    	return this;
    }
	/** 接收人_邮寄地址 **/
    private String sendaddress;
	public String getSendaddress () {
    	return sendaddress;
   	}
    public LotteryWinQuery setSendaddress(String sendaddress) {
    	this.sendaddress = sendaddress;
    	return this;
    }
	/** 中奖人真实姓名 **/
    private String realName;
	public String getRealName () {
    	return realName;
   	}
    public LotteryWinQuery setRealName(String realName) {
    	this.realName = realName;
    	return this;
    }
	/** 接受人_邮政编码 **/
    private String sendPost;
	public String getSendPost () {
    	return sendPost;
   	}
    public LotteryWinQuery setSendPost(String sendPost) {
    	this.sendPost = sendPost;
    	return this;
    }
	/** 是否取消状态（0为正常 1为取消） **/
    private String state;
	public String getState () {
    	return state;
   	}
    public LotteryWinQuery setState(String state) {
    	this.state = state;
    	return this;
    }
	/** 支付宝账号 **/
    private String alipay;
	public String getAlipay () {
    	return alipay;
   	}
    public LotteryWinQuery setAlipay(String alipay) {
    	this.alipay = alipay;
    	return this;
    }
	/** 支付流水号 **/
    private String payseqnum;
	public String getPayseqnum () {
    	return payseqnum;
   	}
    public LotteryWinQuery setPayseqnum(String payseqnum) {
    	this.payseqnum = payseqnum;
    	return this;
    }
	/** 备注 **/
    private String comments;
	public String getComments () {
    	return comments;
   	}
    public LotteryWinQuery setComments(String comments) {
    	this.comments = comments;
    	return this;
    }
	/** 活动id **/
    private String activityId;
	public String getActivityId () {
    	return activityId;
   	}
    public LotteryWinQuery setActivityId(String activityId) {
    	this.activityId = activityId;
    	return this;
    }
	/**==============================批量查询时的Order条件顺序设置==================================**/
	public class OrderField{
		public OrderField(String fieldName, String order) {
			super();
			this.fieldName = fieldName;
			this.order = order;
		}
		private String fieldName;
		private String order;
		public String getFieldName() {
			return fieldName;
		}
		public OrderField setFieldName(String fieldName) {
			this.fieldName = fieldName;
			return this;
		}
		public String getOrder() {
			return order;
		}
		public OrderField setOrder(String order) {
			this.order = order;
			return this;
		}
	}

	/**==============================批量查询时的Order条件顺序设置==================================**/
	/**排序列表字段**/
	private List<OrderField> orderFields = new ArrayList<OrderField>();
	/**
	 * 设置排序按属性：中奖纪录ID
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyWinaid(boolean isAsc){
		orderFields.add(new OrderField("WINAID",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：中奖用户名称
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyUsername(boolean isAsc){
		orderFields.add(new OrderField("USERNAME",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：中奖用户ID
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyUserid(boolean isAsc){
		orderFields.add(new OrderField("USERID",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：奖品名称
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyLotteryname(boolean isAsc){
		orderFields.add(new OrderField("LOTTERYNAME",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：奖品Id
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyPid(boolean isAsc){
		orderFields.add(new OrderField("PID",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：中奖人手机号码
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyUserphone(boolean isAsc){
		orderFields.add(new OrderField("USERPHONE",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：是否中奖（0 为未中奖 1为中奖）
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyWinorfailure(boolean isAsc){
		orderFields.add(new OrderField("WINORFAILURE",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：中奖时间
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyWindate(boolean isAsc){
		orderFields.add(new OrderField("WINDATE",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：奖品是否发出（0奖品未送出 1奖品已送出）
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyCheckout(boolean isAsc){
		orderFields.add(new OrderField("CHECKOUT",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：接受人_联系电话
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyPhoneint(boolean isAsc){
		orderFields.add(new OrderField("PHONEINT",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：接收人_姓名
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyReceiveName(boolean isAsc){
		orderFields.add(new OrderField("RECEIVE_NAME",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：接收人_邮寄地址
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbySendaddress(boolean isAsc){
		orderFields.add(new OrderField("SENDADDRESS",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：中奖人真实姓名
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyRealName(boolean isAsc){
		orderFields.add(new OrderField("REAL_NAME",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：接受人_邮政编码
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbySendPost(boolean isAsc){
		orderFields.add(new OrderField("SEND_POST",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：是否取消状态（0为正常 1为取消）
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyState(boolean isAsc){
		orderFields.add(new OrderField("STATE",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：支付宝账号
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyAlipay(boolean isAsc){
		orderFields.add(new OrderField("ALIPAY",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：支付流水号
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyPayseqnum(boolean isAsc){
		orderFields.add(new OrderField("PAYSEQNUM",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：备注
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyComments(boolean isAsc){
		orderFields.add(new OrderField("COMMENTS",isAsc?"ASC":"DESC"));
		return this;
	}
	/**
	 * 设置排序按属性：活动id
	 * @param isAsc 是否升序，否则为降序
	 */	
	public LotteryWinQuery orderbyActivityId(boolean isAsc){
		orderFields.add(new OrderField("ACTIVITY_ID",isAsc?"ASC":"DESC"));
		return this;
	}
    private String fields;
    /**
     * 提供自定义字段使用
     */
    private static Map<String,String> fieldMap;

    private static Map<String,String> getFieldSet() {
        if (fieldMap == null){
            fieldMap =new HashMap<String,String>();
                    fieldMap.put("WINAID", "winaid");
                    fieldMap.put("USERNAME", "username");
                    fieldMap.put("USERID", "userid");
                    fieldMap.put("LOTTERYNAME", "lotteryname");
                    fieldMap.put("PID", "pid");
                    fieldMap.put("USERPHONE", "userphone");
                    fieldMap.put("WINORFAILURE", "winorfailure");
                    fieldMap.put("WINDATE", "windate");
                    fieldMap.put("CHECKOUT", "checkout");
                    fieldMap.put("PHONEINT", "phoneint");
                    fieldMap.put("RECEIVE_NAME", "receiveName");
                    fieldMap.put("SENDADDRESS", "sendaddress");
                    fieldMap.put("REAL_NAME", "realName");
                    fieldMap.put("SEND_POST", "sendPost");
                    fieldMap.put("STATE", "state");
                    fieldMap.put("ALIPAY", "alipay");
                    fieldMap.put("PAYSEQNUM", "payseqnum");
                    fieldMap.put("COMMENTS", "comments");
                    fieldMap.put("ACTIVITY_ID", "activityId");
                }
        return fieldMap;
    }

    public String getFields(){
        return this.fields;
    }
    public LotteryWinQuery  setFields(String fields){
        String[] array = fields.split(",");
        StringBuffer buffer = new StringBuffer();
        for (String field : array){
            if(getFieldSet().containsKey(field)){
                buffer.append(field).append(" as ").append(getFieldSet().get(field)).append(" ,");
            }
            if(getFieldSet().containsKey("`"+field+"`")){
                buffer.append("`"+field+"`").append(" as ").append(getFieldSet().get(field)).append(" ,");
            }
        }
        if (buffer.length() != 0){
            this.fields = buffer.substring(0, buffer.length() - 1);
        }else{
            this.fields = " 1 ";//没有一个参数可能会报错
        }
        return this;
    }
}
