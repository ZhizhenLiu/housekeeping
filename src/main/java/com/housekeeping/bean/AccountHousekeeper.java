package com.housekeeping.bean;

public class AccountHousekeeper {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_housekeeper.id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_housekeeper.money
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private String money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_housekeeper.transaction_time
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private Long transactionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_housekeeper.description
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_housekeeper.type
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_housekeeper.user_id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_housekeeper.order_id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    private Long orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_housekeeper.id
     *
     * @return the value of account_housekeeper.id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_housekeeper.id
     *
     * @param id the value for account_housekeeper.id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_housekeeper.money
     *
     * @return the value of account_housekeeper.money
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public String getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_housekeeper.money
     *
     * @param money the value for account_housekeeper.money
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_housekeeper.transaction_time
     *
     * @return the value of account_housekeeper.transaction_time
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public Long getTransactionTime() {
        return transactionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_housekeeper.transaction_time
     *
     * @param transactionTime the value for account_housekeeper.transaction_time
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setTransactionTime(Long transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_housekeeper.description
     *
     * @return the value of account_housekeeper.description
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_housekeeper.description
     *
     * @param description the value for account_housekeeper.description
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_housekeeper.type
     *
     * @return the value of account_housekeeper.type
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_housekeeper.type
     *
     * @param type the value for account_housekeeper.type
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_housekeeper.user_id
     *
     * @return the value of account_housekeeper.user_id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_housekeeper.user_id
     *
     * @param userId the value for account_housekeeper.user_id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_housekeeper.order_id
     *
     * @return the value of account_housekeeper.order_id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_housekeeper.order_id
     *
     * @param orderId the value for account_housekeeper.order_id
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}