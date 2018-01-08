/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
/*
 * Pannawat1020
 * Tatpiya1005
 */
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Scanner;

public class HashTable {
    
    private final static int TABLE_SIZE = 10000; // number of indexes in hash table
    
    HashEntry[] table; // initialise array of HashEntry (table)
    /*public int count=0;
    public String [] countfind = new String [TABLE_SIZE];*/
    // constructor, create array, assign all values to null
    HashTable() {
        // create array of HashEntry, predefined size
        table = new HashEntry[TABLE_SIZE];
        // assign all values to null
        
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }

    // from key, find the correct index, load the HashEntry object and return the value
    public String getValue(String key) {
        int index = this.getKeyIndex(key);
        if(table[index]==null)
        	return  key +" does not exist";
        else{
        while(table[index].equals(key)==true){
        	        index++;
       }
        HashEntry chosen_entry = table[index];
        String chosen_entry_value = chosen_entry.getValue(key);
        return chosen_entry_value;
        }
    }

    // creates a new HashEntry object, inserts that into the table array at the correct index
    // determined by getKeyIndex(key)
    public void insert(String key, String value) {
    	value.toLowerCase();
        
        int index = this.getKeyIndex(key);
        while(table[index]!=null){
        index++;
        }
        HashEntry keyValuePair;
        keyValuePair = new HashEntry(key, value);
        table[index] = keyValuePair;
        /* countfind[count]=key;
        count++;*/
    }
    // ** PRIVATE FUNCTIONS ** //
    // get index from key
    private Integer getKeyIndex(String key) {
    
        key=key.toLowerCase();
        int hash = 7;
        
        for (int i = 0; i < key.length(); i++) {
            hash = (hash*31 + key.charAt(i))%5000;
        }
        return hash;
    }
    public boolean checkKey(String key){
    
        key=key.toLowerCase();
    	int index = this.getKeyIndex(key);
    	return table[index]==null;
        
    }
    public void getEdit(String key,String value){
    	value.toLowerCase();
       
    	if(checkKey(key)==true)
    		 System.out.println("your key '"+key+"' does not exist");
    	else{
    		int index = this.getKeyIndex(key);
    		  HashEntry keyValuePair;
    		  keyValuePair = new HashEntry(key, value);
    		  table[index] = keyValuePair;
    		  System.out.println("Edit ok");
    	}
    }
    public void deleteKey(String key){
    	 int index = this.getKeyIndex(key);
    	 HashEntry keyValuePair;
    	 keyValuePair = new HashEntry(null, key +" Does not exist");
    	 table[index] = keyValuePair;
    	 System.out.println("this key "+key+" have Delete");
    }
     public void displaymenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("************ Menu ************");
        System.out.println("::  1. Load word dictionary ::");
        System.out.println("******************************");
        System.out.print("Choose the choice :: ");

       
        int ch = sc.nextInt();
        switch(ch){
                    //a
            case 1  :insert("about","เกี่ยวกับ"); 
                    insert("across","ข้าม");
                    insert("add","เพิ่ม");
                    insert("again","อีกที");
                    //b
                    insert("banana","กล้วย"); 
                    insert("basic","พื้นฐาน");
                    insert("beauty","ความสวยงาม");
                    insert("build","สร้าง");
                    //c
                    insert("captain","กัปตัน");
                    insert("century","ศตวรรษ");
                    insert("change","เปลี่ยน");
                    insert("complete","สมบูรณ์");
                    //d
                    insert("danger","อันตราย");
                    insert("dead","ตาย");
                    insert("die","ตาย");
                    insert("difference","ความแตกต่าง");
                    //e
                    insert("earth","โลก");
                    insert("education","การศึกษา");
                    insert("expensive","แพง");
                    insert("experience","ประสบการณ์");
                    //f
                    insert("family","ครอบครัว");
                    insert("feel","รู้สึก");
                    insert("first","แรก");
                    insert("follow","ติดตาม");
                    //g
                    insert("give","ให้"); 
                    insert("group","กลุ่ม");
                    insert("guide","แนะแนว");
                    insert("gun","ปืน");
                    //h
                    insert("handsome","หล่อ");
                    insert("healthy","มีสุขภาพดี");
                    insert("heart","หัวใจ");
                    insert("hospital","พยาบาล");
                    //i
                    insert("ice","น้ำแข็ง");
                    insert("imagine","จินตนาการ");
                    insert("inch","นิ้ว (หน่วยวัด)");
                    insert("island","เกาะ");
                    //j
                    insert("join","เข้าร่วม");
                    insert("Journey","การเดินทาง");
                    insert("Jump","กระโดด");
                    insert("just","เพิ่งจะ, เพียงแค่");
                    //k
                    insert("keep","เก็บ, รักษาไว้");
                    insert("kill","ฆ่า");//k
                    insert("kind","ชนิด, จำพวก");
                    insert("king","กษัตริย์, ราชา");
                    //l
                    insert("language","ภาษา");
                    insert("last","สุดท้าย");
                    insert("learn","เรียนรู้");
                    insert("lost","สูญหาย, พ่ายแพ้");
                    //m
                    insert("machine","เครื่องจักร");
                    insert("Meeting","การประชุม");
                    insert("moment","ขณะนั้น, ชั่วครู่");
                    insert("music","ดนตรี");
                    //n
                    insert("nation","ชาติ");
                    insert("nature","ธรรมชาติ");
                    insert("notebook","สมุดบันทึก");
                    insert("nurse","พยาบาล");
                    //o
                    insert("object"," วัตถุ");
                    insert("only","เท่านั้น");
                    insert("opposite","ตรงกันข้าม");
                    insert("original","ต้นฉบับ");
                    //p
                    insert("pair","คู่");
                    insert("particular","โดยเฉพาะ");
                    insert("picture","รูปภาพ");
                    insert("possible","เป็นไปได้");
                    //q
                    insert("quiet","เงียบ, สงบ");
                    insert("quick","รวดเร็ว");
                    insert("quite","โดยแท้จริง");
                    insert("queen","ราชินี");
                    //r
                    insert("reason","เหตุผล");
                    insert("receive","ได้รับ");
                    insert("root","ราก");
                    insert("rope","เชือก");
                    //s   
                    insert("school","โรงเรียน"); 
                    insert("science","วิทยาศาสตร์");
                    insert("should","ควรจะ");
                    insert("sorry","เสียใจ");
                    //t
                    insert("teacher","ผู้สอน, ครู");
                    insert("though","แม้ว่า");
                    insert("through","ผ่าน");
                    insert("together","ด้วยกัน");
                    //u
                    insert("unclear","ไม่ชัดเจน");
                    insert("understand","เข้าใจ");
                    insert("unit","หน่วย");
                    insert("useless","ไม่มีประโยชน์");
                    //v
                    insert("valley","หุบเขา");
                    insert("victory","ชัยชนะ");
                    insert("voice","เสียง");
                    insert("volcano","ภูเขาไฟ");
                    //w
                    insert("walk","เดิน");
                    insert("want","ต้องการ");
                    insert("waterfall ","น้ำตก");
                    insert("weak","อ่อนแอ");
                    //x
                    insert("X-ray","รังสีเอ็กซ์");
                    insert("Xerox","ถ่ายเอกสาร");
                    insert("Xmas","คริสต์มาส");
                    insert("xyster","เครื่องมือผ่าตัด");
                    //y
                    insert("yard","สนาม, หลา");
                    insert("yesterday","เมื่อวานนี้");
                    insert("young","อ่อนวัย");
                    insert("yummy","อร่อย");
                    //z
                    insert("zero","ศูนย์");                    
                    insert("zip","ซิป, บีบ, อัด"); 
                    insert("zombie","ผีดิบ");
                    insert("zone","เขต, บริเวณ");
                    
                    
                    System.out.println("Load file complete");            
                    displaymenu1();
                    break;
                    
             
            default :if(ch != 1){
                System.out.println("Can't choice");
                displaymenu();
            }
           
       }
       }
    public void displaymenu1(){
        Scanner sc = new Scanner(System.in);
                    System.out.println("************* Menu ***************");
                    System.out.println("::          1. add word         ::");
                    System.out.println("::          2. Search word      ::");
                    System.out.println("::          3. Delete word      ::");
                    System.out.println("::          4. Edit word        ::");
                    System.out.println("::          5. close            ::");
                    System.out.println("**********************************");
                    System.out.print("Choose the choice :: ");
                    int ch1 = sc.nextInt();
                    switch(ch1){
                        case 1 :System.out.print("Input to add word :: ");
                                String word = sc.next();
                                System.out.print("Input to add mean :: ");
                                String mean = sc.next();
                                insert(word, mean);
                                displaymenu1();   
                                break;
                        case 2 :System.out.print("Input to word Search :: ");
                                String search = sc.next() ;
                                System.out.println("Search from key mean :: "+ getValue(search) );
                                displaymenu2(search); 
                                break;
                        case 3 :System.out.print("Input to  key word delelte :: ");
                                String dele = sc.next() ;
                                deleteKey(dele);
                                displaymenu2(dele);
                                break;
                        case 4 : 
                                System.out.print("Input to key word :: ");
                                String eword = sc.next() ;
                                System.out.print("Edit mean :: ");
                                    String eread = sc.next() ;
                                getEdit(eword,eread);
                                displaymenu1(); 
                                break;           
                        case 5 :System.out.print("Close Program");    
                        break;
                        default :if((ch1 < 1)||(ch1 >=6)){
                                 System.out.println("Can't choice");
                                 displaymenu1();
                                 }
                        }
    }
    
    public void displaymenu2(String key){
        Scanner sc = new Scanner(System.in);
            System.out.println("************ Menu Search ***************");
            System.out.println("::          1. Next word              ::");
            System.out.println("::          2. Previous word          ::");
            System.out.println("::          3. Menu add               ::");
            System.out.println("****************************************");
            System.out.print("input to choice :: ");
            int ch2 = sc.nextInt();
            switch(ch2)
            {
                case 1 :key = findlisd(key,0);
                        System.out.println("Next word is '"+key+"'");
                        displaymenu2(key);                      
                break;
                case 2 :key = findlisd(key,1);
                        System.out.println("Previous word is '"+key+"'");
                        displaymenu2(key);                       
                break;
                case 3 :displaymenu1(); 
                break;
                default :System.out.print("Can't choice");
            }
    }
    
      
    public String findlisd(String key,int list){
 
        key=key.toLowerCase();
        int index = getKeyIndex(key);
        if(list==+1){
            index++;
             while(table[index]==null){
        index++;
        }
        }
        
        else{ index--;
                 while(table[index]==null){
        index--;
        }
        }
            return  table[index].getKey();
    }
  
       


}
