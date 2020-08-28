package com.renshu.www.notice.service;

import com.renshu.www.notice.dto.NoticeDto;

import java.util.List;

public interface NoticeService {

        List<NoticeDto> selectNoticeList() throws Exception;

        /*void insertNotice(NoticeDto notice) throws Exception;

        NoticeDto selectNoticeDetail(int noticeIdx) throws Exception;

        void updateNotice(NoticeDto notice) throws Exception;

        void deleteNotice(int noticeIdx) throws Exception;*/
    }
