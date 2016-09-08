@groovy.transform.ToString()
class Developer {
    String first;
    String last;
    def languages = [];
    
    void work(){
       println "$first $last $languages";
    }
}