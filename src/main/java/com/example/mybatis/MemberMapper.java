package com.example.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {

    void save(Member member);

    //파라미터 2개 이상부터 @Param 사용해야함
    void update(@Param("id") Long id, @Param("updateParam") UpdateRequest request);

    List<Member> findAll();

    Optional<Member> findById(Long id);
}
