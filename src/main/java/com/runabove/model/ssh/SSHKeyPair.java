package com.runabove.model.ssh;

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
 * ssh key pair
 */

/**
 * The Class SSHKeyPair.
 */
public class SSHKeyPair {

	/** SSH keypair fingerprint. */
	private String fingerPrint;

	/** SSH keypair name. */
	private String name;

	/** SSH public key. */
	private String publicKey;

	/** SSH keypair region. */
	private String region;

	/**
	 * SSH keypair fingerprint.
	 *
	 * @return the finger print
	 */
	public String getFingerPrint() {
		return fingerPrint;
	}

	/**
	 * SSH keypair fingerprint.
	 *
	 * @param fingerPrint the new finger print
	 */
	public void setFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
	}

	/**
	 * SSH keypair name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * SSH keypair name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * SSH public key.
	 *
	 * @return the public key
	 */
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * SSH public key.
	 *
	 * @param publicKey the new public key
	 */
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	/**
	 * SSH keypair region.
	 *
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * SSH keypair region.
	 *
	 * @param region the new region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

}