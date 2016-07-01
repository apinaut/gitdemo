package com.apiomat.nativemodule;
/*
 * common interface for hook classes
 */
public interface IModelHooksCommon<T>
{
    public void setCallingModel( T model );
	
	/**
	 * You can implement a custom authentication method in your own user class, which must inherit from Basics.User. If
	 * access on an arbitrary model is checked, your user class (inheriting from user) is resolved by the users name and
	 * the authentication method gets called.
	 *
	 * @param httpVerb GET / POST / DELETE / PUT
	 * @param modelName name of the model where the user wants access to
	 * @param modelForeignId foreign ID of the model where the user wants access to
	 * @param userNameOrEmail username or email of the user
	 * @param password users password
	 * @param request the request object
	 * @return TRUE on successfull auth
	 */
	default public boolean auth( String httpVerb, String modelName, String modelForeignId, String userNameOrEmail, String password, Request request )
	{
		return false;
	}
}