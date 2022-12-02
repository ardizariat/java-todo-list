public class AplikasiTodoList {
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    /*
    menampilkan data todo list
     */
    public static void showTodoList(){
        for(var i=0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null)
                System.out.println(no + ". " + todo);
        }
    }

    public static void testShowTodoList() {
        showTodoList();
    }

    /*
    tambah data todo list
     */
    public static void addTodoList(String todo){
        var isFull = true;
//        cek apakah data di model penuh
        for(int i=0; i<model.length; i++){
            if(model[i] == null){
//                model masih ada yang kosong
                isFull = false;
                break;
            }
        }

//        jika penuh data model nya diresize
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];
            for(var i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

//        tambahkan ke posisi yang data arraynya null
        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for(var i =0; i<=25;i++){
            addTodoList("makan ke "+ i );
        }
        showTodoList();
    }

    /*
    hapus data todo list
    */
    public static boolean removeTodoList(Integer number){
        if((number - 1) >= model.length){
            return false;
        }else if(model[number - 1] == null){
            return false;
        }else {
            model[number - 1] = null;
            for (var i = (number-1); i < model.length; i++){
                if(i == (model.length - 1)){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("makan");
        addTodoList("minum");
        addTodoList("solat");
        var result = removeTodoList(3);
        showTodoList();
    }

     /*
    view data todo list
    */
    public static void viewShowTodoList(){

    }

    /*
    view add data todo list
   */
    public static void viewAddTodoList(){

    }

    /*
    view remove data todo list
   */
    public static void removeAddTodoList(){

    }
}
