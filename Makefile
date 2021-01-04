SRC_DIR := src/
BIN_DIR := bin/


#packages src
MODEL_DIR := $(SRC_DIR)model/
CONTROLLER_DIR := $(SRC_DIR)controller/
VIEW_DIR := $(SRC_DIR)view/

#packages bin
MODEL_DIR_BIN := $(BIN_DIR)model/
CONTROLLER_DIR_BIN := $(BIN_DIR)controller/
VIEW_DIR_BIN := $(BIN_DIR)view/

FLAGS := -d $(BIN_DIR) -sourcepath $(SRC_DIR) -classpath $(BIN_DIR)
JC := javac
JEXE := java -classpath "$(BIN_DIR)"
JDOC := javadoc
RM := rm -rf 
MKDIR := mkdir

all: $(BIN_DIR) $(BIN_DIR)Main.class

$(BIN_DIR):
	$(MKDIR) $(BIN_DIR)


#application
$(BIN_DIR)Main.class: $(SRC_DIR)Main.java $(BIN_DIR)app/App.class $(DATA_DIR)
	$(JC) $(FLAGS) $(SRC_DIR)Main.java

$(BIN_DIR)app/App.class: $(SRC_DIR)app/App.java $(CONTROLLER_DIR_BIN)DispenserController.class
	$(JC) $(FLAGS) $(SRC_DIR)app/App.java

#models

$(MODEL_DIR_BIN)Drink.class: $(MODEL_DIR)Drink.java
	$(JC) $(FLAGS) $(MODEL_DIR)Drink.java

$(MODEL_DIR_BIN)Dispenser.class: $(MODEL_DIR)Dispenser.java $(MODEL_DIR_BIN)Drink.class
	$(JC) $(FLAGS) $(MODEL_DIR)Dispenser.java


#controllers

$(CONTROLLER_DIR_BIN)DispenserController.class: $(CONTROLLER_DIR)DispenserController.java $(VIEW_DIR_BIN)ClientInterface.class
	$(JC) $(FLAGS) $(CONTROLLER_DIR)DispenserController.java

#ui (views)

$(VIEW_DIR_BIN)ClientInterface.class: $(VIEW_DIR)ClientInterface.java  $(MODEL_DIR_BIN)Dispenser.class 
	$(JC) $(FLAGS) $(VIEW_DIR)ClientInterface.java

#launch program
run:
	$(JEXE) Main

#clean bin dir
clean:
	$(RM) $(BIN_DIR)*
