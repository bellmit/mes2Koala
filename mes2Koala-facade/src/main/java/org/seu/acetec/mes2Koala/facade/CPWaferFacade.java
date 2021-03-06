package org.seu.acetec.mes2Koala.facade;

import java.util.List;

import org.dayatang.utils.Page;
import org.openkoala.koala.commons.InvokeResult;
import org.seu.acetec.mes2Koala.core.domain.CPLot;
import org.seu.acetec.mes2Koala.core.domain.CPNode;
import org.seu.acetec.mes2Koala.facade.dto.*;

public interface CPWaferFacade {

	public InvokeResult getCPWafer(Long id);

	public InvokeResult creatCPWafer(CPWaferDTO cPWafer);

	public InvokeResult updateCPWafer(CPWaferDTO cPWafer);

	public InvokeResult removeCPWafer(Long id);

	public InvokeResult removeCPWafers(Long[] ids);

	public List<CPWaferDTO> findAllCPWafer();

	public Page<CPWaferDTO> pageQueryCPWafer(CPWaferDTO cPWafer,
			int currentPage, int pageSize);

	public CPLotDTO findCpLotByCPWafer(Long id);

	public CPCustomerWaferDTO findCpCustomerWaferByCPWafer(Long id);

	public InvokeResult changeStatusPassed(String ids);

	public InvokeResult getCPWaferInfoByNode(Long cpLotId, Long nodeId);

	public InvokeResult saveCheck(String ids,CPWaferDTO cPWaferDTO);
	
	public List<CPWaferDTO> getCPWaferInfoByNode(CPLot cpLot, CPNode cpNode);

	public boolean checkCPWaferSbl(CPLot cpLot, String nodeName);
	
	public List<CPWaferDTO> getCPWaferYieldByLot(CPLot cpLot);
	
	public List<CPWaferDTO> getCPWaferYieldByLotId(Long id);

	public InvokeResult getCPWaferCheck(Long cpLotId, Long nodeId);
}
