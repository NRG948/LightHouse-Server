package com.nrg948.tba;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ReefInfo {
	private @Id @GeneratedValue Long id;
	@OneToOne(cascade = CascadeType.ALL)
	private TopNodesInfo topRow;
	@OneToOne(cascade = CascadeType.ALL)
	private MidNodesInfo midRow;
	@OneToOne(cascade = CascadeType.ALL)
	private BotNodesInfo botRow;
	/**
	 * @return the topRow
	 */
	public TopNodesInfo getTopRow() {
		return topRow;
	}
	/**
	 * @param topRow the topRow to set
	 */
	public void setTopRow(TopNodesInfo topRow) {
		this.topRow = topRow;
	}
	/**
	 * @return the midRow
	 */
	public MidNodesInfo getMidRow() {
		return midRow;
	}
	/**
	 * @param midRow the midRow to set
	 */
	public void setMidRow(MidNodesInfo midRow) {
		this.midRow = midRow;
	}
	/**
	 * @return the botRow
	 */
	public BotNodesInfo getBotRow() {
		return botRow;
	}
	/**
	 * @param botRow the botRow to set
	 */
	public void setBotRow(BotNodesInfo botRow) {
		this.botRow = botRow;
	}
	/**
	 * @return the trough
	 */
	public int getTrough() {
		return trough;
	}
	/**
	 * @param trough the trough to set
	 */
	public void setTrough(int trough) {
		this.trough = trough;
	}
	/**
	 * @return the tba_botRowCount
	 */
	public int getTba_botRowCount() {
		return tba_botRowCount;
	}
	/**
	 * @param tba_botRowCount the tba_botRowCount to set
	 */
	public void setTba_botRowCount(int tba_botRowCount) {
		this.tba_botRowCount = tba_botRowCount;
	}
	/**
	 * @return the tba_midRowCount
	 */
	public int getTba_midRowCount() {
		return tba_midRowCount;
	}
	/**
	 * @param tba_midRowCount the tba_midRowCount to set
	 */
	public void setTba_midRowCount(int tba_midRowCount) {
		this.tba_midRowCount = tba_midRowCount;
	}
	/**
	 * @return the tba_topRowCount
	 */
	public int getTba_topRowCount() {
		return tba_topRowCount;
	}
	/**
	 * @param tba_topRowCount the tba_topRowCount to set
	 */
	public void setTba_topRowCount(int tba_topRowCount) {
		this.tba_topRowCount = tba_topRowCount;
	}
	private int trough;
	private int tba_botRowCount;
	private int tba_midRowCount;
	private int tba_topRowCount;
}

@Entity
class TopNodesInfo {
	private @Id @GeneratedValue Long id;
	/**
	 * @return the nodeA
	 */
	public boolean isNodeA() {
		return nodeA;
	}
	/**
	 * @param nodeA the nodeA to set
	 */
	public void setNodeA(boolean nodeA) {
		this.nodeA = nodeA;
	}
	/**
	 * @return the nodeB
	 */
	public boolean isNodeB() {
		return nodeB;
	}
	/**
	 * @param nodeB the nodeB to set
	 */
	public void setNodeB(boolean nodeB) {
		this.nodeB = nodeB;
	}
	/**
	 * @return the nodeC
	 */
	public boolean isNodeC() {
		return nodeC;
	}
	/**
	 * @param nodeC the nodeC to set
	 */
	public void setNodeC(boolean nodeC) {
		this.nodeC = nodeC;
	}
	/**
	 * @return the nodeD
	 */
	public boolean isNodeD() {
		return nodeD;
	}
	/**
	 * @param nodeD the nodeD to set
	 */
	public void setNodeD(boolean nodeD) {
		this.nodeD = nodeD;
	}
	/**
	 * @return the nodeE
	 */
	public boolean isNodeE() {
		return nodeE;
	}
	/**
	 * @param nodeE the nodeE to set
	 */
	public void setNodeE(boolean nodeE) {
		this.nodeE = nodeE;
	}
	/**
	 * @return the nodeF
	 */
	public boolean isNodeF() {
		return nodeF;
	}
	/**
	 * @param nodeF the nodeF to set
	 */
	public void setNodeF(boolean nodeF) {
		this.nodeF = nodeF;
	}
	/**
	 * @return the nodeG
	 */
	public boolean isNodeG() {
		return nodeG;
	}
	/**
	 * @param nodeG the nodeG to set
	 */
	public void setNodeG(boolean nodeG) {
		this.nodeG = nodeG;
	}
	/**
	 * @return the nodeH
	 */
	public boolean isNodeH() {
		return nodeH;
	}
	/**
	 * @param nodeH the nodeH to set
	 */
	public void setNodeH(boolean nodeH) {
		this.nodeH = nodeH;
	}
	/**
	 * @return the nodeI
	 */
	public boolean isNodeI() {
		return nodeI;
	}
	/**
	 * @param nodeI the nodeI to set
	 */
	public void setNodeI(boolean nodeI) {
		this.nodeI = nodeI;
	}
	/**
	 * @return the nodeJ
	 */
	public boolean isNodeJ() {
		return nodeJ;
	}
	/**
	 * @param nodeJ the nodeJ to set
	 */
	public void setNodeJ(boolean nodeJ) {
		this.nodeJ = nodeJ;
	}
	/**
	 * @return the nodeK
	 */
	public boolean isNodeK() {
		return nodeK;
	}
	/**
	 * @param nodeK the nodeK to set
	 */
	public void setNodeK(boolean nodeK) {
		this.nodeK = nodeK;
	}
	/**
	 * @return the nodeL
	 */
	public boolean isNodeL() {
		return nodeL;
	}
	/**
	 * @param nodeL the nodeL to set
	 */
	public void setNodeL(boolean nodeL) {
		this.nodeL = nodeL;
	}
	private boolean nodeA;
	private boolean nodeB;
	private boolean nodeC;
	private boolean nodeD;
	private boolean nodeE;
	private boolean nodeF;
	private boolean nodeG;
	private boolean nodeH;
	private boolean nodeI;
	private boolean nodeJ;
	private boolean nodeK;
	private boolean nodeL;
}