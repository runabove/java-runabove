package com.runabove.model.billing;

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
 * billing bandwitdh instance details
 *
 */
/**
 * The Class BillingBandwidthInstanceDetails.
 */
public class BillingBandwidthInstanceDetails {

	/** Bandwidth used in bytes. */
	private long quantity;

	/** Instance id. */
	private String id;

	/**
	 * Bandwidth used in bytes.
	 *
	 * @return the quantity
	 */
	public long getQuantity() {
		return quantity;
	}

	/**
	 * Bandwidth used in bytes.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	/**
	 * Instance id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Instance id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

}