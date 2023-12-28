package com.salesforce;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {
		this(7, 20, false); // 아래 3줄 대신 작성가능. 단, 무조건 맨 앞에 작성해야함.
//		this.channel = 7;
//		this.volume = 20;
//		this.power = false;
	}

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void power(boolean on) {
		this.power = on;
		if(on) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	public void channel(int channel) {
		if(channel < 1) {
			System.out.println("채널 번호가 1보다 작을 수 없습니다.");
		} else if(channel > 255) {
			System.out.println("채널 번호가 255보다 클 수 없습니다.");
		} else {
			System.out.println("채널 번호는 " + this.getChannel() + "번 입니다.");
		}
		
//		if(channel > 0 && channel < 256) {
//			this.channel = channel;
//		}
	}
	
	public void channel(boolean up) {
		if(up) {
			if(this.channel < 255) {
				this.channel++;				
			}
		} else {
			if(this.channel > 1) {
				this.channel--;				
			}
		}
		System.out.println("채널 번호는 " + this.getChannel() + "번 입니다.");
	}
	
	public void volume(int volume) {
		if(volume < 0) {
			System.out.println("볼륨이 0보다 작을 수 없습니다.");
		} else if(volume > 100) {
			System.out.println("볼륨이 100보다 클 수 없습니다.");
		} else {
			System.out.println("현재 볼륨 크기는 " + this.getVolume() + " 입니다.");
		}
		
//		if(volume >= 0 && volume <= 100) {
//			this.volume = volume;
//		}
	}
	
	public void volume(boolean up) {
		if(up) {
			if(this.volume < 100) {
				this.volume++;				
			}
		} else {
			if(this.volume > 0) {
				this.volume--;				
			}
		}
		System.out.println("현재 볼륨 크기는 " + this.getVolume() + " 입니다.");

	}
	
	public void status() {
//		System.out.println("TV 정보 (채널:" + this.getChannel() + ", 볼륨: " + this.getVolume() + ", 전원: " + this.isPower() + ")");
		System.out.println(this.toString());
	}

}
