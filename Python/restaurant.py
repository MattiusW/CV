class Restaurant:
    
    def __init__(self, restaurant_name, cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type
        self.number_served = 0
    
    def describe_restaurant(self):
        print(f"Name of restaurant: {self.restaurant_name}")
        print(f"Type of restaurant: {self.cuisine_type}")

    def open_restaurant(self):
        print("Restaurant is open at 12:00am - 20pm")

    def set_number_served(self):
        print(f"Number of visitors: {self.number_served}")

    def increment_number_served(self, served):
        self.number_served += served
        print(f"Increas number of visitors: {served}")

class IceCreamStand(Restaurant):
    
    def __init__(self, restaurant_name, cuisine_type, flavors):
        super().__init__(restaurant_name, cuisine_type)
        self.flavors = ('Orange, Stawberry, Bubble gum')

    def show_flavors(self):
        print(f"Flavors: {self.flavors}")

restaurant = Restaurant('Dagrasso','Pizzeria')
restaurant.describe_restaurant()
restaurant.open_restaurant()
restaurant2 = Restaurant('McDonald','FastFood')
restaurant2.describe_restaurant()
restaurant2.open_restaurant()
restaurant.set_number_served()
restaurant.increment_number_served(10)
restaurant.increment_number_served(20)
lodziarnia = IceCreamStand('Lodziarnia', 'Lody', 'Smaki')
lodziarnia.describe_restaurant()
lodziarnia.show_flavors()
restaurant.set_number_served()

