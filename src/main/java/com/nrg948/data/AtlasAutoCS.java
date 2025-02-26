package com.nrg948.data;

import jakarta.persistence.Embeddable;

@Embeddable
public class AtlasAutoCS {
	private int barge;
	private int processor;
	/**
	 * @return the barge
	 */
	public int getBarge() {
		return barge;
	}
	/**
	 * @param barge the barge to set
	 */
	public void setBarge(int barge) {
		this.barge = barge;
	}
	/**
	 * @return the processor
	 */
	public int getProcessor() {
		return processor;
	}
	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(int processor) {
		this.processor = processor;
	}
}
