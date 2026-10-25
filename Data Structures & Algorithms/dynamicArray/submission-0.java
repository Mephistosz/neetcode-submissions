class DynamicArray {
    int valuesInArray;
    int capacity;
    int[] arr;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.arr = new int[capacity];
            this.capacity = capacity;
        }
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(getSize() + 1 > getCapacity()){
            resize();
        }
        System.out.println(valuesInArray);
        System.out.println(getCapacity());

        arr[valuesInArray] = n;
        valuesInArray++;
    }

    public int popback() {
        valuesInArray--;
        return arr[valuesInArray];
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
