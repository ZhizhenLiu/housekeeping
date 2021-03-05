package com.housekeeping.dao;

import com.housekeeping.bean.OrderLine;
import com.housekeeping.bean.OrderLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    long countByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    int deleteByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    int insert(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    int insertSelective(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    List<OrderLine> selectByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    OrderLine selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    int updateByExampleSelective(@Param("record") OrderLine record, @Param("example") OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    int updateByExample(@Param("record") OrderLine record, @Param("example") OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    int updateByPrimaryKeySelective(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_line
     *
     * @mbg.generated Fri Mar 05 10:54:27 CST 2021
     */
    int updateByPrimaryKey(OrderLine record);
}