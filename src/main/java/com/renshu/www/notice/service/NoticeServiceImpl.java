package com.renshu.www.notice.service;

import com.renshu.www.notice.dto.NoticeDto;
import com.renshu.www.notice.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<NoticeDto> selectNoticeList() throws Exception {
        return noticeMapper.selectNoticeList();
    }

   /* @Override
    public void insertNotice(NoticeDto notice) throws Exception {
        noticeMapper.insertNotice(notice);
    }

    @Override
    public NoticeDto selectNoticeDetail(int noticeIdx) throws Exception{
        NoticeDto notice = noticeMapper.selectNoticeDetail(noticeIdx);
        return notice;
    }

    @Override
    public void updateNotice(NoticeDto notice) throws Exception {
        noticeMapper.updateNotice(notice);
    }

    @Override
    public void deleteNotice(int noticeIdx) throws Exception {
        noticeMapper.deleteNotice(noticeIdx);
    }*/
}