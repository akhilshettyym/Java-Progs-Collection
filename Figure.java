package Area;

abstract class Figure {
    double dim1, dim2;

    Figure(double a, double b)
    {
        dim1 = a;
        dim2 = b;
    }
    abstract double Area();
}
class Rectangle extends Figure
        {
            Rectangle(double a,double b)
            {
                super(a,b);
            }
            double Area()
            {
                return dim1*dim2;
            }
        }

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double Area() {
        return 0.5 * dim1 * dim2;
    }
}
        public static void main(String[] args)
        {
            Triangle t = new Triangle(10, 5);
            Rectangle r = new Rectangle(10, 5);
            double AreaTriangle = t.Area();
            double AreaRectangle = r.Area();
            System.out.println("Area of triangle=" + AreaTriangle);
            System.out.println("Area of rectangle=" + AreaRectangle);
    }
    }