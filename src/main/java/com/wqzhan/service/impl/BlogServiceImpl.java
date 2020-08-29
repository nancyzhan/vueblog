package com.wqzhan.service.impl;

import com.wqzhan.entity.Blog;
import com.wqzhan.mapper.BlogMapper;
import com.wqzhan.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wqzhan
 * @since 2020-08-26
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
