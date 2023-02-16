package com.example.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final MemberMapper memberMapper;

    public void save(Member member) {
        memberMapper.save(member);
    }

    public void update(Long id, UpdateRequest request) {
        memberMapper.update(id, request);
    }

    public Optional<Member> findById(Long id) {
        return memberMapper.findById(id);
    }

    public List<Member> findAll() {
        return memberMapper.findAll();
    }

}
