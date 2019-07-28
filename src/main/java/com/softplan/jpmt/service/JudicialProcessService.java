package com.softplan.jpmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softplan.jpm.entities.JudicialProcess;
import com.softplan.jpm.jpa.repository.JudicialProcessRepository;

@Service
public class JudicialProcessService {

	@Autowired
	private JudicialProcessRepository judicialProcessRepository;

	public List<JudicialProcess> getAllJudicialProcess() {
		List<JudicialProcess> judicialProcess = judicialProcessRepository.findAll();
		return judicialProcess;
	}
	
	public JudicialProcess persistJudicialProcess(JudicialProcess judicialProcess) {
		
		return judicialProcessRepository.save(judicialProcess);
	}
	
	public JudicialProcess getById(long id) {
		
		return judicialProcessRepository.getOne(id);
	}
	
//	public void deleteById(long id) {
//        // Retrieve the movie with this ID
//		JudicialProcess judicialProcess = judicialProcessRepository.getOne(id);
//        if (judicialProcess != null) {
//            try {
//               
//                judicialProcess.getResponsables().forEach(responsable -> {
//                    responsable.getJudicialProcess().remove(judicialProcess);
//                });
//
//                judicialProcessRepository.delete(judicialProcess);
//                
//            } catch (Exception e) {//TODO tirar este catch genérico
//                e.printStackTrace();
//            }
//        }
//    }
	

}
