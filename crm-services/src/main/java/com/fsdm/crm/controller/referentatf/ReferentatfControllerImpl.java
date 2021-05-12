package com.fsdm.crm.controller.referentatf;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.referentatf.view.ReferentatfUpdateRequestView;
import com.fsdm.crm.controller.referentatf.view.ReferentatfView;

import com.fsdm.crm.entities.Referentatf;

import com.fsdm.crm.services.referentatfservice.ReferentatfService;

@Component
public class ReferentatfControllerImpl  implements ReferentatfController{

	@Autowired
	ReferentatfService 	referentatfService ;
	@Override
	public @Valid @NotNull ReferentatfView findReferentatfById(@NotNull Long idReferentatf) {
		// TODO Auto-generated method stub
		return ReferentatfView.from(referentatfService.findReferentatfById(idReferentatf));
	}

	@Override
	public ReferentatfView createReferentatf(@NotNull @Valid ReferentatfView referentatf) {
		
		return ReferentatfView.from(referentatfService.createReferentatf(ReferentatfView.to(referentatf)));
	}

	@Override
	public void updateReferentatf(ReferentatfUpdateRequestView referentatfRequestView) throws Exception {
		Referentatf referentatf = referentatfService.findReferentatfById(referentatfRequestView.getIdReferent());
		referentatf.setTelephone(referentatfRequestView.getTelephone());
		referentatfService.updateReferentatf(referentatf);
		
	}

	@Override
	public void deleteReferentatf(Long idReferentatf) {
		referentatfService.deleteReferentatf(idReferentatf);
		
	}

}
