PImage face;

void setup() {
  face = loadImage("face.png");
  size(322,400);
  face.resize(322,400);
}

void draw() {
  image(face,0,0);
  fill(255,255,255);
  circle(110,237,50);
  circle(210,237,50);
  
  fill(0,0,0);
  circle(mouseX,mouseY,20);
  mouseX = constrain(mouseX,95,125);
  mouseY = constrain(mouseY,222,252);
  
  //circle(210,237,20);
  circle(mouseX,mouseY,20);
  mouseX = constrain(mouseX,195,225);
  mouseY = constrain(mouseY,222,252);
}
