package T1908a.lap6;

public class Cylineder extends Circle6 {
        private double heights ;
        public Cylineder(double height,double radius){
            super(radius);
            this.heights = height;
        }
        public double getHeight(){
            return this.heights;
        }
        public void setHeight(double height){
            this.heights = height;
        }
        @Override
        public double getArea(){
            return super.getArea() ;
        }
        public double getVolumne(){
            return super.getArea() * this.heights;
        }
        @Override
    public String toString(){
            return "Cylinder[ height ="+ heights +","+ super.toString()+",volumne ="+getVolumne()+"]";
        }

}
