package com.housekeeping.bean;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.c_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private Integer cNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.d_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private String dNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.u_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private String uNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.c_date
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private Date cDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.c_content
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private String cContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.c_no
     *
     * @return the value of comment.c_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public Integer getcNo() {
        return cNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.c_no
     *
     * @param cNo the value for comment.c_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setcNo(Integer cNo) {
        this.cNo = cNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.d_no
     *
     * @return the value of comment.d_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public String getdNo() {
        return dNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.d_no
     *
     * @param dNo the value for comment.d_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setdNo(String dNo) {
        this.dNo = dNo == null ? null : dNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.u_no
     *
     * @return the value of comment.u_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public String getuNo() {
        return uNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.u_no
     *
     * @param uNo the value for comment.u_no
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setuNo(String uNo) {
        this.uNo = uNo == null ? null : uNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.c_date
     *
     * @return the value of comment.c_date
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public Date getcDate() {
        return cDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.c_date
     *
     * @param cDate the value for comment.c_date
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.c_content
     *
     * @return the value of comment.c_content
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public String getcContent() {
        return cContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.c_content
     *
     * @param cContent the value for comment.c_content
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }
}