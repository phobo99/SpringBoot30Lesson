<template>
  <!-- <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
  </div> -->

  <div class="container">
    <div class="row justify-content-between">
      <h1>{{ brand }}</h1>
      <a href="#" class="btn btn-info btn-lg">
        <span class="fa fa-shopping-cart"></span> {{ count }}
      </a>
    </div>
    <div class="row mt-5">
      <div class="col-lg-12 card-margin">
        <div class="card search-form">
          <div class="card-body p-0">
            <form id="search-form">
              <div class="row">
                <div class="col-12">
                  <div class="row no-gutters">
                    <div class="col-lg-3 col-md-3 col-sm-12 p-0 ">
                      <select
                        class="form-control"
                        id="exampleFormControlSelect1" 
                      >
                        <option hidden>Sort by...</option>
                        <option>Feature</option>
                        <option>Price: High to Low</option>
                        <option>Price: Low to High</option>
                        <option>A - Z</option>
                        <option>Z - A</option>
                      </select>
                    </div>
                    <div class="col-lg-8 col-md-6 col-sm-12 p-0">
                      <input
                        type="text"
                        placeholder="Search..."
                        class="form-control"
                        id="search"
                        name="search"
                      />
                    </div>
                    <div class="col-lg-1 col-md-3 col-sm-12 p-0">
                      <button type="submit" class="btn btn-base">
                        <svg
                          xmlns="http://www.w3.org/2000/svg"
                          width="24"
                          height="24"
                          viewBox="0 0 24 24"
                          fill="none"
                          stroke="currentColor"
                          stroke-width="2"
                          stroke-linecap="round"
                          stroke-linejoin="round"
                          class="feather feather-search"
                        >
                          <circle cx="11" cy="11" r="8"></circle>
                          <line x1="21" y1="21" x2="16.65" y2="16.65"></line>
                        </svg>
                      </button>
                    </div>
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>

    <div class="d-flex justify-content-center mt-20 mb-50">
      <div class="row">
        <div
          class="col-md-4 mt-3 mb-2"
          v-for="product in products"
          :key="product.id"
        >
          <div class="card">
            <div class="card-body">
              <div class="card-img-actions">
                <img
                  :src="product.image"
                  class="card-img img-fluid"
                  width="96px"
                  height="350px"
                  alt=""
                />
              </div>
            </div>
            <div class="card-body bg-light text-center">
              <div class="mb-2">
                <h6 class="font-weight-semibold mb-2">
                  {{ product.name }}
                </h6>
              </div>
              <h3 class="mb-0 font-weight-semibold">
                Price: ${{ product.price }}
              </h3>
              <button type="button" class="btn bg-cart" @click="count += 1">
                Add to cart
              </button>
            </div>
          </div>
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
      count: 0,
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
        {
          id: 4,
          image: require("@/assets/iphone-x.jpg"),
          name: "Iphone XSMax 256GB",
          price: 700,
        },
        {
          id: 5,
          image: require("@/assets/iphone-11.jpg"),
          name: "Iphone 11 Pro Max 256GB",
          price: 1200,
        },
        {
          id: 6,
          image: require("@/assets/iphone-12.jpg"),
          name: "Iphone 12 Pro Max 256GB",
          price: 1900,
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
}
h1 {
  color: #fff;
}
.bg-cart {
  margin-top: 30px;
  background-color: orange;
  color: #fff;
}

.bg-cart:hover {
  color: #fff;
  opacity: .8;
}

.bg-buy {
  background-color: green;
  color: #fff;
  padding-right: 29px;
}

.bg-buy:hover {
  opacity: .8;
  color: #fff;
}
.mt-50 {
  margin-top: 100px;
}
</style>
