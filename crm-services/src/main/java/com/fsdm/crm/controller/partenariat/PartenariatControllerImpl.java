package com.fsdm.crm.controller.partenariat;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.partenariat.view.PartenariatUpdateRequestView;
import com.fsdm.crm.controller.partenariat.view.PartenariatView;
import com.fsdm.crm.controller.statut.view.StatutView;
import com.fsdm.crm.services.partenariat.PartenariatService;
@Component
public class PartenariatControllerImpl implements PartenariatController {
@Autowired
private PartenariatService partenariatService;
	@Override
	public @Valid @NotNull PartenariatView findStatutById(@NotNull Long idPartenariat) {
		
		return PartenariatView.from(partenariatService.findPartenariatById(idPartenariat));
	}

	@Override
	public PartenariatView createPartenariat(@NotNull @Valid PartenariatView partenariat) {
		// TODO Auto-generated method stub
		return PartenariatView.from(partenariatService.createPartenariat(PartenariatView.to(partenariat)));
	}

	@Override
	public void updatePartenariat(PartenariatUpdateRequestView partenariatUpdateRequestView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePartenariat(Long idPartenariat) {
		partenariatService.deletePartenariat(idPartenariat);
		
	}

}
