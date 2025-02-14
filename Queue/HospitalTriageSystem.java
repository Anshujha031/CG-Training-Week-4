package org.example.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HospitalTriageSystem {
   static class Patient{
        String name;
        int severity;
        public Patient(String name , int severity){
            this.name = name;
            this.severity = severity;
        }

        @Override
        public String toString(){
            return name + "(Severity: " + severity + ")";
        }
    }


        public static void main(String[] args) {
            Comparator<Patient> s = new Comparator<Patient>() {
                @Override
                public int compare(Patient o1, Patient o2) {
                    return Integer.compare(o2.severity , o1.severity);
                }
            };

            PriorityQueue<Patient> tq = new PriorityQueue<>(s);
            tq.add(new Patient("John" , 3));
            tq.add(new Patient("Alice" , 5));
            tq.add(new Patient("Bob" , 2));

            while(!tq.isEmpty()){
                System.out.println(tq.poll());
            }

        }

    }

