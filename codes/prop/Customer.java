package prop;

class Customer {
    private int custNo;
    private String custName;
    private String custAddr;

    public void init() {
        custNo = 2;
        custName = "Ravi";
        custAddr = "Bnaglore,India";
    }

    public void display() {
        System.out.println("Customer Number: " + custNo);
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Address: " + custAddr);
    }

    // Getters and setters
    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }
}

