class Math:
    # class variable - shared
    PI = 3.141592

    def add(self, a, b):
        return a + b

    def mul(self, a, b):
        return a * b

    def circle_area(self, r):
        return Math.PI * r * r

if __name__ == "__main__":
    math = Math()
    print(math.add(2, 3))
    print(math.mul(2, 3))
    print(math.circle_area(5))
