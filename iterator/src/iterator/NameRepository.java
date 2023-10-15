/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;

public class NameRepository implements Container {
    public Student students[] = {
            new Student("36", "syed adan shah", "Male", "0333-3333332"),
            new Student("05", "hanzala", "female", "0331-4442222"),
            new Student("18", "hamza", "Female", "0333-5462222"),
            new Student("17", "zand", "Female", "0332-7772322")
    };

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return students[index--];
            }
            return null;
        }

        @Override
        public Student previous() {
            if (index < students.length - 1) {
                return students[++index];
            }
            return null;
        }

        @Override
        public void MoveToFirst() {
            index = 0;
        }

        @Override
        public void MoveToLast() {
            index = students.length - 1;
        }




    }
}
