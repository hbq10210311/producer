package com.nezha.gcar.member.service.impl;

import com.nezha.gcar.member.entity.Member;
import com.nezha.gcar.member.mapper.MemberMapper;
import com.nezha.gcar.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<Member> queryMemberList() {
        return this.memberMapper.queryMemberList();
    }
}
