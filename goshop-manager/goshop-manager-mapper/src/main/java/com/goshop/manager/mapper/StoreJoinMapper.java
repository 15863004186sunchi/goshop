package com.goshop.manager.mapper;

import com.goshop.manager.pojo.StoreJoin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreJoinMapper {

    //���ύ����
    static String JOIN_STATIC_APPLY = "10";
    //�ɷ����
    static String JOIN_STATIC_PAY = "11";
    //��˳ɹ�
    static String JOIN_STATIC_EXMINE_YES = "20";
    //���ʧ��
    static String JOIN_STATIC_EXMINE_NO = "30";
    //�ɷ����ʧ��
    static String JOIN_STATIC_PAY_NO = "31";
    //���ͨ������
    static String JOIN_STATIC_YES = "40";

    int deleteByPrimaryKey(Long memberId);

    int insert(StoreJoin record);

    int insertSelective(StoreJoin record);

    StoreJoin selectByPrimaryKey(Long memberId);

    int updateByPrimaryKeySelective(StoreJoin record);

    int updateByPrimaryKey(StoreJoin record);

    List<StoreJoin> findBySellerName(@Param("sellerName")String sellerName);

    List<StoreJoin> findByStoreName(@Param("storeName")String storeName);

    List<StoreJoin> findAll();
}