package recommend.model.vo;

import java.util.ArrayList;

import component.model.vo.COOLER;
import component.model.vo.CPU;
import component.model.vo.GCARD;
import component.model.vo.HDD;
import component.model.vo.MainBoard;
import component.model.vo.POWER;
import component.model.vo.RAM;
import component.model.vo.SKIN;
import component.model.vo.SSD;

public class ComponentList {
	
	private ArrayList<POWER> powerList;
	private ArrayList<COOLER> coolerList;
	private ArrayList<CPU> cpuList;
	private ArrayList<GCARD> gcardList;
	private ArrayList<HDD> hddList;
	private ArrayList<MainBoard> mainboardList;
	private ArrayList<RAM> ramList;
	private ArrayList<SKIN> skinList;
    private ArrayList<SSD> ssdList;
    
   public ComponentList() {} 
   

	public ArrayList<POWER> getPowerList() {
		return powerList;
	}
	public void setPowerList(ArrayList<POWER> powerList) {
		this.powerList = powerList;
	}
	public ArrayList<COOLER> getCoolerList() {
		return coolerList;
	}
	public void setCoolerList(ArrayList<COOLER> coolerList) {
		this.coolerList = coolerList;
	}
	public ArrayList<CPU> getCpuList() {
		return cpuList;
	}
	public void setCpuList(ArrayList<CPU> cpuList) {
		this.cpuList = cpuList;
	}
	public ArrayList<GCARD> getGcardList() {
		return gcardList;
	}
	public void setGcardList(ArrayList<GCARD> gcardList) {
		this.gcardList = gcardList;
	}
	public ArrayList<HDD> getHddList() {
		return hddList;
	}
	public void setHddList(ArrayList<HDD> hddList) {
		this.hddList = hddList;
	}
	public ArrayList<MainBoard> getMainboardList() {
		return mainboardList;
	}
	public void setMainboardList(ArrayList<MainBoard> mainboardList) {
		this.mainboardList = mainboardList;
	}
	public ArrayList<RAM> getRamList() {
		return ramList;
	}
	public void setRamList(ArrayList<RAM> ramList) {
		this.ramList = ramList;
	}
	public ArrayList<SKIN> getSkinList() {
		return skinList;
	}
	public void setSkinList(ArrayList<SKIN> skinList) {
		this.skinList = skinList;
	}
	public ArrayList<SSD> getSsdList() {
		return ssdList;
	}
	public void setSsdList(ArrayList<SSD> ssdList) {
		this.ssdList = ssdList;
	}
	
    
    
    
}
