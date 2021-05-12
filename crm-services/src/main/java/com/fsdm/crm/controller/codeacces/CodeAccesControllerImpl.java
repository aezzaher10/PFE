package com.fsdm.crm.controller.codeacces;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fsdm.crm.controller.Classement.view.ClassementView;
import com.fsdm.crm.controller.codeacces.view.CodeAccesUpadteRequestView;
import com.fsdm.crm.controller.codeacces.view.CodeAccesView;
import com.fsdm.crm.entities.Classement;
import com.fsdm.crm.entities.CodeAcces;
import com.fsdm.crm.services.codeacces.CodeAccesService;
@Component
public class CodeAccesControllerImpl implements CodeAccesController {
@Autowired
private CodeAccesService codeaccesService;
	@Override
	public @Valid @NotNull CodeAccesView findCodeAccesById(@NotNull Long idAcces) {
		// TODO Auto-generated method stub
		return CodeAccesView.from(codeaccesService.findCodeAccesById(idAcces));
	}

	@Override
	public CodeAccesView createCodeAcces(@NotNull @Valid CodeAccesView codeacces) {
		// TODO Auto-generated method stub
		return CodeAccesView.from(codeaccesService.createCodeAcces(CodeAccesView.to(codeacces)));
	}

	@Override
	public void updateCodeAcces(CodeAccesUpadteRequestView codeaccesUpdateRequestView) throws Exception {
		CodeAcces codeacces= codeaccesService.findCodeAccesById(codeaccesUpdateRequestView.getIdAcess());
		codeacces.setDateJp(codeaccesUpdateRequestView.getDateJp());
		codeaccesService.updateCodeAcces(codeacces);
		
		
	}

	@Override
	public void deleteCodeAcces(Long idAcces) {
		// TODO Auto-generated method stub
		codeaccesService.deleteCodeAcces(idAcces);
	}

}
