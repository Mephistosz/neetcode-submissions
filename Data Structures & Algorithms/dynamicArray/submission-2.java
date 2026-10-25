class DynamicArray {
    int valuesInArray;
    int[] arr;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.arr = new int[capacity];
        }
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        
        if (getSize() + 1 > getCapacity()) {
            resize();
        }

        arr[valuesInArray] = n;
        valuesInArray++;
    }

    public int popback() {
        return arr[--valuesInArray];
    }

    public void resize() {
        var tmpArr = arr.length * 2;
        var tmp = new int[tmpArr];

        for (int i = 0; i < getSize(); i++) {
            tmp[i] = arr[i];
        }

        this.arr = tmp;
    }

    public int getSize() {
        return this.valuesInArray;
    }

    public int getCapacity() {
        return arr.length;
    }

}
