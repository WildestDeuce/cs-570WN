package HomeworkAssignment3;

//package data_Structures;

//Prudhvi Nelaturi
//CWID: 20018695

public class IDLListTest {

    public static void main(String[] args) {

        // create an empty indexed double linked list, data type is Integer
        IDLList<Integer> idlList = new IDLList<Integer>();

        // add element 65 at the head, 65 becomes the first element
        idlList.add(65);
        System.out.println("The first element of the list is: " + idlList.toString() + "\n");

//        // add element 32 at the head,32 becomes the first element
        try {
            idlList.add(0, 32);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After add 32 at the head, the list becomes " + idlList.toString() + "\n");
//
//        // add element 19 at index 1
        try {
            idlList.add(1, 19);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After add 19 at index 1, the list becomes " + idlList.toString() + "\n");
//
//
//        // append element 12 at the end of the list
        idlList.append(12);
        System.out.println("After append, the list is : " + idlList.toString() + "\n");
//
//        // returns the object at position index 1 from the head
        System.out.println("Current list is: " + idlList.toString());
        System.out.println("Get element of position 1 in list : " + idlList.get(1) + "\n");
//
//        // return the object at the head
        System.out.println("Current list is: " + idlList.toString());
        System.out.println("Get head object in list: " + idlList.getHead() + "\n");
//
//        // return the object at the tail
        System.out.println("Current list is: " + idlList.toString());
        System.out.println("Get tail object in list: " + idlList.getLast() + "\n");
//
//        // return the list size
        System.out.println("The current list size is: " + idlList.size() + "\n");
//
//        // remove and return element at the head
        System.out.println("Now the list is: " + idlList.toString());
        System.out.println("The removed head element is: " + idlList.remove());
        System.out.println("After remove, the current list is: " + idlList.toString() + "\n");
//
//        // remove and return the element at the tail
        System.out.println("Now the list is: " + idlList.toString());
        System.out.println("The removed tail element is: " + idlList.removeLast());
        System.out.println("After remove, the current list is: " + idlList.toString() + "\n");

        //remove at index x and return the element
        System.out.println("Now the list is: " + idlList.toString());
        System.out.println("Remove element at postion 2 in the list: ");
        try {
            idlList.removeAt(1);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        System.out.println("After remove, the current list is: " + idlList.toString() + "\n");

//        // add two elements 35
        idlList.append(35);
        try {
            idlList.add(2, 35);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Now the list is: " + idlList.toString());

//        // remove the first occurrence of 35
        try {
            idlList.remove(35);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After removed the first occurrence of 35, now the list is: "
                + idlList.toString());

    }

}
