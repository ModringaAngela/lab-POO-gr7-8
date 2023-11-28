package lab6;

public class Child extends Parent {

    int fieldChild;
    static final int NR_COMPUS = 4;

    public Child(int child, String parentFiled){
        //trebuie sa apelam constructorul super(parentFiled), pentru a crea un obiect Parent cu parametrul dat
        super(parentFiled);
        this.fieldChild = child;
    }

    public Child(int child, String parentFiled1, String parentFiled2){
        //trebuie sa apelam constructorul super(parentFiled), pentru a crea un obiect Parent cu parametrul dat
        super(parentFiled1, parentFiled2);
        this.fieldChild = child;
    }

    public Child(int child){
        //se apeleaza super() implicit => fieldParent va fi null
        //apelul facut implicit de Java nu are niciodata parametri
        this.fieldChild = child;
    }

    public Child(String parent){
        //nu setam fieldChild => fieldChild va fi 0
        super(parent);
    }

    public Child(){
        //nu setam fieldChild => fieldChild va fi 0
        //se apeleaza super() implicit => fieldParent va fi null
    }

    @Override
    public String toString() {
        return "Child{" +
                "fieldChild=" + fieldChild +
                ", fieldParent='" + fieldParent + '\'' +
                ", fieldParent2='" + fieldParent2 + '\'' +
                '}';
    }


}
