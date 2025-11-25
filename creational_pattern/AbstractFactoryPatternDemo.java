public class Main {

    // ----- Product Interfaces -----
    interface Paint {
        void usePaint();
    }

    interface Brush {
        void useBrush();
    }

    // ----- Concrete Products (Watercolor Family) -----
    static class WatercolorPaint implements Paint {
        public void usePaint() {
            System.out.println("Using Watercolor Paint 🎨");
        }
    }

    static class WatercolorBrush implements Brush {
        public void useBrush() {
            System.out.println("Using Watercolor Brush 🖌️");
        }
    }

    // ----- Concrete Products (Oil Painting Family) -----
    static class OilPaint implements Paint {
        public void usePaint() {
            System.out.println("Using Oil Paint 🌈");
        }
    }

    static class OilBrush implements Brush {
        public void useBrush() {
            System.out.println("Using Oil Brush 🖌️");
        }
    }

    // ----- Abstract Factory -----
    interface PaintingKitFactory {
        Paint createPaint();
        Brush createBrush();
    }

    // ----- Concrete Factories -----
    static class WatercolorKitFactory implements PaintingKitFactory {
        public Paint createPaint() {
            return new WatercolorPaint();
        }
        public Brush createBrush() {
            return new WatercolorBrush();
        }
    }

    static class OilPaintingKitFactory implements PaintingKitFactory {
        public Paint createPaint() {
            return new OilPaint();
        }
        public Brush createBrush() {
            return new OilBrush();
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        // Buying Watercolor Kit
        PaintingKitFactory watercolorKit = new WatercolorKitFactory();
        Paint wcPaint = watercolorKit.createPaint();
        Brush wcBrush = watercolorKit.createBrush();
        wcPaint.usePaint();
        wcBrush.useBrush();

        System.out.println();

        // Buying Oil Painting Kit
        PaintingKitFactory oilKit = new OilPaintingKitFactory();
        Paint oilPaint = oilKit.createPaint();
        Brush oilBrush = oilKit.createBrush();
        oilPaint.usePaint();
        oilBrush.useBrush();
    }
}
