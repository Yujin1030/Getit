package recommend.model.vo;

import component.vo.COOLER;
import component.vo.CPU;
import component.vo.GCARD;
import component.vo.HDD;
import component.vo.MainBoard;
import component.vo.POWER;
import component.vo.RAM;
import component.vo.SKIN;
import component.vo.SSD;

public class Component {
	
	private COOLER cooler;
	private CPU cpu;
	private GCARD gcard;
	private MainBoard mainboard;
	private HDD hdd;
	private POWER power;
	private RAM ram;
	private SKIN skin;
	private SSD ssd;
	
	public Component() {}
	
	public COOLER getCooler() {
		return cooler;
	}
	public void setCooler(COOLER cooler) {
		this.cooler = cooler;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public GCARD getGcard() {
		return gcard;
	}
	public void setGcard(GCARD gcard) {
		this.gcard = gcard;
	}
	public MainBoard getMainboard() {
		return mainboard;
	}
	public void setMainboard(MainBoard mainboard) {
		this.mainboard = mainboard;
	}
	public HDD getHdd() {
		return hdd;
	}
	public void setHdd(HDD hdd) {
		this.hdd = hdd;
	}
	public POWER getPower() {
		return power;
	}
	public void setPower(POWER power) {
		this.power = power;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	public SKIN getSkin() {
		return skin;
	}
	public void setSkin(SKIN skin) {
		this.skin = skin;
	}
	public SSD getSsd() {
		return ssd;
	}
	public void setSsd(SSD ssd) {
		this.ssd = ssd;
	}
	
	
}
