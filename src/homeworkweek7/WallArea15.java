package homeworkweek7;


public class WallArea15 {
        //Wall Area


        double width;
        double height;

        public WallArea15(){
        }

        public WallArea15( double width, double height){
            if(width > 0 && height < 0){
                this.width = width;
                this.height = 0;
            }else if(width < 0 && height > 0){
                this.width = 0.0;
                this.height = height;
            }else if(width < 0 && height < 0){
                this.width = 0.0;
                this.height = 0.0;
            }else{
                this.width = width;
                this.height = height;
            }
        }

        public void setWidth(double width){
            if(width < 0){
                this.width = 0;
            }else{
                this.width = width;
            }
        }

        public double getWidth(){
            return width;
        }

        public void setHeight(double height){
            if(height < 0){
                this.height = 0;
            }else{
                this.height = height;
            }
        }

        public double getHeight(){
            return height;
        }
        public double getArea(){
            return this.width * this.height;
        }

        public static void main(String[] args) {
            WallArea15 wall = new WallArea15 (5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }

    }
