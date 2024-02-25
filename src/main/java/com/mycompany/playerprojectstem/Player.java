/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playerprojectstem;

/**
 *
 * @author anth1
 */
public class Player {
    // private static int numCount = 0;
 
 
 private static int numPlayers = 0;
 
 private int xPos;
 
 private int yPos;
 
 private int zPos;
 
 
 
 private int directionCurrent; //North, 1; South, 2; Up, 3; Down, 4; East, 5; West, 6.
 
 private int hp;
 
 
 private String playerName;
 
 public Player(String name, int x, int y, int z, int health, int direction) {
   playerName = name;
   
   xPos = x;
   yPos = y;
   zPos = z;
   
   if (health < 0) {
     hp = 0;
     
   }
   else {
     hp = health;
     
   }
   
   if (direction < 0 || direction > 6) {
      directionCurrent = 1;
   }
   else {
     directionCurrent = direction; 
   }
   
   
   numPlayers ++;
   
   
 }
 public Player() {
   this("P" + numPlayers,0,0,0,20,1);
   
   
   
 }
 public Player(String name, int x, int y , int z) {
   this("P" + numPlayers,x,y,z,20,1);
   
  
   
   
 }
 
 
 public static int getNumPlayers() {
   return numPlayers;
 }
 
 public  String getName() {
   return playerName;
 }
 
 public  int getX(){
   return xPos;
 }
 
 
 
 public  int getY() {
   return yPos;
 }
 
 public  int getZ() {
   return zPos;
 }
 
 
 
 
 
 public int getHp() {
   return hp;
 }
 
 public  int getDirection() {
   return directionCurrent;
 }
 
 public String toString() {
   return "Name: " + playerName + "\nHealth: " + hp + "\nCoordinates: X " + xPos + " Y " + yPos + " Z " + zPos +"\nDirection: " + directionCurrent; 
   
 }
 
 public void setHp(int health) {
   if (health < 0) {
     hp = 0;
   }
   else {
     hp = health;
   }
   
 }
 
 public void setDirection(int direction) {
   if (direction >= 1&& direction <= 6) {
      directionCurrent = direction;
   }
   
 }
 
 
 
 
 
 
 
  public void move(int direction, int units) {
   if (direction == 1) {
     xPos +=   Math.abs(units);
   }
   else if (direction == 2) {
     xPos -=  Math.abs(units);
     
     
   }
   else if (direction == 3) {
     
     yPos +=  Math.abs(units);
   }
   
   else if (direction ==4) {
     
     yPos -=  Math.abs(units);
   }
   
   else if (direction == 5) {
     zPos +=  Math.abs(units);
     
     
   }
   else if (direction == 6) {
     zPos -=  Math.abs(units);
     
   }
   else {
     
   }
 
 
 
 
 
 }
 
 public void attack(Player player, int damage) {
   player.setHp(player.getHp() - damage);
   if (player.getHp() < 0 ) {
     player.setHp(0);
   }
   
   
 }
 
 public void teleport(int x, int y, int z) {
   xPos = x;
   yPos = y; 
   zPos = z;
   
 }
 
  public void teleport(Player player) {
   xPos = player.getX();
   yPos = player.getY(); 
   zPos = player.getZ();
   
 }
 
 
 
 
 public double getDistance(int x, int y, int z) {
   
   double distanceCord = Math.sqrt( Math.pow( (x - xPos), 2 )   +    Math.pow( (y - yPos), 2 )      +  Math.pow( (z - yPos), 2 )   )         ;
   
   return distanceCord;
   
   
   
 }
 
 
 public double getDistance(Player player) {
   
   double distanceUser = Math.sqrt(Math.pow( (player.getX() - xPos)  ,2 )  +   Math.pow( (player.getY() -  yPos)  ,2 )     + Math.pow( (player.getZ() - zPos ) ,2)                   ) ;
   
   
   
   return distanceUser;
   
   
 }
 
 
 
 
 
 
}
