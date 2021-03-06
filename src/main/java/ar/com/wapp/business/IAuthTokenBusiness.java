package ar.com.wapp.business;

import ar.com.wapp.model.AuthToken;

public interface IAuthTokenBusiness {
	
	public AuthToken save(AuthToken at) throws BusinessException;

	public AuthToken load(String series) throws BusinessException, NotFoundException;

	public void delete(AuthToken at) throws BusinessException;

}
