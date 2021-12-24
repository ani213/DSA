class Node{
    constructor(data,next=null){
        this.data=data;
        this.next=next;
    }
}
class LinkList{
    constructor(){
        this.head=null;
        this.size=0;
    }
    insertFirst(data){
        this.head=new Node(data,this.head);
    }
   insertLast(data){
    this.head=new Node(data);
    let current;
       if(!this.head){
           this.size++;
       }else{
           let current=this.head
           while(current.next){
             current=current.next;
           }
           this.head=new Node(data,this.head);
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
li.insertFirst(200)
li.insertFirst(400)
li.insertLast(9999)
li.printList()