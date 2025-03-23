# bartenderTheJavaMix  

## Overview  
This is a Java-based bartender simulation inspired by *Bartender: The Right Mix*. The game allows players to serve different drinks, experimenting with various combinations of beverages in different containers.  

## Inspiration  
This project is inspired by the online game *Bartender: The Right Mix*, where players mix drinks to impress or surprise customers. Many assets, such as drink images and the bartender logic, are influenced by this concept.  

## Features  
- Serve drinks like beer, soda, and mixed beverages  
- Different drink containers: cans, bottles, and glasses  
- Customer interaction (e.g., a `Student` class)  
- **Adapter Pattern (Desfăcătorul)**: Enables customers to drink from different types of containers uniformly  
- GUI support with images for a better visual experience  

## Design Patterns  
### **Adapter Pattern - "Desfăcătorul"**  
The project implements the **Adapter Pattern** in `AdaptorSticla.java`, acting as a *desfăcător* (bottle opener).  
- This allows a `Student` (customer) to drink from different types of drink containers (e.g., bottles, cans, glasses) without modifying their original implementations.  
- The adapter converts a **Sticla (Bottle)** into a **Bautura (Drink)**, so it can be consumed like a regular drink.  
- This approach follows the **SOLID** principles, promoting code reusability and flexibility.  

## Project Structure  
```
📂 src  
 ┣ 📂 barul  
 ┃ ┣ 📝 `AdaptorSticla.java` (Adapter for bottle-to-drink conversion)  
 ┃ ┣ 📝 `bartenderTheJavaMix.java` (Bartender logic)  
 ┃ ┣ 📝 `Bautura.java` (Base class for drinks)  
 ┃ ┣ 📝 `Doza.java` (Can implementation)  
 ┃ ┣ 📝 `Pahar.java` (Glass implementation)  
 ┃ ┣ 📝 `Sticla.java` (Bottle implementation)  
 ┣ 📂 clienti  
 ┃ ┣ 📝 `Student.java` (Customer class)  
 ┣ 📂 main  
 ┃ ┣ 📝 `Main.java` (Entry point)  
 ┣ 📂 ui  
 ┃ ┣ 🖼️ Image assets (`coke_can.png`, `beer_glass.png`, etc.)  
 ┃ ┣ 📝 `UI.java` (User Interface)  
 ┣ 📝 `module-info.java` (Module system)  
```

## Requirements  
- Java 11+  
- IDE like IntelliJ IDEA or Eclipse  

## Running the Project  
1. Clone the repository  
2. Open the project in an IDE  
3. Run `Main.java`  

## Future Improvements  
- Add more customer types  
- Improve the bartender AI  
- Enhance the UI with animations  

---

### ⚠ Disclaimer  
This project is for educational purposes and inspired by *Bartender: The Right Mix*. All assets used are for non-commercial purposes.  
