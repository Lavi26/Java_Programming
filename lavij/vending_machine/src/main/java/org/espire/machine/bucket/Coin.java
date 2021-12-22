package org.espire.machine.bucket;

import lombok.AllArgsConstructor;
import lombok.Data;



public enum Coin {
  
  NOCOINE(0), Coine(1),FIVERUPEE(5),TENRUPEE(10),TWENTYRUPEE(20),FIFTYRUPEE(50),HUNDREDRUPEE(100);

  Coin(int i) {
    this.coinValue= coinValue;
  }

  private int coinValue;
  
}
