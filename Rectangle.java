/*Написати клас Rectangle , в якому буде описано поля : довжина, ширина.
 Описати дані поля в конструкторі. Створити конструктор з параметрами і без параметрів.
 Написати методи, які будуть розраховувати площу та периметр.
 В Main класі продемонструвати створення об’єктів використовуючи два конструктори.
 Вивести на консоль площу і периметр прямокутника. Вивід на консолі повинен мати наступний вигляд:
 «Площа прямокутника = тут буде площа », «Периметр прямокутника = тут буде периметр».
 */


package com.rectangle;

public class Rectangle {

        public int length;
        public int width;

        public Rectangle(int length, int width ) {
            this.length = length;
            this.width = width;
        }



        public int square() {
            return this.width * this.length;

        }
        public int perimeter(){

            return  (this.width + this.length)*2;

        }

}
