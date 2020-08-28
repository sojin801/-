package com.renshu.www.notice.mapper;

import com.renshu.www.notice.dto.NoticeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

    @Mapper
    public interface NoticeMapper {

        List<NoticeDto> selectNoticeList() throws Exception;

        /*void insertNotice(NoticeDto notice) throws Exception;

        NoticeDto selectNoticeDetail(int noticeIdx) throws Exception;

        void updateNotice(NoticeDto notice) throws Exception;

        void deleteNotice(int noticeIdx) throws Exception;
*/
    }
