package org.espire.machine.bucket;

import java.util.List;

public class PaymentCalculation {

  public List<Coin> convertToCoin(List<Coin> returnCoinsArray, int changedValue) {
    
    int reminder = 0;
    
    if (changedValue >= Coin.HUNDREDRUPEE.) {
      reminder = changedValue / Coin.HUNDREDRUPEE.;
      if (reminder > 0) {
        for (int i = 0; i <= reminder - 1; i++) {
          returnCoinsArray.add(Coin.HUNDREDRUPEE);
        }
      }
      
      int test = changedValue - (reminder * Coin.HUNDREDRUPEE.);
      if (test != 0) {
        convertToCoin(returnCoinsArray, test);
      }

    } 


}
