/*hybird inheritance :hierarchichical+multiple
inherit one time in hierarchical otherwise amguity issue will rise.
*/
#include<iostream>
#include<ctime>
using namespace std;
class A{
    protected:
    string name;
    int roll_no;
    public:
    void setvalue(){
        cout<<"enter student name:"<<endl;
        cin>>name;
        cout<<"enter roll no:"<<endl;
        cin>>roll_no;

    }
};
class B{
    protected:
    int maths,english,chem;
public:
    void getMarks(){
        cout<<"enter marks of maths:"<<endl;
        cin>>maths;
         cout<<"enter marks of english:"<<endl;
        cin>>english;
         cout<<"enter marks of chem:"<<endl;
        cin>>chem;
    }
};
class C:public A{
protected:
int sports_marks;
public:
void getSportsMarks(){
    cout<<"enter sports marks:"<<endl;
    cin>>sports_marks;
}
};
class D:public B,public C{
    protected:
    int total;
    float average;
    public:
    void getTime(){
        time_t now=time(0);
        //convert time to string
        string dt=ctime(&now);
        cout<<"date and time"<<dt<<endl;

    }
    void getTotal(){
        total=maths+english+chem+sports_marks;
        cout<<total<<endl;
    }
    void getAverage(){
        average=total/4;
        cout<<"average:"<<average<<endl;
    }
};
int main(){
D d;
// d.setvalue();
// d.getMarks();
// d.getSportsMarks();
// d.getTotal();
// d.getAverage();
d.getTime();


}