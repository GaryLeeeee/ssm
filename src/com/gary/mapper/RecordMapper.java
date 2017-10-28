package com.gary.mapper;

import java.util.List;

import com.gary.pojo.Record;

public interface RecordMapper {
    public void add(Record record);  
    
    public void delete(int id);  
        
    public Record get(int id);  
      
    public void update(Record record);   
        
    public List<Record> list();
     
    public int count(); 
}
