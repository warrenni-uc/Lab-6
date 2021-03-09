class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;
 
  Tree() {
  treeName = "";
  treeType = "";
  leavesFall = false;
  leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
  treeName = aTreeName;
  treeType = aTreeType;
  leavesFall = aLeavesFall;
  leafColor = aLeafColor;
  }

String getName() {
  return treeName;
}
String getType() {
  return treeType;
}

boolean getLeavesFall() {
  return leavesFall;
}

String getColor() {
  return leafColor;
}

void setName(String theTreeName) {
  treeName = theTreeName;
}

void setType(String theTreeType) {
  treeType = theTreeType;
}

void setLeavesFall(boolean theLeavesFall) {
  leavesFall = theLeavesFall;
}

void setColor(String theLeafColor) {
  leafColor = theLeafColor;
}

// CONDITION ? IF TRUE : IF FALSE , ternery operator
void print() {
  System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and it's leaves are currently " + leafColor + ". It " + (leavesFall ? "does" : "does not") + " lose its leaves for the winter.");
  }
}
