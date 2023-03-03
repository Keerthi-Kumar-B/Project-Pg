package com.example.practice.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.practice.dto.PgCandidate;
import com.example.practice.exception.NodataFoundException;
import com.example.practice.repo.PgRepo;

@Repository
public class PgDao {

	@Autowired
	private PgRepo pgrepo;

	public PgCandidate insertdata(PgCandidate cand) throws NodataFoundException {
		if (cand != null) {
			PgCandidate candidate = pgrepo.save(cand);

			return candidate;
		}
		throw new NodataFoundException("no data found");

	}

	public PgCandidate updatedata(PgCandidate cand) throws NodataFoundException {
		if (cand != null) {
			PgCandidate candidate = pgrepo.save(cand);

			return candidate;
		}
		throw new NodataFoundException("no data updated");

	}

	public void deleteById(int canditateId) {
		pgrepo.deleteById(canditateId);

	}

	public PgCandidate getById(int canditateId) {
		Optional<PgCandidate> findById = pgrepo.findById(canditateId);
		if (findById.isPresent())
			return findById.get();
		return null;

	}

	public List<PgCandidate> fetchAll() {
		List<PgCandidate> findAll = pgrepo.findAll();
		if (findAll != null) {
			return findAll;
		} else {
			return null;
		}
	}
}
