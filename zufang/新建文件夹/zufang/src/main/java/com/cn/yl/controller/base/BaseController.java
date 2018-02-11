package com.cn.yl.controller.base;

import java.util.Iterator;  
import java.util.List;  
import java.util.Map;  
  


import org.springframework.ui.Model;  

import com.cn.yl.util.Pager;
  
public class BaseController<T> {  
  
    //初始化分页相关信息  
    protected void initPage(Map<String,Object> map, Integer pageNum, Integer pageSize, Integer totalCount){  
        if(null==pageSize || pageSize.equals("")){  
            pageSize = 15;  
        }  
        if(pageSize>50){  
            pageSize = 50;  
        }  
        Integer totalPage = (totalCount+pageSize-1)/pageSize;  
        if(null==pageNum){  
            pageNum = 1;  
        }else if(pageNum>totalPage){  
            pageNum = totalPage;  
        }  
        map.put("startIndex", Pager.getStartIndex(pageNum, pageSize));  
        map.put("pageNum", pageNum);  
        map.put("totalPage", totalPage);  
        map.put("pageSize", pageSize);  
        map.put("totalCount", totalCount);  
          
    }  
      
    //将相关数据放入model  
    @SuppressWarnings("rawtypes")
	protected void initResult(Model model, List<T> list, Map<String,Object> map){  
        model.addAttribute("list", list);  
        Iterator it = map.entrySet().iterator();   
        while(it.hasNext()){   
            Map.Entry m = (Map.Entry)it.next();
            //回填查询条件和hidden属性的值
            model.addAttribute(m.getKey().toString(), m.getValue());  
       }   
    }        
} 