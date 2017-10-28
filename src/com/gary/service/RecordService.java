package com.gary.service;

import java.util.List;

import com.gary.pojo.Record;


public interface RecordService {
	List<Record> list();
	

	void add(Record record);
	void update(Record record);
	void delete(Record record);
	Record get(int id);
}
