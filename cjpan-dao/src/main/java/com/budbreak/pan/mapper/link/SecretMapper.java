package com.budbreak.pan.mapper.link;

import com.budbreak.pan.entity.link.Secret;
import com.budbreak.pan.vo.link.SecretVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
/**
 * @Description: 代码生成器自动生成
 * @author:
 * @Createed Date: 2020-4-24 14:46:16
 * @ModificationHistory: Who  When  What
 * ---------     -------------   --------------------------------------
 **/
@Repository
public interface SecretMapper extends BaseMapper<Secret> {

    /**
    * select Secret by id
    * @param id
    * @return
    */
    SecretVO selectDetailById(@Param("id")int id) ;

    /**
    * selectOwnPage
    * @param page
    * @param param
    * @return
    */
    IPage<SecretVO> selectOwnPage(Page page, @Param("param") Map<String, Object> param);

}
