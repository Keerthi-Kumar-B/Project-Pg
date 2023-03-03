package com.example.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.dao.PgDao;
import com.example.practice.dto.PgCandidate;
import com.example.practice.exception.NodataFoundException;
import com.example.practice.response.ResponseStructure;

@Service
public class PgService {
	@Autowired
	private PgDao pgdao;

	public ResponseStructure<PgCandidate> insertdata(PgCandidate cand) throws NodataFoundException {
		PgCandidate insertdata = pgdao.insertdata(cand);
		ResponseStructure<PgCandidate> resp = new ResponseStructure<>();
		resp.setData(insertdata);
		resp.setMsg("data inserted");

		return resp;
	}

	public ResponseStructure<PgCandidate> updatedata(PgCandidate cand) throws NodataFoundException {

		PgCandidate updatedata = pgdao.updatedata(cand);
		ResponseStructure<PgCandidate> resp = new ResponseStructure<>();
		resp.setData(updatedata);
		resp.setMsg("data updated");
		return resp;
	}

	public ResponseStructure<String> deleteById(int canditateId) {
		pgdao.deleteById(canditateId);
		ResponseStructure<String> resp = new ResponseStructure<>();
		resp.setMsg("data Deleted Success");

		return resp;
		

	}

	public ResponseStructure<PgCandidate> getById(int canditateId) {
		PgCandidate byId = pgdao.getById(canditateId);
		ResponseStructure<PgCandidate>resp=new ResponseStructure<>();
		resp.setData(byId);
		resp.setMsg("data fetched by id");
		return resp;
		
	}

	public ResponseStructure<List<PgCandidate>> fetchAll() {
		List<PgCandidate> fetchAll = pgdao.fetchAll();
		ResponseStructure<List<PgCandidate>>resp=new ResponseStructure<>();
		resp.setData(fetchAll);
		resp.setMsg("data all fetched");
		return resp;
	}

}
