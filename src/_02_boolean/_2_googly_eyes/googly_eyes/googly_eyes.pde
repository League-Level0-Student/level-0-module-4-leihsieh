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
  circle(110,237,20);
  circle(210,237,20);
}
