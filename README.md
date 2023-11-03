# JUnit-Java
Tugas WKPL Minggu 10 - JUnit Testing Java
Penjelasan Code Calculator.java

```java
import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }
}
```
Import double stream digunakan untuk memanipulasi sekumpulan data nilai double dalam bentuk stream. Stream ini dapat digunakan untuk berbagai tujuan, termasuk transformasi, agregasi, filter, dan operasi lainnya pada elemen-elemen double dalam stream.
Double Stream berguna untuk melakukan operasi data numerik atau angka dalam Stream seperti perhitungan statistik, pemrosesan data, atau transformasi data numerik.
Double... adalah varargs (variadic arguments)
kemudian mereturn nilai didalam parameter dan mengonversi nilai menjadi stream serta sum digunakan untuk menghitung jumlah angka dalam stream tersebut.

```java
class CalculatorTest{
  @Test
  @DisplayName("Add two numbers")
  void add() {
      assertEquals(4, Calculator.add(2, 2));
  }
  
  @Test
  @DisplayName("Multiply two numbers")
  void multiply() {
      assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
      () -> assertEquals(-4, Calculator.multiply(2, -2)),
      () -> assertEquals(4, Calculator.multiply(-2, -2)),
      () -> assertEquals(0, Calculator.multiply(1, 0)));
  }
}
```
assertEquals adalah method yang digunakan untuk mengecek apakah nilai yang dimasukkan atau di set sama
assertAll adalah method untuk mengecek semua nilai dan menampilkan pesan sukses atau gagal
jika gagal maka akan muncul 2 pesan, yaitu nilai yang sebenarnya dan nilai yang dimasukkan
