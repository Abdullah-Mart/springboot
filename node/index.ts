class product {
  constructor(
    public id: number,
    public name: string,
    public price: number,
    public description: string
  ) {}
}

class shoppingCart {
  public products: product[] = [];

  addProduct(product: product) {
    this.products.push(product);
  }

  removeProduct(productId: number) {
    this.products = this.products.filter((product) => product.id !== productId);
  }

  calculateTotal() {
    return this.products.reduce((total, product) => total + product.price, 0);
  }
}
const cart = new shoppingCart();
const product1 = new product(1, "Laptop", 1000, "A high-end laptop");
const product2 = new product(2, "Phone", 500, "A latest model phone");
const product3 = new product(3, "Tablet", 300, "A lightweight tablet");
cart.addProduct(product1);
cart.addProduct(product2);
cart.addProduct(product3);  
cart.removeProduct(2);
console.log("|=====================Welcome to our store===========================|")
console.log("|Total Price: $|" + cart.calculateTotal(),); // Total Price: $1300);
console.log("|Products in cart|: ", cart.products); // Products in cart: [product1, product3]
console.log("====================Thank you for choosing us========================|")

