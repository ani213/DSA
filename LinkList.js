// Created a Node object 
class Node{
    constructor(data,next=null){
        this.data=data;
        this.next=next;
    }
}
// Created Linklist object
class LinkList{
    constructor(){
        this.head=null;
        this.size=0;
    }
    /*Insert data at First and in head there will be 
    head:Node {data:data,next: Node {data:data,next: Node{data:next}}}*/
    insertFirst(data){
        this.head=new Node(data,this.head);
    }
    /* insert at last in head there will be
     head:Node {data:data,next:Node{data:data,next:{data:data,next:null}}}*/
   insertLast(data){
       if(!this.head){
           this.head=new Node(data)
           this.size++;
       }else{
           let current=this.head
           while(current.next){
             current=current.next;
           }
           current.next=new Node(data)
           this.size++;
       }
   }
    printList(){
        let current=this.head;
        while(current){
            console.log(current.data)
            current=current.next;
        }
    }
}
const li= new LinkList();
li.insertFirst(12);
li.insertFirst(100);
li.insertFirst(200);
li.insertFirst(400);
li.insertLast(100)
li.insertLast(200);
li.insertLast(300)
li.printList()