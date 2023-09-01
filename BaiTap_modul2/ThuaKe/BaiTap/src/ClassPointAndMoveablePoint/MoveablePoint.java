package ClassPointAndMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super.setXY(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] speed = {xSpeed, ySpeed};
        return speed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString()+" , speed = ("+getxSpeed()+" , "+getySpeed()+" )";
    }
    public float[] move(){
        float a = this.getX() + this.getxSpeed();
        float b = this.getY() + this.getySpeed();
//        this.setX(a);
//        this.setY(b);
        float[] newArr = {a, b};
        return newArr;

    }
}
