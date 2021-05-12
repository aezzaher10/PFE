package com.fsdm.crm.controller.Classement;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.Classement.view.ClassementUpdateRequestView;
import com.fsdm.crm.controller.Classement.view.ClassementView;
import com.fsdm.crm.entities.Classement;
import com.fsdm.crm.services.classementservice.ClassementService;
@Component
public class ClassementControllerImpl implements ClassementController{
@Autowired
private ClassementService classementService;
	@Override
	public @Valid @NotNull ClassementView findClassementById(@NotNull Long idClassement) {
		// TODO Auto-generated method stub
		return ClassementView.from(classementService.findClassementById(idClassement));
	}

	@Override
	public ClassementView createClassement(@NotNull @Valid ClassementView classement) {
		// TODO Auto-generated method stub
		return ClassementView.from(classementService.createClassement(ClassementView.to(classement)));
	}

	@Override
	public void updateClassement(ClassementUpdateRequestView classementRequestView) throws Exception {
		Classement classement= classementService.findClassementById(classementRequestView.getIdClassement());
		classement.setDateClassement(classementRequestView.getDateClassement());
		classementService.updateClassement(classement);
		
	}

	@Override
	public void deleteClassement(Long idClassement) {
		classementService.deleteClassement(idClassement);
		
	}

}
