public class Main {

    // ----- Abstract Class (Template Method) -----
    static abstract class CookieRecipe {

        // Template Method - final to prevent changes
        public final void bakeCookies() {
            preheatOven();
            addFlavoring();   // subclass custom behavior
            mixIngredients();
            bake();
            coolDown();
        }

        // Fixed steps
        private void preheatOven() {
            System.out.println("🔥 Preheating oven to 350°F...");
        }

        private void mixIngredients() {
            System.out.println("🥣 Mixing all ingredients together...");
        }

        private void bake() {
            System.out.println("🍪 Baking cookies for 12 minutes...");
        }

        private void coolDown() {
            System.out.println("❄️ Cooling cookies on rack...\n");
        }

        // Abstract Step (Subclass MUST implement)
        protected abstract void addFlavoring();
    }

    // ----- Concrete Subclasses -----

    static class ChocolateChipCookie extends CookieRecipe {
        protected void addFlavoring() {
            System.out.println("🍫 Adding chocolate chips...");
        }
    }

    static class OatmealRaisinCookie extends CookieRecipe {
        protected void addFlavoring() {
            System.out.println("🌾 Adding oatmeal and raisins...");
        }
    }

    static class PeanutButterCookie extends CookieRecipe {
        protected void addFlavoring() {
            System.out.println("🥜 Adding peanut butter chunks...");
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        CookieRecipe recipe;

        recipe = new ChocolateChipCookie();
        recipe.bakeCookies();

        recipe = new OatmealRaisinCookie();
        recipe.bakeCookies();

        recipe = new PeanutButterCookie();
        recipe.bakeCookies();
    }
}
