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

        arr[valuesInArray++] = n;
    }

    public int popback() {
        return arr[--valuesInArray];
    }

    public void resize() {
        var arrTmp = new int[arr.length * 2];

        for (int i = 0; i < getSize(); i++) {
            arrTmp[i] = arr[i];
        }

        this.arr = arrTmp;
    }

    public int getSize() {
        return this.valuesInArray;
    }

    public int getCapacity() {
        return arr.length;
    }

}
