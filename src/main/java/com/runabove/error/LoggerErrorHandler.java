package com.runabove.error;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import retrofit.RetrofitError;

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

 * Logger error handler, util class to display error on logger

 *
 */
/**
 * The Class LoggerErrorHandler.
 */
public class LoggerErrorHandler implements ExceptionHandler {

	/** The log. */
	private final static Logger LOG = LoggerFactory.getLogger(LoggerErrorHandler.class);

	/**
	 * handle exception implementation.
	 *
	 * @param exception the exception
	 */
	public void handleException(Exception exception) {
		LOG.error("Exception ", exception);
	}

	/**
	 * handle error implementation.
	 *
	 * @param cause the cause
	 * @return the throwable
	 */
	public Throwable handleError(RetrofitError cause) {
		if (cause == null) {
			return null;
		}
		if (cause.getResponse() == null) {
			return null;
		}

		LOG.error("Response Reason " + cause.getResponse().getReason());
		LOG.error("Response Status " + cause.getResponse().getStatus());
		LOG.error("Response Url " + cause.getResponse().getUrl());
		LOG.error("Response Body ----  ");

		try {
			if (cause.getResponse() != null && cause.getResponse().getBody() != null) {
				InputStream in = cause.getResponse().getBody().in();
				LOG.error(convertStreamToString(in));
			}
		} catch (IOException e) {
			LOG.error("IO Exception during request execution : ", e);
		}

		LOG.error("Response Body ----  ");
		LOG.error("Error cause : ", cause);

		return null;
	}

	/**
	 * util function to convert input stream to string.
	 *
	 * @param is the is
	 * @return the string
	 */
	@SuppressWarnings("resource")
	private static String convertStreamToString(InputStream is) {
		Scanner s = new Scanner(is).useDelimiter("\\A");
		return s.hasNext() ? s.next() : "";
	}
}
