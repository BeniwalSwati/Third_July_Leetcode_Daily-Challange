/**
 * 
 * We have two special characters:

The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.
 * 
 */

 // 1st way
 class Solution {
  public boolean isOneBitCharacter(int[] bits) {
      int i = 0;
      
      while(i < bits.length -1){
         i = (bits[i] == 1) ? i+2 : i+1;
      }
      return i == bits.length -1;
  }
}

//2nd way
class Solution {
  public boolean isOneBitCharacter(int[] bits) {
    int idx = 0;
    while (idx < bits.length - 1) {
      if (bits[idx] != 0) {
        idx++;
      }
      idx++;
    }
    return idx == bits.length - 1;
  } 
}