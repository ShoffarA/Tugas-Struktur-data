/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular.linked.list;

/**
 *
 * @author Windows 10
 */
public class CircularLinkedList {
    static class Node{
        int data;
        Node next;
    }
    
    static Node addToEmpty(Node last, int data){
        if(last != null)
            return last;
        
        Node temp = new Node();
        temp.data = data;
        last = temp;
        last.next = last;
        
        return last;
    }
    static Node addBegin(Node last, int data){
        if(last == null)
            return addToEmpty(last, data);
        
        Node temp = new Node();
        
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        
        return last;
    }
    
    static Node addEnd(Node last, int data){
        if(last == null)
            return addToEmpty(last, data);
        
        Node temp = new Node();
        
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        last = temp;
        
        return last;
    }
    
    static Node addAfter(Node last, int data, int item){
        if(last == null)
            return null;
        
        Node temp, p;
        p = last.next;
        
        do{
            if(p.data == item){
                temp = new Node();
                temp.data = data;
                temp.next = p.next;
                p.next = temp;
                
                if(p == last)
                    last = temp;
                return last;
            }
            
            p = p.next;
        }
        while(p != last.next);
        
        System.out.println(item + "Not present in the list.");
        return last;
    }
    
    static void traverse(Node last){
        Node p;
       
        if (last == null){
            System.out.println("List Is Empty.");
            return;
        }
        
        p = last.next;
        
        do{
            System.out.print(p.data + "");
            p = p.next;
        }
        while (p != last.next);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node last = null;
        
        last = addToEmpty(last, 6);
        last = addBegin(last, 4);
        last = addBegin(last, 3);
        last = addEnd(last, 10);
        last = addEnd(last, 9);
        last = addEnd(last, 50);
        last = addAfter(last, 70, 9);
        
        traverse(last);
    }
}