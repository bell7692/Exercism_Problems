class Triangle {

    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
            if (side1 == side2 && side2 == side3 && side3 == side1) {
                return true;
            }
        }
        return false;
    }

    boolean isIsosceles() {
        while(sideIsNotZero()) {
            if (side1 == side2 || side2 == side3 || side3 == side1) {
                return true;
            }
        }
        return false;
    }

    boolean isScalene() {
        while (sideIsNotZero()) {
            if (side1 != side2 && side2 != side3 && side3 != side1) {
                return true;
            }
        }
        return false;
    }

    boolean sideIsNotZero(){

        if(side1 != 0 && side2 != 0 && side3 != 0){
            return true;
        }
        return false;
    }

}
