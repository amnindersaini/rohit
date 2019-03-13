package com.wipro.automate;

import java.util.LinkedHashMap;

public class FinalJson 
{
	private String _index;
	private String _type;
	private String _id;
	private String _routing;
	private LinkedHashMap<Object,Object> _source;
	public String get_index() {
		return _index;
	}
	public void set_index(String _index) {
		this._index = _index;
	}
	public String get_type() {
		return _type;
	}
	public void set_type(String _type) {
		this._type = _type;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_routing() {
		return _routing;
	}
	public void set_routing(String _routing) {
		this._routing = _routing;
	}
	public LinkedHashMap<Object, Object> get_source() {
		return _source;
	}
	public void set_source(LinkedHashMap<Object, Object> _source) {
		this._source = _source;
	}
	

}
