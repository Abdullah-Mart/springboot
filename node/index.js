var product = /** @class */ (function () {
    function product(id, name, price, description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    return product;
}());
var shoppingCart = /** @class */ (function () {
    function shoppingCart() {
        this.products = [];
    }
    shoppingCart.prototype.addProduct = function (product) {
        this.products.push(product);
    };
    shoppingCart.prototype.removeProduct = function (productId) {
        this.products = this.products.filter(function (product) { return product.id !== productId; });
    };
    shoppingCart.prototype.calculateTotal = function () {
        return this.products.reduce(function (total, product) { return total + product.price; }, 0);
    };
    return shoppingCart;
}());
var cart = new shoppingCart();
var product1 = new product(1, "Laptop", 1000, "A high-end laptop");
var product2 = new product(2, "Phone", 500, "A latest model phone");
var product3 = new product(3, "Tablet", 300, "A lightweight tablet");
cart.addProduct(product1);
cart.addProduct(product2);
cart.addProduct(product3);
cart.removeProduct(2);
console.log("|=====================Welcome to our store===========================|");
console.log("|Total Price: $|" + cart.calculateTotal()); // Total Price: $1300);
console.log("|Products in cart|: ", cart.products); // Products in cart: [product1, product3]
console.log("====================Thank you for choosing us========================|");
