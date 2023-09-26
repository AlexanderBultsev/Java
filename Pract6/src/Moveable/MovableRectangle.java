package Moveable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Moveable.MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public boolean equalsSpeed (MovablePoint first, MovablePoint second) {
        return first.xSpeed == second.xSpeed && first.ySpeed == second.ySpeed;
    }

    @Override
    public void moveUp() {
        if (equalsSpeed(topLeft, bottomRight)) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else {
            System.out.println("Ошибка! Разная сторость точек");
        }
    }

    @Override
    public void moveDown() {
        if (equalsSpeed(topLeft, bottomRight)) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else {
            System.out.println("Ошибка! Разная сторость точек");
        }
    }

    @Override
    public void moveLeft() {
        if (equalsSpeed(topLeft, bottomRight)) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else {
            System.out.println("Ошибка! Разная сторость точек");
        }
    }

    @Override
    public void moveRight() {
        if (equalsSpeed(topLeft, bottomRight)) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else {
            System.out.println("Ошибка! Разная сторость точек");
        }
    }
}
