package abstraction;

public abstract class Bank {
	public static final int[] VALID_PINS = {1001, 1234, 1212};
    protected int pin;

    // Abstract method to set PIN
    public abstract void setPin();

    // Abstract method to validate PIN
    public abstract boolean validatePin();
}

