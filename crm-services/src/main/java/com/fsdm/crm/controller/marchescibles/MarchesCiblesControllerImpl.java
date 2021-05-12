package com.fsdm.crm.controller.marchescibles;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.codeacces.view.CodeAccesView;
import com.fsdm.crm.controller.marchescibles.view.MarchesCiblesUpdateRequestView;
import com.fsdm.crm.controller.marchescibles.view.MarchesCiblesView;
import com.fsdm.crm.entities.CodeAcces;
import com.fsdm.crm.entities.MarchesCibles;
import com.fsdm.crm.services.marchescibles.MarchesCiblesService;
@Component
public class MarchesCiblesControllerImpl implements MarchesCiblesController {
@Autowired 
private MarchesCiblesService marchesciblesServices;
	@Override
	public @Valid @NotNull MarchesCiblesView findMarchesCiblesById(@NotNull Long idMarchescibles) {
		// TODO Auto-generated method stub
		return MarchesCiblesView.from(marchesciblesServices.findMarchesCiblesById(idMarchescibles));
	}

	@Override
	public MarchesCiblesView createMarchesCibles(@NotNull @Valid MarchesCiblesView marchescibles) {
		// TODO Auto-generated method stub
		return MarchesCiblesView.from(marchesciblesServices.createMarchesCibles(MarchesCiblesView.to(marchescibles)));
	}

	@Override
	public void updateMarchesCibles(MarchesCiblesUpdateRequestView marchesciblesUpdateRequestView) throws Exception {
		MarchesCibles marchescibles= marchesciblesServices.findMarchesCiblesById(marchesciblesUpdateRequestView.getIdMarchescibeles());
		marchescibles.setDateMc(marchesciblesUpdateRequestView.getDateMc());
		marchesciblesServices.updateMarchesCibles(marchescibles);
		
	}

	@Override
	public void deleteCodeAcces(Long idMarchesCibles) {
		
		marchesciblesServices.deleteMarchesCibles(idMarchesCibles);
	}

}
