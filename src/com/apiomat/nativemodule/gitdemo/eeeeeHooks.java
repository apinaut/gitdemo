/*
 * Copyright (c) 2011 - 2016, Apinauten GmbH
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this 
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.gitdemo;

import java.util.*;

import com.apiomat.nativemodule.*;



/**
* Generated class for hooks on your eeeee data model 
*/
public class eeeeeHooks<T extends eeeee> implements IModelHooks<eeeee>
{
    protected eeeee model;

    @Override
    public void setCallingModel( eeeee model )
    {
        this.model = model;
    }
    
    /* 
     * do-Methods can be used if your data model is set to TRANSIENT 
     */
     
    @Override
    public String doPost( eeeee obj, Request r )
    {
        return null;
    }

    @Override
    public void doPut( eeeee obj, Request r )
    {
    }

    @Override
    public eeeee doGet( String foreignId, Request r )
    {
        return null;
    }

    @Override
    public boolean doDelete( String foreignId, Request r )
    {
        return false;
    }

    @Override
    public List<eeeee> doGetAll( String query, Request r )
    {
        return null;
    }
    
    @Override
    public long doCountAll( String query, Request r )
    {
        return 0;
    }

    /*
     * Please note: Before doPostRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public void doPostRef( Object referencedObject, String referenceName, Request r )
    {
    }

    /*
     * Please note: Before doDeleteRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public void doDeleteRef( String refName, String refForeignId, Request r )
    {
    }

    /*
     * Please note: Before doGetRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public <Z extends AbstractClientDataModel> List<Z> doGetRef( String refName, String query, Request r )
    {
        return null;
    }

    /* Gets called in both cases: If the MetaModel is transient as well as if it isn't */
    @Override
    public boolean auth( String httpVerb, String modelName, String modelForeignId, String userNameOrEmail,
        String password, Request r )
    {
        return false;
    }

    /* 
     * Following Methods can be used if your data model is NOT set to TRANSIENT 
     */
     
    @Override
    public void beforePost( eeeee obj, Request r )
    {
    }

    @Override
    public void afterPost( eeeee obj, Request r )
    {
    }

    @Override
    public void beforeGet( eeeee obj, Request r )
    {
    }

    @Override
    public boolean beforePut( eeeee objFromDB, eeeee obj, Request r )
    {
        return false;
    }

    @Override
    public void afterPut( eeeee obj, Request r )
    {
    }

    @Override
    public boolean beforeDelete( eeeee obj, Request r )
    {
        return false;
    }

    @Override
    public List<eeeee> afterGetAll( List<eeeee> objects, String query, Request r )
    {
        /* 
         * If you want to change the retuned list of elements, you have to create a new list
         * and add the elements to return to it. Because getting elements from the "objects"
         * list will return a copy, changing values in this list does not have any effect.
         * 
         * If NULL is returned, unnecessary conversions are omitted and result is taken from database. 
         */
        return null; 
    }

    @Override
    public boolean beforePostRef( eeeee obj, Object referencedObject, String referenceName, Request r )
    {
        return false;
    }

    @Override
    public void afterPostRef( eeeee obj, Object referencedObject, String referenceName, Request r )
    {
    }

    @Override
    public boolean beforeDeleteRef( eeeee obj, Object referencedObject, String referenceName, Request r )
    {
        return false;
    }

    @Override
    public void afterDeleteRef( eeeee obj, Object referencedObject, String referenceName, Request r )
    {
    }

    @Override
    public <Z extends AbstractClientDataModel> List<Z> afterGetAllReferences( List<Z> objects, String query,
        String referenceName, Request request )
    {
            return null; // return objects here if you changed sth; returning null prevents unnecessary conversions
    }
}
