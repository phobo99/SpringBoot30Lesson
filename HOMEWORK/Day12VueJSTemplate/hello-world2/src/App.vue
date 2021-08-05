<template>
  <div class="container">
    <div class="card">
      <div class="row">
        <div class="col-md-8 cart">
          <div class="title">
            <div class="row">
              <div class="col">
                <h4>
                  <b>{{ brand }}</b>
                </h4>
              </div>
              <div class="col align-self-center text-right text-muted">
                3 items
              </div>
            </div>
          </div>
          <div
            class="row border-top border-bottom"
            v-for="product in products"
            :key="product.id"
          >
            <div class="row main align-items-center">
              <div class="col-2">
                <img class="img-fluid" :src="product.image" alt="" />
              </div>
              <div class="col">
                <div class="row text-muted">Name:</div>
                <div class="row">{{ product.name }}</div>
              </div>
              <div class="col">
                <a href="#">-</a><a href="#">1</a><a href="#">+</a>
              </div>
              <div class="col">
                ${{ product.price }}
                <span class="close"><a href="">&#10005;</a></span>
              </div>
            </div>
          </div>
          <div class="back-to-shop">
            <a href="#">&leftarrow;</a
            ><span class="text-muted">Back to shop</span>
          </div>
        </div>
        <div class="col-md-4 summary">
          <div>
            <h5><b>Summary</b></h5>
          </div>
          <hr />
          <div class="row">
            <div class="col" style="padding-left:0;">ITEMS 3</div>
            <div class="col text-right">$2000</div>
          </div>
          <form>
            <p>SHIPPING</p>
            <select>
              <option class="text-muted"
                >Standard-Delivery- ${{ delivery }}</option
              >
            </select>
            <p>GIVE CODE</p>
            <input id="code" placeholder="Enter your code" />
          </form>
          <div
            class="row"
            style="border-top: 1px solid rgba(0,0,0,.1); padding: 2vh 0;"
          >
            <div class="col">TOTAL PRICE</div>
            <div class="col text-right"> $2005 </div>
          </div>
          <button class="btn">CHECKOUT</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "App",
  data() {
    return {
      brand: "AppleStore",
      delivery: 5,
      count: 0,
      selected: 0,
      products: [
        {
          id: 1,
          image: require("@/assets/iphone-x.jpg"),
          name: "Iphone XSMax 64GB",
          price: 500,
        },
        {
          id: 2,
          image: require("@/assets/iphone-11.jpg"),
          name: "Iphone 11 Pro Max 64GB",
          price: 1000,
        },
        {
          id: 3,
          image: require("@/assets/iphone-12.jpg"),
          name: "Iphone 12 Pro Max 128GB",
          price: 1500,
        },
      ],
    };
  },
};
</script>
<style lang="css">
body {
  background: linear-gradient(to right, #c04848, #480048);
  min-height: 100vh;
  vertical-align: middle;
  display: flex;
  font-family: sans-serif;
  font-weight: bold;
}

.title {
  margin-bottom: 5vh;
}

.card {
  margin: auto;
  margin-top: 10%;
  max-width: 950px;
  width: 90%;
  box-shadow: 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  border-radius: 1rem;
  border: transparent;
}

@media (max-width: 767px) {
  .card {
    margin: 3vh auto;
  }
}

.cart {
  background-color: #fff;
  padding: 4vh 5vh;
  border-bottom-left-radius: 1rem;
  border-top-left-radius: 1rem;
}

@media (max-width: 767px) {
  .cart {
    padding: 4vh;
    border-bottom-left-radius: unset;
    border-top-right-radius: 1rem;
  }
}

.summary {
  background-color: #ddd;
  border-top-right-radius: 1rem;
  border-bottom-right-radius: 1rem;
  padding: 4vh;
  color: rgb(65, 65, 65);
}

@media (max-width: 767px) {
  .summary {
    border-top-right-radius: unset;
    border-bottom-left-radius: 1rem;
  }
}

.summary .col-2 {
  padding: 0;
}

.summary .col-10 {
  padding: 0;
}

.row {
  margin: 0;
}

.title b {
  font-size: 1.5rem;
}

.main {
  margin: 0;
  padding: 2vh 0;
  width: 100%;
}

.col-2,
.col {
  padding: 0 1vh;
}

a {
  padding: 0 1vh;
}

.close {
  margin-left: auto;
  font-size: 0.7rem;
}

img {
  width: 5rem;
}

.back-to-shop {
  margin-top: 4.5rem;
}

h5 {
  margin-top: 4vh;
}

hr {
  margin-top: 1.25rem;
}

form {
  padding: 2vh 0;
}

select {
  border: 1px solid rgba(0, 0, 0, 0.137);
  padding: 1.5vh 1vh;
  margin-bottom: 4vh;
  outline: none;
  width: 100%;
  background-color: rgb(247, 247, 247);
}

input {
  border: 1px solid rgba(0, 0, 0, 0.137);
  padding: 1vh;
  margin-bottom: 4vh;
  outline: none;
  width: 100%;
  background-color: rgb(247, 247, 247);
}

input:focus::-webkit-input-placeholder {
  color: transparent;
}

.btn {
  background-color: #000;
  border-color: #000;
  color: white;
  width: 100%;
  font-size: 0.7rem;
  margin-top: 4vh;
  padding: 1vh;
  border-radius: 0;
}

.btn:focus {
  box-shadow: none;
  outline: none;
  box-shadow: none;
  color: white;
  -webkit-box-shadow: none;
  -webkit-user-select: none;
  transition: none;
}

.btn:hover {
  color: white;
}

a {
  color: black;
}

a:hover {
  color: black;
  text-decoration: none;
}

#code {
  background-image: linear-gradient(
      to left,
      rgba(255, 255, 255, 0.253),
      rgba(255, 255, 255, 0.185)
    ),
    url("https://img.icons8.com/small/16/000000/long-arrow-right.png");
  background-repeat: no-repeat;
  background-position-x: 95%;
  background-position-y: center;
}
</style>
