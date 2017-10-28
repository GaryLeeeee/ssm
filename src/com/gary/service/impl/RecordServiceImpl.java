package com.gary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gary.mapper.RecordMapper;
import com.gary.pojo.Record;
import com.gary.service.RecordService;
@Service
public class RecordServiceImpl implements RecordService {
	@Autowired
	RecordMapper recordMapper;
	@Override
	public List<Record> list() {
		// TODO Auto-generated method stub
//		return null;
		return recordMapper.list();
	}
	@Override
	public void add(Record record) {
		// TODO Auto-generated method stub
		recordMapper.add(record);
	}
	@Override
	public void update(Record record) {
		// TODO Auto-generated method stub
		recordMapper.update(record);
	}
	@Override
	public void delete(Record record) {
		// TODO Auto-generated method stub
		recordMapper.delete(record.getId());
	}
	@Override
	public Record get(int id) {
		// TODO Auto-generated method stub
		return recordMapper.get(id);
	}

}
