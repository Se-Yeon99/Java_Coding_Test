class EmptyNum {
    public int EmptyNum(int[] numbers) {
        int sum = 0;

      for(int i = 0; i < numbers.length; i++){
          sum += numbers[i];
      }
        return 45 - sum;
    }
}
