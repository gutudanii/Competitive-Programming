 public static List<Integer> gradingStudents(List<Integer> grades) {
  
    List<Integer> f_grade = new LinkedList<>();
    for(Integer grade:grades){
        if(grade < 38){
            f_grade.add(grade);
        }else if(grade % 5 == 0){
            f_grade.add(grade);
        }else if((grade + 1)% 5 == 0){
            f_grade.add(grade+1);
        }else if((grade + 2) % 5 == 0){
            f_grade.add(grade+2);
        }else{
            f_grade.add(grade);
        }
    }
    return f_grade;

    }
