class Solution {
    int[][] dirs = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    public void cleanRoom(Robot robot) {
        Set<String> set = new HashSet<>();
        Point curr = new Point(0,0);
        set.add(curr.toString());
        moveAndClean(curr, robot, set, 0);
    }
    
    private void moveAndClean(Point p, Robot robot,Set<String> set, int dir) {
        
        robot.clean();
        robot.turnLeft();
        for (int i = 0; i<4;i++) {
            Point nextPoint = new Point(p.x+this.dirs[(i+dir+3)%4][0], p.y+this.dirs[(i+dir+3)%4][1]);
            if (!set.contains(nextPoint.toString())) {
                set.add(nextPoint.toString());
                boolean canGo = robot.move();
                if (canGo)  {
                    moveAndClean(nextPoint, robot, set, (i+dir+3)%4);
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            } else {
                robot.turnRight();
            }
        }
        robot.turnLeft();
        robot.move();
        
    }
    
    class Point {
        public int x, y;
        public Point ( int x, int y) {
            this.x = x; this.y = y;
        }
        public String toString() {
            return this.x+ " " + this.y;
        }
    }