class IntegerSet 
{
    private boolean[] intSet;
    private static final int setSize = 100;
  
    public static void main(String[] args) 
    {
      IntegerSet zbior = new IntegerSet();
      IntegerSet A = new IntegerSet();
      IntegerSet B = new IntegerSet();
      IntegerSet C = new IntegerSet();
      System.out.println(zbior);
      zbior.add(80);
      zbior.add(101);
      zbior.add(7);
      zbior.remove(7);
      System.out.println(zbior);
      A.add(0);
      A.add(2);
      A.add(3);
      A.add(5);
      A.add(99);
      B.add(1);
      B.add(3);
      B.add(4);
      B.add(8);
      B.add(99);
      System.out.println("Zbior A: " + A);
      System.out.println("Zbior B: " + B);
      C = IntegerSet.interSection(A, B);
      System.out.println("A^B: " + C);
    }
  
    public boolean add(int el) 
    {
      if (el >= 0 && el < intSet.length) 
      {
        intSet[el] = true;
        return true;
      } 
      else
        return false;
    }
  
      public boolean remove(int el) 
      {
      if (el >= 0 && el < intSet.length) 
      {
        intSet[el] = false;
        return true;
      } 
      else
        return false;
    }
  
    public IntegerSet() 
    {
      intSet = new boolean[setSize];
    }
  
    public String toString() 
    {
      StringBuilder sb = new StringBuilder();
      sb.append("{");
      for (int i = 0; i < intSet.length; i++) {
        if (intSet[i] == true) {
          if (sb.length() == 1) {
            sb.append(i);
          } else {
            sb.append(", " + i);
          }
        }
      }
      sb.append("}");
      return sb.toString();
    }
    // C = A ^ B
    public static IntegerSet interSection(IntegerSet A, IntegerSet B)
    {
      IntegerSet C = new IntegerSet();
      for (int i = 0; i < setSize; i++)
      {
        if (A.belong(i) && B.belong(i))
          C.add(i);
      }
        return C;
    }
  
    public boolean belong(int el)
    {
      return intSet[el];
    }
  
  }