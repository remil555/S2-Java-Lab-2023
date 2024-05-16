package cycle1;

public class CPU {
	int price, noc;
	String memory, manufacturer;

	CPU(int price) {
		this.price = price;
	}

	class Processor {
		int noc;
		String manufacturer;

		Processor(int noc, String manufacturer) {
			this.noc = noc;
			this.manufacturer = manufacturer;
		}

		public String toString() {
			return ("\nProcessor:-\nNo. of cores:" + noc + "\nManufacturer:" + manufacturer);
		}
	}

	static class RAM {
		String memory, manufacturer;

		RAM(String memory, String manufacturer) {
			this.memory = memory;
			this.manufacturer = manufacturer;
		}

		public String toString() {
			return ("\nRAM:-\nMemory:\t" + memory + "\nManufacturer:\t" + manufacturer);
		}
	}

	public String toString() {
		return ("CPU Information:-\nPrice:\t" + price);
	}

	public static void main(String[] args) {
		CPU cpu = new CPU(40000);
		CPU.Processor processor = cpu.new Processor(14, "Intel");
		CPU.RAM ram = new CPU.RAM("16 GB", "Crucial");

		System.out.println(cpu);
		System.out.println(processor);
		System.out.println(ram);
	}
}