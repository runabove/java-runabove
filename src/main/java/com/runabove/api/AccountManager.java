package com.runabove.api;

import retrofit.http.GET;
import retrofit.http.Query;

import com.runabove.model.account.Account;
import com.runabove.model.account.Balance;
import com.runabove.model.billing.BillingProjectUse;
import com.runabove.model.token.Token;

/*
 * Copyright (c) 2014, OVH

 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.

 * Except as contained in this notice, the name of OVH and or its trademarks
 * (and among others RunAbove) shall not be used in advertising or otherwise to
 * promote the sale, use or other dealings in this Software without prior
 * written authorization from OVH.
 * Unit test for run above api
 * 
 * 
 */
/**
 * The Interface AccountManager.
 */
public interface AccountManager {

	/**
	 * Gets the usage.
	 *
	 * @return the usage
	 */
	@GET("/me/usage")
	BillingProjectUse[] getUsage();

	/**
	 * Gets the usage.
	 *
	 * @param billed the billed
	 * @param from the from
	 * @param projectId the project id
	 * @param to the to
	 * @return the usage
	 */
	@GET("/me/usage")
	BillingProjectUse[] getUsage(@Query("billed") boolean billed, @Query("from") String from, @Query("projectId") String projectId, @Query("to") String to);

	/**
	 * Gets the balance.
	 *
	 * @return the balance
	 */
	@GET("/me/balance")
	Balance getBalance();

	/**
	 * Me.
	 *
	 * @return the account
	 */
	@GET("/me")
	Account me();

	/**
	 * Project.
	 *
	 * @return the string[]
	 */
	@GET("/project")
	String[] project();

	/**
	 * Token.
	 *
	 * @return the token
	 */
	@GET("/token")
	Token token();
}
