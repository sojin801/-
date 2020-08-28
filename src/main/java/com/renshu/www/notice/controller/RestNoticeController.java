package com.renshu.www.notice.controller;

import com.renshu.www.notice.dto.NoticeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.renshu.www.notice.service.NoticeService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RestNoticeController {
    @Autowired
    private NoticeService noticeService;

    @RequestMapping(value="/notice", method= RequestMethod.GET)
    public ModelAndView openNoticeList() throws Exception{
        ModelAndView mv = new ModelAndView("/notice/restNoticeList");

        List<NoticeDto> list = noticeService.selectNoticeList();
        mv.addObject("list", list);

        return mv;
    }

    /*@RequestMapping(value="/notice/write", method=RequestMethod.GET)
    public String openNoticeWrite() throws Exception{
        return "notice/restNoticeWrite";
    }

    @RequestMapping(value="/notice/write", method=RequestMethod.POST)
    public String insertNotice(NoticeDto notice) throws Exception{
        noticeService.insertNotice(notice);
        return "redirect:/notice";
    }

    @RequestMapping(value="/notice/{noticeIdx}", method=RequestMethod.GET)
    public ModelAndView openNoticeDetail(@PathVariable("noticeIdx") int noticeIdx, ModelMap model) throws Exception{
        ModelAndView mv = new ModelAndView("/notice/restNoticeDetail");

        NoticeDto board = noticeService.selectNoticeDetail(noticeIdx);
        mv.addObject("notice", noticeService);

        return mv;
    }

    @RequestMapping(value="/notice/{noticeIdx}", method=RequestMethod.PUT)
    public String updateNotice(NoticeDto notice) throws Exception{
        noticeService.updateNotice(notice);
        return "redirect:/notice";
    }

    @RequestMapping(value="/notice/{noticeIdx}", method=RequestMethod.DELETE)
    public String deleteNotice(@PathVariable("noticeIdx") int noticeIdx) throws Exception{
        noticeService.deleteNotice(noticeIdx);
        return "redirect:/notice";
    }*/


}
