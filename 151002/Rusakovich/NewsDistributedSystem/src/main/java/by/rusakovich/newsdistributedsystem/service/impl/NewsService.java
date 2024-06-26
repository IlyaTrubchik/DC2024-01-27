package by.rusakovich.newsdistributedsystem.service.impl;

import by.rusakovich.newsdistributedsystem.dao.IEntityRepository;
import by.rusakovich.newsdistributedsystem.model.dto.mapper.EntityMapper;
import by.rusakovich.newsdistributedsystem.model.dto.news.NewsRequestTO;
import by.rusakovich.newsdistributedsystem.model.dto.news.NewsResponseTO;
import by.rusakovich.newsdistributedsystem.model.entity.impl.News;
import by.rusakovich.newsdistributedsystem.service.EntityService;
import org.springframework.stereotype.Service;

@Service
public class NewsService extends EntityService<Long, NewsRequestTO, NewsResponseTO, News<Long>> {

    public NewsService(EntityMapper<Long, News<Long>, NewsRequestTO, NewsResponseTO> mapper, IEntityRepository<Long, News<Long>> rep) {
        super(mapper, rep);
    }
}
