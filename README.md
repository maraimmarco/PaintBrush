# PaintBrush
Paint is a simple raster graphics editor. It's built using Java Programming Language with OOP Principles. The program lets you draw lines and shapes such as Rectangle and Oval with different colors picked from a color palette. Also, you can draw with free-hand pencil and erase whatever you want with the Eraser. It has some extra features such as fill shapes, Undo, and Clear All options.
Abstraction:
The GeoShape abstract class serves as a blueprint, allowing specific geometric shapes to share common characteristics.

Encapsulation:
Private variables and methods within each shape class conceal internal details, promoting a modular and organized code structure.

Inheritance:
Concrete shape classes (e.g., Rectangle, Line, Oval, Pencil, Eraser) extend the GeoShape abstract class, inheriting shared properties and methods.

Polymorphism:
The drawShape method is overridden by each shape class, demonstrating polymorphism in providing a unique drawing implementation.
