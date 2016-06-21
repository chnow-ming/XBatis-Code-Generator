package com.ct.pojo;

import java.util.*;
import java.io.Serializable;

/**
 *
 * @author  Wu shaoming(361726442@qq.com)
 * @date    2016-06-21
 */
public class LotteryWin implements Serializable{

    /**
	 *序列化ID
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 中奖纪录ID
     */
    private Long winaid;
	/**
     * 中奖用户名称
     */
    private String username;
	/**
     * 中奖用户ID
     */
    private Long userid;
	/**
     * 奖品名称
     */
    private String lotteryname;
	/**
     * 奖品Id
     */
    private Long pid;
	/**
     * 中奖人手机号码
     */
    private String userphone;
	/**
     * 是否中奖（0 为未中奖 1为中奖）
     */
    private String winorfailure;
	/**
     * 中奖时间
     */
    private Date windate;
	/**
     * 奖品是否发出（0奖品未送出 1奖品已送出）
     */
    private Integer checkout;
	/**
     * 接受人_联系电话
     */
    private String phoneint;
	/**
     * 接收人_姓名
     */
    private String receiveName;
	/**
     * 接收人_邮寄地址
     */
    private String sendaddress;
	/**
     * 中奖人真实姓名
     */
    private String realName;
	/**
     * 接受人_邮政编码
     */
    private String sendPost;
	/**
     * 是否取消状态（0为正常 1为取消）
     */
    private String state;
	/**
     * 支付宝账号
     */
    private String alipay;
	/**
     * 支付流水号
     */
    private String payseqnum;
	/**
     * 备注
     */
    private String comments;
	/**
     * 活动id
     */
    private String activityId;

	
   /**
    * @return winaid 中奖纪录ID
    */
    public Long getWinaid() {
       return winaid;
    }
   /**
    * @param winaid 中奖纪录ID
    */
    public void setWinaid(Long winaid) {
       this.winaid = winaid;
    }
	
   /**
    * @return username 中奖用户名称
    */
    public String getUsername() {
       return username;
    }
   /**
    * @param username 中奖用户名称
    */
    public void setUsername(String username) {
       this.username = username;
    }
	
   /**
    * @return userid 中奖用户ID
    */
    public Long getUserid() {
       return userid;
    }
   /**
    * @param userid 中奖用户ID
    */
    public void setUserid(Long userid) {
       this.userid = userid;
    }
	
   /**
    * @return lotteryname 奖品名称
    */
    public String getLotteryname() {
       return lotteryname;
    }
   /**
    * @param lotteryname 奖品名称
    */
    public void setLotteryname(String lotteryname) {
       this.lotteryname = lotteryname;
    }
	
   /**
    * @return pid 奖品Id
    */
    public Long getPid() {
       return pid;
    }
   /**
    * @param pid 奖品Id
    */
    public void setPid(Long pid) {
       this.pid = pid;
    }
	
   /**
    * @return userphone 中奖人手机号码
    */
    public String getUserphone() {
       return userphone;
    }
   /**
    * @param userphone 中奖人手机号码
    */
    public void setUserphone(String userphone) {
       this.userphone = userphone;
    }
	
   /**
    * @return winorfailure 是否中奖（0 为未中奖 1为中奖）
    */
    public String getWinorfailure() {
       return winorfailure;
    }
   /**
    * @param winorfailure 是否中奖（0 为未中奖 1为中奖）
    */
    public void setWinorfailure(String winorfailure) {
       this.winorfailure = winorfailure;
    }
	
   /**
    * @return windate 中奖时间
    */
    public Date getWindate() {
       return windate;
    }
   /**
    * @param windate 中奖时间
    */
    public void setWindate(Date windate) {
       this.windate = windate;
    }
	
   /**
    * @return checkout 奖品是否发出（0奖品未送出 1奖品已送出）
    */
    public Integer getCheckout() {
       return checkout;
    }
   /**
    * @param checkout 奖品是否发出（0奖品未送出 1奖品已送出）
    */
    public void setCheckout(Integer checkout) {
       this.checkout = checkout;
    }
	
   /**
    * @return phoneint 接受人_联系电话
    */
    public String getPhoneint() {
       return phoneint;
    }
   /**
    * @param phoneint 接受人_联系电话
    */
    public void setPhoneint(String phoneint) {
       this.phoneint = phoneint;
    }
	
   /**
    * @return receiveName 接收人_姓名
    */
    public String getReceiveName() {
       return receiveName;
    }
   /**
    * @param receiveName 接收人_姓名
    */
    public void setReceiveName(String receiveName) {
       this.receiveName = receiveName;
    }
	
   /**
    * @return sendaddress 接收人_邮寄地址
    */
    public String getSendaddress() {
       return sendaddress;
    }
   /**
    * @param sendaddress 接收人_邮寄地址
    */
    public void setSendaddress(String sendaddress) {
       this.sendaddress = sendaddress;
    }
	
   /**
    * @return realName 中奖人真实姓名
    */
    public String getRealName() {
       return realName;
    }
   /**
    * @param realName 中奖人真实姓名
    */
    public void setRealName(String realName) {
       this.realName = realName;
    }
	
   /**
    * @return sendPost 接受人_邮政编码
    */
    public String getSendPost() {
       return sendPost;
    }
   /**
    * @param sendPost 接受人_邮政编码
    */
    public void setSendPost(String sendPost) {
       this.sendPost = sendPost;
    }
	
   /**
    * @return state 是否取消状态（0为正常 1为取消）
    */
    public String getState() {
       return state;
    }
   /**
    * @param state 是否取消状态（0为正常 1为取消）
    */
    public void setState(String state) {
       this.state = state;
    }
	
   /**
    * @return alipay 支付宝账号
    */
    public String getAlipay() {
       return alipay;
    }
   /**
    * @param alipay 支付宝账号
    */
    public void setAlipay(String alipay) {
       this.alipay = alipay;
    }
	
   /**
    * @return payseqnum 支付流水号
    */
    public String getPayseqnum() {
       return payseqnum;
    }
   /**
    * @param payseqnum 支付流水号
    */
    public void setPayseqnum(String payseqnum) {
       this.payseqnum = payseqnum;
    }
	
   /**
    * @return comments 备注
    */
    public String getComments() {
       return comments;
    }
   /**
    * @param comments 备注
    */
    public void setComments(String comments) {
       this.comments = comments;
    }
	
   /**
    * @return activityId 活动id
    */
    public String getActivityId() {
       return activityId;
    }
   /**
    * @param activityId 活动id
    */
    public void setActivityId(String activityId) {
       this.activityId = activityId;
    }

}