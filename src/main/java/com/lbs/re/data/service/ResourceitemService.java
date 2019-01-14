package com.lbs.re.data.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lbs.re.model.ReResourceitem;

@Service
public interface ResourceitemService extends BaseService<ReResourceitem, Integer>{
	List<ReResourceitem> getItemListByResource(int resourceref);
}
