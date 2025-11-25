public class Main {

    // ----- Component Interface -----
    interface Gift {
        void wrap();
    }

    // ----- Concrete Component -----
    static class SimpleGift implements Gift {
        public void wrap() {
            System.out.println("Gift box 🎁");
        }
    }

    // ----- Base Decorator -----
    static abstract class GiftDecorator implements Gift {
        protected Gift gift;

        public GiftDecorator(Gift gift) {
            this.gift = gift;
        }

        public void wrap() {
            gift.wrap();
        }
    }

    // ----- Concrete Decorators -----
    static class RedWrapper extends GiftDecorator {
        public RedWrapper(Gift gift) {
            super(gift);
        }

        public void wrap() {
            super.wrap();
            System.out.println(" + Wrapped with Red Paper ❤️");
        }
    }

    static class ShinyWrapper extends GiftDecorator {
        public ShinyWrapper(Gift gift) {
            super(gift);
        }

        public void wrap() {
            super.wrap();
            System.out.println(" + Wrapped with Shiny Paper ✨");
        }
    }

    static class GlitterWrapper extends GiftDecorator {
        public GlitterWrapper(Gift gift) {
            super(gift);
        }

        public void wrap() {
            super.wrap();
            System.out.println(" + Wrapped with Glitter Paper ✨✨");
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        Gift gift = new SimpleGift();

        // Wrap with multiple layers
        gift = new RedWrapper(gift);
        gift = new ShinyWrapper(gift);
        gift = new GlitterWrapper(gift);

        gift.wrap();  // final decorated gift
    }
}
