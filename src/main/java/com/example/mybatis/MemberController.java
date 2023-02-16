package com.example.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @PostMapping("/save")
    public void saveController(@RequestBody Member member) {
        memberRepository.save(member);
    }

    @PatchMapping("/update/{id}")
    public void updateController(@PathVariable Long id, @RequestBody UpdateRequest request) {
        memberRepository.update(id, request);
    }

    @GetMapping("/find/{memberId}")
    public Optional<Member> findController(@PathVariable Long memberId) {
        return memberRepository.findById(memberId);
    }

    @GetMapping("/findAll")
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
